# ============================================
# Ejemplo 10: Generador de numeros aleatorios LCG
# ============================================

# Crear un generador con semilla especifica (reproducible)
rng = LCG(seed=69);

# Generar numeros flotantes aleatorios [0.0, 1.0)
print("=== Numeros flotantes aleatorios ===");
r1 = rng.rand();
r9 = rng.rand();
r3 = rng.rand();
print("r1 =", r1);
print("r2 =", r9);
print("r3 =", r3);

# Generar enteros aleatorios en un rango [min, max]
print("=== Enteros aleatorios (dados 1-6) ===");
dado1 = rng.randint(1, 6);
dado2 = rng.randint(1, 6);
dado3 = rng.randint(1, 6);
print("Dado 1:", dado1);
print("Dado 2:", dado2);
print("Dado 3:", dado3);

# Demostrar reproducibilidad: misma semilla = misma secuencia
print("=== Reproducibilidad ===");
rng2 = LCG(seed=42);
check1 = rng2.rand();
check2 = rng2.rand();
check3 = rng2.rand();
print("Con semilla 42 otra vez:");
print("check1 =", check1);
print("check2 =", check2);
print("check3 =", check3);

# Re-semillar un generador existente
print("=== Re-semillar generador ===");
rng.seed(999);
nuevo1 = rng.rand();
nuevo2 = rng.rand();
print("Despues de seed(999):");
print("nuevo1 =", nuevo1);
print("nuevo2 =", nuevo2);

# Uso en bucle: generar lista de 5 numeros aleatorios
print("=== Generando 5 numeros en bucle ===");
for (i in range(0, 5)) {
    val = rng.randint(0, 100);
    print("Valor", i, ":", val);
}

print("=== Fin del ejemplo LCG ===");
