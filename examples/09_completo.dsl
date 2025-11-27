# 09_completo.dsl
# Ejemplo completo integrando múltiples características

print("=== EJEMPLO COMPLETO DSL ===");

# 1. Cargar datos (simulados)
datos = [
    [1, 2], [2, 3], [3, 4], [4, 5], [5, 6],
    [10, 10], [11, 11], [12, 12]
];

print("Datos cargados:");
mostrar_tabla(datos);

# 2. Análisis estadístico básico
suma_total = 0;
for (i in range(0, 8)) {
    # Iterando sobre los datos
    suma_total = suma_total + 1;
}

# 3. Clustering para encontrar grupos
print("\n--- Ejecutando K-Means ---");
km = KMeans(n_clusters=2, seed=1);
km.fit(datos);
# km.plot(width=50, height=15, output_file="kmeans_completo.txt");  # Comentado por encoding
print("K-Means completado");

# 4. Regresión sobre un subconjunto (simulado)
print("\n--- Ejecutando Regresión Lineal ---");
X_reg = [1, 2, 3, 4, 5];
y_reg = [2, 4, 6, 8, 10];
reg = RegresionLineal();
reg.fit(X_reg, y_reg);
r2_score = reg.r2();
print("R2 Score:", r2_score);

# 5. Guardar resultados
print("\n--- Guardando Resultados ---");
escribir_archivo("reporte_final.txt", "Analisis completado. R2 calculado.");

print("Proceso finalizado con éxito.");
