// Generated from /home/pouya/AndroidStudioProjects/compiler/app/src/main/java/com/example/compiler/antlrCodeGenegrated/Grammar.g4 by ANTLR 4.7.2
package com.example.compiler.antlrCodeGenegrated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

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
		T__45=46, DIGITS=47, ALPHABET=48, ALPHABETS=49, WS=50;
	public static final int
		RULE_program = 0, RULE_statements = 1, RULE_statement = 2, RULE_expr = 3, 
		RULE_complexExp = 4, RULE_div_multi = 5, RULE_pow = 6, RULE_fact = 7, 
		RULE_openBracket = 8, RULE_closeBracket = 9, RULE_opneParan = 10, RULE_closeParan = 11, 
		RULE_semicolon = 12, RULE_equal = 13, RULE_colon = 14, RULE_plus_minusOP = 15, 
		RULE_div_multiOP = 16, RULE_power = 17, RULE_binop = 18, RULE_number = 19, 
		RULE_identifier = 20, RULE_numcom = 21, RULE_value = 22, RULE_stringliteral = 23, 
		RULE_boolea = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statements", "statement", "expr", "complexExp", "div_multi", 
			"pow", "fact", "openBracket", "closeBracket", "opneParan", "closeParan", 
			"semicolon", "equal", "colon", "plus_minusOP", "div_multiOP", "power", 
			"binop", "number", "identifier", "numcom", "value", "stringliteral", 
			"boolea"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end'", "'if'", "'then'", "'else'", "'while'", "'do'", 
			"'for'", "'loop'", "'print'", "','", "'println'", "'put'", "'array'", 
			"'array.get'", "'array.put'", "'array.size'", "'map'", "'map.get'", "'map.put'", 
			"'map.size'", "'!'", "'{'", "'}'", "'('", "')'", "';'", "'='", "':'", 
			"'+'", "'-'", "'/'", "'*'", "'%'", "'^'", "'<'", "'>'", "'<='", "'>='", 
			"'=='", "'!='", "'.'", "'_'", "'\"'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "DIGITS", 
			"ALPHABET", "ALPHABETS", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				statement();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << ALPHABET))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EqualContext equal() {
			return getRuleContext(EqualContext.class,0);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutmapContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PutmapContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPutmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPutmap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPutmap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PutContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPut(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetarrayContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public GetarrayContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetmapContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public GetmapContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGetmap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGetmap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGetmap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfelseContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfelseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfelse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfelse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintfContext extends StatementContext {
		public StringliteralContext stringliteral() {
			return getRuleContext(StringliteralContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PrintfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizearrayContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public SizearrayContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSizearray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSizearray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSizearray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutarrayContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PutarrayContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPutarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPutarray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPutarray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public PrintlnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginendContext extends StatementContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BeginendContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBeginend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBeginend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBeginend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public OpenBracketContext openBracket() {
			return getRuleContext(OpenBracketContext.class,0);
		}
		public NumcomContext numcom() {
			return getRuleContext(NumcomContext.class,0);
		}
		public CloseBracketContext closeBracket() {
			return getRuleContext(CloseBracketContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public ArrayContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoopContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LoopContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizemapContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public SizemapContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSizemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSizemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSizemap(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MapContext extends StatementContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColonContext colon() {
			return getRuleContext(ColonContext.class,0);
		}
		public OpenBracketContext openBracket() {
			return getRuleContext(OpenBracketContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public CloseBracketContext closeBracket() {
			return getRuleContext(CloseBracketContext.class,0);
		}
		public SemicolonContext semicolon() {
			return getRuleContext(SemicolonContext.class,0);
		}
		public MapContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				identifier();
				setState(58);
				equal();
				setState(59);
				expr(0);
				setState(60);
				semicolon();
				}
				break;
			case 2:
				_localctx = new BeginendContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__0);
				setState(63);
				statements();
				setState(64);
				match(T__1);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__2);
				setState(67);
				expr(0);
				setState(68);
				match(T__3);
				setState(69);
				statement();
				}
				break;
			case 4:
				_localctx = new IfelseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(T__2);
				setState(72);
				expr(0);
				setState(73);
				match(T__3);
				setState(74);
				statement();
				setState(75);
				match(T__4);
				setState(76);
				statement();
				}
				break;
			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__5);
				setState(79);
				expr(0);
				setState(80);
				match(T__6);
				setState(81);
				statement();
				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(T__7);
				setState(84);
				identifier();
				setState(85);
				equal();
				setState(86);
				number();
				setState(87);
				colon();
				setState(88);
				number();
				setState(89);
				match(T__6);
				setState(90);
				statement();
				}
				break;
			case 7:
				_localctx = new LoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(92);
				match(T__8);
				setState(93);
				identifier();
				setState(94);
				colon();
				setState(95);
				number();
				setState(96);
				match(T__6);
				setState(97);
				statement();
				}
				break;
			case 8:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(99);
				match(T__9);
				setState(100);
				identifier();
				setState(101);
				semicolon();
				}
				break;
			case 9:
				_localctx = new PrintfContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				match(T__9);
				setState(104);
				stringliteral();
				setState(105);
				match(T__10);
				setState(106);
				identifier();
				setState(107);
				semicolon();
				}
				break;
			case 10:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(109);
				match(T__11);
				setState(110);
				identifier();
				setState(111);
				semicolon();
				}
				break;
			case 11:
				_localctx = new PutContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(113);
				match(T__12);
				setState(114);
				identifier();
				setState(115);
				semicolon();
				}
				break;
			case 12:
				_localctx = new ArrayContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(117);
				match(T__13);
				setState(118);
				identifier();
				setState(119);
				colon();
				setState(120);
				openBracket();
				setState(121);
				numcom();
				setState(122);
				closeBracket();
				setState(123);
				semicolon();
				}
				break;
			case 13:
				_localctx = new GetarrayContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(125);
				match(T__14);
				setState(126);
				identifier();
				setState(127);
				opneParan();
				setState(128);
				number();
				setState(129);
				closeParan();
				setState(130);
				semicolon();
				}
				break;
			case 14:
				_localctx = new PutarrayContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(132);
				match(T__15);
				setState(133);
				identifier();
				setState(134);
				opneParan();
				setState(135);
				number();
				setState(136);
				closeParan();
				setState(137);
				semicolon();
				}
				break;
			case 15:
				_localctx = new SizearrayContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(139);
				match(T__16);
				setState(140);
				identifier();
				setState(141);
				semicolon();
				}
				break;
			case 16:
				_localctx = new MapContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(143);
				match(T__17);
				setState(144);
				identifier();
				setState(145);
				colon();
				setState(146);
				openBracket();
				setState(147);
				value();
				setState(148);
				closeBracket();
				setState(149);
				semicolon();
				}
				break;
			case 17:
				_localctx = new GetmapContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(151);
				match(T__18);
				setState(152);
				identifier();
				setState(153);
				opneParan();
				setState(154);
				stringliteral();
				setState(155);
				closeParan();
				setState(156);
				semicolon();
				}
				break;
			case 18:
				_localctx = new PutmapContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(158);
				match(T__19);
				setState(159);
				identifier();
				setState(160);
				opneParan();
				setState(161);
				stringliteral();
				setState(162);
				match(T__10);
				setState(163);
				number();
				setState(164);
				closeParan();
				setState(165);
				semicolon();
				}
				break;
			case 19:
				_localctx = new SizemapContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(167);
				match(T__20);
				setState(168);
				identifier();
				setState(169);
				semicolon();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComplexExprContext extends ExprContext {
		public ComplexExpContext complexExp() {
			return getRuleContext(ComplexExpContext.class,0);
		}
		public ComplexExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComplexExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComplexExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComplexExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public BooleaContext boolea() {
			return getRuleContext(BooleaContext.class,0);
		}
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinoprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinopContext binop() {
			return getRuleContext(BinopContext.class,0);
		}
		public BinoprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBinopr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBinopr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBinopr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(174);
				match(T__21);
				setState(175);
				expr(6);
				}
				break;
			case 2:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				opneParan();
				setState(177);
				expr(0);
				setState(178);
				closeParan();
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				identifier();
				}
				break;
			case 4:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				number();
				}
				break;
			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				boolea();
				}
				break;
			case 6:
				{
				_localctx = new ComplexExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				complexExp();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BinoprContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(186);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(187);
					binop();
					setState(188);
					expr(8);
					}
					} 
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ComplexExpContext extends ParserRuleContext {
		public List<Div_multiContext> div_multi() {
			return getRuleContexts(Div_multiContext.class);
		}
		public Div_multiContext div_multi(int i) {
			return getRuleContext(Div_multiContext.class,i);
		}
		public List<Plus_minusOPContext> plus_minusOP() {
			return getRuleContexts(Plus_minusOPContext.class);
		}
		public Plus_minusOPContext plus_minusOP(int i) {
			return getRuleContext(Plus_minusOPContext.class,i);
		}
		public ComplexExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterComplexExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitComplexExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitComplexExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexExpContext complexExp() throws RecognitionException {
		ComplexExpContext _localctx = new ComplexExpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complexExp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			div_multi();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(196);
					plus_minusOP();
					setState(197);
					div_multi();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class Div_multiContext extends ParserRuleContext {
		public List<PowContext> pow() {
			return getRuleContexts(PowContext.class);
		}
		public PowContext pow(int i) {
			return getRuleContext(PowContext.class,i);
		}
		public List<Div_multiOPContext> div_multiOP() {
			return getRuleContexts(Div_multiOPContext.class);
		}
		public Div_multiOPContext div_multiOP(int i) {
			return getRuleContext(Div_multiOPContext.class,i);
		}
		public Div_multiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_multi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDiv_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDiv_multi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDiv_multi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_multiContext div_multi() throws RecognitionException {
		Div_multiContext _localctx = new Div_multiContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_div_multi);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			pow();
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(205);
					div_multiOP();
					setState(206);
					pow();
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PowContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public List<PowerContext> power() {
			return getRuleContexts(PowerContext.class);
		}
		public PowerContext power(int i) {
			return getRuleContext(PowerContext.class,i);
		}
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pow);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			fact();
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					power();
					setState(215);
					fact();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class FactContext extends ParserRuleContext {
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
	 
		public FactContext() { }
		public void copyFrom(FactContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NummContext extends FactContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NummContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanContext extends FactContext {
		public OpneParanContext opneParan() {
			return getRuleContext(OpneParanContext.class,0);
		}
		public ComplexExpContext complexExp() {
			return getRuleContext(ComplexExpContext.class,0);
		}
		public CloseParanContext closeParan() {
			return getRuleContext(CloseParanContext.class,0);
		}
		public ParanContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IddContext extends FactContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IddContext(FactContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fact);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				_localctx = new ParanContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				opneParan();
				setState(223);
				complexExp();
				setState(224);
				closeParan();
				}
				break;
			case ALPHABET:
				_localctx = new IddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				identifier();
				}
				break;
			case T__29:
			case T__30:
			case DIGITS:
				_localctx = new NummContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				number();
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

	public static class OpenBracketContext extends ParserRuleContext {
		public OpenBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpenBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpenBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpenBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBracketContext openBracket() throws RecognitionException {
		OpenBracketContext _localctx = new OpenBracketContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_openBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__22);
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

	public static class CloseBracketContext extends ParserRuleContext {
		public CloseBracketContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBracket; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCloseBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCloseBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCloseBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBracketContext closeBracket() throws RecognitionException {
		CloseBracketContext _localctx = new CloseBracketContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_closeBracket);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__23);
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

	public static class OpneParanContext extends ParserRuleContext {
		public OpneParanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opneParan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpneParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpneParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpneParan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpneParanContext opneParan() throws RecognitionException {
		OpneParanContext _localctx = new OpneParanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_opneParan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__24);
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

	public static class CloseParanContext extends ParserRuleContext {
		public CloseParanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCloseParan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCloseParan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCloseParan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseParanContext closeParan() throws RecognitionException {
		CloseParanContext _localctx = new CloseParanContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_closeParan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__25);
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

	public static class SemicolonContext extends ParserRuleContext {
		public SemicolonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semicolon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSemicolon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSemicolon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSemicolon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemicolonContext semicolon() throws RecognitionException {
		SemicolonContext _localctx = new SemicolonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_semicolon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__26);
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

	public static class EqualContext extends ParserRuleContext {
		public EqualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualContext equal() throws RecognitionException {
		EqualContext _localctx = new EqualContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_equal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__27);
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

	public static class ColonContext extends ParserRuleContext {
		public ColonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterColon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitColon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitColon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColonContext colon() throws RecognitionException {
		ColonContext _localctx = new ColonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_colon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__28);
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

	public static class Plus_minusOPContext extends ParserRuleContext {
		public Plus_minusOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus_minusOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPlus_minusOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPlus_minusOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPlus_minusOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Plus_minusOPContext plus_minusOP() throws RecognitionException {
		Plus_minusOPContext _localctx = new Plus_minusOPContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_plus_minusOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !(_la==T__29 || _la==T__30) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Div_multiOPContext extends ParserRuleContext {
		public Div_multiOPContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div_multiOP; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterDiv_multiOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitDiv_multiOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitDiv_multiOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Div_multiOPContext div_multiOP() throws RecognitionException {
		Div_multiOPContext _localctx = new Div_multiOPContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_div_multiOP);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__32) | (1L << T__33))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class PowerContext extends ParserRuleContext {
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_power);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__34);
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

	public static class BinopContext extends ParserRuleContext {
		public BinopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBinop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBinop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBinop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinopContext binop() throws RecognitionException {
		BinopContext _localctx = new BinopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_binop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(GrammarParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(GrammarParser.DIGITS, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__29 || _la==T__30) {
				{
				setState(252);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(255);
			match(DIGITS);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(256);
				match(T__41);
				setState(257);
				match(DIGITS);
				}
				break;
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(GrammarParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(GrammarParser.ALPHABET, i);
		}
		public List<TerminalNode> DIGITS() { return getTokens(GrammarParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(GrammarParser.DIGITS, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(ALPHABET);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(261);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__42) | (1L << DIGITS) | (1L << ALPHABET))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class NumcomContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public NumcomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numcom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNumcom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNumcom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNumcom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumcomContext numcom() throws RecognitionException {
		NumcomContext _localctx = new NumcomContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_numcom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__29) | (1L << T__30) | (1L << DIGITS))) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
				case T__30:
				case DIGITS:
					{
					setState(267);
					number();
					}
					break;
				case T__10:
					{
					setState(268);
					match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(273);
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

	public static class ValueContext extends ParserRuleContext {
		public List<StringliteralContext> stringliteral() {
			return getRuleContexts(StringliteralContext.class);
		}
		public StringliteralContext stringliteral(int i) {
			return getRuleContext(StringliteralContext.class,i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__43) {
				{
				setState(279);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__43:
					{
					{
					setState(274);
					stringliteral();
					setState(275);
					match(T__27);
					setState(276);
					number();
					}
					}
					break;
				case T__10:
					{
					setState(278);
					match(T__10);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(283);
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

	public static class StringliteralContext extends ParserRuleContext {
		public List<TerminalNode> ALPHABET() { return getTokens(GrammarParser.ALPHABET); }
		public TerminalNode ALPHABET(int i) {
			return getToken(GrammarParser.ALPHABET, i);
		}
		public StringliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringliteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStringliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStringliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStringliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringliteralContext stringliteral() throws RecognitionException {
		StringliteralContext _localctx = new StringliteralContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_stringliteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284);
			match(T__43);
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHABET) {
				{
				{
				setState(285);
				match(ALPHABET);
				}
				}
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			match(T__43);
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

	public static class BooleaContext extends ParserRuleContext {
		public BooleaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleaContext boolea() throws RecognitionException {
		BooleaContext _localctx = new BooleaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_boolea);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==T__44 || _la==T__45) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\3\6\38\n\3\r\3\16\39\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u00ae\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u00bb\n\5\3\5\3\5\3\5\3\5\7\5\u00c1\n\5\f\5\16\5\u00c4\13\5\3\6\3\6\3"+
		"\6\3\6\7\6\u00ca\n\6\f\6\16\6\u00cd\13\6\3\7\3\7\3\7\3\7\7\7\u00d3\n\7"+
		"\f\7\16\7\u00d6\13\7\3\b\3\b\3\b\3\b\7\b\u00dc\n\b\f\b\16\b\u00df\13\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e7\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\5\25\u0100\n\25\3\25\3\25\3\25\5\25\u0105\n\25\3\26\3\26\7\26"+
		"\u0109\n\26\f\26\16\26\u010c\13\26\3\27\3\27\7\27\u0110\n\27\f\27\16\27"+
		"\u0113\13\27\3\30\3\30\3\30\3\30\3\30\7\30\u011a\n\30\f\30\16\30\u011d"+
		"\13\30\3\31\3\31\7\31\u0121\n\31\f\31\16\31\u0124\13\31\3\31\3\31\3\32"+
		"\3\32\3\32\2\3\b\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\2\7\3\2 !\3\2\"$\3\2&+\4\2--\61\62\3\2/\60\2\u0136\2\64\3\2\2\2\4"+
		"\67\3\2\2\2\6\u00ad\3\2\2\2\b\u00ba\3\2\2\2\n\u00c5\3\2\2\2\f\u00ce\3"+
		"\2\2\2\16\u00d7\3\2\2\2\20\u00e6\3\2\2\2\22\u00e8\3\2\2\2\24\u00ea\3\2"+
		"\2\2\26\u00ec\3\2\2\2\30\u00ee\3\2\2\2\32\u00f0\3\2\2\2\34\u00f2\3\2\2"+
		"\2\36\u00f4\3\2\2\2 \u00f6\3\2\2\2\"\u00f8\3\2\2\2$\u00fa\3\2\2\2&\u00fc"+
		"\3\2\2\2(\u00ff\3\2\2\2*\u0106\3\2\2\2,\u0111\3\2\2\2.\u011b\3\2\2\2\60"+
		"\u011e\3\2\2\2\62\u0127\3\2\2\2\64\65\5\4\3\2\65\3\3\2\2\2\668\5\6\4\2"+
		"\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;<\5*\26\2<="+
		"\5\34\17\2=>\5\b\5\2>?\5\32\16\2?\u00ae\3\2\2\2@A\7\3\2\2AB\5\4\3\2BC"+
		"\7\4\2\2C\u00ae\3\2\2\2DE\7\5\2\2EF\5\b\5\2FG\7\6\2\2GH\5\6\4\2H\u00ae"+
		"\3\2\2\2IJ\7\5\2\2JK\5\b\5\2KL\7\6\2\2LM\5\6\4\2MN\7\7\2\2NO\5\6\4\2O"+
		"\u00ae\3\2\2\2PQ\7\b\2\2QR\5\b\5\2RS\7\t\2\2ST\5\6\4\2T\u00ae\3\2\2\2"+
		"UV\7\n\2\2VW\5*\26\2WX\5\34\17\2XY\5(\25\2YZ\5\36\20\2Z[\5(\25\2[\\\7"+
		"\t\2\2\\]\5\6\4\2]\u00ae\3\2\2\2^_\7\13\2\2_`\5*\26\2`a\5\36\20\2ab\5"+
		"(\25\2bc\7\t\2\2cd\5\6\4\2d\u00ae\3\2\2\2ef\7\f\2\2fg\5*\26\2gh\5\32\16"+
		"\2h\u00ae\3\2\2\2ij\7\f\2\2jk\5\60\31\2kl\7\r\2\2lm\5*\26\2mn\5\32\16"+
		"\2n\u00ae\3\2\2\2op\7\16\2\2pq\5*\26\2qr\5\32\16\2r\u00ae\3\2\2\2st\7"+
		"\17\2\2tu\5*\26\2uv\5\32\16\2v\u00ae\3\2\2\2wx\7\20\2\2xy\5*\26\2yz\5"+
		"\36\20\2z{\5\22\n\2{|\5,\27\2|}\5\24\13\2}~\5\32\16\2~\u00ae\3\2\2\2\177"+
		"\u0080\7\21\2\2\u0080\u0081\5*\26\2\u0081\u0082\5\26\f\2\u0082\u0083\5"+
		"(\25\2\u0083\u0084\5\30\r\2\u0084\u0085\5\32\16\2\u0085\u00ae\3\2\2\2"+
		"\u0086\u0087\7\22\2\2\u0087\u0088\5*\26\2\u0088\u0089\5\26\f\2\u0089\u008a"+
		"\5(\25\2\u008a\u008b\5\30\r\2\u008b\u008c\5\32\16\2\u008c\u00ae\3\2\2"+
		"\2\u008d\u008e\7\23\2\2\u008e\u008f\5*\26\2\u008f\u0090\5\32\16\2\u0090"+
		"\u00ae\3\2\2\2\u0091\u0092\7\24\2\2\u0092\u0093\5*\26\2\u0093\u0094\5"+
		"\36\20\2\u0094\u0095\5\22\n\2\u0095\u0096\5.\30\2\u0096\u0097\5\24\13"+
		"\2\u0097\u0098\5\32\16\2\u0098\u00ae\3\2\2\2\u0099\u009a\7\25\2\2\u009a"+
		"\u009b\5*\26\2\u009b\u009c\5\26\f\2\u009c\u009d\5\60\31\2\u009d\u009e"+
		"\5\30\r\2\u009e\u009f\5\32\16\2\u009f\u00ae\3\2\2\2\u00a0\u00a1\7\26\2"+
		"\2\u00a1\u00a2\5*\26\2\u00a2\u00a3\5\26\f\2\u00a3\u00a4\5\60\31\2\u00a4"+
		"\u00a5\7\r\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\5"+
		"\32\16\2\u00a8\u00ae\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\5*\26\2"+
		"\u00ab\u00ac\5\32\16\2\u00ac\u00ae\3\2\2\2\u00ad;\3\2\2\2\u00ad@\3\2\2"+
		"\2\u00adD\3\2\2\2\u00adI\3\2\2\2\u00adP\3\2\2\2\u00adU\3\2\2\2\u00ad^"+
		"\3\2\2\2\u00ade\3\2\2\2\u00adi\3\2\2\2\u00ado\3\2\2\2\u00ads\3\2\2\2\u00ad"+
		"w\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u0086\3\2\2\2\u00ad\u008d\3\2\2\2\u00ad"+
		"\u0091\3\2\2\2\u00ad\u0099\3\2\2\2\u00ad\u00a0\3\2\2\2\u00ad\u00a9\3\2"+
		"\2\2\u00ae\7\3\2\2\2\u00af\u00b0\b\5\1\2\u00b0\u00b1\7\30\2\2\u00b1\u00bb"+
		"\5\b\5\b\u00b2\u00b3\5\26\f\2\u00b3\u00b4\5\b\5\2\u00b4\u00b5\5\30\r\2"+
		"\u00b5\u00bb\3\2\2\2\u00b6\u00bb\5*\26\2\u00b7\u00bb\5(\25\2\u00b8\u00bb"+
		"\5\62\32\2\u00b9\u00bb\5\n\6\2\u00ba\u00af\3\2\2\2\u00ba\u00b2\3\2\2\2"+
		"\u00ba\u00b6\3\2\2\2\u00ba\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9"+
		"\3\2\2\2\u00bb\u00c2\3\2\2\2\u00bc\u00bd\f\t\2\2\u00bd\u00be\5&\24\2\u00be"+
		"\u00bf\5\b\5\n\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2"+
		"\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\t\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00cb\5\f\7\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\5\f\7\2\u00c8"+
		"\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc\13\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d4"+
		"\5\16\b\2\u00cf\u00d0\5\"\22\2\u00d0\u00d1\5\16\b\2\u00d1\u00d3\3\2\2"+
		"\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5"+
		"\3\2\2\2\u00d5\r\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00dd\5\20\t\2\u00d8"+
		"\u00d9\5$\23\2\u00d9\u00da\5\20\t\2\u00da\u00dc\3\2\2\2\u00db\u00d8\3"+
		"\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\17\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1\5\26\f\2\u00e1\u00e2\5\n\6"+
		"\2\u00e2\u00e3\5\30\r\2\u00e3\u00e7\3\2\2\2\u00e4\u00e7\5*\26\2\u00e5"+
		"\u00e7\5(\25\2\u00e6\u00e0\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2"+
		"\2\2\u00e7\21\3\2\2\2\u00e8\u00e9\7\31\2\2\u00e9\23\3\2\2\2\u00ea\u00eb"+
		"\7\32\2\2\u00eb\25\3\2\2\2\u00ec\u00ed\7\33\2\2\u00ed\27\3\2\2\2\u00ee"+
		"\u00ef\7\34\2\2\u00ef\31\3\2\2\2\u00f0\u00f1\7\35\2\2\u00f1\33\3\2\2\2"+
		"\u00f2\u00f3\7\36\2\2\u00f3\35\3\2\2\2\u00f4\u00f5\7\37\2\2\u00f5\37\3"+
		"\2\2\2\u00f6\u00f7\t\2\2\2\u00f7!\3\2\2\2\u00f8\u00f9\t\3\2\2\u00f9#\3"+
		"\2\2\2\u00fa\u00fb\7%\2\2\u00fb%\3\2\2\2\u00fc\u00fd\t\4\2\2\u00fd\'\3"+
		"\2\2\2\u00fe\u0100\t\2\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0104\7\61\2\2\u0102\u0103\7,\2\2\u0103\u0105\7\61"+
		"\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105)\3\2\2\2\u0106\u010a"+
		"\7\62\2\2\u0107\u0109\t\5\2\2\u0108\u0107\3\2\2\2\u0109\u010c\3\2\2\2"+
		"\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b+\3\2\2\2\u010c\u010a\3"+
		"\2\2\2\u010d\u0110\5(\25\2\u010e\u0110\7\r\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112-\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\5\60\31\2\u0115\u0116"+
		"\7\36\2\2\u0116\u0117\5(\25\2\u0117\u011a\3\2\2\2\u0118\u011a\7\r\2\2"+
		"\u0119\u0114\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119"+
		"\3\2\2\2\u011b\u011c\3\2\2\2\u011c/\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u0122\7.\2\2\u011f\u0121\7\62\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0125\u0126\7.\2\2\u0126\61\3\2\2\2\u0127\u0128\t\6\2\2"+
		"\u0128\63\3\2\2\2\229\u00ad\u00ba\u00c2\u00cb\u00d4\u00dd\u00e6\u00ff"+
		"\u0104\u010a\u010f\u0111\u0119\u011b\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}