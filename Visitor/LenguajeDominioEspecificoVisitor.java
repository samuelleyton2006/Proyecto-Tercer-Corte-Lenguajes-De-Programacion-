// Generated from ./LenguajeDominioEspecifico.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LenguajeDominioEspecificoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LenguajeDominioEspecificoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LenguajeDominioEspecificoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(LenguajeDominioEspecificoParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(LenguajeDominioEspecificoParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#buclefor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclefor(LenguajeDominioEspecificoParser.BucleforContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#buclewhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuclewhile(LenguajeDominioEspecificoParser.BuclewhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(LenguajeDominioEspecificoParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(LenguajeDominioEspecificoParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionLista}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLista(LenguajeDominioEspecificoParser.ExpresionListaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionNot}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionNot(LenguajeDominioEspecificoParser.ExpresionNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionNumero}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionNumero(LenguajeDominioEspecificoParser.ExpresionNumeroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacionSumaResta}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionSumaResta(LenguajeDominioEspecificoParser.OperacionSumaRestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionString}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionString(LenguajeDominioEspecificoParser.ExpresionStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionCargarMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionCargarMatriz(LenguajeDominioEspecificoParser.ExpresionCargarMatrizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionBooleano}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionBooleano(LenguajeDominioEspecificoParser.ExpresionBooleanoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionParentesis}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionParentesis(LenguajeDominioEspecificoParser.ExpresionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionComparacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionComparacion(LenguajeDominioEspecificoParser.ExpresionComparacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionLeerArchivo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLeerArchivo(LenguajeDominioEspecificoParser.ExpresionLeerArchivoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionVariable}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionVariable(LenguajeDominioEspecificoParser.ExpresionVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionLogica}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionLogica(LenguajeDominioEspecificoParser.ExpresionLogicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacionMatrizExpr}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionMatrizExpr(LenguajeDominioEspecificoParser.OperacionMatrizExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionOperacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionOperacion(LenguajeDominioEspecificoParser.ExpresionOperacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpresionMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionMatriz(LenguajeDominioEspecificoParser.ExpresionMatrizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AccesoCentroides}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccesoCentroides(LenguajeDominioEspecificoParser.AccesoCentroidesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CrearRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearRegresion(LenguajeDominioEspecificoParser.CrearRegresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperacionMultDiv}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionMultDiv(LenguajeDominioEspecificoParser.OperacionMultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrizMultiFila}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrizMultiFila(LenguajeDominioEspecificoParser.MatrizMultiFilaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatrizUnidimensional}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatrizUnidimensional(LenguajeDominioEspecificoParser.MatrizUnidimensionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#fila}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFila(LenguajeDominioEspecificoParser.FilaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#lista}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista(LenguajeDominioEspecificoParser.ListaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMatriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosMatriz(LenguajeDominioEspecificoParser.ParametrosMatrizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EntrenarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrenarRegresion(LenguajeDominioEspecificoParser.EntrenarRegresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ObtenerMetricaRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObtenerMetricaRegresion(LenguajeDominioEspecificoParser.ObtenerMetricaRegresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraficarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraficarRegresion(LenguajeDominioEspecificoParser.GraficarRegresionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PredecirModelo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#prediccionModelo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredecirModelo(LenguajeDominioEspecificoParser.PredecirModeloContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosPlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosPlot(LenguajeDominioEspecificoParser.ParametrosPlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroPlot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroPlot(LenguajeDominioEspecificoParser.ParametroPlotContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#escribirArchivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribirArchivo(LenguajeDominioEspecificoParser.EscribirArchivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#guardarMatriz}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuardarMatriz(LenguajeDominioEspecificoParser.GuardarMatrizContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CrearMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearMLP(LenguajeDominioEspecificoParser.CrearMLPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EntrenarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrenarMLP(LenguajeDominioEspecificoParser.EntrenarMLPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EvaluarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluarMLP(LenguajeDominioEspecificoParser.EvaluarMLPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraficarPerdidaMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraficarPerdidaMLP(LenguajeDominioEspecificoParser.GraficarPerdidaMLPContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMLP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosMLP(LenguajeDominioEspecificoParser.ParametrosMLPContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroMLP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroMLP(LenguajeDominioEspecificoParser.ParametroMLPContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosEntrenamiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosEntrenamiento(LenguajeDominioEspecificoParser.ParametrosEntrenamientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroEntrenamiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroEntrenamiento(LenguajeDominioEspecificoParser.ParametroEntrenamientoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CrearKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrearKMeans(LenguajeDominioEspecificoParser.CrearKMeansContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EntrenarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrenarKMeans(LenguajeDominioEspecificoParser.EntrenarKMeansContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GraficarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraficarKMeans(LenguajeDominioEspecificoParser.GraficarKMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosKMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosKMeans(LenguajeDominioEspecificoParser.ParametrosKMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroKMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroKMeans(LenguajeDominioEspecificoParser.ParametroKMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficarKMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosGraficarKMeans(LenguajeDominioEspecificoParser.ParametrosGraficarKMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficarKMeans}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroGraficarKMeans(LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#graficar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGraficar(LenguajeDominioEspecificoParser.GraficarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosGraficar(LenguajeDominioEspecificoParser.ParametrosGraficarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroGraficar(LenguajeDominioEspecificoParser.ParametroGraficarContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(LenguajeDominioEspecificoParser.ImpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#operaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperaciones(LenguajeDominioEspecificoParser.OperacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosOp(LenguajeDominioEspecificoParser.ParametrosOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MostrarTablaASCII}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#mostrarTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMostrarTablaASCII(LenguajeDominioEspecificoParser.MostrarTablaASCIIContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosTabla(LenguajeDominioEspecificoParser.ParametrosTablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroTabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametroTabla(LenguajeDominioEspecificoParser.ParametroTablaContext ctx);
}