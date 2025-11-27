// Generated from ./LenguajeDominioEspecifico.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LenguajeDominioEspecificoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, MATRIZ=78, FOR=79, WHILE=80, IF=81, 
		ELIF=82, ELSE=83, IN=84, RANGE=85, PRINT=86, TRUE=87, FALSE=88, GRAFICAR=89, 
		MOSTRAR_TABLA=90, KMEANS=91, PERCEPTRON=92, REGRESION=93, ID=94, NUMBER=95, 
		STRING=96, COMENTARIO=97, WS=98;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_condicional = 2, RULE_buclefor = 3, 
		RULE_buclewhile = 4, RULE_comentario = 5, RULE_asignacion = 6, RULE_expresion = 7, 
		RULE_matriz = 8, RULE_fila = 9, RULE_lista = 10, RULE_parametrosMatriz = 11, 
		RULE_regresionLineal = 12, RULE_prediccionModelo = 13, RULE_parametrosPlot = 14, 
		RULE_parametroPlot = 15, RULE_escribirArchivo = 16, RULE_guardarMatriz = 17, 
		RULE_perceptronMulticapa = 18, RULE_parametrosMLP = 19, RULE_parametroMLP = 20, 
		RULE_parametrosEntrenamiento = 21, RULE_parametroEntrenamiento = 22, RULE_kmeans = 23, 
		RULE_parametrosKMeans = 24, RULE_parametroKMeans = 25, RULE_parametrosGraficarKMeans = 26, 
		RULE_parametroGraficarKMeans = 27, RULE_graficar = 28, RULE_parametrosGraficar = 29, 
		RULE_parametroGraficar = 30, RULE_impresion = 31, RULE_operaciones = 32, 
		RULE_parametrosOp = 33, RULE_mostrarTabla = 34, RULE_parametrosTabla = 35, 
		RULE_parametroTabla = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "condicional", "buclefor", "buclewhile", "comentario", 
			"asignacion", "expresion", "matriz", "fila", "lista", "parametrosMatriz", 
			"regresionLineal", "prediccionModelo", "parametrosPlot", "parametroPlot", 
			"escribirArchivo", "guardarMatriz", "perceptronMulticapa", "parametrosMLP", 
			"parametroMLP", "parametrosEntrenamiento", "parametroEntrenamiento", 
			"kmeans", "parametrosKMeans", "parametroKMeans", "parametrosGraficarKMeans", 
			"parametroGraficarKMeans", "graficar", "parametrosGraficar", "parametroGraficar", 
			"impresion", "operaciones", "parametrosOp", "mostrarTabla", "parametrosTabla", 
			"parametroTabla"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "'{'", "'}'", "','", "'='", "'*'", "'/'", 
			"'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'and'", 
			"'or'", "'not'", "'.'", "'suma'", "'resta'", "'multiplicar'", "'transpuesta'", 
			"'determinante'", "'inversa'", "'centroids'", "'leer_archivo'", "'cargar_matriz'", 
			"'['", "']'", "'fit'", "'mse'", "'mae'", "'r2'", "'rmse'", "'plot'", 
			"'predict'", "'width'", "'height'", "'left_margin'", "'point_char'", 
			"'line_char'", "'title'", "'show_stats'", "'output_file'", "'escribir_archivo'", 
			"'guardar_matriz'", "'score'", "'plot_loss'", "'layers'", "'learning_rate'", 
			"'seed'", "'epochs'", "'batch_size'", "'verbose'", "'n_clusters'", "'max_iter'", 
			"'abs'", "'factorial'", "'exp'", "'ln'", "'sqrt'", "'powf'", "'sin'", 
			"'cos'", "'tan'", "'div'", "'mod'", "'max_rows'", "'max_cols'", "'max_col_width'", 
			"'floatfmt'", "'show_index'", "'headers'", "'matriz'", "'for'", "'while'", 
			"'if'", "'elif'", "'else'", "'in'", "'range'", "'print'", "'True'", "'False'", 
			"'graficar'", "'mostrar_tabla'", "'KMeans'", "'PerceptronMulticapa'", 
			"'RegresionLineal'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "MATRIZ", "FOR", "WHILE", "IF", "ELIF", 
			"ELSE", "IN", "RANGE", "PRINT", "TRUE", "FALSE", "GRAFICAR", "MOSTRAR_TABLA", 
			"KMEANS", "PERCEPTRON", "REGRESION", "ID", "NUMBER", "STRING", "COMENTARIO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LenguajeDominioEspecifico.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeDominioEspecificoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LenguajeDominioEspecificoParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
				{
				{
				setState(74);
				instruccion();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public RegresionLinealContext regresionLineal() {
			return getRuleContext(RegresionLinealContext.class,0);
		}
		public PerceptronMulticapaContext perceptronMulticapa() {
			return getRuleContext(PerceptronMulticapaContext.class,0);
		}
		public PrediccionModeloContext prediccionModelo() {
			return getRuleContext(PrediccionModeloContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public ComentarioContext comentario() {
			return getRuleContext(ComentarioContext.class,0);
		}
		public BucleforContext buclefor() {
			return getRuleContext(BucleforContext.class,0);
		}
		public BuclewhileContext buclewhile() {
			return getRuleContext(BuclewhileContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public MostrarTablaContext mostrarTabla() {
			return getRuleContext(MostrarTablaContext.class,0);
		}
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public KmeansContext kmeans() {
			return getRuleContext(KmeansContext.class,0);
		}
		public GraficarContext graficar() {
			return getRuleContext(GraficarContext.class,0);
		}
		public EscribirArchivoContext escribirArchivo() {
			return getRuleContext(EscribirArchivoContext.class,0);
		}
		public GuardarMatrizContext guardarMatriz() {
			return getRuleContext(GuardarMatrizContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				regresionLineal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				perceptronMulticapa();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				prediccionModelo();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				impresion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				comentario();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				buclefor();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(89);
				buclewhile();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(90);
				condicional();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(91);
				mostrarTabla();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(92);
				operaciones();
				setState(93);
				match(T__0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(95);
				kmeans();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(96);
				graficar();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(97);
				escribirArchivo();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(98);
				guardarMatriz();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LenguajeDominioEspecificoParser.IF, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(LenguajeDominioEspecificoParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(LenguajeDominioEspecificoParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(LenguajeDominioEspecificoParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			match(T__1);
			setState(103);
			expresion(0);
			setState(104);
			match(T__2);
			setState(105);
			match(T__3);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
				{
				{
				setState(106);
				instruccion();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__4);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(113);
				match(ELIF);
				setState(114);
				match(T__1);
				setState(115);
				expresion(0);
				setState(116);
				match(T__2);
				setState(117);
				match(T__3);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
					{
					{
					setState(118);
					instruccion();
					}
					}
					setState(123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				match(T__4);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(131);
				match(ELSE);
				setState(132);
				match(T__3);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
					{
					{
					setState(133);
					instruccion();
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(T__4);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BucleforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LenguajeDominioEspecificoParser.FOR, 0); }
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public TerminalNode IN() { return getToken(LenguajeDominioEspecificoParser.IN, 0); }
		public TerminalNode RANGE() { return getToken(LenguajeDominioEspecificoParser.RANGE, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BucleforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclefor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterBuclefor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitBuclefor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitBuclefor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucleforContext buclefor() throws RecognitionException {
		BucleforContext _localctx = new BucleforContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_buclefor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FOR);
			setState(143);
			match(T__1);
			setState(144);
			match(ID);
			setState(145);
			match(IN);
			setState(146);
			match(RANGE);
			setState(147);
			match(T__1);
			setState(148);
			expresion(0);
			setState(149);
			match(T__5);
			setState(150);
			expresion(0);
			setState(151);
			match(T__2);
			setState(152);
			match(T__2);
			setState(153);
			match(T__3);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
				{
				{
				setState(154);
				instruccion();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuclewhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(LenguajeDominioEspecificoParser.WHILE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BuclewhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buclewhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterBuclewhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitBuclewhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitBuclewhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuclewhileContext buclewhile() throws RecognitionException {
		BuclewhileContext _localctx = new BuclewhileContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_buclewhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(WHILE);
			setState(163);
			match(T__1);
			setState(164);
			expresion(0);
			setState(165);
			match(T__2);
			setState(166);
			match(T__3);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 49)) & ~0x3f) == 0 && ((1L << (_la - 49)) & 320102847213571L) != 0)) {
				{
				{
				setState(167);
				instruccion();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIO() { return getToken(LenguajeDominioEspecificoParser.COMENTARIO, 0); }
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitComentario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitComentario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comentario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COMENTARIO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(ID);
			setState(178);
			match(T__6);
			setState(179);
			expresion(0);
			setState(180);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionListaContext extends ExpresionContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ExpresionListaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionLista(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionNotContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionNotContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionNumeroContext extends ExpresionContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public ExpresionNumeroContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionNumero(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacionSumaRestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperacionSumaRestaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterOperacionSumaResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitOperacionSumaResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitOperacionSumaResta(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionStringContext extends ExpresionContext {
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public ExpresionStringContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionCargarMatrizContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionCargarMatrizContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionCargarMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionCargarMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionCargarMatriz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionBooleanoContext extends ExpresionContext {
		public TerminalNode TRUE() { return getToken(LenguajeDominioEspecificoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LenguajeDominioEspecificoParser.FALSE, 0); }
		public ExpresionBooleanoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionParentesisContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionParentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionComparacionContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExpresionComparacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionComparacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLeerArchivoContext extends ExpresionContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ExpresionLeerArchivoContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionLeerArchivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionLeerArchivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionLeerArchivo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionVariableContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public ExpresionVariableContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionLogicaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ExpresionLogicaContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionLogica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionLogica(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacionMatrizExprContext extends ExpresionContext {
		public Token operacion;
		public TerminalNode MATRIZ() { return getToken(LenguajeDominioEspecificoParser.MATRIZ, 0); }
		public ParametrosMatrizContext parametrosMatriz() {
			return getRuleContext(ParametrosMatrizContext.class,0);
		}
		public OperacionMatrizExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterOperacionMatrizExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitOperacionMatrizExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitOperacionMatrizExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionOperacionContext extends ExpresionContext {
		public OperacionesContext operaciones() {
			return getRuleContext(OperacionesContext.class,0);
		}
		public ExpresionOperacionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionOperacion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionMatrizContext extends ExpresionContext {
		public MatrizContext matriz() {
			return getRuleContext(MatrizContext.class,0);
		}
		public ExpresionMatrizContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterExpresionMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitExpresionMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitExpresionMatriz(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccesoCentroidesContext extends ExpresionContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public AccesoCentroidesContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterAccesoCentroides(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitAccesoCentroides(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitAccesoCentroides(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrearRegresionContext extends ExpresionContext {
		public TerminalNode REGRESION() { return getToken(LenguajeDominioEspecificoParser.REGRESION, 0); }
		public CrearRegresionContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterCrearRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitCrearRegresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitCrearRegresion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperacionMultDivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public OperacionMultDivContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterOperacionMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitOperacionMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitOperacionMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new ExpresionNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(183);
				match(T__20);
				setState(184);
				expresion(15);
				}
				break;
			case 2:
				{
				_localctx = new ExpresionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(T__1);
				setState(186);
				expresion(0);
				setState(187);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new OperacionMatrizExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(MATRIZ);
				setState(190);
				match(T__21);
				setState(191);
				((OperacionMatrizExprContext)_localctx).operacion = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 528482304L) != 0)) ) {
					((OperacionMatrizExprContext)_localctx).operacion = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(192);
				match(T__1);
				setState(193);
				parametrosMatriz();
				setState(194);
				match(T__2);
				}
				break;
			case 4:
				{
				_localctx = new AccesoCentroidesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(ID);
				setState(197);
				match(T__21);
				setState(198);
				match(T__28);
				}
				break;
			case 5:
				{
				_localctx = new CrearRegresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(REGRESION);
				setState(200);
				match(T__1);
				setState(201);
				match(T__2);
				}
				break;
			case 6:
				{
				_localctx = new ExpresionOperacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				operaciones();
				}
				break;
			case 7:
				{
				_localctx = new ExpresionMatrizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				matriz();
				}
				break;
			case 8:
				{
				_localctx = new ExpresionListaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				lista();
				}
				break;
			case 9:
				{
				_localctx = new ExpresionNumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				match(NUMBER);
				}
				break;
			case 10:
				{
				_localctx = new ExpresionVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new ExpresionStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(207);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new ExpresionBooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(208);
				match(TRUE);
				}
				break;
			case 13:
				{
				_localctx = new ExpresionBooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209);
				match(FALSE);
				}
				break;
			case 14:
				{
				_localctx = new ExpresionLeerArchivoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__29);
				setState(211);
				match(T__1);
				setState(212);
				expresion(0);
				setState(213);
				match(T__2);
				}
				break;
			case 15:
				{
				_localctx = new ExpresionCargarMatrizContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				match(T__30);
				setState(216);
				match(T__1);
				setState(217);
				expresion(0);
				setState(218);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(234);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new OperacionMultDivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(222);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(223);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(224);
						expresion(20);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionComparacionContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(225);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(226);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(227);
						expresion(19);
						}
						break;
					case 3:
						{
						_localctx = new OperacionSumaRestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(228);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(229);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(230);
						expresion(18);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionLogicaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(231);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(232);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==T__19) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						expresion(17);
						}
						break;
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatrizContext extends ParserRuleContext {
		public MatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matriz; }
	 
		public MatrizContext() { }
		public void copyFrom(MatrizContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatrizMultiFilaContext extends MatrizContext {
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public MatrizMultiFilaContext(MatrizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterMatrizMultiFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitMatrizMultiFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitMatrizMultiFila(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MatrizUnidimensionalContext extends MatrizContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public MatrizUnidimensionalContext(MatrizContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterMatrizUnidimensional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitMatrizUnidimensional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitMatrizUnidimensional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatrizContext matriz() throws RecognitionException {
		MatrizContext _localctx = new MatrizContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matriz);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new MatrizMultiFilaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(T__31);
				setState(240);
				fila();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(241);
					match(T__5);
					setState(242);
					fila();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(T__32);
				}
				break;
			case 2:
				_localctx = new MatrizUnidimensionalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(T__31);
				setState(251);
				expresion(0);
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(252);
					match(T__5);
					setState(253);
					expresion(0);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(259);
				match(T__32);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterFila(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitFila(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitFila(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fila);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__31);
			setState(264);
			expresion(0);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(265);
				match(T__5);
				setState(266);
				expresion(0);
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterLista(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitLista(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitLista(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__31);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843001695404028L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8078246143L) != 0)) {
				{
				setState(275);
				expresion(0);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(276);
					match(T__5);
					setState(277);
					expresion(0);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(T__32);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosMatrizContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametrosMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosMatriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosMatrizContext parametrosMatriz() throws RecognitionException {
		ParametrosMatrizContext _localctx = new ParametrosMatrizContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parametrosMatriz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			expresion(0);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(288);
				match(T__5);
				setState(289);
				expresion(0);
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegresionLinealContext extends ParserRuleContext {
		public RegresionLinealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regresionLineal; }
	 
		public RegresionLinealContext() { }
		public void copyFrom(RegresionLinealContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraficarRegresionContext extends RegresionLinealContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public ParametrosPlotContext parametrosPlot() {
			return getRuleContext(ParametrosPlotContext.class,0);
		}
		public GraficarRegresionContext(RegresionLinealContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterGraficarRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitGraficarRegresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitGraficarRegresion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntrenarRegresionContext extends RegresionLinealContext {
		public ExpresionContext x;
		public ExpresionContext y;
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public EntrenarRegresionContext(RegresionLinealContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterEntrenarRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitEntrenarRegresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitEntrenarRegresion(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObtenerMetricaRegresionContext extends RegresionLinealContext {
		public Token target;
		public Token modelo;
		public Token metrica;
		public List<TerminalNode> ID() { return getTokens(LenguajeDominioEspecificoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeDominioEspecificoParser.ID, i);
		}
		public ObtenerMetricaRegresionContext(RegresionLinealContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterObtenerMetricaRegresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitObtenerMetricaRegresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitObtenerMetricaRegresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegresionLinealContext regresionLineal() throws RecognitionException {
		RegresionLinealContext _localctx = new RegresionLinealContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_regresionLineal);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new EntrenarRegresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);
				setState(296);
				match(T__21);
				setState(297);
				match(T__33);
				setState(298);
				match(T__1);
				setState(299);
				((EntrenarRegresionContext)_localctx).x = expresion(0);
				setState(300);
				match(T__5);
				setState(301);
				((EntrenarRegresionContext)_localctx).y = expresion(0);
				setState(302);
				match(T__2);
				setState(303);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ObtenerMetricaRegresionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				((ObtenerMetricaRegresionContext)_localctx).target = match(ID);
				setState(306);
				match(T__6);
				setState(307);
				((ObtenerMetricaRegresionContext)_localctx).modelo = match(ID);
				setState(308);
				match(T__21);
				setState(309);
				((ObtenerMetricaRegresionContext)_localctx).metrica = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
					((ObtenerMetricaRegresionContext)_localctx).metrica = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				match(T__1);
				setState(311);
				match(T__2);
				setState(312);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new GraficarRegresionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(313);
				match(ID);
				setState(314);
				match(T__21);
				setState(315);
				match(T__38);
				setState(316);
				match(T__1);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 560750930165760L) != 0)) {
					{
					setState(317);
					parametrosPlot();
					}
				}

				setState(320);
				match(T__2);
				setState(321);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrediccionModeloContext extends ParserRuleContext {
		public PrediccionModeloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prediccionModelo; }
	 
		public PrediccionModeloContext() { }
		public void copyFrom(PrediccionModeloContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredecirModeloContext extends PrediccionModeloContext {
		public Token target;
		public Token modelo;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(LenguajeDominioEspecificoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeDominioEspecificoParser.ID, i);
		}
		public PredecirModeloContext(PrediccionModeloContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterPredecirModelo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitPredecirModelo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitPredecirModelo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrediccionModeloContext prediccionModelo() throws RecognitionException {
		PrediccionModeloContext _localctx = new PrediccionModeloContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_prediccionModelo);
		try {
			_localctx = new PredecirModeloContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			((PredecirModeloContext)_localctx).target = match(ID);
			setState(325);
			match(T__6);
			setState(326);
			((PredecirModeloContext)_localctx).modelo = match(ID);
			setState(327);
			match(T__21);
			setState(328);
			match(T__39);
			setState(329);
			match(T__1);
			setState(330);
			expresion(0);
			setState(331);
			match(T__2);
			setState(332);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosPlotContext extends ParserRuleContext {
		public List<ParametroPlotContext> parametroPlot() {
			return getRuleContexts(ParametroPlotContext.class);
		}
		public ParametroPlotContext parametroPlot(int i) {
			return getRuleContext(ParametroPlotContext.class,i);
		}
		public ParametrosPlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosPlot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosPlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosPlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosPlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosPlotContext parametrosPlot() throws RecognitionException {
		ParametrosPlotContext _localctx = new ParametrosPlotContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametrosPlot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			parametroPlot();
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(335);
				match(T__5);
				setState(336);
				parametroPlot();
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroPlotContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(LenguajeDominioEspecificoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LenguajeDominioEspecificoParser.FALSE, 0); }
		public ParametroPlotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroPlot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroPlot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroPlot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroPlot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroPlotContext parametroPlot() throws RecognitionException {
		ParametroPlotContext _localctx = new ParametroPlotContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parametroPlot);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(T__40);
				setState(343);
				match(T__6);
				setState(344);
				match(NUMBER);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(T__41);
				setState(346);
				match(T__6);
				setState(347);
				match(NUMBER);
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(T__42);
				setState(349);
				match(T__6);
				setState(350);
				match(NUMBER);
				}
				break;
			case T__43:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(T__43);
				setState(352);
				match(T__6);
				setState(353);
				match(STRING);
				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				match(T__44);
				setState(355);
				match(T__6);
				setState(356);
				match(STRING);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 6);
				{
				setState(357);
				match(T__45);
				setState(358);
				match(T__6);
				setState(359);
				match(STRING);
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				match(T__46);
				setState(361);
				match(T__6);
				setState(362);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 8);
				{
				setState(363);
				match(T__47);
				setState(364);
				match(T__6);
				setState(365);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EscribirArchivoContext extends ParserRuleContext {
		public ExpresionContext nombre;
		public ExpresionContext contenido;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public EscribirArchivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escribirArchivo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterEscribirArchivo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitEscribirArchivo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitEscribirArchivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EscribirArchivoContext escribirArchivo() throws RecognitionException {
		EscribirArchivoContext _localctx = new EscribirArchivoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_escribirArchivo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(T__48);
			setState(369);
			match(T__1);
			setState(370);
			((EscribirArchivoContext)_localctx).nombre = expresion(0);
			setState(371);
			match(T__5);
			setState(372);
			((EscribirArchivoContext)_localctx).contenido = expresion(0);
			setState(373);
			match(T__2);
			setState(374);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GuardarMatrizContext extends ParserRuleContext {
		public ExpresionContext nombre;
		public ExpresionContext matriz_expr;
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public GuardarMatrizContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardarMatriz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterGuardarMatriz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitGuardarMatriz(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitGuardarMatriz(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardarMatrizContext guardarMatriz() throws RecognitionException {
		GuardarMatrizContext _localctx = new GuardarMatrizContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_guardarMatriz);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(T__49);
			setState(377);
			match(T__1);
			setState(378);
			((GuardarMatrizContext)_localctx).nombre = expresion(0);
			setState(379);
			match(T__5);
			setState(380);
			((GuardarMatrizContext)_localctx).matriz_expr = expresion(0);
			setState(381);
			match(T__2);
			setState(382);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PerceptronMulticapaContext extends ParserRuleContext {
		public PerceptronMulticapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perceptronMulticapa; }
	 
		public PerceptronMulticapaContext() { }
		public void copyFrom(PerceptronMulticapaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrearMLPContext extends PerceptronMulticapaContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public TerminalNode PERCEPTRON() { return getToken(LenguajeDominioEspecificoParser.PERCEPTRON, 0); }
		public ParametrosMLPContext parametrosMLP() {
			return getRuleContext(ParametrosMLPContext.class,0);
		}
		public CrearMLPContext(PerceptronMulticapaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterCrearMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitCrearMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitCrearMLP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntrenarMLPContext extends PerceptronMulticapaContext {
		public ExpresionContext x;
		public ExpresionContext y;
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametrosEntrenamientoContext parametrosEntrenamiento() {
			return getRuleContext(ParametrosEntrenamientoContext.class,0);
		}
		public EntrenarMLPContext(PerceptronMulticapaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterEntrenarMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitEntrenarMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitEntrenarMLP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraficarPerdidaMLPContext extends PerceptronMulticapaContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public GraficarPerdidaMLPContext(PerceptronMulticapaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterGraficarPerdidaMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitGraficarPerdidaMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitGraficarPerdidaMLP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EvaluarMLPContext extends PerceptronMulticapaContext {
		public Token target;
		public Token modelo;
		public ExpresionContext x;
		public ExpresionContext y;
		public List<TerminalNode> ID() { return getTokens(LenguajeDominioEspecificoParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LenguajeDominioEspecificoParser.ID, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public EvaluarMLPContext(PerceptronMulticapaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterEvaluarMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitEvaluarMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitEvaluarMLP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerceptronMulticapaContext perceptronMulticapa() throws RecognitionException {
		PerceptronMulticapaContext _localctx = new PerceptronMulticapaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_perceptronMulticapa);
		int _la;
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new CrearMLPContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				match(ID);
				setState(385);
				match(T__6);
				setState(386);
				match(PERCEPTRON);
				setState(387);
				match(T__1);
				setState(388);
				parametrosMLP();
				setState(389);
				match(T__2);
				setState(390);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new EntrenarMLPContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(393);
				match(T__21);
				setState(394);
				match(T__33);
				setState(395);
				match(T__1);
				setState(396);
				((EntrenarMLPContext)_localctx).x = expresion(0);
				setState(397);
				match(T__5);
				setState(398);
				((EntrenarMLPContext)_localctx).y = expresion(0);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(399);
					match(T__5);
					setState(400);
					parametrosEntrenamiento();
					}
				}

				setState(403);
				match(T__2);
				setState(404);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new EvaluarMLPContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				((EvaluarMLPContext)_localctx).target = match(ID);
				setState(407);
				match(T__6);
				setState(408);
				((EvaluarMLPContext)_localctx).modelo = match(ID);
				setState(409);
				match(T__21);
				setState(410);
				match(T__50);
				setState(411);
				match(T__1);
				setState(412);
				((EvaluarMLPContext)_localctx).x = expresion(0);
				setState(413);
				match(T__5);
				setState(414);
				((EvaluarMLPContext)_localctx).y = expresion(0);
				setState(415);
				match(T__2);
				setState(416);
				match(T__0);
				}
				break;
			case 4:
				_localctx = new GraficarPerdidaMLPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(ID);
				setState(419);
				match(T__21);
				setState(420);
				match(T__51);
				setState(421);
				match(T__1);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(422);
					match(STRING);
					}
				}

				setState(425);
				match(T__2);
				setState(426);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosMLPContext extends ParserRuleContext {
		public List<ParametroMLPContext> parametroMLP() {
			return getRuleContexts(ParametroMLPContext.class);
		}
		public ParametroMLPContext parametroMLP(int i) {
			return getRuleContext(ParametroMLPContext.class,i);
		}
		public ParametrosMLPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosMLP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosMLP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosMLPContext parametrosMLP() throws RecognitionException {
		ParametrosMLPContext _localctx = new ParametrosMLPContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametrosMLP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			parametroMLP();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(430);
				match(T__5);
				setState(431);
				parametroMLP();
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroMLPContext extends ParserRuleContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public ParametroMLPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroMLP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroMLP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroMLP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroMLP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroMLPContext parametroMLP() throws RecognitionException {
		ParametroMLPContext _localctx = new ParametroMLPContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametroMLP);
		try {
			setState(446);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				match(T__52);
				setState(438);
				match(T__6);
				setState(439);
				lista();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(T__53);
				setState(441);
				match(T__6);
				setState(442);
				match(NUMBER);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 3);
				{
				setState(443);
				match(T__54);
				setState(444);
				match(T__6);
				setState(445);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosEntrenamientoContext extends ParserRuleContext {
		public List<ParametroEntrenamientoContext> parametroEntrenamiento() {
			return getRuleContexts(ParametroEntrenamientoContext.class);
		}
		public ParametroEntrenamientoContext parametroEntrenamiento(int i) {
			return getRuleContext(ParametroEntrenamientoContext.class,i);
		}
		public ParametrosEntrenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosEntrenamiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosEntrenamiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosEntrenamiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosEntrenamiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosEntrenamientoContext parametrosEntrenamiento() throws RecognitionException {
		ParametrosEntrenamientoContext _localctx = new ParametrosEntrenamientoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parametrosEntrenamiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			parametroEntrenamiento();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(449);
				match(T__5);
				setState(450);
				parametroEntrenamiento();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroEntrenamientoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(LenguajeDominioEspecificoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LenguajeDominioEspecificoParser.FALSE, 0); }
		public ParametroEntrenamientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroEntrenamiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroEntrenamiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroEntrenamiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroEntrenamiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroEntrenamientoContext parametroEntrenamiento() throws RecognitionException {
		ParametroEntrenamientoContext _localctx = new ParametroEntrenamientoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parametroEntrenamiento);
		int _la;
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__55:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				match(T__55);
				setState(457);
				match(T__6);
				setState(458);
				match(NUMBER);
				}
				break;
			case T__56:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				match(T__56);
				setState(460);
				match(T__6);
				setState(461);
				match(NUMBER);
				}
				break;
			case T__57:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				match(T__57);
				setState(463);
				match(T__6);
				setState(464);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KmeansContext extends ParserRuleContext {
		public KmeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kmeans; }
	 
		public KmeansContext() { }
		public void copyFrom(KmeansContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CrearKMeansContext extends KmeansContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public TerminalNode KMEANS() { return getToken(LenguajeDominioEspecificoParser.KMEANS, 0); }
		public ParametrosKMeansContext parametrosKMeans() {
			return getRuleContext(ParametrosKMeansContext.class,0);
		}
		public CrearKMeansContext(KmeansContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterCrearKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitCrearKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitCrearKMeans(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntrenarKMeansContext extends KmeansContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public EntrenarKMeansContext(KmeansContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterEntrenarKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitEntrenarKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitEntrenarKMeans(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GraficarKMeansContext extends KmeansContext {
		public TerminalNode ID() { return getToken(LenguajeDominioEspecificoParser.ID, 0); }
		public ParametrosGraficarKMeansContext parametrosGraficarKMeans() {
			return getRuleContext(ParametrosGraficarKMeansContext.class,0);
		}
		public GraficarKMeansContext(KmeansContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterGraficarKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitGraficarKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitGraficarKMeans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KmeansContext kmeans() throws RecognitionException {
		KmeansContext _localctx = new KmeansContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_kmeans);
		int _la;
		try {
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new CrearKMeansContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(ID);
				setState(468);
				match(T__6);
				setState(469);
				match(KMEANS);
				setState(470);
				match(T__1);
				setState(471);
				parametrosKMeans();
				setState(472);
				match(T__2);
				setState(473);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new EntrenarKMeansContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(475);
				match(ID);
				setState(476);
				match(T__21);
				setState(477);
				match(T__33);
				setState(478);
				match(T__1);
				setState(479);
				expresion(0);
				setState(480);
				match(T__2);
				setState(481);
				match(T__0);
				}
				break;
			case 3:
				_localctx = new GraficarKMeansContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				match(ID);
				setState(484);
				match(T__21);
				setState(485);
				match(T__38);
				setState(486);
				match(T__1);
				setState(488);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 288072046477312L) != 0)) {
					{
					setState(487);
					parametrosGraficarKMeans();
					}
				}

				setState(490);
				match(T__2);
				setState(491);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosKMeansContext extends ParserRuleContext {
		public List<ParametroKMeansContext> parametroKMeans() {
			return getRuleContexts(ParametroKMeansContext.class);
		}
		public ParametroKMeansContext parametroKMeans(int i) {
			return getRuleContext(ParametroKMeansContext.class,i);
		}
		public ParametrosKMeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosKMeans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosKMeans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosKMeansContext parametrosKMeans() throws RecognitionException {
		ParametrosKMeansContext _localctx = new ParametrosKMeansContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parametrosKMeans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			parametroKMeans();
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(495);
				match(T__5);
				setState(496);
				parametroKMeans();
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroKMeansContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public ParametroKMeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroKMeans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroKMeans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroKMeansContext parametroKMeans() throws RecognitionException {
		ParametroKMeansContext _localctx = new ParametroKMeansContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_parametroKMeans);
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(T__58);
				setState(503);
				match(T__6);
				setState(504);
				match(NUMBER);
				}
				break;
			case T__59:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(T__59);
				setState(506);
				match(T__6);
				setState(507);
				match(NUMBER);
				}
				break;
			case T__54:
				enterOuterAlt(_localctx, 3);
				{
				setState(508);
				match(T__54);
				setState(509);
				match(T__6);
				setState(510);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosGraficarKMeansContext extends ParserRuleContext {
		public List<ParametroGraficarKMeansContext> parametroGraficarKMeans() {
			return getRuleContexts(ParametroGraficarKMeansContext.class);
		}
		public ParametroGraficarKMeansContext parametroGraficarKMeans(int i) {
			return getRuleContext(ParametroGraficarKMeansContext.class,i);
		}
		public ParametrosGraficarKMeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosGraficarKMeans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosGraficarKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosGraficarKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosGraficarKMeans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosGraficarKMeansContext parametrosGraficarKMeans() throws RecognitionException {
		ParametrosGraficarKMeansContext _localctx = new ParametrosGraficarKMeansContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parametrosGraficarKMeans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			parametroGraficarKMeans();
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(514);
				match(T__5);
				setState(515);
				parametroGraficarKMeans();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroGraficarKMeansContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public ParametroGraficarKMeansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroGraficarKMeans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroGraficarKMeans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroGraficarKMeans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroGraficarKMeans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroGraficarKMeansContext parametroGraficarKMeans() throws RecognitionException {
		ParametroGraficarKMeansContext _localctx = new ParametroGraficarKMeansContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_parametroGraficarKMeans);
		try {
			setState(530);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(521);
				match(T__40);
				setState(522);
				match(T__6);
				setState(523);
				match(NUMBER);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(T__41);
				setState(525);
				match(T__6);
				setState(526);
				match(NUMBER);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				match(T__47);
				setState(528);
				match(T__6);
				setState(529);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GraficarContext extends ParserRuleContext {
		public ExpresionContext x;
		public ExpresionContext y;
		public TerminalNode GRAFICAR() { return getToken(LenguajeDominioEspecificoParser.GRAFICAR, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametrosGraficarContext parametrosGraficar() {
			return getRuleContext(ParametrosGraficarContext.class,0);
		}
		public GraficarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graficar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterGraficar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitGraficar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitGraficar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraficarContext graficar() throws RecognitionException {
		GraficarContext _localctx = new GraficarContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_graficar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(GRAFICAR);
			setState(533);
			match(T__1);
			setState(534);
			((GraficarContext)_localctx).x = expresion(0);
			setState(535);
			match(T__5);
			setState(536);
			((GraficarContext)_localctx).y = expresion(0);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(537);
				match(T__5);
				setState(538);
				parametrosGraficar();
				}
			}

			setState(541);
			match(T__2);
			setState(542);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosGraficarContext extends ParserRuleContext {
		public List<ParametroGraficarContext> parametroGraficar() {
			return getRuleContexts(ParametroGraficarContext.class);
		}
		public ParametroGraficarContext parametroGraficar(int i) {
			return getRuleContext(ParametroGraficarContext.class,i);
		}
		public ParametrosGraficarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosGraficar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosGraficar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosGraficar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosGraficar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosGraficarContext parametrosGraficar() throws RecognitionException {
		ParametrosGraficarContext _localctx = new ParametrosGraficarContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametrosGraficar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			parametroGraficar();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(545);
				match(T__5);
				setState(546);
				parametroGraficar();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroGraficarContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public ParametroGraficarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroGraficar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroGraficar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroGraficar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroGraficar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroGraficarContext parametroGraficar() throws RecognitionException {
		ParametroGraficarContext _localctx = new ParametroGraficarContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_parametroGraficar);
		try {
			setState(564);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__40:
				enterOuterAlt(_localctx, 1);
				{
				setState(552);
				match(T__40);
				setState(553);
				match(T__6);
				setState(554);
				match(NUMBER);
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				match(T__41);
				setState(556);
				match(T__6);
				setState(557);
				match(NUMBER);
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(558);
				match(T__45);
				setState(559);
				match(T__6);
				setState(560);
				match(STRING);
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				match(T__47);
				setState(562);
				match(T__6);
				setState(563);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(LenguajeDominioEspecificoParser.PRINT, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_impresion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(PRINT);
			setState(567);
			match(T__1);
			setState(568);
			expresion(0);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(569);
				match(T__5);
				setState(570);
				expresion(0);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(T__2);
			setState(577);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperacionesContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParametrosOpContext parametrosOp() {
			return getRuleContext(ParametrosOpContext.class,0);
		}
		public OperacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterOperaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitOperaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitOperaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionesContext operaciones() throws RecognitionException {
		OperacionesContext _localctx = new OperacionesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_operaciones);
		try {
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__60:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(T__60);
				setState(580);
				match(T__1);
				setState(581);
				expresion(0);
				setState(582);
				match(T__2);
				}
				break;
			case T__61:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				match(T__61);
				setState(585);
				match(T__1);
				setState(586);
				expresion(0);
				setState(587);
				match(T__2);
				}
				break;
			case T__62:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				match(T__62);
				setState(590);
				match(T__1);
				setState(591);
				expresion(0);
				setState(592);
				match(T__2);
				}
				break;
			case T__63:
				enterOuterAlt(_localctx, 4);
				{
				setState(594);
				match(T__63);
				setState(595);
				match(T__1);
				setState(596);
				expresion(0);
				setState(597);
				match(T__2);
				}
				break;
			case T__64:
				enterOuterAlt(_localctx, 5);
				{
				setState(599);
				match(T__64);
				setState(600);
				match(T__1);
				setState(601);
				expresion(0);
				setState(602);
				match(T__2);
				}
				break;
			case T__65:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				match(T__65);
				setState(605);
				match(T__1);
				setState(606);
				parametrosOp();
				setState(607);
				match(T__2);
				}
				break;
			case T__66:
				enterOuterAlt(_localctx, 7);
				{
				setState(609);
				match(T__66);
				setState(610);
				match(T__1);
				setState(611);
				expresion(0);
				setState(612);
				match(T__2);
				}
				break;
			case T__67:
				enterOuterAlt(_localctx, 8);
				{
				setState(614);
				match(T__67);
				setState(615);
				match(T__1);
				setState(616);
				expresion(0);
				setState(617);
				match(T__2);
				}
				break;
			case T__68:
				enterOuterAlt(_localctx, 9);
				{
				setState(619);
				match(T__68);
				setState(620);
				match(T__1);
				setState(621);
				expresion(0);
				setState(622);
				match(T__2);
				}
				break;
			case T__69:
				enterOuterAlt(_localctx, 10);
				{
				setState(624);
				match(T__69);
				setState(625);
				match(T__1);
				setState(626);
				parametrosOp();
				setState(627);
				match(T__2);
				}
				break;
			case T__70:
				enterOuterAlt(_localctx, 11);
				{
				setState(629);
				match(T__70);
				setState(630);
				match(T__1);
				setState(631);
				parametrosOp();
				setState(632);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosOpContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ParametrosOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosOpContext parametrosOp() throws RecognitionException {
		ParametrosOpContext _localctx = new ParametrosOpContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_parametrosOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			expresion(0);
			setState(637);
			match(T__5);
			setState(638);
			expresion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MostrarTablaContext extends ParserRuleContext {
		public MostrarTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mostrarTabla; }
	 
		public MostrarTablaContext() { }
		public void copyFrom(MostrarTablaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MostrarTablaASCIIContext extends MostrarTablaContext {
		public TerminalNode MOSTRAR_TABLA() { return getToken(LenguajeDominioEspecificoParser.MOSTRAR_TABLA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ParametrosTablaContext parametrosTabla() {
			return getRuleContext(ParametrosTablaContext.class,0);
		}
		public MostrarTablaASCIIContext(MostrarTablaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterMostrarTablaASCII(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitMostrarTablaASCII(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitMostrarTablaASCII(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MostrarTablaContext mostrarTabla() throws RecognitionException {
		MostrarTablaContext _localctx = new MostrarTablaContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mostrarTabla);
		int _la;
		try {
			_localctx = new MostrarTablaASCIIContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			match(MOSTRAR_TABLA);
			setState(641);
			match(T__1);
			setState(642);
			expresion(0);
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(643);
				match(T__5);
				setState(644);
				parametrosTabla();
				}
			}

			setState(647);
			match(T__2);
			setState(648);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosTablaContext extends ParserRuleContext {
		public List<ParametroTablaContext> parametroTabla() {
			return getRuleContexts(ParametroTablaContext.class);
		}
		public ParametroTablaContext parametroTabla(int i) {
			return getRuleContext(ParametroTablaContext.class,i);
		}
		public ParametrosTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametrosTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametrosTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametrosTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosTablaContext parametrosTabla() throws RecognitionException {
		ParametrosTablaContext _localctx = new ParametrosTablaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parametrosTabla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(650);
			parametroTabla();
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(651);
				match(T__5);
				setState(652);
				parametroTabla();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroTablaContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(LenguajeDominioEspecificoParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(LenguajeDominioEspecificoParser.STRING, 0); }
		public TerminalNode TRUE() { return getToken(LenguajeDominioEspecificoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LenguajeDominioEspecificoParser.FALSE, 0); }
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ParametroTablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametroTabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).enterParametroTabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LenguajeDominioEspecificoListener ) ((LenguajeDominioEspecificoListener)listener).exitParametroTabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeDominioEspecificoVisitor ) return ((LenguajeDominioEspecificoVisitor<? extends T>)visitor).visitParametroTabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroTablaContext parametroTabla() throws RecognitionException {
		ParametroTablaContext _localctx = new ParametroTablaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parametroTabla);
		int _la;
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__71:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(T__71);
				setState(659);
				match(T__6);
				setState(660);
				match(NUMBER);
				}
				break;
			case T__72:
				enterOuterAlt(_localctx, 2);
				{
				setState(661);
				match(T__72);
				setState(662);
				match(T__6);
				setState(663);
				match(NUMBER);
				}
				break;
			case T__73:
				enterOuterAlt(_localctx, 3);
				{
				setState(664);
				match(T__73);
				setState(665);
				match(T__6);
				setState(666);
				match(NUMBER);
				}
				break;
			case T__74:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				match(T__74);
				setState(668);
				match(T__6);
				setState(669);
				match(STRING);
				}
				break;
			case T__75:
				enterOuterAlt(_localctx, 5);
				{
				setState(670);
				match(T__75);
				setState(671);
				match(T__6);
				setState(672);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__76:
				enterOuterAlt(_localctx, 6);
				{
				setState(673);
				match(T__76);
				setState(674);
				match(T__6);
				setState(675);
				lista();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001b\u02a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002l\b\u0002"+
		"\n\u0002\f\u0002o\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002x\b\u0002\n\u0002\f\u0002"+
		"{\t\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u007f\b\u0002\n\u0002\f"+
		"\u0002\u0082\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0087"+
		"\b\u0002\n\u0002\f\u0002\u008a\t\u0002\u0001\u0002\u0003\u0002\u008d\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u009c\b\u0003\n\u0003\f\u0003\u009f\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u00a9\b\u0004\n\u0004\f\u0004\u00ac"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00dd\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00eb\b\u0007\n\u0007\f\u0007\u00ee\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f4\b\b\n\b\f\b\u00f7\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00ff\b\b\n\b\f\b\u0102"+
		"\t\b\u0001\b\u0001\b\u0003\b\u0106\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u010c\b\t\n\t\f\t\u010f\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0117\b\n\n\n\f\n\u011a\t\n\u0003\n\u011c\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0123\b\u000b"+
		"\n\u000b\f\u000b\u0126\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u013f\b\f\u0001\f\u0001\f\u0003\f\u0143\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0152\b\u000e\n\u000e\f\u000e"+
		"\u0155\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u016f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0192\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01a8\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u01ac\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u01b1\b\u0013\n\u0013\f\u0013\u01b4\t\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01bf\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u01c4\b\u0015\n\u0015\f\u0015\u01c7\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01d2\b\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01e9\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u01ed\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018"+
		"\u01f2\b\u0018\n\u0018\f\u0018\u01f5\t\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u0200\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0005"+
		"\u001a\u0205\b\u001a\n\u001a\f\u001a\u0208\t\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u0213\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u021c\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0224\b\u001d\n\u001d\f\u001d\u0227\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0235"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u023c\b\u001f\n\u001f\f\u001f\u023f\t\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u027b\b \u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0286"+
		"\b\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0005#\u028e\b#\n#\f"+
		"#\u0291\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003"+
		"$\u02a5\b$\u0001$\u0000\u0001\u000e%\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"H\u0000\u0007\u0001\u0000\u0017\u001c\u0001\u0000\b\n\u0001\u0000\u000b"+
		"\u0010\u0001\u0000\u0011\u0012\u0001\u0000\u0013\u0014\u0001\u0000#&\u0001"+
		"\u0000WX\u02e6\u0000M\u0001\u0000\u0000\u0000\u0002c\u0001\u0000\u0000"+
		"\u0000\u0004e\u0001\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000"+
		"\b\u00a2\u0001\u0000\u0000\u0000\n\u00af\u0001\u0000\u0000\u0000\f\u00b1"+
		"\u0001\u0000\u0000\u0000\u000e\u00dc\u0001\u0000\u0000\u0000\u0010\u0105"+
		"\u0001\u0000\u0000\u0000\u0012\u0107\u0001\u0000\u0000\u0000\u0014\u0112"+
		"\u0001\u0000\u0000\u0000\u0016\u011f\u0001\u0000\u0000\u0000\u0018\u0142"+
		"\u0001\u0000\u0000\u0000\u001a\u0144\u0001\u0000\u0000\u0000\u001c\u014e"+
		"\u0001\u0000\u0000\u0000\u001e\u016e\u0001\u0000\u0000\u0000 \u0170\u0001"+
		"\u0000\u0000\u0000\"\u0178\u0001\u0000\u0000\u0000$\u01ab\u0001\u0000"+
		"\u0000\u0000&\u01ad\u0001\u0000\u0000\u0000(\u01be\u0001\u0000\u0000\u0000"+
		"*\u01c0\u0001\u0000\u0000\u0000,\u01d1\u0001\u0000\u0000\u0000.\u01ec"+
		"\u0001\u0000\u0000\u00000\u01ee\u0001\u0000\u0000\u00002\u01ff\u0001\u0000"+
		"\u0000\u00004\u0201\u0001\u0000\u0000\u00006\u0212\u0001\u0000\u0000\u0000"+
		"8\u0214\u0001\u0000\u0000\u0000:\u0220\u0001\u0000\u0000\u0000<\u0234"+
		"\u0001\u0000\u0000\u0000>\u0236\u0001\u0000\u0000\u0000@\u027a\u0001\u0000"+
		"\u0000\u0000B\u027c\u0001\u0000\u0000\u0000D\u0280\u0001\u0000\u0000\u0000"+
		"F\u028a\u0001\u0000\u0000\u0000H\u02a4\u0001\u0000\u0000\u0000JL\u0003"+
		"\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001"+
		"\u0000\u0000\u0000Rd\u0003\f\u0006\u0000Sd\u0003\u0018\f\u0000Td\u0003"+
		"$\u0012\u0000Ud\u0003\u001a\r\u0000Vd\u0003>\u001f\u0000Wd\u0003\n\u0005"+
		"\u0000Xd\u0003\u0006\u0003\u0000Yd\u0003\b\u0004\u0000Zd\u0003\u0004\u0002"+
		"\u0000[d\u0003D\"\u0000\\]\u0003@ \u0000]^\u0005\u0001\u0000\u0000^d\u0001"+
		"\u0000\u0000\u0000_d\u0003.\u0017\u0000`d\u00038\u001c\u0000ad\u0003 "+
		"\u0010\u0000bd\u0003\"\u0011\u0000cR\u0001\u0000\u0000\u0000cS\u0001\u0000"+
		"\u0000\u0000cT\u0001\u0000\u0000\u0000cU\u0001\u0000\u0000\u0000cV\u0001"+
		"\u0000\u0000\u0000cW\u0001\u0000\u0000\u0000cX\u0001\u0000\u0000\u0000"+
		"cY\u0001\u0000\u0000\u0000cZ\u0001\u0000\u0000\u0000c[\u0001\u0000\u0000"+
		"\u0000c\\\u0001\u0000\u0000\u0000c_\u0001\u0000\u0000\u0000c`\u0001\u0000"+
		"\u0000\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0003"+
		"\u0001\u0000\u0000\u0000ef\u0005Q\u0000\u0000fg\u0005\u0002\u0000\u0000"+
		"gh\u0003\u000e\u0007\u0000hi\u0005\u0003\u0000\u0000im\u0005\u0004\u0000"+
		"\u0000jl\u0003\u0002\u0001\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000p\u0080\u0005\u0005\u0000"+
		"\u0000qr\u0005R\u0000\u0000rs\u0005\u0002\u0000\u0000st\u0003\u000e\u0007"+
		"\u0000tu\u0005\u0003\u0000\u0000uy\u0005\u0004\u0000\u0000vx\u0003\u0002"+
		"\u0001\u0000wv\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z|\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000|}\u0005\u0005\u0000\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~q\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u008c\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005S\u0000\u0000\u0084\u0088\u0005\u0004\u0000\u0000\u0085\u0087"+
		"\u0003\u0002\u0001\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008b\u008d\u0005\u0005\u0000\u0000\u008c\u0083"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0005"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005O\u0000\u0000\u008f\u0090\u0005"+
		"\u0002\u0000\u0000\u0090\u0091\u0005^\u0000\u0000\u0091\u0092\u0005T\u0000"+
		"\u0000\u0092\u0093\u0005U\u0000\u0000\u0093\u0094\u0005\u0002\u0000\u0000"+
		"\u0094\u0095\u0003\u000e\u0007\u0000\u0095\u0096\u0005\u0006\u0000\u0000"+
		"\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0098\u0005\u0003\u0000\u0000"+
		"\u0098\u0099\u0005\u0003\u0000\u0000\u0099\u009d\u0005\u0004\u0000\u0000"+
		"\u009a\u009c\u0003\u0002\u0001\u0000\u009b\u009a\u0001\u0000\u0000\u0000"+
		"\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000"+
		"\u00a1\u0007\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005P\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0002\u0000\u0000\u00a4\u00a5\u0003\u000e\u0007\u0000\u00a5"+
		"\u00a6\u0005\u0003\u0000\u0000\u00a6\u00aa\u0005\u0004\u0000\u0000\u00a7"+
		"\u00a9\u0003\u0002\u0001\u0000\u00a8\u00a7\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac"+
		"\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0005\u0000\u0000\u00ae"+
		"\t\u0001\u0000\u0000\u0000\u00af\u00b0\u0005a\u0000\u0000\u00b0\u000b"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005^\u0000\u0000\u00b2\u00b3\u0005"+
		"\u0007\u0000\u0000\u00b3\u00b4\u0003\u000e\u0007\u0000\u00b4\u00b5\u0005"+
		"\u0001\u0000\u0000\u00b5\r\u0001\u0000\u0000\u0000\u00b6\u00b7\u0006\u0007"+
		"\uffff\uffff\u0000\u00b7\u00b8\u0005\u0015\u0000\u0000\u00b8\u00dd\u0003"+
		"\u000e\u0007\u000f\u00b9\u00ba\u0005\u0002\u0000\u0000\u00ba\u00bb\u0003"+
		"\u000e\u0007\u0000\u00bb\u00bc\u0005\u0003\u0000\u0000\u00bc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0005N\u0000\u0000\u00be\u00bf\u0005\u0016"+
		"\u0000\u0000\u00bf\u00c0\u0007\u0000\u0000\u0000\u00c0\u00c1\u0005\u0002"+
		"\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b\u0000\u00c2\u00c3\u0005\u0003"+
		"\u0000\u0000\u00c3\u00dd\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005^\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0016\u0000\u0000\u00c6\u00dd\u0005\u001d\u0000"+
		"\u0000\u00c7\u00c8\u0005]\u0000\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000"+
		"\u00c9\u00dd\u0005\u0003\u0000\u0000\u00ca\u00dd\u0003@ \u0000\u00cb\u00dd"+
		"\u0003\u0010\b\u0000\u00cc\u00dd\u0003\u0014\n\u0000\u00cd\u00dd\u0005"+
		"_\u0000\u0000\u00ce\u00dd\u0005^\u0000\u0000\u00cf\u00dd\u0005`\u0000"+
		"\u0000\u00d0\u00dd\u0005W\u0000\u0000\u00d1\u00dd\u0005X\u0000\u0000\u00d2"+
		"\u00d3\u0005\u001e\u0000\u0000\u00d3\u00d4\u0005\u0002\u0000\u0000\u00d4"+
		"\u00d5\u0003\u000e\u0007\u0000\u00d5\u00d6\u0005\u0003\u0000\u0000\u00d6"+
		"\u00dd\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u001f\u0000\u0000\u00d8"+
		"\u00d9\u0005\u0002\u0000\u0000\u00d9\u00da\u0003\u000e\u0007\u0000\u00da"+
		"\u00db\u0005\u0003\u0000\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc"+
		"\u00b6\u0001\u0000\u0000\u0000\u00dc\u00b9\u0001\u0000\u0000\u0000\u00dc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00dc\u00c4\u0001\u0000\u0000\u0000\u00dc"+
		"\u00c7\u0001\u0000\u0000\u0000\u00dc\u00ca\u0001\u0000\u0000\u0000\u00dc"+
		"\u00cb\u0001\u0000\u0000\u0000\u00dc\u00cc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00dc\u00ce\u0001\u0000\u0000\u0000\u00dc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00dc\u00d0\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d1\u0001\u0000\u0000\u0000\u00dc\u00d2\u0001\u0000\u0000\u0000\u00dc"+
		"\u00d7\u0001\u0000\u0000\u0000\u00dd\u00ec\u0001\u0000\u0000\u0000\u00de"+
		"\u00df\n\u0013\u0000\u0000\u00df\u00e0\u0007\u0001\u0000\u0000\u00e0\u00eb"+
		"\u0003\u000e\u0007\u0014\u00e1\u00e2\n\u0012\u0000\u0000\u00e2\u00e3\u0007"+
		"\u0002\u0000\u0000\u00e3\u00eb\u0003\u000e\u0007\u0013\u00e4\u00e5\n\u0011"+
		"\u0000\u0000\u00e5\u00e6\u0007\u0003\u0000\u0000\u00e6\u00eb\u0003\u000e"+
		"\u0007\u0012\u00e7\u00e8\n\u0010\u0000\u0000\u00e8\u00e9\u0007\u0004\u0000"+
		"\u0000\u00e9\u00eb\u0003\u000e\u0007\u0011\u00ea\u00de\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00e4\u0001\u0000\u0000"+
		"\u0000\u00ea\u00e7\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000"+
		"\u0000\u00ed\u000f\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005 \u0000\u0000\u00f0\u00f5\u0003\u0012\t\u0000"+
		"\u00f1\u00f2\u0005\u0006\u0000\u0000\u00f2\u00f4\u0003\u0012\t\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005!\u0000\u0000\u00f9\u0106\u0001\u0000\u0000\u0000\u00fa\u00fb"+
		"\u0005 \u0000\u0000\u00fb\u0100\u0003\u000e\u0007\u0000\u00fc\u00fd\u0005"+
		"\u0006\u0000\u0000\u00fd\u00ff\u0003\u000e\u0007\u0000\u00fe\u00fc\u0001"+
		"\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0103\u0001"+
		"\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005"+
		"!\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u00ef\u0001\u0000"+
		"\u0000\u0000\u0105\u00fa\u0001\u0000\u0000\u0000\u0106\u0011\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0005 \u0000\u0000\u0108\u010d\u0003\u000e\u0007"+
		"\u0000\u0109\u010a\u0005\u0006\u0000\u0000\u010a\u010c\u0003\u000e\u0007"+
		"\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005!\u0000\u0000\u0111\u0013\u0001\u0000\u0000\u0000"+
		"\u0112\u011b\u0005 \u0000\u0000\u0113\u0118\u0003\u000e\u0007\u0000\u0114"+
		"\u0115\u0005\u0006\u0000\u0000\u0115\u0117\u0003\u000e\u0007\u0000\u0116"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011b"+
		"\u0113\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005!\u0000\u0000\u011e\u0015"+
		"\u0001\u0000\u0000\u0000\u011f\u0124\u0003\u000e\u0007\u0000\u0120\u0121"+
		"\u0005\u0006\u0000\u0000\u0121\u0123\u0003\u000e\u0007\u0000\u0122\u0120"+
		"\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0017"+
		"\u0001\u0000\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128"+
		"\u0005^\u0000\u0000\u0128\u0129\u0005\u0016\u0000\u0000\u0129\u012a\u0005"+
		"\"\u0000\u0000\u012a\u012b\u0005\u0002\u0000\u0000\u012b\u012c\u0003\u000e"+
		"\u0007\u0000\u012c\u012d\u0005\u0006\u0000\u0000\u012d\u012e\u0003\u000e"+
		"\u0007\u0000\u012e\u012f\u0005\u0003\u0000\u0000\u012f\u0130\u0005\u0001"+
		"\u0000\u0000\u0130\u0143\u0001\u0000\u0000\u0000\u0131\u0132\u0005^\u0000"+
		"\u0000\u0132\u0133\u0005\u0007\u0000\u0000\u0133\u0134\u0005^\u0000\u0000"+
		"\u0134\u0135\u0005\u0016\u0000\u0000\u0135\u0136\u0007\u0005\u0000\u0000"+
		"\u0136\u0137\u0005\u0002\u0000\u0000\u0137\u0138\u0005\u0003\u0000\u0000"+
		"\u0138\u0143\u0005\u0001\u0000\u0000\u0139\u013a\u0005^\u0000\u0000\u013a"+
		"\u013b\u0005\u0016\u0000\u0000\u013b\u013c\u0005\'\u0000\u0000\u013c\u013e"+
		"\u0005\u0002\u0000\u0000\u013d\u013f\u0003\u001c\u000e\u0000\u013e\u013d"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0003\u0000\u0000\u0141\u0143"+
		"\u0005\u0001\u0000\u0000\u0142\u0127\u0001\u0000\u0000\u0000\u0142\u0131"+
		"\u0001\u0000\u0000\u0000\u0142\u0139\u0001\u0000\u0000\u0000\u0143\u0019"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005^\u0000\u0000\u0145\u0146\u0005"+
		"\u0007\u0000\u0000\u0146\u0147\u0005^\u0000\u0000\u0147\u0148\u0005\u0016"+
		"\u0000\u0000\u0148\u0149\u0005(\u0000\u0000\u0149\u014a\u0005\u0002\u0000"+
		"\u0000\u014a\u014b\u0003\u000e\u0007\u0000\u014b\u014c\u0005\u0003\u0000"+
		"\u0000\u014c\u014d\u0005\u0001\u0000\u0000\u014d\u001b\u0001\u0000\u0000"+
		"\u0000\u014e\u0153\u0003\u001e\u000f\u0000\u014f\u0150\u0005\u0006\u0000"+
		"\u0000\u0150\u0152\u0003\u001e\u000f\u0000\u0151\u014f\u0001\u0000\u0000"+
		"\u0000\u0152\u0155\u0001\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u001d\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0005)\u0000\u0000"+
		"\u0157\u0158\u0005\u0007\u0000\u0000\u0158\u016f\u0005_\u0000\u0000\u0159"+
		"\u015a\u0005*\u0000\u0000\u015a\u015b\u0005\u0007\u0000\u0000\u015b\u016f"+
		"\u0005_\u0000\u0000\u015c\u015d\u0005+\u0000\u0000\u015d\u015e\u0005\u0007"+
		"\u0000\u0000\u015e\u016f\u0005_\u0000\u0000\u015f\u0160\u0005,\u0000\u0000"+
		"\u0160\u0161\u0005\u0007\u0000\u0000\u0161\u016f\u0005`\u0000\u0000\u0162"+
		"\u0163\u0005-\u0000\u0000\u0163\u0164\u0005\u0007\u0000\u0000\u0164\u016f"+
		"\u0005`\u0000\u0000\u0165\u0166\u0005.\u0000\u0000\u0166\u0167\u0005\u0007"+
		"\u0000\u0000\u0167\u016f\u0005`\u0000\u0000\u0168\u0169\u0005/\u0000\u0000"+
		"\u0169\u016a\u0005\u0007\u0000\u0000\u016a\u016f\u0007\u0006\u0000\u0000"+
		"\u016b\u016c\u00050\u0000\u0000\u016c\u016d\u0005\u0007\u0000\u0000\u016d"+
		"\u016f\u0005`\u0000\u0000\u016e\u0156\u0001\u0000\u0000\u0000\u016e\u0159"+
		"\u0001\u0000\u0000\u0000\u016e\u015c\u0001\u0000\u0000\u0000\u016e\u015f"+
		"\u0001\u0000\u0000\u0000\u016e\u0162\u0001\u0000\u0000\u0000\u016e\u0165"+
		"\u0001\u0000\u0000\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u016b"+
		"\u0001\u0000\u0000\u0000\u016f\u001f\u0001\u0000\u0000\u0000\u0170\u0171"+
		"\u00051\u0000\u0000\u0171\u0172\u0005\u0002\u0000\u0000\u0172\u0173\u0003"+
		"\u000e\u0007\u0000\u0173\u0174\u0005\u0006\u0000\u0000\u0174\u0175\u0003"+
		"\u000e\u0007\u0000\u0175\u0176\u0005\u0003\u0000\u0000\u0176\u0177\u0005"+
		"\u0001\u0000\u0000\u0177!\u0001\u0000\u0000\u0000\u0178\u0179\u00052\u0000"+
		"\u0000\u0179\u017a\u0005\u0002\u0000\u0000\u017a\u017b\u0003\u000e\u0007"+
		"\u0000\u017b\u017c\u0005\u0006\u0000\u0000\u017c\u017d\u0003\u000e\u0007"+
		"\u0000\u017d\u017e\u0005\u0003\u0000\u0000\u017e\u017f\u0005\u0001\u0000"+
		"\u0000\u017f#\u0001\u0000\u0000\u0000\u0180\u0181\u0005^\u0000\u0000\u0181"+
		"\u0182\u0005\u0007\u0000\u0000\u0182\u0183\u0005\\\u0000\u0000\u0183\u0184"+
		"\u0005\u0002\u0000\u0000\u0184\u0185\u0003&\u0013\u0000\u0185\u0186\u0005"+
		"\u0003\u0000\u0000\u0186\u0187\u0005\u0001\u0000\u0000\u0187\u01ac\u0001"+
		"\u0000\u0000\u0000\u0188\u0189\u0005^\u0000\u0000\u0189\u018a\u0005\u0016"+
		"\u0000\u0000\u018a\u018b\u0005\"\u0000\u0000\u018b\u018c\u0005\u0002\u0000"+
		"\u0000\u018c\u018d\u0003\u000e\u0007\u0000\u018d\u018e\u0005\u0006\u0000"+
		"\u0000\u018e\u0191\u0003\u000e\u0007\u0000\u018f\u0190\u0005\u0006\u0000"+
		"\u0000\u0190\u0192\u0003*\u0015\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0005\u0003\u0000\u0000\u0194\u0195\u0005\u0001\u0000\u0000"+
		"\u0195\u01ac\u0001\u0000\u0000\u0000\u0196\u0197\u0005^\u0000\u0000\u0197"+
		"\u0198\u0005\u0007\u0000\u0000\u0198\u0199\u0005^\u0000\u0000\u0199\u019a"+
		"\u0005\u0016\u0000\u0000\u019a\u019b\u00053\u0000\u0000\u019b\u019c\u0005"+
		"\u0002\u0000\u0000\u019c\u019d\u0003\u000e\u0007\u0000\u019d\u019e\u0005"+
		"\u0006\u0000\u0000\u019e\u019f\u0003\u000e\u0007\u0000\u019f\u01a0\u0005"+
		"\u0003\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000\u0000\u01a1\u01ac\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0005^\u0000\u0000\u01a3\u01a4\u0005\u0016"+
		"\u0000\u0000\u01a4\u01a5\u00054\u0000\u0000\u01a5\u01a7\u0005\u0002\u0000"+
		"\u0000\u01a6\u01a8\u0005`\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000"+
		"\u01a9\u01aa\u0005\u0003\u0000\u0000\u01aa\u01ac\u0005\u0001\u0000\u0000"+
		"\u01ab\u0180\u0001\u0000\u0000\u0000\u01ab\u0188\u0001\u0000\u0000\u0000"+
		"\u01ab\u0196\u0001\u0000\u0000\u0000\u01ab\u01a2\u0001\u0000\u0000\u0000"+
		"\u01ac%\u0001\u0000\u0000\u0000\u01ad\u01b2\u0003(\u0014\u0000\u01ae\u01af"+
		"\u0005\u0006\u0000\u0000\u01af\u01b1\u0003(\u0014\u0000\u01b0\u01ae\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\'\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6\u00055\u0000"+
		"\u0000\u01b6\u01b7\u0005\u0007\u0000\u0000\u01b7\u01bf\u0003\u0014\n\u0000"+
		"\u01b8\u01b9\u00056\u0000\u0000\u01b9\u01ba\u0005\u0007\u0000\u0000\u01ba"+
		"\u01bf\u0005_\u0000\u0000\u01bb\u01bc\u00057\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0007\u0000\u0000\u01bd\u01bf\u0005_\u0000\u0000\u01be\u01b5\u0001\u0000"+
		"\u0000\u0000\u01be\u01b8\u0001\u0000\u0000\u0000\u01be\u01bb\u0001\u0000"+
		"\u0000\u0000\u01bf)\u0001\u0000\u0000\u0000\u01c0\u01c5\u0003,\u0016\u0000"+
		"\u01c1\u01c2\u0005\u0006\u0000\u0000\u01c2\u01c4\u0003,\u0016\u0000\u01c3"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6"+
		"+\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u00058\u0000\u0000\u01c9\u01ca\u0005\u0007\u0000\u0000\u01ca\u01d2\u0005"+
		"_\u0000\u0000\u01cb\u01cc\u00059\u0000\u0000\u01cc\u01cd\u0005\u0007\u0000"+
		"\u0000\u01cd\u01d2\u0005_\u0000\u0000\u01ce\u01cf\u0005:\u0000\u0000\u01cf"+
		"\u01d0\u0005\u0007\u0000\u0000\u01d0\u01d2\u0007\u0006\u0000\u0000\u01d1"+
		"\u01c8\u0001\u0000\u0000\u0000\u01d1\u01cb\u0001\u0000\u0000\u0000\u01d1"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d2-\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0005^\u0000\u0000\u01d4\u01d5\u0005\u0007\u0000\u0000\u01d5\u01d6\u0005"+
		"[\u0000\u0000\u01d6\u01d7\u0005\u0002\u0000\u0000\u01d7\u01d8\u00030\u0018"+
		"\u0000\u01d8\u01d9\u0005\u0003\u0000\u0000\u01d9\u01da\u0005\u0001\u0000"+
		"\u0000\u01da\u01ed\u0001\u0000\u0000\u0000\u01db\u01dc\u0005^\u0000\u0000"+
		"\u01dc\u01dd\u0005\u0016\u0000\u0000\u01dd\u01de\u0005\"\u0000\u0000\u01de"+
		"\u01df\u0005\u0002\u0000\u0000\u01df\u01e0\u0003\u000e\u0007\u0000\u01e0"+
		"\u01e1\u0005\u0003\u0000\u0000\u01e1\u01e2\u0005\u0001\u0000\u0000\u01e2"+
		"\u01ed\u0001\u0000\u0000\u0000\u01e3\u01e4\u0005^\u0000\u0000\u01e4\u01e5"+
		"\u0005\u0016\u0000\u0000\u01e5\u01e6\u0005\'\u0000\u0000\u01e6\u01e8\u0005"+
		"\u0002\u0000\u0000\u01e7\u01e9\u00034\u001a\u0000\u01e8\u01e7\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005\u0003\u0000\u0000\u01eb\u01ed\u0005\u0001"+
		"\u0000\u0000\u01ec\u01d3\u0001\u0000\u0000\u0000\u01ec\u01db\u0001\u0000"+
		"\u0000\u0000\u01ec\u01e3\u0001\u0000\u0000\u0000\u01ed/\u0001\u0000\u0000"+
		"\u0000\u01ee\u01f3\u00032\u0019\u0000\u01ef\u01f0\u0005\u0006\u0000\u0000"+
		"\u01f0\u01f2\u00032\u0019\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f5\u0001\u0000\u0000\u0000\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f3"+
		"\u01f4\u0001\u0000\u0000\u0000\u01f41\u0001\u0000\u0000\u0000\u01f5\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005;\u0000\u0000\u01f7\u01f8\u0005"+
		"\u0007\u0000\u0000\u01f8\u0200\u0005_\u0000\u0000\u01f9\u01fa\u0005<\u0000"+
		"\u0000\u01fa\u01fb\u0005\u0007\u0000\u0000\u01fb\u0200\u0005_\u0000\u0000"+
		"\u01fc\u01fd\u00057\u0000\u0000\u01fd\u01fe\u0005\u0007\u0000\u0000\u01fe"+
		"\u0200\u0005_\u0000\u0000\u01ff\u01f6\u0001\u0000\u0000\u0000\u01ff\u01f9"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u02003\u0001"+
		"\u0000\u0000\u0000\u0201\u0206\u00036\u001b\u0000\u0202\u0203\u0005\u0006"+
		"\u0000\u0000\u0203\u0205\u00036\u001b\u0000\u0204\u0202\u0001\u0000\u0000"+
		"\u0000\u0205\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000"+
		"\u0000\u0206\u0207\u0001\u0000\u0000\u0000\u02075\u0001\u0000\u0000\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005)\u0000\u0000\u020a"+
		"\u020b\u0005\u0007\u0000\u0000\u020b\u0213\u0005_\u0000\u0000\u020c\u020d"+
		"\u0005*\u0000\u0000\u020d\u020e\u0005\u0007\u0000\u0000\u020e\u0213\u0005"+
		"_\u0000\u0000\u020f\u0210\u00050\u0000\u0000\u0210\u0211\u0005\u0007\u0000"+
		"\u0000\u0211\u0213\u0005`\u0000\u0000\u0212\u0209\u0001\u0000\u0000\u0000"+
		"\u0212\u020c\u0001\u0000\u0000\u0000\u0212\u020f\u0001\u0000\u0000\u0000"+
		"\u02137\u0001\u0000\u0000\u0000\u0214\u0215\u0005Y\u0000\u0000\u0215\u0216"+
		"\u0005\u0002\u0000\u0000\u0216\u0217\u0003\u000e\u0007\u0000\u0217\u0218"+
		"\u0005\u0006\u0000\u0000\u0218\u021b\u0003\u000e\u0007\u0000\u0219\u021a"+
		"\u0005\u0006\u0000\u0000\u021a\u021c\u0003:\u001d\u0000\u021b\u0219\u0001"+
		"\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005\u0003\u0000\u0000\u021e\u021f\u0005"+
		"\u0001\u0000\u0000\u021f9\u0001\u0000\u0000\u0000\u0220\u0225\u0003<\u001e"+
		"\u0000\u0221\u0222\u0005\u0006\u0000\u0000\u0222\u0224\u0003<\u001e\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000\u0000"+
		"\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000"+
		"\u0226;\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0228"+
		"\u0229\u0005)\u0000\u0000\u0229\u022a\u0005\u0007\u0000\u0000\u022a\u0235"+
		"\u0005_\u0000\u0000\u022b\u022c\u0005*\u0000\u0000\u022c\u022d\u0005\u0007"+
		"\u0000\u0000\u022d\u0235\u0005_\u0000\u0000\u022e\u022f\u0005.\u0000\u0000"+
		"\u022f\u0230\u0005\u0007\u0000\u0000\u0230\u0235\u0005`\u0000\u0000\u0231"+
		"\u0232\u00050\u0000\u0000\u0232\u0233\u0005\u0007\u0000\u0000\u0233\u0235"+
		"\u0005`\u0000\u0000\u0234\u0228\u0001\u0000\u0000\u0000\u0234\u022b\u0001"+
		"\u0000\u0000\u0000\u0234\u022e\u0001\u0000\u0000\u0000\u0234\u0231\u0001"+
		"\u0000\u0000\u0000\u0235=\u0001\u0000\u0000\u0000\u0236\u0237\u0005V\u0000"+
		"\u0000\u0237\u0238\u0005\u0002\u0000\u0000\u0238\u023d\u0003\u000e\u0007"+
		"\u0000\u0239\u023a\u0005\u0006\u0000\u0000\u023a\u023c\u0003\u000e\u0007"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023f\u0001\u0000\u0000"+
		"\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000"+
		"\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u0005\u0003\u0000\u0000\u0241\u0242\u0005\u0001\u0000"+
		"\u0000\u0242?\u0001\u0000\u0000\u0000\u0243\u0244\u0005=\u0000\u0000\u0244"+
		"\u0245\u0005\u0002\u0000\u0000\u0245\u0246\u0003\u000e\u0007\u0000\u0246"+
		"\u0247\u0005\u0003\u0000\u0000\u0247\u027b\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0005>\u0000\u0000\u0249\u024a\u0005\u0002\u0000\u0000\u024a\u024b"+
		"\u0003\u000e\u0007\u0000\u024b\u024c\u0005\u0003\u0000\u0000\u024c\u027b"+
		"\u0001\u0000\u0000\u0000\u024d\u024e\u0005?\u0000\u0000\u024e\u024f\u0005"+
		"\u0002\u0000\u0000\u024f\u0250\u0003\u000e\u0007\u0000\u0250\u0251\u0005"+
		"\u0003\u0000\u0000\u0251\u027b\u0001\u0000\u0000\u0000\u0252\u0253\u0005"+
		"@\u0000\u0000\u0253\u0254\u0005\u0002\u0000\u0000\u0254\u0255\u0003\u000e"+
		"\u0007\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u027b\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u0005A\u0000\u0000\u0258\u0259\u0005\u0002\u0000"+
		"\u0000\u0259\u025a\u0003\u000e\u0007\u0000\u025a\u025b\u0005\u0003\u0000"+
		"\u0000\u025b\u027b\u0001\u0000\u0000\u0000\u025c\u025d\u0005B\u0000\u0000"+
		"\u025d\u025e\u0005\u0002\u0000\u0000\u025e\u025f\u0003B!\u0000\u025f\u0260"+
		"\u0005\u0003\u0000\u0000\u0260\u027b\u0001\u0000\u0000\u0000\u0261\u0262"+
		"\u0005C\u0000\u0000\u0262\u0263\u0005\u0002\u0000\u0000\u0263\u0264\u0003"+
		"\u000e\u0007\u0000\u0264\u0265\u0005\u0003\u0000\u0000\u0265\u027b\u0001"+
		"\u0000\u0000\u0000\u0266\u0267\u0005D\u0000\u0000\u0267\u0268\u0005\u0002"+
		"\u0000\u0000\u0268\u0269\u0003\u000e\u0007\u0000\u0269\u026a\u0005\u0003"+
		"\u0000\u0000\u026a\u027b\u0001\u0000\u0000\u0000\u026b\u026c\u0005E\u0000"+
		"\u0000\u026c\u026d\u0005\u0002\u0000\u0000\u026d\u026e\u0003\u000e\u0007"+
		"\u0000\u026e\u026f\u0005\u0003\u0000\u0000\u026f\u027b\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0005F\u0000\u0000\u0271\u0272\u0005\u0002\u0000\u0000"+
		"\u0272\u0273\u0003B!\u0000\u0273\u0274\u0005\u0003\u0000\u0000\u0274\u027b"+
		"\u0001\u0000\u0000\u0000\u0275\u0276\u0005G\u0000\u0000\u0276\u0277\u0005"+
		"\u0002\u0000\u0000\u0277\u0278\u0003B!\u0000\u0278\u0279\u0005\u0003\u0000"+
		"\u0000\u0279\u027b\u0001\u0000\u0000\u0000\u027a\u0243\u0001\u0000\u0000"+
		"\u0000\u027a\u0248\u0001\u0000\u0000\u0000\u027a\u024d\u0001\u0000\u0000"+
		"\u0000\u027a\u0252\u0001\u0000\u0000\u0000\u027a\u0257\u0001\u0000\u0000"+
		"\u0000\u027a\u025c\u0001\u0000\u0000\u0000\u027a\u0261\u0001\u0000\u0000"+
		"\u0000\u027a\u0266\u0001\u0000\u0000\u0000\u027a\u026b\u0001\u0000\u0000"+
		"\u0000\u027a\u0270\u0001\u0000\u0000\u0000\u027a\u0275\u0001\u0000\u0000"+
		"\u0000\u027bA\u0001\u0000\u0000\u0000\u027c\u027d\u0003\u000e\u0007\u0000"+
		"\u027d\u027e\u0005\u0006\u0000\u0000\u027e\u027f\u0003\u000e\u0007\u0000"+
		"\u027fC\u0001\u0000\u0000\u0000\u0280\u0281\u0005Z\u0000\u0000\u0281\u0282"+
		"\u0005\u0002\u0000\u0000\u0282\u0285\u0003\u000e\u0007\u0000\u0283\u0284"+
		"\u0005\u0006\u0000\u0000\u0284\u0286\u0003F#\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000"+
		"\u0000\u0000\u0287\u0288\u0005\u0003\u0000\u0000\u0288\u0289\u0005\u0001"+
		"\u0000\u0000\u0289E\u0001\u0000\u0000\u0000\u028a\u028f\u0003H$\u0000"+
		"\u028b\u028c\u0005\u0006\u0000\u0000\u028c\u028e\u0003H$\u0000\u028d\u028b"+
		"\u0001\u0000\u0000\u0000\u028e\u0291\u0001\u0000\u0000\u0000\u028f\u028d"+
		"\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290G\u0001"+
		"\u0000\u0000\u0000\u0291\u028f\u0001\u0000\u0000\u0000\u0292\u0293\u0005"+
		"H\u0000\u0000\u0293\u0294\u0005\u0007\u0000\u0000\u0294\u02a5\u0005_\u0000"+
		"\u0000\u0295\u0296\u0005I\u0000\u0000\u0296\u0297\u0005\u0007\u0000\u0000"+
		"\u0297\u02a5\u0005_\u0000\u0000\u0298\u0299\u0005J\u0000\u0000\u0299\u029a"+
		"\u0005\u0007\u0000\u0000\u029a\u02a5\u0005_\u0000\u0000\u029b\u029c\u0005"+
		"K\u0000\u0000\u029c\u029d\u0005\u0007\u0000\u0000\u029d\u02a5\u0005`\u0000"+
		"\u0000\u029e\u029f\u0005L\u0000\u0000\u029f\u02a0\u0005\u0007\u0000\u0000"+
		"\u02a0\u02a5\u0007\u0006\u0000\u0000\u02a1\u02a2\u0005M\u0000\u0000\u02a2"+
		"\u02a3\u0005\u0007\u0000\u0000\u02a3\u02a5\u0003\u0014\n\u0000\u02a4\u0292"+
		"\u0001\u0000\u0000\u0000\u02a4\u0295\u0001\u0000\u0000\u0000\u02a4\u0298"+
		"\u0001\u0000\u0000\u0000\u02a4\u029b\u0001\u0000\u0000\u0000\u02a4\u029e"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a1\u0001\u0000\u0000\u0000\u02a5I\u0001"+
		"\u0000\u0000\u0000,Mcmy\u0080\u0088\u008c\u009d\u00aa\u00dc\u00ea\u00ec"+
		"\u00f5\u0100\u0105\u010d\u0118\u011b\u0124\u013e\u0142\u0153\u016e\u0191"+
		"\u01a7\u01ab\u01b2\u01be\u01c5\u01d1\u01e8\u01ec\u01f3\u01ff\u0206\u0212"+
		"\u021b\u0225\u0234\u023d\u027a\u0285\u028f\u02a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}