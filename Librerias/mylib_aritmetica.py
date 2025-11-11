def suma(a, b): return a + b
def resta(a, b): return a - b
def multiplicacion(a, b): return a * b
def division(a, b): return a / b if b != 0 else "Error: división entre 0"
def modulo(a, b): return a % b
def potencia(a, b):
    res = 1
    for _ in range(int(b)): res *= a
    return res
def raiz(x, n=2): return x ** (1/n)
def seno(x):  # usando serie de Taylor
    s = 0
    for k in range(10):
        s += ((-1)**k * x**(2*k+1)) / factorial(2*k+1)
    return s
