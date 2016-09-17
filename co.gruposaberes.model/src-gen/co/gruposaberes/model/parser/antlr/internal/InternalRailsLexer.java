package co.gruposaberes.model.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailsLexer extends Lexer {
    public static final int RULE_HAS_MANY_WORD=8;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=11;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=12;
    public static final int RULE_SPACE=5;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=15;
    public static final int RULE_ID=7;
    public static final int RULE_WS=19;
    public static final int RULE_ANY_OTHER=21;
    public static final int RULE_MODULE_WORD=17;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=20;
    public static final int T__29=29;
    public static final int RULE_BRACKET_BLOCK=14;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=18;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=9;
    public static final int RULE_DEF_WORD=16;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=6;
    public static final int RULE_BELONGS_TO_WORD=13;

    // delegates
    // delegators

    public InternalRailsLexer() {;} 
    public InternalRailsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRailsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRails.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:11:7: ( '<' )
            // InternalRails.g:11:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:12:7: ( '::' )
            // InternalRails.g:12:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:13:7: ( '.' )
            // InternalRails.g:13:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:14:7: ( ',' )
            // InternalRails.g:14:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:15:7: ( ':' )
            // InternalRails.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:16:7: ( '=>' )
            // InternalRails.g:16:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:17:7: ( '?' )
            // InternalRails.g:17:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:18:7: ( '=' )
            // InternalRails.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:879:12: ( ' ' )
            // InternalRails.g:879:14: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_BRACKET_BLOCK"
    public final void mRULE_BRACKET_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:881:20: ( '{' ( options {greedy=false; } : . )* '}' )
            // InternalRails.g:881:22: '{' ( options {greedy=false; } : . )* '}'
            {
            match('{'); 
            // InternalRails.g:881:26: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='}') ) {
                    alt1=2;
                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='|')||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRails.g:881:54: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BRACKET_BLOCK"

    // $ANTLR start "RULE_ARRAY_BLOCK"
    public final void mRULE_ARRAY_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:883:18: ( '[' ( options {greedy=false; } : . )* ']' )
            // InternalRails.g:883:20: '[' ( options {greedy=false; } : . )* ']'
            {
            match('['); 
            // InternalRails.g:883:24: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==']') ) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\\')||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRails.g:883:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARRAY_BLOCK"

    // $ANTLR start "RULE_BELONGS_TO_WORD"
    public final void mRULE_BELONGS_TO_WORD() throws RecognitionException {
        try {
            int _type = RULE_BELONGS_TO_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:885:22: ( 'belongs_to' )
            // InternalRails.g:885:24: 'belongs_to'
            {
            match("belongs_to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BELONGS_TO_WORD"

    // $ANTLR start "RULE_HAS_MANY_WORD"
    public final void mRULE_HAS_MANY_WORD() throws RecognitionException {
        try {
            int _type = RULE_HAS_MANY_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:887:20: ( 'has_many' )
            // InternalRails.g:887:22: 'has_many'
            {
            match("has_many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HAS_MANY_WORD"

    // $ANTLR start "RULE_HAS_AND_BELONGS_TO_MANY_WORD"
    public final void mRULE_HAS_AND_BELONGS_TO_MANY_WORD() throws RecognitionException {
        try {
            int _type = RULE_HAS_AND_BELONGS_TO_MANY_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:889:35: ( 'has_and_belongs_to_many' )
            // InternalRails.g:889:37: 'has_and_belongs_to_many'
            {
            match("has_and_belongs_to_many"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HAS_AND_BELONGS_TO_MANY_WORD"

    // $ANTLR start "RULE_CLASS_WORD"
    public final void mRULE_CLASS_WORD() throws RecognitionException {
        try {
            int _type = RULE_CLASS_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:891:17: ( 'class' )
            // InternalRails.g:891:19: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLASS_WORD"

    // $ANTLR start "RULE_MODULE_WORD"
    public final void mRULE_MODULE_WORD() throws RecognitionException {
        try {
            int _type = RULE_MODULE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:893:18: ( 'module' )
            // InternalRails.g:893:20: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULE_WORD"

    // $ANTLR start "RULE_DEF_WORD"
    public final void mRULE_DEF_WORD() throws RecognitionException {
        try {
            int _type = RULE_DEF_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:895:15: ( 'def' )
            // InternalRails.g:895:17: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEF_WORD"

    // $ANTLR start "RULE_END_WORD"
    public final void mRULE_END_WORD() throws RecognitionException {
        try {
            int _type = RULE_END_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:897:15: ( 'end' )
            // InternalRails.g:897:17: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_END_WORD"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:899:13: ( ':' RULE_ID )
            // InternalRails.g:899:15: ':' RULE_ID
            {
            match(':'); 
            mRULE_ID(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:901:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRails.g:901:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRails.g:901:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRails.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:903:13: ( ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
            // InternalRails.g:903:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            {
            // InternalRails.g:903:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRails.g:903:16: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 
                    // InternalRails.g:903:20: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\"') ) {
                            alt4=2;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRails.g:903:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRails.g:903:56: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // InternalRails.g:903:61: ( options {greedy=false; } : . )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\'') ) {
                            alt5=2;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRails.g:903:89: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:905:17: ( '=begin' ( options {greedy=false; } : . )* '=end' )
            // InternalRails.g:905:19: '=begin' ( options {greedy=false; } : . )* '=end'
            {
            match("=begin"); 

            // InternalRails.g:905:28: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='=') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='e') ) {
                        int LA7_3 = input.LA(3);

                        if ( (LA7_3=='n') ) {
                            int LA7_4 = input.LA(4);

                            if ( (LA7_4=='d') ) {
                                alt7=2;
                            }
                            else if ( ((LA7_4>='\u0000' && LA7_4<='c')||(LA7_4>='e' && LA7_4<='\uFFFF')) ) {
                                alt7=1;
                            }


                        }
                        else if ( ((LA7_3>='\u0000' && LA7_3<='m')||(LA7_3>='o' && LA7_3<='\uFFFF')) ) {
                            alt7=1;
                        }


                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='d')||(LA7_1>='f' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='<')||(LA7_0>='>' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRails.g:905:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("=end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:907:17: ( '#' ( options {greedy=false; } : . )* '\\n' )
            // InternalRails.g:907:19: '#' ( options {greedy=false; } : . )* '\\n'
            {
            match('#'); 
            // InternalRails.g:907:23: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\n') ) {
                    alt8=2;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRails.g:907:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:909:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalRails.g:909:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalRails.g:909:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\t' && LA9_0<='\n')||LA9_0=='\r'||LA9_0==' ') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRails.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:911:10: ( ( '0' .. '9' )+ )
            // InternalRails.g:911:12: ( '0' .. '9' )+
            {
            // InternalRails.g:911:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRails.g:911:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRails.g:913:16: ( . )
            // InternalRails.g:913:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalRails.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_SPACE | RULE_BRACKET_BLOCK | RULE_ARRAY_BLOCK | RULE_BELONGS_TO_WORD | RULE_HAS_MANY_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_CLASS_WORD | RULE_MODULE_WORD | RULE_DEF_WORD | RULE_END_WORD | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER )
        int alt11=26;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalRails.g:1:10: T__22
                {
                mT__22(); 

                }
                break;
            case 2 :
                // InternalRails.g:1:16: T__23
                {
                mT__23(); 

                }
                break;
            case 3 :
                // InternalRails.g:1:22: T__24
                {
                mT__24(); 

                }
                break;
            case 4 :
                // InternalRails.g:1:28: T__25
                {
                mT__25(); 

                }
                break;
            case 5 :
                // InternalRails.g:1:34: T__26
                {
                mT__26(); 

                }
                break;
            case 6 :
                // InternalRails.g:1:40: T__27
                {
                mT__27(); 

                }
                break;
            case 7 :
                // InternalRails.g:1:46: T__28
                {
                mT__28(); 

                }
                break;
            case 8 :
                // InternalRails.g:1:52: T__29
                {
                mT__29(); 

                }
                break;
            case 9 :
                // InternalRails.g:1:58: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 10 :
                // InternalRails.g:1:69: RULE_BRACKET_BLOCK
                {
                mRULE_BRACKET_BLOCK(); 

                }
                break;
            case 11 :
                // InternalRails.g:1:88: RULE_ARRAY_BLOCK
                {
                mRULE_ARRAY_BLOCK(); 

                }
                break;
            case 12 :
                // InternalRails.g:1:105: RULE_BELONGS_TO_WORD
                {
                mRULE_BELONGS_TO_WORD(); 

                }
                break;
            case 13 :
                // InternalRails.g:1:126: RULE_HAS_MANY_WORD
                {
                mRULE_HAS_MANY_WORD(); 

                }
                break;
            case 14 :
                // InternalRails.g:1:145: RULE_HAS_AND_BELONGS_TO_MANY_WORD
                {
                mRULE_HAS_AND_BELONGS_TO_MANY_WORD(); 

                }
                break;
            case 15 :
                // InternalRails.g:1:179: RULE_CLASS_WORD
                {
                mRULE_CLASS_WORD(); 

                }
                break;
            case 16 :
                // InternalRails.g:1:195: RULE_MODULE_WORD
                {
                mRULE_MODULE_WORD(); 

                }
                break;
            case 17 :
                // InternalRails.g:1:212: RULE_DEF_WORD
                {
                mRULE_DEF_WORD(); 

                }
                break;
            case 18 :
                // InternalRails.g:1:226: RULE_END_WORD
                {
                mRULE_END_WORD(); 

                }
                break;
            case 19 :
                // InternalRails.g:1:240: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 20 :
                // InternalRails.g:1:252: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 21 :
                // InternalRails.g:1:260: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 22 :
                // InternalRails.g:1:272: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 23 :
                // InternalRails.g:1:288: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 24 :
                // InternalRails.g:1:304: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 25 :
                // InternalRails.g:1:312: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalRails.g:1:321: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\2\uffff\1\31\2\uffff\1\37\1\uffff\1\41\2\26\6\46\1\uffff\3\26\21\uffff\1\46\1\uffff\5\46\3\uffff\4\46\1\71\1\72\4\46\2\uffff\3\46\1\103\4\46\1\uffff\1\110\3\46\1\uffff\1\46\1\115\2\46\1\uffff\1\46\1\121\1\46\1\uffff\14\46\1\137\1\uffff";
    static final String DFA11_eofS =
        "\140\uffff";
    static final String DFA11_minS =
        "\1\0\1\uffff\1\72\2\uffff\1\76\1\uffff\1\11\2\0\1\145\1\141\1\154\1\157\1\145\1\156\1\uffff\3\0\21\uffff\1\154\1\uffff\1\163\1\141\1\144\1\146\1\144\3\uffff\1\157\1\137\1\163\1\165\2\60\1\156\1\141\1\163\1\154\2\uffff\1\147\1\141\1\156\1\60\1\145\1\163\1\156\1\144\1\uffff\1\60\1\137\1\171\1\137\1\uffff\1\164\1\60\1\142\1\157\1\uffff\1\145\1\60\1\154\1\uffff\1\157\1\156\1\147\1\163\1\137\1\164\1\157\1\137\1\155\1\141\1\156\1\171\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\uffff\1\172\2\uffff\1\142\1\uffff\1\40\2\uffff\1\145\1\141\1\154\1\157\1\145\1\156\1\uffff\3\uffff\21\uffff\1\154\1\uffff\1\163\1\141\1\144\1\146\1\144\3\uffff\1\157\1\137\1\163\1\165\2\172\1\156\1\155\1\163\1\154\2\uffff\1\147\1\141\1\156\1\172\1\145\1\163\1\156\1\144\1\uffff\1\172\1\137\1\171\1\137\1\uffff\1\164\1\172\1\142\1\157\1\uffff\1\145\1\172\1\154\1\uffff\1\157\1\156\1\147\1\163\1\137\1\164\1\157\1\137\1\155\1\141\1\156\1\171\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\uffff\1\7\11\uffff\1\24\3\uffff\1\30\1\31\1\32\1\1\1\2\1\5\1\23\1\3\1\4\1\6\1\26\1\10\1\7\1\11\1\30\1\12\1\13\1\uffff\1\24\5\uffff\1\25\1\27\1\31\12\uffff\1\21\1\22\10\uffff\1\17\4\uffff\1\20\4\uffff\1\15\3\uffff\1\14\15\uffff\1\16";
    static final String DFA11_specialS =
        "\1\0\7\uffff\1\3\1\5\7\uffff\1\1\1\4\1\2\114\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\26\2\24\2\26\1\24\22\26\1\7\1\26\1\21\1\23\3\26\1\22\4\26\1\4\1\26\1\3\1\26\12\25\1\2\1\26\1\1\1\5\1\26\1\6\1\26\32\20\1\11\3\26\1\20\1\26\1\20\1\12\1\14\1\16\1\17\2\20\1\13\4\20\1\15\15\20\1\10\uff84\26",
            "",
            "\1\30\6\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\35\43\uffff\1\36",
            "",
            "\2\42\2\uffff\1\42\22\uffff\1\42",
            "\0\43",
            "\0\44",
            "\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "\0\54",
            "\0\54",
            "\0\55",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57",
            "",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\73",
            "\1\75\13\uffff\1\74",
            "\1\76",
            "\1\77",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\111",
            "\1\112",
            "\1\113",
            "",
            "\1\114",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | RULE_SPACE | RULE_BRACKET_BLOCK | RULE_ARRAY_BLOCK | RULE_BELONGS_TO_WORD | RULE_HAS_MANY_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_CLASS_WORD | RULE_MODULE_WORD | RULE_DEF_WORD | RULE_END_WORD | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='<') ) {s = 1;}

                        else if ( (LA11_0==':') ) {s = 2;}

                        else if ( (LA11_0=='.') ) {s = 3;}

                        else if ( (LA11_0==',') ) {s = 4;}

                        else if ( (LA11_0=='=') ) {s = 5;}

                        else if ( (LA11_0=='?') ) {s = 6;}

                        else if ( (LA11_0==' ') ) {s = 7;}

                        else if ( (LA11_0=='{') ) {s = 8;}

                        else if ( (LA11_0=='[') ) {s = 9;}

                        else if ( (LA11_0=='b') ) {s = 10;}

                        else if ( (LA11_0=='h') ) {s = 11;}

                        else if ( (LA11_0=='c') ) {s = 12;}

                        else if ( (LA11_0=='m') ) {s = 13;}

                        else if ( (LA11_0=='d') ) {s = 14;}

                        else if ( (LA11_0=='e') ) {s = 15;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='a'||(LA11_0>='f' && LA11_0<='g')||(LA11_0>='i' && LA11_0<='l')||(LA11_0>='n' && LA11_0<='z')) ) {s = 16;}

                        else if ( (LA11_0=='\"') ) {s = 17;}

                        else if ( (LA11_0=='\'') ) {s = 18;}

                        else if ( (LA11_0=='#') ) {s = 19;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r') ) {s = 20;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 21;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='+')||LA11_0=='-'||LA11_0=='/'||LA11_0==';'||LA11_0=='>'||LA11_0=='@'||(LA11_0>='\\' && LA11_0<='^')||LA11_0=='`'||(LA11_0>='|' && LA11_0<='\uFFFF')) ) {s = 22;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( ((LA11_17>='\u0000' && LA11_17<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_19 = input.LA(1);

                        s = -1;
                        if ( ((LA11_19>='\u0000' && LA11_19<='\uFFFF')) ) {s = 45;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( ((LA11_8>='\u0000' && LA11_8<='\uFFFF')) ) {s = 35;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_18 = input.LA(1);

                        s = -1;
                        if ( ((LA11_18>='\u0000' && LA11_18<='\uFFFF')) ) {s = 44;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_9 = input.LA(1);

                        s = -1;
                        if ( ((LA11_9>='\u0000' && LA11_9<='\uFFFF')) ) {s = 36;}

                        else s = 22;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}