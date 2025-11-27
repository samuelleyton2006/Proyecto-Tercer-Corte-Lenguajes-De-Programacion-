rr = LCG(seed=50);
x = [];
y = [];
for (i in range(0, 20)) {
    x.agregar(rr.randint(0, 100));
    y.agregar(rr.randint(0, 100));
}

reg = RegresionLineal();
reg.fit(x, y);
reg.plot(width=60, height=20, title="Mi Gráfica");
hola = reg.r2();
print("R2 Score:", hola);