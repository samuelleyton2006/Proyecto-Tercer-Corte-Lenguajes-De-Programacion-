
rng = LCG(seed=42);


datos = [];

for (i in range(0, 5)) {
    x = rng.randint(0, 4);
    y = rng.randint(0, 4);
    punto = [x, y];
    datos.agregar(punto);
}

for (i in range(0, 5)) {
    x = rng.randint(6, 10);
    y = rng.randint(6, 10);
    punto = [x, y];
    datos.agregar(punto);
}

for (i in range(0, 5)) {
    x = rng.randint(0, 4);
    y = rng.randint(6, 10);
    punto = [x, y];
    datos.agregar(punto);
}


mostrar_tabla(datos);

kmeans = KMeans(n_clusters=3, max_iter=20, seed=123);
kmeans.fit(datos);

centroides = kmeans.centroids;
mostrar_tabla(centroides);
kmeans.plot(width=50, height=20);
