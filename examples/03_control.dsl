# 03_control.dsl
# Ejemplo de condicionales y ciclos

print("--- CONDICIONALES ---");

x = 10;

if (x > 5) {
    print("x es mayor que 5");
} else {
    print("x es menor o igual a 5");
}

y = 20;
if (y < 10) {
    print("y es menor que 10");
} elif (y == 20) {
    print("y es igual a 20");
} else {
    print("y es mayor que 10 y no es 20");
}

print("\n--- CICLO FOR ---");
# Imprimir números del 0 al 4
for (i in range(0, 5)) {
    print("Iteración for:", i);
}

print("\n--- CICLO WHILE ---");
# Imprimir números mientras contador < 3
contador = 0;
while (contador < 3) {
    print("Iteración while:", contador);
    contador = contador + 1;
}
