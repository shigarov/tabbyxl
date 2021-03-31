// $ANTLR null D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g 2019-12-19 19:22:38

package ru.icc.td.tabbyxl.crl2j.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class CRLLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int T__65=65;
	public static final int T__66=66;
	public static final int T__67=67;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int ACTION=4;
	public static final int ACTIONS=5;
	public static final int ASSIGNMENT=6;
	public static final int BRACKET=7;
	public static final int CHAR=8;
	public static final int COMMENT=9;
	public static final int CONDITION=10;
	public static final int CONDITIONS=11;
	public static final int CONSTRAINT=12;
	public static final int CONSTRAINTS=13;
	public static final int EOL=14;
	public static final int ESC_SEQ=15;
	public static final int EXPONENT=16;
	public static final int EXPRESSION=17;
	public static final int FLOAT=18;
	public static final int HEX_DIGIT=19;
	public static final int ID=20;
	public static final int IDENTIFIER=21;
	public static final int IMPORT=22;
	public static final int IMPORTS=23;
	public static final int INT=24;
	public static final int OCTAL_ESC=25;
	public static final int OPERAND=26;
	public static final int OPERATOR=27;
	public static final int QUERY=28;
	public static final int RULE=29;
	public static final int RULES=30;
	public static final int STRING=31;
	public static final int TYPE=32;
	public static final int UNICODE_ESC=33;
	public static final int WS=34;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public CRLLexer() {} 
	public CRLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public CRLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g"; }

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:12:7: ( ',' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:12:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:13:7: ( '.' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:13:9: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:14:7: ( '.*' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:14:9: '.*'
			{
			match(".*"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:15:7: ( ':' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:15:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:16:7: ( ';' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:16:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:17:7: ( 'add label' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:17:9: 'add label'
			{
			match("add label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:18:7: ( 'as' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:18:9: 'as'
			{
			match("as"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:19:7: ( 'categories' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:19:9: 'categories'
			{
			match("categories"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:20:7: ( 'category' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:20:9: 'category'
			{
			match("category"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:21:7: ( 'cell' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:21:9: 'cell'
			{
			match("cell"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:22:7: ( 'cells' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:22:9: 'cells'
			{
			match("cells"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:23:7: ( 'end' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:23:9: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:24:7: ( 'entries' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:24:9: 'entries'
			{
			match("entries"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:25:7: ( 'entry' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:25:9: 'entry'
			{
			match("entry"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:26:7: ( 'group' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:26:9: 'group'
			{
			match("group"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:27:7: ( 'import static' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:27:9: 'import static'
			{
			match("import static"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:28:7: ( 'label' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:28:9: 'label'
			{
			match("label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:29:7: ( 'labels' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:29:9: 'labels'
			{
			match("labels"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:30:7: ( 'merge' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:30:9: 'merge'
			{
			match("merge"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:31:7: ( 'new entry' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:31:9: 'new entry'
			{
			match("new entry"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:32:7: ( 'new label' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:32:9: 'new label'
			{
			match("new label"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:33:7: ( 'no' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:33:9: 'no'
			{
			match("no"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:34:7: ( 'of' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:34:9: 'of'
			{
			match("of"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:35:7: ( 'print' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:35:9: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:36:7: ( 'printf' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:36:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:37:7: ( 'rule #' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:37:9: 'rule #'
			{
			match("rule #"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:38:7: ( 'set category' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:38:9: 'set category'
			{
			match("set category"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:39:7: ( 'set indent' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:39:9: 'set indent'
			{
			match("set indent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:40:7: ( 'set parent' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:40:9: 'set parent'
			{
			match("set parent"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:41:7: ( 'set tag' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:41:9: 'set tag'
			{
			match("set tag"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "T__65"
	public final void mT__65() throws RecognitionException {
		try {
			int _type = T__65;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:7: ( 'set text' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:42:9: 'set text'
			{
			match("set text"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__65"

	// $ANTLR start "T__66"
	public final void mT__66() throws RecognitionException {
		try {
			int _type = T__66;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:43:7: ( 'set value' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:43:9: 'set value'
			{
			match("set value"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__66"

	// $ANTLR start "T__67"
	public final void mT__67() throws RecognitionException {
		try {
			int _type = T__67;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:7: ( 'split' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:44:9: 'split'
			{
			match("split"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__67"

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:45:7: ( 'then' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:45:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:46:7: ( 'to' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:46:9: 'to'
			{
			match("to"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:47:7: ( 'when' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:47:9: 'when'
			{
			match("when"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:48:7: ( 'with' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:48:9: 'with'
			{
			match("with"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '$' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
			{
			if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:192:35: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='$'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:195:5: ( ( '0' .. '9' )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:195:7: ( '0' .. '9' )+
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:195:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:9: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:25: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:37: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:199:37: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:200:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:200:13: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:200:25: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:200:25: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:201:9: ( '0' .. '9' )+ EXPONENT
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:201:9: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:205:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:205:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:205:14: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:205:28: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:205:28: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:206:9: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:206:14: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:206:42: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:209:5: ( ( ' ' | '\\t' ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:209:9: ( ' ' | '\\t' )
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:215:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:215:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:215:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:215:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:215:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:218:5: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:218:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:218:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:218:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:218:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "OPERATOR"
	public final void mOPERATOR() throws RecognitionException {
		try {
			int _type = OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:222:2: ( ( '=' | '>' | '<' | '&' | '|' | '+' | '-' | '*' | '/' | '%' | '!' )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:222:4: ( '=' | '>' | '<' | '&' | '|' | '+' | '-' | '*' | '/' | '%' | '!' )+
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:222:4: ( '=' | '>' | '<' | '&' | '|' | '+' | '-' | '*' | '/' | '%' | '!' )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0=='!'||(LA16_0 >= '%' && LA16_0 <= '&')||(LA16_0 >= '*' && LA16_0 <= '+')||LA16_0=='-'||LA16_0=='/'||(LA16_0 >= '<' && LA16_0 <= '>')||LA16_0=='|') ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					if ( input.LA(1)=='!'||(input.LA(1) >= '%' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1) >= '<' && input.LA(1) <= '>')||input.LA(1)=='|' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPERATOR"

	// $ANTLR start "BRACKET"
	public final void mBRACKET() throws RecognitionException {
		try {
			int _type = BRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:226:2: ( '(' | ')' | '[' | ']' | '{' | '}' )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
			{
			if ( (input.LA(1) >= '(' && input.LA(1) <= ')')||input.LA(1)=='['||input.LA(1)==']'||input.LA(1)=='{'||input.LA(1)=='}' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BRACKET"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:6: ( ( ( '\\r' )? '\\n' )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:8: ( ( '\\r' )? '\\n' )+
			{
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:8: ( ( '\\r' )? '\\n' )+
			int cnt18=0;
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0=='\n'||LA18_0=='\r') ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:9: ( '\\r' )? '\\n'
					{
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:9: ( '\\r' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0=='\r') ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:230:10: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

				default :
					if ( cnt18 >= 1 ) break loop18;
					EarlyExitException eee = new EarlyExitException(18, input);
					throw eee;
				}
				cnt18++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:235:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:235:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:235:22: ( '+' | '-' )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='+'||LA19_0=='-') ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:235:33: ( '0' .. '9' )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:238:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:242:5: ( '\\\\' ( 'b' | 'f' | 't' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt21=3;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 't':
					{
					alt21=1;
					}
					break;
				case 'u':
					{
					alt21=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt21=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 21, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:242:9: '\\\\' ( 'b' | 'f' | 't' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:243:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:244:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:249:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt22=3;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='\\') ) {
				int LA22_1 = input.LA(2);
				if ( ((LA22_1 >= '0' && LA22_1 <= '3')) ) {
					int LA22_2 = input.LA(3);
					if ( ((LA22_2 >= '0' && LA22_2 <= '7')) ) {
						int LA22_4 = input.LA(4);
						if ( ((LA22_4 >= '0' && LA22_4 <= '7')) ) {
							alt22=1;
						}

						else {
							alt22=2;
						}

					}

					else {
						alt22=3;
					}

				}
				else if ( ((LA22_1 >= '4' && LA22_1 <= '7')) ) {
					int LA22_3 = input.LA(3);
					if ( ((LA22_3 >= '0' && LA22_3 <= '7')) ) {
						alt22=2;
					}

					else {
						alt22=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 22, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:249:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:250:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:251:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:256:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:256:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | OPERATOR | BRACKET | EOL )
		int alt23=47;
		alt23 = dfa23.predict(input);
		switch (alt23) {
			case 1 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:10: T__35
				{
				mT__35(); 

				}
				break;
			case 2 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:16: T__36
				{
				mT__36(); 

				}
				break;
			case 3 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:22: T__37
				{
				mT__37(); 

				}
				break;
			case 4 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:28: T__38
				{
				mT__38(); 

				}
				break;
			case 5 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:34: T__39
				{
				mT__39(); 

				}
				break;
			case 6 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:40: T__40
				{
				mT__40(); 

				}
				break;
			case 7 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:46: T__41
				{
				mT__41(); 

				}
				break;
			case 8 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:52: T__42
				{
				mT__42(); 

				}
				break;
			case 9 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:58: T__43
				{
				mT__43(); 

				}
				break;
			case 10 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:64: T__44
				{
				mT__44(); 

				}
				break;
			case 11 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:70: T__45
				{
				mT__45(); 

				}
				break;
			case 12 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:76: T__46
				{
				mT__46(); 

				}
				break;
			case 13 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:82: T__47
				{
				mT__47(); 

				}
				break;
			case 14 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:88: T__48
				{
				mT__48(); 

				}
				break;
			case 15 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:94: T__49
				{
				mT__49(); 

				}
				break;
			case 16 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:100: T__50
				{
				mT__50(); 

				}
				break;
			case 17 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:106: T__51
				{
				mT__51(); 

				}
				break;
			case 18 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:112: T__52
				{
				mT__52(); 

				}
				break;
			case 19 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:118: T__53
				{
				mT__53(); 

				}
				break;
			case 20 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:124: T__54
				{
				mT__54(); 

				}
				break;
			case 21 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:130: T__55
				{
				mT__55(); 

				}
				break;
			case 22 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:136: T__56
				{
				mT__56(); 

				}
				break;
			case 23 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:142: T__57
				{
				mT__57(); 

				}
				break;
			case 24 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:148: T__58
				{
				mT__58(); 

				}
				break;
			case 25 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:154: T__59
				{
				mT__59(); 

				}
				break;
			case 26 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:160: T__60
				{
				mT__60(); 

				}
				break;
			case 27 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:166: T__61
				{
				mT__61(); 

				}
				break;
			case 28 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:172: T__62
				{
				mT__62(); 

				}
				break;
			case 29 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:178: T__63
				{
				mT__63(); 

				}
				break;
			case 30 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:184: T__64
				{
				mT__64(); 

				}
				break;
			case 31 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:190: T__65
				{
				mT__65(); 

				}
				break;
			case 32 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:196: T__66
				{
				mT__66(); 

				}
				break;
			case 33 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:202: T__67
				{
				mT__67(); 

				}
				break;
			case 34 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:208: T__68
				{
				mT__68(); 

				}
				break;
			case 35 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:214: T__69
				{
				mT__69(); 

				}
				break;
			case 36 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:220: T__70
				{
				mT__70(); 

				}
				break;
			case 37 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:226: T__71
				{
				mT__71(); 

				}
				break;
			case 38 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:232: ID
				{
				mID(); 

				}
				break;
			case 39 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:235: INT
				{
				mINT(); 

				}
				break;
			case 40 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:239: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 41 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:245: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 42 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:253: WS
				{
				mWS(); 

				}
				break;
			case 43 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:256: STRING
				{
				mSTRING(); 

				}
				break;
			case 44 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:263: CHAR
				{
				mCHAR(); 

				}
				break;
			case 45 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:268: OPERATOR
				{
				mOPERATOR(); 

				}
				break;
			case 46 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:277: BRACKET
				{
				mBRACKET(); 

				}
				break;
			case 47 :
				// D:\\Box Sync\\Codes\\tabbyxl\\src\\main\\resources\\CRL.g:1:285: EOL
				{
				mEOL(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA23 dfa23 = new DFA23(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "198:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA23_eotS =
		"\2\uffff\1\35\2\uffff\16\23\1\uffff\1\63\1\31\11\uffff\1\23\1\67\10\23"+
		"\1\101\1\102\5\23\1\110\2\23\1\uffff\2\31\1\23\1\uffff\2\23\1\122\6\23"+
		"\2\uffff\5\23\1\uffff\2\23\1\31\1\uffff\2\31\1\uffff\1\23\1\143\1\uffff"+
		"\5\23\1\uffff\2\23\1\uffff\1\23\1\164\1\165\1\166\1\114\1\23\1\170\1\uffff"+
		"\1\23\1\172\1\173\1\23\1\176\1\177\2\uffff\1\u0081\6\uffff\1\u0084\3\uffff"+
		"\1\23\1\uffff\1\23\2\uffff\1\23\1\u0088\2\uffff\1\u0089\4\uffff\1\23\1"+
		"\u008c\3\uffff\1\23\1\u008e\1\uffff\1\23\1\uffff\1\u0090\1\uffff";
	static final String DFA23_eofS =
		"\u0091\uffff";
	static final String DFA23_minS =
		"\1\11\1\uffff\1\52\2\uffff\1\144\1\141\1\156\1\162\1\155\1\141\2\145\1"+
		"\146\1\162\1\165\1\145\2\150\1\uffff\1\56\1\52\11\uffff\1\144\1\44\1\164"+
		"\1\154\1\144\1\157\1\160\1\142\1\162\1\167\2\44\1\151\1\154\1\164\1\154"+
		"\1\145\1\44\1\145\1\164\1\uffff\2\0\1\40\1\uffff\1\145\1\154\1\44\1\162"+
		"\1\165\1\157\1\145\1\147\1\40\2\uffff\1\156\1\145\1\40\1\151\1\156\1\uffff"+
		"\1\156\1\150\1\0\1\uffff\2\0\1\uffff\1\147\1\44\1\uffff\1\151\1\160\1"+
		"\162\1\154\2\145\1\164\1\40\1\143\1\164\3\44\1\41\1\157\1\44\1\uffff\1"+
		"\145\2\44\1\164\2\44\2\uffff\1\44\4\uffff\1\141\1\uffff\1\44\3\uffff\1"+
		"\162\1\uffff\1\163\2\uffff\1\40\1\44\2\uffff\1\44\4\uffff\1\151\1\44\3"+
		"\uffff\1\145\1\44\1\uffff\1\163\1\uffff\1\44\1\uffff";
	static final String DFA23_maxS =
		"\1\175\1\uffff\1\71\2\uffff\1\163\1\145\1\156\1\162\1\155\1\141\1\145"+
		"\1\157\1\146\1\162\1\165\1\160\1\157\1\151\1\uffff\1\145\1\57\11\uffff"+
		"\1\144\1\172\1\164\1\154\1\164\1\157\1\160\1\142\1\162\1\167\2\172\1\151"+
		"\1\154\1\164\1\154\1\145\1\172\1\145\1\164\1\uffff\2\uffff\1\40\1\uffff"+
		"\1\145\1\154\1\172\1\162\1\165\1\157\1\145\1\147\1\40\2\uffff\1\156\1"+
		"\145\1\40\1\151\1\156\1\uffff\1\156\1\150\1\uffff\1\uffff\2\uffff\1\uffff"+
		"\1\147\1\172\1\uffff\1\171\1\160\1\162\1\154\1\145\1\154\1\164\1\40\1"+
		"\166\1\164\3\172\1\174\1\157\1\172\1\uffff\1\145\2\172\1\164\2\172\2\uffff"+
		"\1\172\4\uffff\1\145\1\uffff\1\172\3\uffff\1\162\1\uffff\1\163\2\uffff"+
		"\1\40\1\172\2\uffff\1\172\4\uffff\1\171\1\172\3\uffff\1\145\1\172\1\uffff"+
		"\1\163\1\uffff\1\172\1\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\16\uffff\1\46\2\uffff\1\52\1\53\1\54\1\55"+
		"\1\56\1\57\1\3\1\2\1\50\24\uffff\1\47\3\uffff\1\7\11\uffff\1\26\1\27\5"+
		"\uffff\1\43\3\uffff\1\51\2\uffff\1\6\2\uffff\1\14\20\uffff\1\12\6\uffff"+
		"\1\24\1\25\1\uffff\1\32\1\33\1\34\1\35\1\uffff\1\40\1\uffff\1\42\1\44"+
		"\1\45\1\uffff\1\13\1\uffff\1\16\1\17\2\uffff\1\21\1\23\1\uffff\1\30\1"+
		"\36\1\37\1\41\2\uffff\1\20\1\22\1\31\2\uffff\1\15\1\uffff\1\11\1\uffff"+
		"\1\10";
	static final String DFA23_specialS =
		"\64\uffff\1\4\1\1\25\uffff\1\0\1\uffff\1\3\1\2\102\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\26\1\33\2\uffff\1\33\22\uffff\1\26\1\31\1\27\1\uffff\1\23\2\31\1\30"+
			"\2\32\2\31\1\1\1\31\1\2\1\25\12\24\1\3\1\4\3\31\2\uffff\32\23\1\32\1"+
			"\uffff\1\32\1\uffff\1\23\1\uffff\1\5\1\23\1\6\1\23\1\7\1\23\1\10\1\23"+
			"\1\11\2\23\1\12\1\13\1\14\1\15\1\16\1\23\1\17\1\20\1\21\2\23\1\22\3\23"+
			"\1\32\1\31\1\32",
			"",
			"\1\34\5\uffff\12\36",
			"",
			"",
			"\1\37\16\uffff\1\40",
			"\1\41\3\uffff\1\42",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50\11\uffff\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55\12\uffff\1\56",
			"\1\57\6\uffff\1\60",
			"\1\61\1\62",
			"",
			"\1\36\1\uffff\12\24\13\uffff\1\36\37\uffff\1\36",
			"\1\65\4\uffff\1\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\66",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\70",
			"\1\71",
			"\1\72\17\uffff\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\111",
			"\1\112",
			"",
			"\41\114\1\113\3\114\2\113\3\114\2\113\1\114\1\113\1\114\1\113\14\114"+
			"\3\113\75\114\1\113\uff83\114",
			"\41\114\1\116\3\114\2\116\3\114\1\115\1\116\1\114\1\116\1\114\1\116"+
			"\14\114\3\116\75\114\1\116\uff83\114",
			"\1\117",
			"",
			"\1\120",
			"\1\121",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"",
			"",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"",
			"\1\136",
			"\1\137",
			"\41\114\1\113\3\114\2\113\3\114\2\113\1\114\1\113\1\114\1\113\14\114"+
			"\3\113\75\114\1\113\uff83\114",
			"",
			"\41\114\1\116\3\114\2\116\3\114\1\115\1\116\1\114\1\116\1\114\1\140"+
			"\14\114\3\116\75\114\1\116\uff83\114",
			"\41\114\1\116\3\114\2\116\3\114\1\115\1\116\1\114\1\116\1\114\1\116"+
			"\14\114\3\116\75\114\1\116\uff83\114",
			"",
			"\1\141",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\142"+
			"\7\23",
			"",
			"\1\144\17\uffff\1\145",
			"\1\146",
			"\1\147",
			"\1\150",
			"\1\151",
			"\1\152\6\uffff\1\153",
			"\1\154",
			"\1\155",
			"\1\156\5\uffff\1\157\6\uffff\1\160\3\uffff\1\161\1\uffff\1\162",
			"\1\163",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\116\3\uffff\2\116\3\uffff\1\115\1\116\1\uffff\1\116\1\uffff\1\116"+
			"\14\uffff\3\116\75\uffff\1\116",
			"\1\167",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"\1\171",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"\1\174",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\22\23\1\175"+
			"\7\23",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\5\23\1\u0080"+
			"\24\23",
			"",
			"",
			"",
			"",
			"\1\u0082\3\uffff\1\u0083",
			"",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"",
			"\1\u0085",
			"",
			"\1\u0086",
			"",
			"",
			"\1\u0087",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"",
			"",
			"\1\u008a\17\uffff\1\u008b",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"",
			"",
			"\1\u008d",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			"",
			"\1\u008f",
			"",
			"\1\23\13\uffff\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR | OPERATOR | BRACKET | EOL );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_75 = input.LA(1);
						s = -1;
						if ( ((LA23_75 >= '\u0000' && LA23_75 <= ' ')||(LA23_75 >= '\"' && LA23_75 <= '$')||(LA23_75 >= '\'' && LA23_75 <= ')')||LA23_75==','||LA23_75=='.'||(LA23_75 >= '0' && LA23_75 <= ';')||(LA23_75 >= '?' && LA23_75 <= '{')||(LA23_75 >= '}' && LA23_75 <= '\uFFFF')) ) {s = 76;}
						else if ( (LA23_75=='!'||(LA23_75 >= '%' && LA23_75 <= '&')||(LA23_75 >= '*' && LA23_75 <= '+')||LA23_75=='-'||LA23_75=='/'||(LA23_75 >= '<' && LA23_75 <= '>')||LA23_75=='|') ) {s = 75;}
						else s = 25;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_53 = input.LA(1);
						s = -1;
						if ( (LA23_53=='*') ) {s = 77;}
						else if ( (LA23_53=='!'||(LA23_53 >= '%' && LA23_53 <= '&')||LA23_53=='+'||LA23_53=='-'||LA23_53=='/'||(LA23_53 >= '<' && LA23_53 <= '>')||LA23_53=='|') ) {s = 78;}
						else if ( ((LA23_53 >= '\u0000' && LA23_53 <= ' ')||(LA23_53 >= '\"' && LA23_53 <= '$')||(LA23_53 >= '\'' && LA23_53 <= ')')||LA23_53==','||LA23_53=='.'||(LA23_53 >= '0' && LA23_53 <= ';')||(LA23_53 >= '?' && LA23_53 <= '{')||(LA23_53 >= '}' && LA23_53 <= '\uFFFF')) ) {s = 76;}
						else s = 25;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA23_78 = input.LA(1);
						s = -1;
						if ( (LA23_78=='*') ) {s = 77;}
						else if ( (LA23_78=='!'||(LA23_78 >= '%' && LA23_78 <= '&')||LA23_78=='+'||LA23_78=='-'||LA23_78=='/'||(LA23_78 >= '<' && LA23_78 <= '>')||LA23_78=='|') ) {s = 78;}
						else if ( ((LA23_78 >= '\u0000' && LA23_78 <= ' ')||(LA23_78 >= '\"' && LA23_78 <= '$')||(LA23_78 >= '\'' && LA23_78 <= ')')||LA23_78==','||LA23_78=='.'||(LA23_78 >= '0' && LA23_78 <= ';')||(LA23_78 >= '?' && LA23_78 <= '{')||(LA23_78 >= '}' && LA23_78 <= '\uFFFF')) ) {s = 76;}
						else s = 25;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA23_77 = input.LA(1);
						s = -1;
						if ( (LA23_77=='/') ) {s = 96;}
						else if ( (LA23_77=='*') ) {s = 77;}
						else if ( (LA23_77=='!'||(LA23_77 >= '%' && LA23_77 <= '&')||LA23_77=='+'||LA23_77=='-'||(LA23_77 >= '<' && LA23_77 <= '>')||LA23_77=='|') ) {s = 78;}
						else if ( ((LA23_77 >= '\u0000' && LA23_77 <= ' ')||(LA23_77 >= '\"' && LA23_77 <= '$')||(LA23_77 >= '\'' && LA23_77 <= ')')||LA23_77==','||LA23_77=='.'||(LA23_77 >= '0' && LA23_77 <= ';')||(LA23_77 >= '?' && LA23_77 <= '{')||(LA23_77 >= '}' && LA23_77 <= '\uFFFF')) ) {s = 76;}
						else s = 25;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA23_52 = input.LA(1);
						s = -1;
						if ( (LA23_52=='!'||(LA23_52 >= '%' && LA23_52 <= '&')||(LA23_52 >= '*' && LA23_52 <= '+')||LA23_52=='-'||LA23_52=='/'||(LA23_52 >= '<' && LA23_52 <= '>')||LA23_52=='|') ) {s = 75;}
						else if ( ((LA23_52 >= '\u0000' && LA23_52 <= ' ')||(LA23_52 >= '\"' && LA23_52 <= '$')||(LA23_52 >= '\'' && LA23_52 <= ')')||LA23_52==','||LA23_52=='.'||(LA23_52 >= '0' && LA23_52 <= ';')||(LA23_52 >= '?' && LA23_52 <= '{')||(LA23_52 >= '}' && LA23_52 <= '\uFFFF')) ) {s = 76;}
						else s = 25;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
