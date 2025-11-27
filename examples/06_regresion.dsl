# 06_regresion.dsl
# Ejemplo de Regresión Lineal

print("--- REGRESIÓN LINEAL ---");

# Datos de entrenamiento (y = 2x + 1)
X = [1, 2, 3, 4, 5];
y = [3, 5, 7, 9, 11];

print("Datos X:", X);
print("Datos y:", y);

# Crear y entrenar modelo
reg = RegresionLineal();
reg.fit(X, y);

# Predecir
pred = reg.predict(6);
print("Predicción para x=6 (esperado 13):", pred);

# Métricas
mse_val = reg.mse();
r2_val = reg.r2();
print("MSE:", mse_val);
print("R2 Score:", r2_val);

# Graficar
print("Graficando regresión...");
reg.plot(width=60, height=15, title="Regresion Lineal DSL");
