from libs.mylib_aritmetica import *
from libs.mylib_matrices import *
from libs.mylib_archivos import *
from libs.mylib_funciones import *
from libs.mylib_redes import *

class DeepLearningVisitor(ParseTreeVisitor):
    def visitOperacionAritmetica(self, ctx):
        a = self.visit(ctx.expresion(0))
        b = self.visit(ctx.expresion(1))
        op = ctx.op.text
        if op == '+': return suma(a, b)
        elif op == '*': return multiplicacion(a, b)
        elif op == '^': return potencia(a, b)
