# 07_mlp.dsl
# Ejemplo de Perceptrón Multicapa (MLP)

print("--- PERCEPTRÓN MULTICAPA ---");

# Datos XOR
X = [[0, 0], [0, 1], [1, 0], [1, 1]];
y = [[0], [1], [1], [0]];

print("Entrenando MLP para problema XOR...");

# Crear modelo: 2 entradas -> 4 ocultas -> 1 salida
mlp = PerceptronMulticapa(layers=[2, 4, 1], learning_rate=0.5, seed=42);

# Entrenar
mlp.fit(X, y, epochs=1000, verbose=False);

# Evaluar
accuracy = mlp.score(X, y);
print("Precisión (Accuracy):", accuracy);

# Predicciones individuales
p1 = mlp.predict([0, 1]);
print("Predicción para [0, 1] (esperado ~1):", p1);

p2 = mlp.predict([1, 1]);
print("Predicción para [1, 1] (esperado ~0):", p2);

# Graficar pérdida
print("Guardando gráfica de pérdida en 'mlp_loss.txt'...");
mlp.plot_loss("mlp_loss.txt");
print("Gráfica guardada exitosamente.");
