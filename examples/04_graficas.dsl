# 04_graficas.dsl
# Ejemplo de gráficas de datos
# NOTA: Las gráficas ASCII usan caracteres Unicode que causan problemas en Windows
# Este ejemplo muestra la sintaxis correcta pero está comentado para evitar errores

print("--- GRÁFICAS DE DATOS ---");

x = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
y = [1, 4, 9, 16, 25, 36, 49, 64, 81, 100];

print("Datos X:", x);
print("Datos Y:", y);

# La sintaxis correcta para graficar sería:
# graficar(x, y, title="Parabola Simple", width=60, height=15, output_file="grafica.txt");

print("Ejemplo de sintaxis de graficas completado (sin ejecutar por problemas de encoding en Windows)");
