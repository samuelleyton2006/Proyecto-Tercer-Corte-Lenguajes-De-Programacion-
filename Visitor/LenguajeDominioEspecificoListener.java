// Generated from ./LenguajeDominioEspecifico.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LenguajeDominioEspecificoParser}.
 */
public interface LenguajeDominioEspecificoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LenguajeDominioEspecificoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LenguajeDominioEspecificoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(LenguajeDominioEspecificoParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(LenguajeDominioEspecificoParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(LenguajeDominioEspecificoParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(LenguajeDominioEspecificoParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void enterBuclefor(LenguajeDominioEspecificoParser.BucleforContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#buclefor}.
	 * @param ctx the parse tree
	 */
	void exitBuclefor(LenguajeDominioEspecificoParser.BucleforContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void enterBuclewhile(LenguajeDominioEspecificoParser.BuclewhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#buclewhile}.
	 * @param ctx the parse tree
	 */
	void exitBuclewhile(LenguajeDominioEspecificoParser.BuclewhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(LenguajeDominioEspecificoParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(LenguajeDominioEspecificoParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(LenguajeDominioEspecificoParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(LenguajeDominioEspecificoParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionLista}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLista(LenguajeDominioEspecificoParser.ExpresionListaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionLista}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLista(LenguajeDominioEspecificoParser.ExpresionListaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionNot}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionNot(LenguajeDominioEspecificoParser.ExpresionNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionNot}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionNot(LenguajeDominioEspecificoParser.ExpresionNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionNumero}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionNumero(LenguajeDominioEspecificoParser.ExpresionNumeroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionNumero}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionNumero(LenguajeDominioEspecificoParser.ExpresionNumeroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacionSumaResta}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOperacionSumaResta(LenguajeDominioEspecificoParser.OperacionSumaRestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacionSumaResta}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOperacionSumaResta(LenguajeDominioEspecificoParser.OperacionSumaRestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionString}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionString(LenguajeDominioEspecificoParser.ExpresionStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionString}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionString(LenguajeDominioEspecificoParser.ExpresionStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionCargarMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionCargarMatriz(LenguajeDominioEspecificoParser.ExpresionCargarMatrizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionCargarMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionCargarMatriz(LenguajeDominioEspecificoParser.ExpresionCargarMatrizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionBooleano}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionBooleano(LenguajeDominioEspecificoParser.ExpresionBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionBooleano}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionBooleano(LenguajeDominioEspecificoParser.ExpresionBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionParentesis}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionParentesis(LenguajeDominioEspecificoParser.ExpresionParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionParentesis}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionParentesis(LenguajeDominioEspecificoParser.ExpresionParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionComparacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionComparacion(LenguajeDominioEspecificoParser.ExpresionComparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionComparacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionComparacion(LenguajeDominioEspecificoParser.ExpresionComparacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionLeerArchivo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLeerArchivo(LenguajeDominioEspecificoParser.ExpresionLeerArchivoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionLeerArchivo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLeerArchivo(LenguajeDominioEspecificoParser.ExpresionLeerArchivoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionVariable}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionVariable(LenguajeDominioEspecificoParser.ExpresionVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionVariable}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionVariable(LenguajeDominioEspecificoParser.ExpresionVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionLogica}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionLogica(LenguajeDominioEspecificoParser.ExpresionLogicaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionLogica}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionLogica(LenguajeDominioEspecificoParser.ExpresionLogicaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacionMatrizExpr}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOperacionMatrizExpr(LenguajeDominioEspecificoParser.OperacionMatrizExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacionMatrizExpr}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOperacionMatrizExpr(LenguajeDominioEspecificoParser.OperacionMatrizExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionOperacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionOperacion(LenguajeDominioEspecificoParser.ExpresionOperacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionOperacion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionOperacion(LenguajeDominioEspecificoParser.ExpresionOperacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExpresionMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresionMatriz(LenguajeDominioEspecificoParser.ExpresionMatrizContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExpresionMatriz}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresionMatriz(LenguajeDominioEspecificoParser.ExpresionMatrizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AccesoCentroides}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAccesoCentroides(LenguajeDominioEspecificoParser.AccesoCentroidesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AccesoCentroides}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAccesoCentroides(LenguajeDominioEspecificoParser.AccesoCentroidesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CrearRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCrearRegresion(LenguajeDominioEspecificoParser.CrearRegresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CrearRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCrearRegresion(LenguajeDominioEspecificoParser.CrearRegresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperacionMultDiv}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOperacionMultDiv(LenguajeDominioEspecificoParser.OperacionMultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperacionMultDiv}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOperacionMultDiv(LenguajeDominioEspecificoParser.OperacionMultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrizMultiFila}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatrizMultiFila(LenguajeDominioEspecificoParser.MatrizMultiFilaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrizMultiFila}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatrizMultiFila(LenguajeDominioEspecificoParser.MatrizMultiFilaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MatrizUnidimensional}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 */
	void enterMatrizUnidimensional(LenguajeDominioEspecificoParser.MatrizUnidimensionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MatrizUnidimensional}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#matriz}.
	 * @param ctx the parse tree
	 */
	void exitMatrizUnidimensional(LenguajeDominioEspecificoParser.MatrizUnidimensionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#fila}.
	 * @param ctx the parse tree
	 */
	void enterFila(LenguajeDominioEspecificoParser.FilaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#fila}.
	 * @param ctx the parse tree
	 */
	void exitFila(LenguajeDominioEspecificoParser.FilaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#lista}.
	 * @param ctx the parse tree
	 */
	void enterLista(LenguajeDominioEspecificoParser.ListaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#lista}.
	 * @param ctx the parse tree
	 */
	void exitLista(LenguajeDominioEspecificoParser.ListaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMatriz}.
	 * @param ctx the parse tree
	 */
	void enterParametrosMatriz(LenguajeDominioEspecificoParser.ParametrosMatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMatriz}.
	 * @param ctx the parse tree
	 */
	void exitParametrosMatriz(LenguajeDominioEspecificoParser.ParametrosMatrizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EntrenarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void enterEntrenarRegresion(LenguajeDominioEspecificoParser.EntrenarRegresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntrenarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void exitEntrenarRegresion(LenguajeDominioEspecificoParser.EntrenarRegresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObtenerMetricaRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void enterObtenerMetricaRegresion(LenguajeDominioEspecificoParser.ObtenerMetricaRegresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObtenerMetricaRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void exitObtenerMetricaRegresion(LenguajeDominioEspecificoParser.ObtenerMetricaRegresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraficarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void enterGraficarRegresion(LenguajeDominioEspecificoParser.GraficarRegresionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraficarRegresion}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#regresionLineal}.
	 * @param ctx the parse tree
	 */
	void exitGraficarRegresion(LenguajeDominioEspecificoParser.GraficarRegresionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PredecirModelo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#prediccionModelo}.
	 * @param ctx the parse tree
	 */
	void enterPredecirModelo(LenguajeDominioEspecificoParser.PredecirModeloContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PredecirModelo}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#prediccionModelo}.
	 * @param ctx the parse tree
	 */
	void exitPredecirModelo(LenguajeDominioEspecificoParser.PredecirModeloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosPlot}.
	 * @param ctx the parse tree
	 */
	void enterParametrosPlot(LenguajeDominioEspecificoParser.ParametrosPlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosPlot}.
	 * @param ctx the parse tree
	 */
	void exitParametrosPlot(LenguajeDominioEspecificoParser.ParametrosPlotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroPlot}.
	 * @param ctx the parse tree
	 */
	void enterParametroPlot(LenguajeDominioEspecificoParser.ParametroPlotContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroPlot}.
	 * @param ctx the parse tree
	 */
	void exitParametroPlot(LenguajeDominioEspecificoParser.ParametroPlotContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#escribirArchivo}.
	 * @param ctx the parse tree
	 */
	void enterEscribirArchivo(LenguajeDominioEspecificoParser.EscribirArchivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#escribirArchivo}.
	 * @param ctx the parse tree
	 */
	void exitEscribirArchivo(LenguajeDominioEspecificoParser.EscribirArchivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#guardarMatriz}.
	 * @param ctx the parse tree
	 */
	void enterGuardarMatriz(LenguajeDominioEspecificoParser.GuardarMatrizContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#guardarMatriz}.
	 * @param ctx the parse tree
	 */
	void exitGuardarMatriz(LenguajeDominioEspecificoParser.GuardarMatrizContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CrearMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void enterCrearMLP(LenguajeDominioEspecificoParser.CrearMLPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CrearMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void exitCrearMLP(LenguajeDominioEspecificoParser.CrearMLPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EntrenarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void enterEntrenarMLP(LenguajeDominioEspecificoParser.EntrenarMLPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntrenarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void exitEntrenarMLP(LenguajeDominioEspecificoParser.EntrenarMLPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EvaluarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void enterEvaluarMLP(LenguajeDominioEspecificoParser.EvaluarMLPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EvaluarMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void exitEvaluarMLP(LenguajeDominioEspecificoParser.EvaluarMLPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraficarPerdidaMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void enterGraficarPerdidaMLP(LenguajeDominioEspecificoParser.GraficarPerdidaMLPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraficarPerdidaMLP}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#perceptronMulticapa}.
	 * @param ctx the parse tree
	 */
	void exitGraficarPerdidaMLP(LenguajeDominioEspecificoParser.GraficarPerdidaMLPContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMLP}.
	 * @param ctx the parse tree
	 */
	void enterParametrosMLP(LenguajeDominioEspecificoParser.ParametrosMLPContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosMLP}.
	 * @param ctx the parse tree
	 */
	void exitParametrosMLP(LenguajeDominioEspecificoParser.ParametrosMLPContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroMLP}.
	 * @param ctx the parse tree
	 */
	void enterParametroMLP(LenguajeDominioEspecificoParser.ParametroMLPContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroMLP}.
	 * @param ctx the parse tree
	 */
	void exitParametroMLP(LenguajeDominioEspecificoParser.ParametroMLPContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosEntrenamiento}.
	 * @param ctx the parse tree
	 */
	void enterParametrosEntrenamiento(LenguajeDominioEspecificoParser.ParametrosEntrenamientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosEntrenamiento}.
	 * @param ctx the parse tree
	 */
	void exitParametrosEntrenamiento(LenguajeDominioEspecificoParser.ParametrosEntrenamientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroEntrenamiento}.
	 * @param ctx the parse tree
	 */
	void enterParametroEntrenamiento(LenguajeDominioEspecificoParser.ParametroEntrenamientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroEntrenamiento}.
	 * @param ctx the parse tree
	 */
	void exitParametroEntrenamiento(LenguajeDominioEspecificoParser.ParametroEntrenamientoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CrearKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void enterCrearKMeans(LenguajeDominioEspecificoParser.CrearKMeansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CrearKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void exitCrearKMeans(LenguajeDominioEspecificoParser.CrearKMeansContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EntrenarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void enterEntrenarKMeans(LenguajeDominioEspecificoParser.EntrenarKMeansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EntrenarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void exitEntrenarKMeans(LenguajeDominioEspecificoParser.EntrenarKMeansContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GraficarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void enterGraficarKMeans(LenguajeDominioEspecificoParser.GraficarKMeansContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GraficarKMeans}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#kmeans}.
	 * @param ctx the parse tree
	 */
	void exitGraficarKMeans(LenguajeDominioEspecificoParser.GraficarKMeansContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosKMeans}.
	 * @param ctx the parse tree
	 */
	void enterParametrosKMeans(LenguajeDominioEspecificoParser.ParametrosKMeansContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosKMeans}.
	 * @param ctx the parse tree
	 */
	void exitParametrosKMeans(LenguajeDominioEspecificoParser.ParametrosKMeansContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroKMeans}.
	 * @param ctx the parse tree
	 */
	void enterParametroKMeans(LenguajeDominioEspecificoParser.ParametroKMeansContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroKMeans}.
	 * @param ctx the parse tree
	 */
	void exitParametroKMeans(LenguajeDominioEspecificoParser.ParametroKMeansContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficarKMeans}.
	 * @param ctx the parse tree
	 */
	void enterParametrosGraficarKMeans(LenguajeDominioEspecificoParser.ParametrosGraficarKMeansContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficarKMeans}.
	 * @param ctx the parse tree
	 */
	void exitParametrosGraficarKMeans(LenguajeDominioEspecificoParser.ParametrosGraficarKMeansContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficarKMeans}.
	 * @param ctx the parse tree
	 */
	void enterParametroGraficarKMeans(LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficarKMeans}.
	 * @param ctx the parse tree
	 */
	void exitParametroGraficarKMeans(LenguajeDominioEspecificoParser.ParametroGraficarKMeansContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#graficar}.
	 * @param ctx the parse tree
	 */
	void enterGraficar(LenguajeDominioEspecificoParser.GraficarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#graficar}.
	 * @param ctx the parse tree
	 */
	void exitGraficar(LenguajeDominioEspecificoParser.GraficarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficar}.
	 * @param ctx the parse tree
	 */
	void enterParametrosGraficar(LenguajeDominioEspecificoParser.ParametrosGraficarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosGraficar}.
	 * @param ctx the parse tree
	 */
	void exitParametrosGraficar(LenguajeDominioEspecificoParser.ParametrosGraficarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficar}.
	 * @param ctx the parse tree
	 */
	void enterParametroGraficar(LenguajeDominioEspecificoParser.ParametroGraficarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroGraficar}.
	 * @param ctx the parse tree
	 */
	void exitParametroGraficar(LenguajeDominioEspecificoParser.ParametroGraficarContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(LenguajeDominioEspecificoParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(LenguajeDominioEspecificoParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void enterOperaciones(LenguajeDominioEspecificoParser.OperacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#operaciones}.
	 * @param ctx the parse tree
	 */
	void exitOperaciones(LenguajeDominioEspecificoParser.OperacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosOp}.
	 * @param ctx the parse tree
	 */
	void enterParametrosOp(LenguajeDominioEspecificoParser.ParametrosOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosOp}.
	 * @param ctx the parse tree
	 */
	void exitParametrosOp(LenguajeDominioEspecificoParser.ParametrosOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MostrarTablaASCII}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#mostrarTabla}.
	 * @param ctx the parse tree
	 */
	void enterMostrarTablaASCII(LenguajeDominioEspecificoParser.MostrarTablaASCIIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MostrarTablaASCII}
	 * labeled alternative in {@link LenguajeDominioEspecificoParser#mostrarTabla}.
	 * @param ctx the parse tree
	 */
	void exitMostrarTablaASCII(LenguajeDominioEspecificoParser.MostrarTablaASCIIContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosTabla}.
	 * @param ctx the parse tree
	 */
	void enterParametrosTabla(LenguajeDominioEspecificoParser.ParametrosTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametrosTabla}.
	 * @param ctx the parse tree
	 */
	void exitParametrosTabla(LenguajeDominioEspecificoParser.ParametrosTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroTabla}.
	 * @param ctx the parse tree
	 */
	void enterParametroTabla(LenguajeDominioEspecificoParser.ParametroTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LenguajeDominioEspecificoParser#parametroTabla}.
	 * @param ctx the parse tree
	 */
	void exitParametroTabla(LenguajeDominioEspecificoParser.ParametroTablaContext ctx);
}