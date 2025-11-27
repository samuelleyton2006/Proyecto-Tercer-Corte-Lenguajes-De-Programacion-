"""
LibreriaPerceptronMC.py - VERSIÓN MEJORADA
Implementación de un perceptrón multicapa con múltiples funciones de activación
Mejoras:
 - ReLU y Leaky ReLU para capas ocultas (evita vanishing gradient)
 - Sigmoid para capa de salida (clasificación binaria)
 - Mejor inicialización de pesos (Xavier/He initialization)
 - Configuración flexible de función de activación
"""

from Librerias.LibreriaAritmetica import LCG, exp, sqrt

# ============================================
# FUNCIONES DE ACTIVACIÓN
# ============================================

def sigmoid(x):
    """Sigmoid: convierte x en rango [0, 1]"""
    # Limitar x para evitar overflow
    if x > 500:
        return 1.0
    if x < -500:
        return 0.0
    return 1.0 / (1.0 + exp(-x))

def dsigmoid(x):
    """Derivada de Sigmoid"""
    s = sigmoid(x)
    return s * (1.0 - s)

def relu(x):
    """ReLU: max(0, x) - Soluciona vanishing gradient"""
    return x if x > 0 else 0.0

def drelu(x):
    """Derivada de ReLU"""
    return 1.0 if x > 0 else 0.0

def leaky_relu(x, alpha=0.01):
    """Leaky ReLU: permite pequeños gradientes negativos"""
    return x if x > 0 else alpha * x

def dleaky_relu(x, alpha=0.01):
    """Derivada de Leaky ReLU"""
    return 1.0 if x > 0 else alpha

def tanh(x):
    """Tanh: convierte x en rango [-1, 1]"""
    if x > 500:
        return 1.0
    if x < -500:
        return -1.0
    ep = exp(x)
    en = exp(-x)
    return (ep - en) / (ep + en)

def dtanh(x):
    """Derivada de Tanh"""
    t = tanh(x)
    return 1.0 - t * t

# ============================================
# PERCEPTRÓN MULTICAPA MEJORADO
# ============================================

