# 04_graficas.dsl
# Ejemplo de gráficas de datos
# Ahora compatible con Windows y Linux

print("=== EJEMPLO DE GRAFICAS ===");
print("");

# Datos para graficar
x = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
y = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100];

print("Datos X:", x);
print("Datos Y:", y);
print("");

# Gráfica básica (solo consola)
print("1. Grafica basica en consola:");
graficar(x, y, width=60, height=15, title="Parabola y = x^2");
print("");

# Gráfica guardada en archivo
print("2. Grafica guardada en archivo:");
graficar(x, y, output_file="parabola.txt", width=60, height=15, title="Parabola guardada");
print("");

# Datos lineales
x2 = [0, 1, 2, 3, 4, 5];
y2 = [0, 2, 4, 6, 8, 10];

print("3. Grafica lineal:");
graficar(x2, y2, width=50, height=12, title="Linea y = 2x");
print("");

# Datos con más variación
x3 = [1, 2, 3, 4, 5, 6, 7, 8];
y3 = [2, 5, 3, 8, 6, 9, 7, 10];

print("4. Grafica de puntos dispersos:");
graficar(x3, y3, width=50, height=12, title="Datos dispersos");

print("");
print("=== EJEMPLO COMPLETADO ===");