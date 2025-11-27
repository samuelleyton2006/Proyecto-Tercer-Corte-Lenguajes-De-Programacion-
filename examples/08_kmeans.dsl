# 08_kmeans.dsl
# Ejemplo de Clustering con K-Means

print("--- K-MEANS CLUSTERING ---");

# Datos simples (dos grupos claros)
X = [
    [1, 1], [1.5, 2], [3, 4], [5, 7], [3.5, 5], [4.5, 5], [3.5, 4.5]
];

print("Datos:");
mostrar_tabla(X);

# Crear modelo
kmeans = KMeans(n_clusters=2, max_iter=10, seed=42);

# Entrenar
kmeans.fit(X);

# Obtener centroides
centroides = kmeans.centroids;
print("Centroides encontrados:");
mostrar_tabla(centroides);

# Graficar clusters (comentado por problemas de encoding en Windows)
# La sintaxis correcta sería:
# kmeans.plot(width=60, height=20, output_file="kmeans_clusters.txt");
print("Clustering completado (grafica omitida por problemas de encoding)");