class PerceptronMulticapa:
    def __init__(self, layers, learning_rate=0.1, seed=1234, activation='relu', 
                 weight_init='he', alpha=0.01):
        """
        Inicializa el Perceptrón Multicapa con mejoras
        
        Parámetros:
            layers: lista de enteros [input, hidden1, hidden2, ..., output]
                    Ejemplo: [2, 10, 10, 1]
            learning_rate: tasa de aprendizaje (default: 0.1)
                          Prueba: 0.01, 0.1, 0.5, 1.0
            seed: semilla para reproducibilidad
            activation: función de activación para capas ocultas
                       Opciones: 'relu', 'leaky_relu', 'tanh', 'sigmoid'
                       Recomendado: 'relu' o 'leaky_relu'
            weight_init: método de inicialización de pesos
                        'xavier': para tanh/sigmoid
                        'he': para relu/leaky_relu (RECOMENDADO)
                        'random': aleatorio pequeño
            alpha: parámetro para leaky_relu (default: 0.01)
        """
        self.layers = layers[:]
        self.lr = learning_rate
        self.seed = int(seed)
        self.rng = LCG(self.seed)
        self.activation = activation.lower()
        self.weight_init = weight_init.lower()
        self.alpha = alpha
        self.weights = []
        self.biases = []
        self.loss_history = []
        
        # Inicializar pesos y sesgos
        self._initialize_weights()
    
    def _initialize_weights(self):
        """Inicializa pesos usando el método especificado"""
        for i in range(len(self.layers) - 1):
            in_dim = self.layers[i]
            out_dim = self.layers[i + 1]
            
            # Determinar escala según el método
            if self.weight_init == 'xavier':
                # Xavier: bueno para sigmoid/tanh
                scale = sqrt(2.0 / (in_dim + out_dim))
            elif self.weight_init == 'he':
                # He: bueno para ReLU
                scale = sqrt(2.0 / in_dim)
            else:  # random
                scale = 0.5
            
            # Inicializar pesos
            W = [[(self.rng.rand() - 0.5) * 2 * scale 
                  for _ in range(in_dim)] 
                 for _ in range(out_dim)]
            
            # Inicializar sesgos (pequeños)
            b = [0.01 for _ in range(out_dim)]
            
            self.weights.append(W)
            self.biases.append(b)
    
    def _activate(self, x, is_output_layer=False):
        """Aplica la función de activación según la capa"""
        # Capa de salida siempre usa sigmoid (para clasificación binaria)
        if is_output_layer:
            return sigmoid(x)
        
        # Capas ocultas usan la función especificada
        if self.activation == 'relu':
            return relu(x)
        elif self.activation == 'leaky_relu':
            return leaky_relu(x, self.alpha)
        elif self.activation == 'tanh':
            return tanh(x)
        elif self.activation == 'sigmoid':
            return sigmoid(x)
        else:
            return relu(x)  # default
    
    def _activate_derivative(self, x, is_output_layer=False):
        """Calcula la derivada de la función de activación"""
        if is_output_layer:
            return dsigmoid(x)
        
        if self.activation == 'relu':
            return drelu(x)
        elif self.activation == 'leaky_relu':
            return dleaky_relu(x, self.alpha)
        elif self.activation == 'tanh':
            return dtanh(x)
        elif self.activation == 'sigmoid':
            return dsigmoid(x)
        else:
            return drelu(x)  # default

    def _forward_single(self, x):
        """
        Propagación hacia adelante para una muestra
        Retorna: (activaciones, valores pre-activación)
        """
        a = x[:]
        activations = [a]
        zs = []
        
        num_layers = len(self.weights)
        
        for layer_idx, (W, b) in enumerate(zip(self.weights, self.biases)):
            z = []
            a_next = []
            is_output = (layer_idx == num_layers - 1)
            
            for j in range(len(W)):
                # Suma ponderada: z = w·x + b
                s = b[j]
                for i in range(len(W[j])):
                    s += W[j][i] * a[i]
                z.append(s)
                
                # Aplicar función de activación
                a_next.append(self._activate(s, is_output))
            
            zs.append(z)
            activations.append(a_next)
            a = a_next
        
        return activations, zs

    def _backprop_single(self, x, y):
        """
        Retropropagación para una muestra
        Calcula los gradientes de pesos y sesgos
        """
        activations, zs = self._forward_single(x)
        
        # Convertir y a vector
        y_vec = y[:] if isinstance(y, list) else [y]
        
        L = len(self.weights)
        nabla_w = [None] * L
        nabla_b = [None] * L
        
        # Delta de la capa de salida
        delta = []
        last_z = zs[-1]
        last_a = activations[-1]
        
        for j in range(len(last_a)):
            err = last_a[j] - y_vec[j]
            # Derivada para capa de salida (sigmoid)
            delta.append(err * self._activate_derivative(last_z[j], is_output_layer=True))
        
        # Gradientes de la última capa
        nabla_b[L - 1] = delta[:]
        nabla_w[L - 1] = [[delta[j] * activations[-2][i] 
                          for i in range(len(activations[-2]))] 
                         for j in range(len(delta))]
        
        # Propagar hacia atrás
        for l in range(L - 2, -1, -1):
            z = zs[l]
            is_output = False
            sp = [self._activate_derivative(zj, is_output) for zj in z]
            
            # Calcular delta para esta capa
            delta_l = []
            for i_neur in range(len(self.weights[l])):
                s = 0.0
                for k in range(len(delta)):
                    s += self.weights[l + 1][k][i_neur] * delta[k]
                delta_l.append(s * sp[i_neur])
            
            # Almacenar gradientes
            nabla_b[l] = delta_l[:]
            prev_a = activations[l]
            nabla_w[l] = [[delta_l[j] * prev_a[i] 
                          for i in range(len(prev_a))] 
                         for j in range(len(delta_l))]
            
            delta = delta_l
        
        return nabla_w, nabla_b

    def _update_mini_batch(self, nabla_w_sum, nabla_b_sum, batch_size):
        """Actualiza pesos y sesgos usando los gradientes acumulados"""
        for l in range(len(self.weights)):
            for j in range(len(self.weights[l])):
                for i in range(len(self.weights[l][j])):
                    self.weights[l][j][i] -= (self.lr / batch_size) * nabla_w_sum[l][j][i]
            for j in range(len(self.biases[l])):
                self.biases[l][j] -= (self.lr / batch_size) * nabla_b_sum[l][j]

    def fit(self, X, Y, epochs=1000, batch_size=1, verbose=False):
        """
        Entrena el modelo
        
        Parámetros:
            X: lista de muestras de entrada
            Y: lista de salidas esperadas
            epochs: número de iteraciones completas sobre los datos
            batch_size: tamaño del lote para actualización de pesos
            verbose: si True, imprime progreso cada 10% de las épocas
        """
        n = len(X)
        print_every = max(1, epochs // 10) if verbose else epochs + 1
        
        for ep in range(epochs):
            total_loss = 0.0
            
            # Mini-batch SGD
            for i in range(0, n, batch_size):
                end = min(i + batch_size, n)
                
                # Inicializar acumuladores de gradientes
                nabla_w_sum = [[[0.0 for _ in row] for row in W] 
                              for W in self.weights]
                nabla_b_sum = [[0.0 for _ in b] for b in self.biases]
                
                bs = end - i
                
                # Acumular gradientes del batch
                for j in range(i, end):
                    x = X[j]
                    y = Y[j]
                    
                    # Backpropagation
                    nw, nb = self._backprop_single(x, y)
                    
                    # Acumular
                    for l in range(len(self.weights)):
                        for a in range(len(nw[l])):
                            for b_idx in range(len(nw[l][a])):
                                nabla_w_sum[l][a][b_idx] += nw[l][a][b_idx]
                        for a in range(len(nb[l])):
                            nabla_b_sum[l][a] += nb[l][a]
                    
                    # Calcular pérdida
                    pred = self.predict(x)
                    p_flat = pred if isinstance(pred, list) else [pred]
                    y_flat = y if isinstance(y, list) else [y]
                    for a, bv in zip(p_flat, y_flat):
                        total_loss += (a - bv) ** 2
                
                # Actualizar pesos
                self._update_mini_batch(nabla_w_sum, nabla_b_sum, bs)
            
            # Guardar pérdida
            self.loss_history.append(total_loss)
            
            # Imprimir progreso
            if ep % print_every == 0:
                print(f"Epoch {ep}: loss = {total_loss:.6f}")
        
        return self

    def predict(self, x):
        """
        Realiza una predicción para una muestra
        
        Parámetros:
            x: muestra de entrada
        
        Retorna:
            Predicción (número o lista según la arquitectura)
        """
        a = x[:] if isinstance(x, list) else [x]
        
        num_layers = len(self.weights)
        
        for layer_idx, (W, b) in enumerate(zip(self.weights, self.biases)):
            a_next = []
            is_output = (layer_idx == num_layers - 1)
            
            for j in range(len(W)):
                s = b[j]
                for i in range(len(W[j])):
                    s += W[j][i] * a[i]
                a_next.append(self._activate(s, is_output))
            
            a = a_next
        
        return a if len(a) > 1 else a[0]

    def score(self, X, Y):
        """
        Calcula el MSE (Mean Squared Error) del modelo
        
        Parámetros:
            X: datos de entrada
            Y: salidas esperadas
        
        Retorna:
            MSE (error cuadrático medio)
        """
        preds = []
        ys = []
        
        for x, y in zip(X, Y):
            p = self.predict(x)
            if isinstance(p, list):
                preds.append(p[0])
            else:
                preds.append(p)
            
            if isinstance(y, list):
                ys.append(y[0])
            else:
                ys.append(y)
        
        # Calcular MSE
        n = len(preds)
        total = sum((preds[i] - ys[i]) ** 2 for i in range(n))
        return total / n if n > 0 else 0.0


# ============================================
# EJEMPLO DE USO
# ============================================

if __name__ == "__main__":
    print("=== PRUEBA: Problema XOR ===\n")
    
    # Datos XOR
    X = [[0, 0], [0, 1], [1, 0], [1, 1]]
    Y = [0, 1, 1, 0]
    
    # Crear modelo con ReLU (MEJOR para este problema)
    print("Entrenando con ReLU...")
    mlp_relu = PerceptronMulticapa(
        layers=[2, 10, 10, 1],
        learning_rate=0.5,
        activation='relu',
        weight_init='he',
        seed=42
    )
    
    mlp_relu.fit(X, Y, epochs=2000, batch_size=4, verbose=True)
    
    print("\nResultados con ReLU:")
    print(f"MSE final: {mlp_relu.score(X, Y):.6f}")
    for i, (x, y) in enumerate(zip(X, Y)):
        pred = mlp_relu.predict(x)
        print(f"  {x} -> {pred:.4f} (esperado: {y})")
    
    print("\n" + "="*50)
    print("\n=== COMPARACIÓN: Sigmoid vs ReLU ===\n")
    
    # Modelo con Sigmoid (PEOR)
    print("Entrenando con Sigmoid...")
    mlp_sigmoid = PerceptronMulticapa(
        layers=[2, 10, 10, 1],
        learning_rate=0.5,
        activation='sigmoid',
        weight_init='xavier',
        seed=42
    )
    
    mlp_sigmoid.fit(X, Y, epochs=2000, batch_size=4, verbose=False)
    
    print("\nResultados con Sigmoid:")
    print(f"MSE final: {mlp_sigmoid.score(X, Y):.6f}")
    for i, (x, y) in enumerate(zip(X, Y)):
        pred = mlp_sigmoid.predict(x)
        print(f"  {x} -> {pred:.4f} (esperado: {y})")
    