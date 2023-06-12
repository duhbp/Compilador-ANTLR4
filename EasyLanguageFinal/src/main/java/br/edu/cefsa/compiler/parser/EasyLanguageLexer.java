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

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EasyLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, SC=13, OP=14, ATTR=15, VIR=16, ACH=17, FCH=18, 
		OPREL=19, ID=20, NUMBER=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
			"ID", "NUMBER", "WS"
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


	public EasyLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EasyLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0016\u009f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0086\b\u0012\u0001\u0013\u0001\u0013\u0005\u0013\u008a\b"+
		"\u0013\n\u0013\f\u0013\u008d\t\u0013\u0001\u0014\u0004\u0014\u0090\b\u0014"+
		"\u000b\u0014\f\u0014\u0091\u0001\u0014\u0001\u0014\u0004\u0014\u0096\b"+
		"\u0014\u000b\u0014\f\u0014\u0097\u0003\u0014\u009a\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0006\u0003\u0000"+
		"*+--//\u0002\u0000<<>>\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u0003"+
		"\u0000\t\n\r\r  \u00a6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u00032\u0001\u0000\u0000\u0000\u00057\u0001\u0000\u0000"+
		"\u0000\u0007>\u0001\u0000\u0000\u0000\tC\u0001\u0000\u0000\u0000\u000b"+
		"H\u0001\u0000\u0000\u0000\rW\u0001\u0000\u0000\u0000\u000fZ\u0001\u0000"+
		"\u0000\u0000\u0011_\u0001\u0000\u0000\u0000\u0013e\u0001\u0000\u0000\u0000"+
		"\u0015l\u0001\u0000\u0000\u0000\u0017n\u0001\u0000\u0000\u0000\u0019p"+
		"\u0001\u0000\u0000\u0000\u001br\u0001\u0000\u0000\u0000\u001dt\u0001\u0000"+
		"\u0000\u0000\u001fv\u0001\u0000\u0000\u0000!x\u0001\u0000\u0000\u0000"+
		"#z\u0001\u0000\u0000\u0000%\u0085\u0001\u0000\u0000\u0000\'\u0087\u0001"+
		"\u0000\u0000\u0000)\u008f\u0001\u0000\u0000\u0000+\u009b\u0001\u0000\u0000"+
		"\u0000-.\u0005i\u0000\u0000./\u0005n\u0000\u0000/0\u0005i\u0000\u0000"+
		"01\u0005t\u0000\u00001\u0002\u0001\u0000\u0000\u000023\u0005e\u0000\u0000"+
		"34\u0005n\u0000\u000045\u0005d\u0000\u000056\u0005;\u0000\u00006\u0004"+
		"\u0001\u0000\u0000\u000078\u0005n\u0000\u000089\u0005u\u0000\u00009:\u0005"+
		"m\u0000\u0000:;\u0005b\u0000\u0000;<\u0005e\u0000\u0000<=\u0005r\u0000"+
		"\u0000=\u0006\u0001\u0000\u0000\u0000>?\u0005t\u0000\u0000?@\u0005e\u0000"+
		"\u0000@A\u0005x\u0000\u0000AB\u0005t\u0000\u0000B\b\u0001\u0000\u0000"+
		"\u0000CD\u0005r\u0000\u0000DE\u0005e\u0000\u0000EF\u0005a\u0000\u0000"+
		"FG\u0005d\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005p\u0000\u0000"+
		"IJ\u0005r\u0000\u0000JK\u0005i\u0000\u0000KL\u0005n\u0000\u0000LM\u0005"+
		"t\u0000\u0000MN\u0005.\u0000\u0000NO\u0005t\u0000\u0000OP\u0005e\u0000"+
		"\u0000PQ\u0005r\u0000\u0000QR\u0005m\u0000\u0000RS\u0005i\u0000\u0000"+
		"ST\u0005n\u0000\u0000TU\u0005a\u0000\u0000UV\u0005l\u0000\u0000V\f\u0001"+
		"\u0000\u0000\u0000WX\u0005i\u0000\u0000XY\u0005f\u0000\u0000Y\u000e\u0001"+
		"\u0000\u0000\u0000Z[\u0005e\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]^\u0005e\u0000\u0000^\u0010\u0001\u0000\u0000\u0000_`\u0005"+
		"w\u0000\u0000`a\u0005h\u0000\u0000ab\u0005i\u0000\u0000bc\u0005l\u0000"+
		"\u0000cd\u0005e\u0000\u0000d\u0012\u0001\u0000\u0000\u0000ef\u0005r\u0000"+
		"\u0000fg\u0005e\u0000\u0000gh\u0005p\u0000\u0000hi\u0005e\u0000\u0000"+
		"ij\u0005a\u0000\u0000jk\u0005t\u0000\u0000k\u0014\u0001\u0000\u0000\u0000"+
		"lm\u0005(\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005)\u0000\u0000"+
		"o\u0018\u0001\u0000\u0000\u0000pq\u0005;\u0000\u0000q\u001a\u0001\u0000"+
		"\u0000\u0000rs\u0007\u0000\u0000\u0000s\u001c\u0001\u0000\u0000\u0000"+
		"tu\u0005=\u0000\u0000u\u001e\u0001\u0000\u0000\u0000vw\u0005,\u0000\u0000"+
		"w \u0001\u0000\u0000\u0000xy\u0005{\u0000\u0000y\"\u0001\u0000\u0000\u0000"+
		"z{\u0005}\u0000\u0000{$\u0001\u0000\u0000\u0000|\u0086\u0007\u0001\u0000"+
		"\u0000}~\u0005>\u0000\u0000~\u0086\u0005=\u0000\u0000\u007f\u0080\u0005"+
		"<\u0000\u0000\u0080\u0086\u0005=\u0000\u0000\u0081\u0082\u0005=\u0000"+
		"\u0000\u0082\u0086\u0005=\u0000\u0000\u0083\u0084\u0005!\u0000\u0000\u0084"+
		"\u0086\u0005=\u0000\u0000\u0085|\u0001\u0000\u0000\u0000\u0085}\u0001"+
		"\u0000\u0000\u0000\u0085\u007f\u0001\u0000\u0000\u0000\u0085\u0081\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086&\u0001\u0000"+
		"\u0000\u0000\u0087\u008b\u0007\u0002\u0000\u0000\u0088\u008a\u0007\u0003"+
		"\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u008a\u008d\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000"+
		"\u0000\u0000\u008c(\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000"+
		"\u0000\u008e\u0090\u0007\u0004\u0000\u0000\u008f\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0099\u0001\u0000\u0000"+
		"\u0000\u0093\u0095\u0005.\u0000\u0000\u0094\u0096\u0007\u0004\u0000\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000"+
		"\u0097\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000"+
		"\u0098\u009a\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a*\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0007\u0005\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0006\u0015\u0000\u0000\u009e,\u0001\u0000\u0000\u0000\u0007\u0000"+
		"\u0085\u0089\u008b\u0091\u0097\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}