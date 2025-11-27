# 02_matrices.dsl
# Ejemplo de operaciones con matrices

print("--- OPERACIONES CON MATRICES ---");

m1 = [[1, 2], [3, 4]];
m2 = [[5, 6], [7, 8]];

print("Matriz 1:");
mostrar_tabla(m1);

print("Matriz 2:");
mostrar_tabla(m2);

# Suma
suma_m = matriz.suma(m1, m2);
print("Suma de matrices:");
mostrar_tabla(suma_m);

# Resta
resta_m = matriz.resta(m2, m1);
print("Resta de matrices (m2 - m1):");
mostrar_tabla(resta_m);

# Multiplicación
mult_m = matriz.multiplicar(m1, m2);
print("Multiplicación de matrices:");
mostrar_tabla(mult_m);

# Transpuesta
trans = matriz.transpuesta(m1);
print("Transpuesta de m1:");
mostrar_tabla(trans);

# Determinante
det = matriz.determinante(m1);
print("Determinante de m1:", det);

# Inversa
inv = matriz.inversa(m1);
print("Inversa de m1:");
mostrar_tabla(inv);
