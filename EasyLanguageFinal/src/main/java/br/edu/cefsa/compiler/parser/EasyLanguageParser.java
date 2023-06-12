// Generated from ./EasyLanguage.g4 by ANTLR 4.12.0
package br.edu.cefsa.compiler.parser;

	import br.edu.cefsa.compiler.datastructures.EasySymbol;
	import br.edu.cefsa.compiler.datastructures.EasyVariable;
	import br.edu.cefsa.compiler.datastructures.EasySymbolTable;
	import br.edu.cefsa.compiler.exceptions.EasySemanticException;
	import br.edu.cefsa.compiler.abstractsyntaxtree.EasyProgram;
	import br.edu.cefsa.compiler.abstractsyntaxtree.AbstractCommand;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandLeitura;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandEscrita;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandAtribuicao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandDecisao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandRepeticao;
	import br.edu.cefsa.compiler.abstractsyntaxtree.CommandRepeticaoFor;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EasyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, SC=13, OP=14, ATTR=15, VIR=16, ACH=17, FCH=18, 
		OPREL=19, ID=20, NUMBER=21, WS=22;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdselecao = 9, RULE_expr = 10, RULE_termo = 11, RULE_loop = 12, 
		RULE_loopFor = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdselecao", "expr", "termo", "loop", "loopFor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'init'", "'end;'", "'number'", "'text'", "'read'", "'print.terminal'", 
			"'if'", "'else'", "'while'", "'repeat'", "'('", "')'", "';'", null, "'='", 
			"','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AP", 
			"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
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
	public String getGrammarFileName() { return "EasyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
		private String _varName;
		private String _varValue;
		private EasySymbolTable symbolTable = new EasySymbolTable();
		private EasySymbol symbol;
		private EasyProgram program = new EasyProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		private ArrayList<AbstractCommand> listaRep;
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new EasySemanticException("Symbol "+id+" not declared");
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}

	public EasyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			decl();
			setState(30);
			bloco();
			setState(31);
			match(T__1);
			  program.setVarTable(symbolTable);
			           	  program.setComandos(stack.pop());
			           	 
			           
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
	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				declaravar();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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
	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(EasyLanguageParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(EasyLanguageParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			tipo();
			setState(40);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null;
				                  symbol = new EasyVariable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new EasySemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(42);
				match(VIR);
				setState(43);
				match(ID);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new EasyVariable(_varName, _tipo, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                     symbolTable.add(symbol);	
					                  }
					                  else{
					                  	 throw new EasySemanticException("Symbol "+_varName+" already declared");
					                  }
				                    
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(50);
			match(SC);
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__2);
				 _tipo = EasyVariable.NUMBER;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(T__3);
				 _tipo = EasyVariable.TEXT;  
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
	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(59);
				cmd();
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1050336L) != 0) );
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
	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LoopForContext loopFor() {
			return getRuleContext(LoopForContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				cmdleitura();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				cmdattrib();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				cmdselecao();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				loop();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				loopFor();
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
	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(AP);
			setState(74);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(76);
			match(FP);
			setState(77);
			match(SC);

			              	EasyVariable var = (EasyVariable)symbolTable.get(_readID);
			              	CommandLeitura cmd = new CommandLeitura(_readID, var);
			              	stack.peek().add(cmd);
			              
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
	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__5);
			setState(81);
			match(AP);
			setState(82);
			match(ID);
			 verificaID(_input.LT(-1).getText());
				                  _writeID = _input.LT(-1).getText();
			                     
			setState(84);
			match(FP);
			setState(85);
			match(SC);

			               	  CommandEscrita cmd = new CommandEscrita(_writeID);
			               	  stack.peek().add(cmd);
			               
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
	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(EasyLanguageParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(90);
			match(ATTR);
			 _exprContent = ""; 
			setState(92);
			expr();
			setState(93);
			match(SC);

			               	 CommandAtribuicao cmd = new CommandAtribuicao(_exprID, _exprContent);
			               	 stack.peek().add(cmd);
			               
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
	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(EasyLanguageParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(EasyLanguageParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(EasyLanguageParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(EasyLanguageParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(T__6);
			setState(97);
			match(AP);
			setState(98);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(100);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(104);
			match(FP);
			setState(105);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(108); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(107);
				cmd();
				}
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1050336L) != 0) );
			setState(112);
			match(FCH);

			                       listaTrue = stack.pop();	
			                    
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(114);
				match(T__7);
				setState(115);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	
				{
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(117);
					cmd();
					}
					}
					setState(120); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1050336L) != 0) );
				}
				setState(122);
				match(FCH);

				                   		listaFalse = stack.pop();
				                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				                   		stack.peek().add(cmd);
				                   	
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
	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(EasyLanguageParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(EasyLanguageParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			termo();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(128);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				setState(130);
				termo();
				}
				}
				setState(135);
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
	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EasyLanguageParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ID);
				 verificaID(_input.LT(-1).getText());
					               _exprContent += _input.LT(-1).getText();
				                 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(NUMBER);

				              	_exprContent += _input.LT(-1).getText();
				              
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
	public static class LoopContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(T__8);
			setState(143);
			match(AP);

									_exprDecision = "";
								
			setState(145);
			match(ID);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(147);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(149);
			match(ID);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(151);
			match(FP);
			setState(152);
			match(ACH);

			                curThread = new ArrayList<AbstractCommand>();
			                stack.push(curThread);
			            
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1050336L) != 0)) {
				{
				{
				setState(154);
				cmd();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(FCH);

							listaRep = stack.pop();
							CommandRepeticao cmd = new CommandRepeticao(_exprDecision, listaRep);
							stack.peek().add(cmd);
						
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
	public static class LoopForContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(EasyLanguageParser.AP, 0); }
		public TerminalNode NUMBER() { return getToken(EasyLanguageParser.NUMBER, 0); }
		public TerminalNode SC() { return getToken(EasyLanguageParser.SC, 0); }
		public List<TerminalNode> ID() { return getTokens(EasyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EasyLanguageParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(EasyLanguageParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(EasyLanguageParser.FP, 0); }
		public TerminalNode ACH() { return getToken(EasyLanguageParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(EasyLanguageParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public LoopForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).enterLoopFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EasyLanguageListener ) ((EasyLanguageListener)listener).exitLoopFor(this);
		}
	}

	public final LoopForContext loopFor() throws RecognitionException {
		LoopForContext _localctx = new LoopForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__9);
			setState(164);
			match(AP);

									_exprDecision = "";
								
			setState(166);
			match(NUMBER);
			 _exprDecision = "int abllllffff = " + _input.LT(-1).getText() + "; "; 
			setState(168);
			match(SC);
			setState(169);
			match(ID);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(171);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(173);
			match(ID);
			 _exprDecision += _input.LT(-1).getText() + "; ++abllllffff;"; 
			setState(175);
			match(FP);
			setState(176);
			match(ACH);

			                curThread = new ArrayList<AbstractCommand>();
			                stack.push(curThread);
			            
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1050336L) != 0)) {
				{
				{
				setState(178);
				cmd();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(FCH);

							listaRep = stack.pop();
							CommandRepeticaoFor cmd = new CommandRepeticaoFor(_exprDecision, listaRep);
							stack.peek().add(cmd);
						
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u00bc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001$\b\u0001\u000b"+
		"\u0001\f\u0001%\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002.\b\u0002\n\u0002\f\u00021\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u00039\b\u0003\u0001\u0004\u0001\u0004\u0004\u0004=\b\u0004\u000b\u0004"+
		"\f\u0004>\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\tm\b\t\u000b\t\f\tn\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0004\tw\b\t\u000b\t\f\tx\u0001\t\u0001\t\u0001"+
		"\t\u0003\t~\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0084\b\n\n\n"+
		"\f\n\u0087\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u008d\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009c\b\f\n\f"+
		"\f\f\u009f\t\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u00b4\b\r\n\r\f\r\u00b7\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0000\u0000\u000e\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0001\u0001\u0000\u0014"+
		"\u0015\u00bd\u0000\u001c\u0001\u0000\u0000\u0000\u0002#\u0001\u0000\u0000"+
		"\u0000\u0004\'\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000"+
		"\b:\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fH\u0001\u0000"+
		"\u0000\u0000\u000eP\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000"+
		"\u0012`\u0001\u0000\u0000\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016"+
		"\u008c\u0001\u0000\u0000\u0000\u0018\u008e\u0001\u0000\u0000\u0000\u001a"+
		"\u00a3\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0001\u0000\u0000\u001d"+
		"\u001e\u0003\u0002\u0001\u0000\u001e\u001f\u0003\b\u0004\u0000\u001f "+
		"\u0005\u0002\u0000\u0000 !\u0006\u0000\uffff\uffff\u0000!\u0001\u0001"+
		"\u0000\u0000\u0000\"$\u0003\u0004\u0002\u0000#\"\u0001\u0000\u0000\u0000"+
		"$%\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000"+
		"\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005"+
		"\u0014\u0000\u0000)/\u0006\u0002\uffff\uffff\u0000*+\u0005\u0010\u0000"+
		"\u0000+,\u0005\u0014\u0000\u0000,.\u0006\u0002\uffff\uffff\u0000-*\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000023\u0005\r\u0000\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u0003"+
		"\u0000\u000059\u0006\u0003\uffff\uffff\u000067\u0005\u0004\u0000\u0000"+
		"79\u0006\u0003\uffff\uffff\u000084\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u00009\u0007\u0001\u0000\u0000\u0000:<\u0006\u0004\uffff\uffff"+
		"\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\t\u0001\u0000"+
		"\u0000\u0000@G\u0003\f\u0006\u0000AG\u0003\u000e\u0007\u0000BG\u0003\u0010"+
		"\b\u0000CG\u0003\u0012\t\u0000DG\u0003\u0018\f\u0000EG\u0003\u001a\r\u0000"+
		"F@\u0001\u0000\u0000\u0000FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000"+
		"\u0000FC\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000"+
		"\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000"+
		"IJ\u0005\u000b\u0000\u0000JK\u0005\u0014\u0000\u0000KL\u0006\u0006\uffff"+
		"\uffff\u0000LM\u0005\f\u0000\u0000MN\u0005\r\u0000\u0000NO\u0006\u0006"+
		"\uffff\uffff\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0006\u0000\u0000"+
		"QR\u0005\u000b\u0000\u0000RS\u0005\u0014\u0000\u0000ST\u0006\u0007\uffff"+
		"\uffff\u0000TU\u0005\f\u0000\u0000UV\u0005\r\u0000\u0000VW\u0006\u0007"+
		"\uffff\uffff\u0000W\u000f\u0001\u0000\u0000\u0000XY\u0005\u0014\u0000"+
		"\u0000YZ\u0006\b\uffff\uffff\u0000Z[\u0005\u000f\u0000\u0000[\\\u0006"+
		"\b\uffff\uffff\u0000\\]\u0003\u0014\n\u0000]^\u0005\r\u0000\u0000^_\u0006"+
		"\b\uffff\uffff\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000ab\u0005\u000b\u0000\u0000bc\u0005\u0014\u0000\u0000cd\u0006\t\uffff"+
		"\uffff\u0000de\u0005\u0013\u0000\u0000ef\u0006\t\uffff\uffff\u0000fg\u0007"+
		"\u0000\u0000\u0000gh\u0006\t\uffff\uffff\u0000hi\u0005\f\u0000\u0000i"+
		"j\u0005\u0011\u0000\u0000jl\u0006\t\uffff\uffff\u0000km\u0003\n\u0005"+
		"\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0012\u0000\u0000q}\u0006\t\uffff\uffff\u0000rs\u0005\b\u0000\u0000s"+
		"t\u0005\u0011\u0000\u0000tv\u0006\t\uffff\uffff\u0000uw\u0003\n\u0005"+
		"\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005"+
		"\u0012\u0000\u0000{|\u0006\t\uffff\uffff\u0000|~\u0001\u0000\u0000\u0000"+
		"}r\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0013\u0001\u0000"+
		"\u0000\u0000\u007f\u0085\u0003\u0016\u000b\u0000\u0080\u0081\u0005\u000e"+
		"\u0000\u0000\u0081\u0082\u0006\n\uffff\uffff\u0000\u0082\u0084\u0003\u0016"+
		"\u000b\u0000\u0083\u0080\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005\u0014\u0000\u0000\u0089\u008d\u0006\u000b"+
		"\uffff\uffff\u0000\u008a\u008b\u0005\u0015\u0000\u0000\u008b\u008d\u0006"+
		"\u000b\uffff\uffff\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008a"+
		"\u0001\u0000\u0000\u0000\u008d\u0017\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0005\t\u0000\u0000\u008f\u0090\u0005\u000b\u0000\u0000\u0090\u0091\u0006"+
		"\f\uffff\uffff\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0093\u0006"+
		"\f\uffff\uffff\u0000\u0093\u0094\u0005\u0013\u0000\u0000\u0094\u0095\u0006"+
		"\f\uffff\uffff\u0000\u0095\u0096\u0005\u0014\u0000\u0000\u0096\u0097\u0006"+
		"\f\uffff\uffff\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0005"+
		"\u0011\u0000\u0000\u0099\u009d\u0006\f\uffff\uffff\u0000\u009a\u009c\u0003"+
		"\n\u0005\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000"+
		"\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000"+
		"\u0000\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0012\u0000\u0000\u00a1\u00a2\u0006\f\uffff"+
		"\uffff\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\n\u0000"+
		"\u0000\u00a4\u00a5\u0005\u000b\u0000\u0000\u00a5\u00a6\u0006\r\uffff\uffff"+
		"\u0000\u00a6\u00a7\u0005\u0015\u0000\u0000\u00a7\u00a8\u0006\r\uffff\uffff"+
		"\u0000\u00a8\u00a9\u0005\r\u0000\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000"+
		"\u00aa\u00ab\u0006\r\uffff\uffff\u0000\u00ab\u00ac\u0005\u0013\u0000\u0000"+
		"\u00ac\u00ad\u0006\r\uffff\uffff\u0000\u00ad\u00ae\u0005\u0014\u0000\u0000"+
		"\u00ae\u00af\u0006\r\uffff\uffff\u0000\u00af\u00b0\u0005\f\u0000\u0000"+
		"\u00b0\u00b1\u0005\u0011\u0000\u0000\u00b1\u00b5\u0006\r\uffff\uffff\u0000"+
		"\u00b2\u00b4\u0003\n\u0005\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0012\u0000\u0000\u00b9"+
		"\u00ba\u0006\r\uffff\uffff\u0000\u00ba\u001b\u0001\u0000\u0000\u0000\f"+
		"%/8>Fnx}\u0085\u008c\u009d\u00b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}