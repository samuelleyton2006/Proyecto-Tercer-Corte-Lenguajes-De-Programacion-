# 01_aritmetica.dsl
# Ejemplo de operaciones aritméticas básicas y avanzadas

print("--- OPERACIONES ARITMÉTICAS ---");

a = 10;
b = 3;

res_suma = a + b;
res_resta = a - b;
mult = a * b;
division_res = a / b;
modulo_res = a % b;

print("a =", a);
print("b =", b);
print("Suma:", res_suma);
print("Resta:", res_resta);
print("Multiplicación:", mult);
print("División:", division_res);
print("Módulo:", modulo_res);

# Operaciones avanzadas
raiz = sqrt(16);
potencia = powf(2, 3);
seno = sin(0);
coseno = cos(0);
logaritmo = ln(2.71828);
absoluto = abs(-50);
fact = factorial(5);

print("\n--- FUNCIONES MATEMÁTICAS ---");
print("Raíz de 16:", raiz);
print("2 elevado a 3:", potencia);
print("Seno de 0:", seno);
print("Coseno de 0:", coseno);
print("Logaritmo natural de e:", logaritmo);
print("Valor absoluto de -50:", absoluto);
print("Factorial de 5:", fact);
