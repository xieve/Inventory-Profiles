// Generated from src/main/java/io/github/jsnimda/inventoryprofiles/parser/antlr/RulesParser.g4 by ANTLR 4.8
package io.github.jsnimda.inventoryprofiles.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, AT=2, ERR=3, REVERSE=4, DOUBLE_COLON=5, HASHTAG=6, ItemName=7, OPEN=8, 
		NBT=9, WS_mRuleEntry=10, RuleName=11, Parameter=12, EQUAL=13, CLOSE=14, 
		WS_mArgs=15, COMMA=16, WS_mArg=17, Argument=18;
	public static final int
		RULE_customRuleEOF = 0, RULE_ruleEntryEOF = 1, RULE_head = 2, RULE_ruleEntry = 3, 
		RULE_ruleIdentifier = 4, RULE_arguments = 5, RULE_pair = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"customRuleEOF", "ruleEntryEOF", "head", "ruleEntry", "ruleIdentifier", 
			"arguments", "pair"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'@'", null, "'!'", "'::'", "'#'", null, "'('", null, null, 
			null, null, "'='", "')'", null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "AT", "ERR", "REVERSE", "DOUBLE_COLON", "HASHTAG", "ItemName", 
			"OPEN", "NBT", "WS_mRuleEntry", "RuleName", "Parameter", "EQUAL", "CLOSE", 
			"WS_mArgs", "COMMA", "WS_mArg", "Argument"
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
	public String getGrammarFileName() { return "RulesParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CustomRuleEOFContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RulesParser.EOF, 0); }
		public List<RuleEntryContext> ruleEntry() {
			return getRuleContexts(RuleEntryContext.class);
		}
		public RuleEntryContext ruleEntry(int i) {
			return getRuleContext(RuleEntryContext.class,i);
		}
		public CustomRuleEOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customRuleEOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterCustomRuleEOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitCustomRuleEOF(this);
		}
	}

	public final CustomRuleEOFContext customRuleEOF() throws RecognitionException {
		CustomRuleEOFContext _localctx = new CustomRuleEOFContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_customRuleEOF);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			head();
			setState(16); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(15);
				ruleEntry();
				}
				}
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << REVERSE) | (1L << DOUBLE_COLON) | (1L << HASHTAG) | (1L << ItemName))) != 0) );
			setState(20);
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

	public static class RuleEntryEOFContext extends ParserRuleContext {
		public RuleEntryContext ruleEntry() {
			return getRuleContext(RuleEntryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(RulesParser.EOF, 0); }
		public RuleEntryEOFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEntryEOF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterRuleEntryEOF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitRuleEntryEOF(this);
		}
	}

	public final RuleEntryEOFContext ruleEntryEOF() throws RecognitionException {
		RuleEntryEOFContext _localctx = new RuleEntryEOFContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleEntryEOF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			ruleEntry();
			setState(23);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(RulesParser.AT, 0); }
		public TerminalNode RuleName() { return getToken(RulesParser.RuleName, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitHead(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(AT);
			setState(26);
			match(RuleName);
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

	public static class RuleEntryContext extends ParserRuleContext {
		public RuleIdentifierContext ruleIdentifier() {
			return getRuleContext(RuleIdentifierContext.class,0);
		}
		public TerminalNode REVERSE() { return getToken(RulesParser.REVERSE, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public RuleEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterRuleEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitRuleEntry(this);
		}
	}

	public final RuleEntryContext ruleEntry() throws RecognitionException {
		RuleEntryContext _localctx = new RuleEntryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleEntry);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(28);
				match(REVERSE);
				}
			}

			setState(31);
			ruleIdentifier();
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN) {
				{
				setState(32);
				arguments();
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

	public static class RuleIdentifierContext extends ParserRuleContext {
		public TerminalNode RuleName() { return getToken(RulesParser.RuleName, 0); }
		public TerminalNode AT() { return getToken(RulesParser.AT, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(RulesParser.DOUBLE_COLON, 0); }
		public TerminalNode HASHTAG() { return getToken(RulesParser.HASHTAG, 0); }
		public TerminalNode NBT() { return getToken(RulesParser.NBT, 0); }
		public TerminalNode ItemName() { return getToken(RulesParser.ItemName, 0); }
		public RuleIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterRuleIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitRuleIdentifier(this);
		}
	}

	public final RuleIdentifierContext ruleIdentifier() throws RecognitionException {
		RuleIdentifierContext _localctx = new RuleIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleIdentifier);
		int _la;
		try {
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
			case DOUBLE_COLON:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==AT || _la==DOUBLE_COLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(36);
				match(RuleName);
				}
				break;
			case HASHTAG:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				match(HASHTAG);
				setState(38);
				match(RuleName);
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NBT) {
					{
					setState(39);
					match(NBT);
					}
				}

				}
				break;
			case ItemName:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(ItemName);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NBT) {
					{
					setState(43);
					match(NBT);
					}
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(RulesParser.OPEN, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(RulesParser.CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(RulesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(RulesParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(OPEN);
				setState(49);
				pair();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50);
					match(COMMA);
					setState(51);
					pair();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57);
				match(CLOSE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(OPEN);
				setState(60);
				match(CLOSE);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode Parameter() { return getToken(RulesParser.Parameter, 0); }
		public TerminalNode EQUAL() { return getToken(RulesParser.EQUAL, 0); }
		public TerminalNode Argument() { return getToken(RulesParser.Argument, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RulesParserListener ) ((RulesParserListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(Parameter);
			setState(64);
			match(EQUAL);
			setState(65);
			match(Argument);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\6\2\23\n\2\r\2\16\2"+
		"\24\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\5\5 \n\5\3\5\3\5\5\5$\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\5\6+\n\6\3\6\3\6\5\6/\n\6\5\6\61\n\6\3\7\3\7\3\7\3\7"+
		"\7\7\67\n\7\f\7\16\7:\13\7\3\7\3\7\3\7\3\7\5\7@\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\2\2\t\2\4\6\b\n\f\16\2\3\4\2\4\4\7\7\2G\2\20\3\2\2\2\4\30\3\2\2\2\6"+
		"\33\3\2\2\2\b\37\3\2\2\2\n\60\3\2\2\2\f?\3\2\2\2\16A\3\2\2\2\20\22\5\6"+
		"\4\2\21\23\5\b\5\2\22\21\3\2\2\2\23\24\3\2\2\2\24\22\3\2\2\2\24\25\3\2"+
		"\2\2\25\26\3\2\2\2\26\27\7\2\2\3\27\3\3\2\2\2\30\31\5\b\5\2\31\32\7\2"+
		"\2\3\32\5\3\2\2\2\33\34\7\4\2\2\34\35\7\r\2\2\35\7\3\2\2\2\36 \7\6\2\2"+
		"\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\5\n\6\2\"$\5\f\7\2#\"\3\2\2\2#"+
		"$\3\2\2\2$\t\3\2\2\2%&\t\2\2\2&\61\7\r\2\2\'(\7\b\2\2(*\7\r\2\2)+\7\13"+
		"\2\2*)\3\2\2\2*+\3\2\2\2+\61\3\2\2\2,.\7\t\2\2-/\7\13\2\2.-\3\2\2\2./"+
		"\3\2\2\2/\61\3\2\2\2\60%\3\2\2\2\60\'\3\2\2\2\60,\3\2\2\2\61\13\3\2\2"+
		"\2\62\63\7\n\2\2\638\5\16\b\2\64\65\7\22\2\2\65\67\5\16\b\2\66\64\3\2"+
		"\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\20\2\2"+
		"<@\3\2\2\2=>\7\n\2\2>@\7\20\2\2?\62\3\2\2\2?=\3\2\2\2@\r\3\2\2\2AB\7\16"+
		"\2\2BC\7\17\2\2CD\7\24\2\2D\17\3\2\2\2\n\24\37#*.\608?";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}