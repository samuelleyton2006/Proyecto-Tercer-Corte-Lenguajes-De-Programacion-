# 05_archivos.dsl
# Ejemplo de manejo de archivos

print("--- MANEJO DE ARCHIVOS ---");

# 1. Escribir un archivo de texto simple
contenido = "Hola, este es un archivo creado desde el DSL.\nSegunda linea.";
print("Escribiendo archivo 'prueba_escritura.txt'...");
escribir_archivo("prueba_escritura.txt", contenido);

# 2. Leer el archivo
print("Leyendo archivo 'prueba_escritura.txt':");
texto = leer_archivo("prueba_escritura.txt");
print(texto);

# 3. Guardar una matriz en CSV
datos = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
print("Guardando matriz en 'matriz.csv'...");
guardar_matriz("matriz.csv", datos);

# 4. Cargar la matriz desde CSV
print("Cargando matriz desde 'matriz.csv':");
matriz_cargada = cargar_matriz("matriz.csv");
mostrar_tabla(matriz_cargada);
