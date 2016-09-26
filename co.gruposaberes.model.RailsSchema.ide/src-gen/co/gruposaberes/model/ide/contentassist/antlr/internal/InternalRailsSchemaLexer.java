package co.gruposaberes.model.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRailsSchemaLexer extends Lexer {
    public static final int RULE_DO_WORD=11;
    public static final int RULE_PARENTHESIS_BLOCK=10;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=18;
    public static final int RULE_BRACKET_BLOCK_ALONE=16;
    public static final int RULE_SPACE=15;
    public static final int EOF=-1;
    public static final int RULE_ARRAY_BLOCK=6;
    public static final int RULE_ID=8;
    public static final int RULE_COMMA=14;
    public static final int RULE_ANY_OTHER=20;
    public static final int RULE_BS=19;
    public static final int RULE_DECIMAL=9;
    public static final int RULE_INT=7;
    public static final int RULE_BLOCK_PARAMS=13;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=17;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=4;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=12;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRailsSchemaLexer() {;} 
    public InternalRailsSchemaLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRailsSchemaLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalRailsSchema.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:11:7: ( 'ActiveRecord::Schema.define' )
            // InternalRailsSchema.g:11:9: 'ActiveRecord::Schema.define'
            {
            match("ActiveRecord::Schema.define"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:12:7: ( 'create_table' )
            // InternalRailsSchema.g:12:9: 'create_table'
            {
            match("create_table"); 


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
            // InternalRailsSchema.g:13:7: ( 't.' )
            // InternalRailsSchema.g:13:9: 't.'
            {
            match("t."); 


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
            // InternalRailsSchema.g:14:7: ( ':' )
            // InternalRailsSchema.g:14:9: ':'
            {
            match(':'); 

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
            // InternalRailsSchema.g:15:7: ( '=>' )
            // InternalRailsSchema.g:15:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1379:12: ( ',' )
            // InternalRailsSchema.g:1379:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_SPACE"
    public final void mRULE_SPACE() throws RecognitionException {
        try {
            int _type = RULE_SPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1381:12: ( ( ' ' | '\\f' ) )
            // InternalRailsSchema.g:1381:14: ( ' ' | '\\f' )
            {
            if ( input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SPACE"

    // $ANTLR start "RULE_BRACKET_BLOCK_ALONE"
    public final void mRULE_BRACKET_BLOCK_ALONE() throws RecognitionException {
        try {
            int _type = RULE_BRACKET_BLOCK_ALONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1383:26: ( '{' (~ ( ( '{' | '}' ) ) )* '}' )
            // InternalRailsSchema.g:1383:28: '{' (~ ( ( '{' | '}' ) ) )* '}'
            {
            match('{'); 
            // InternalRailsSchema.g:1383:32: (~ ( ( '{' | '}' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRailsSchema.g:1383:32: ~ ( ( '{' | '}' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    // $ANTLR end "RULE_BRACKET_BLOCK_ALONE"

    // $ANTLR start "RULE_ARRAY_BLOCK"
    public final void mRULE_ARRAY_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_ARRAY_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1385:18: ( '[' (~ ( ']' ) )* ']' )
            // InternalRailsSchema.g:1385:20: '[' (~ ( ']' ) )* ']'
            {
            match('['); 
            // InternalRailsSchema.g:1385:24: (~ ( ']' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\\')||(LA2_0>='^' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRailsSchema.g:1385:24: ~ ( ']' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\\')||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

    // $ANTLR start "RULE_PARENTHESIS_BLOCK"
    public final void mRULE_PARENTHESIS_BLOCK() throws RecognitionException {
        try {
            int _type = RULE_PARENTHESIS_BLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1387:24: ( '(' (~ ( ')' ) )* ')' )
            // InternalRailsSchema.g:1387:26: '(' (~ ( ')' ) )* ')'
            {
            match('('); 
            // InternalRailsSchema.g:1387:30: (~ ( ')' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='(')||(LA3_0>='*' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRailsSchema.g:1387:30: ~ ( ')' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='(')||(input.LA(1)>='*' && input.LA(1)<='\uFFFF') ) {
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

            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PARENTHESIS_BLOCK"

    // $ANTLR start "RULE_DO_WORD"
    public final void mRULE_DO_WORD() throws RecognitionException {
        try {
            int _type = RULE_DO_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1389:14: ( 'do' )
            // InternalRailsSchema.g:1389:16: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DO_WORD"

    // $ANTLR start "RULE_END_WORD"
    public final void mRULE_END_WORD() throws RecognitionException {
        try {
            int _type = RULE_END_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1391:15: ( 'end' )
            // InternalRailsSchema.g:1391:17: 'end'
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

    // $ANTLR start "RULE_BLOCK_PARAMS"
    public final void mRULE_BLOCK_PARAMS() throws RecognitionException {
        try {
            int _type = RULE_BLOCK_PARAMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1393:19: ( '|' RULE_ID '|' )
            // InternalRailsSchema.g:1393:21: '|' RULE_ID '|'
            {
            match('|'); 
            mRULE_ID(); 
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLOCK_PARAMS"

    // $ANTLR start "RULE_SYMBOL"
    public final void mRULE_SYMBOL() throws RecognitionException {
        try {
            int _type = RULE_SYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1395:13: ( ':' RULE_ID )
            // InternalRailsSchema.g:1395:15: ':' RULE_ID
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
            // InternalRailsSchema.g:1397:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalRailsSchema.g:1397:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalRailsSchema.g:1397:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRailsSchema.g:
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
            	    break loop4;
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
            // InternalRailsSchema.g:1399:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalRailsSchema.g:1399:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalRailsSchema.g:1399:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRailsSchema.g:1399:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalRailsSchema.g:1399:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalRailsSchema.g:1399:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailsSchema.g:1399:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalRailsSchema.g:1399:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalRailsSchema.g:1399:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRailsSchema.g:1399:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalRailsSchema.g:1399:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
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
            // InternalRailsSchema.g:1401:17: ( '=begin' ( options {greedy=false; } : . )* '=end' )
            // InternalRailsSchema.g:1401:19: '=begin' ( options {greedy=false; } : . )* '=end'
            {
            match("=begin"); 

            // InternalRailsSchema.g:1401:28: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='=') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='e') ) {
                        int LA8_3 = input.LA(3);

                        if ( (LA8_3=='n') ) {
                            int LA8_4 = input.LA(4);

                            if ( (LA8_4=='d') ) {
                                alt8=2;
                            }
                            else if ( ((LA8_4>='\u0000' && LA8_4<='c')||(LA8_4>='e' && LA8_4<='\uFFFF')) ) {
                                alt8=1;
                            }


                        }
                        else if ( ((LA8_3>='\u0000' && LA8_3<='m')||(LA8_3>='o' && LA8_3<='\uFFFF')) ) {
                            alt8=1;
                        }


                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='d')||(LA8_1>='f' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='<')||(LA8_0>='>' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRailsSchema.g:1401:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
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
            // InternalRailsSchema.g:1403:17: ( '#' ( options {greedy=false; } : . )* '\\n' )
            // InternalRailsSchema.g:1403:19: '#' ( options {greedy=false; } : . )* '\\n'
            {
            match('#'); 
            // InternalRailsSchema.g:1403:23: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\n') ) {
                    alt9=2;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRailsSchema.g:1403:51: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
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

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1405:10: ( ( '0' .. '9' )+ )
            // InternalRailsSchema.g:1405:12: ( '0' .. '9' )+
            {
            // InternalRailsSchema.g:1405:12: ( '0' .. '9' )+
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
            	    // InternalRailsSchema.g:1405:13: '0' .. '9'
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

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1407:14: ( RULE_INT '.' RULE_INT )
            // InternalRailsSchema.g:1407:16: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_BS"
    public final void mRULE_BS() throws RecognitionException {
        try {
            int _type = RULE_BS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1409:9: ( ( '\\t' | '\\n' ) )
            // InternalRailsSchema.g:1409:11: ( '\\t' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalRailsSchema.g:1411:16: ( . )
            // InternalRailsSchema.g:1411:18: .
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
        // InternalRailsSchema.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_COMMA | RULE_SPACE | RULE_BRACKET_BLOCK_ALONE | RULE_ARRAY_BLOCK | RULE_PARENTHESIS_BLOCK | RULE_DO_WORD | RULE_END_WORD | RULE_BLOCK_PARAMS | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DECIMAL | RULE_BS | RULE_ANY_OTHER )
        int alt11=22;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // InternalRailsSchema.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalRailsSchema.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalRailsSchema.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalRailsSchema.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalRailsSchema.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalRailsSchema.g:1:40: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 7 :
                // InternalRailsSchema.g:1:51: RULE_SPACE
                {
                mRULE_SPACE(); 

                }
                break;
            case 8 :
                // InternalRailsSchema.g:1:62: RULE_BRACKET_BLOCK_ALONE
                {
                mRULE_BRACKET_BLOCK_ALONE(); 

                }
                break;
            case 9 :
                // InternalRailsSchema.g:1:87: RULE_ARRAY_BLOCK
                {
                mRULE_ARRAY_BLOCK(); 

                }
                break;
            case 10 :
                // InternalRailsSchema.g:1:104: RULE_PARENTHESIS_BLOCK
                {
                mRULE_PARENTHESIS_BLOCK(); 

                }
                break;
            case 11 :
                // InternalRailsSchema.g:1:127: RULE_DO_WORD
                {
                mRULE_DO_WORD(); 

                }
                break;
            case 12 :
                // InternalRailsSchema.g:1:140: RULE_END_WORD
                {
                mRULE_END_WORD(); 

                }
                break;
            case 13 :
                // InternalRailsSchema.g:1:154: RULE_BLOCK_PARAMS
                {
                mRULE_BLOCK_PARAMS(); 

                }
                break;
            case 14 :
                // InternalRailsSchema.g:1:172: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 15 :
                // InternalRailsSchema.g:1:184: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 16 :
                // InternalRailsSchema.g:1:192: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalRailsSchema.g:1:204: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalRailsSchema.g:1:220: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalRailsSchema.g:1:236: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 20 :
                // InternalRailsSchema.g:1:245: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 21 :
                // InternalRailsSchema.g:1:258: RULE_BS
                {
                mRULE_BS(); 

                }
                break;
            case 22 :
                // InternalRailsSchema.g:1:266: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\3\26\1\31\1\24\2\uffff\3\24\2\26\1\24\1\uffff\3\24\1\47\2\uffff\1\26\1\uffff\1\26\12\uffff\1\55\1\26\4\uffff\1\47\2\uffff\2\26\1\uffff\1\61\2\26\1\uffff\17\26\1\103\2\uffff";
    static final String DFA11_eofS =
        "\104\uffff";
    static final String DFA11_minS =
        "\1\0\1\143\1\162\1\56\1\101\1\76\2\uffff\3\0\1\157\1\156\1\101\1\uffff\3\0\1\56\2\uffff\1\164\1\uffff\1\145\12\uffff\1\60\1\144\4\uffff\1\56\2\uffff\1\151\1\141\1\uffff\1\60\1\166\1\164\1\uffff\2\145\1\122\1\137\1\145\1\164\1\143\1\141\1\157\1\142\1\162\1\154\1\144\1\145\1\72\1\60\2\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\143\1\162\1\56\1\172\1\142\2\uffff\3\uffff\1\157\1\156\1\172\1\uffff\3\uffff\1\71\2\uffff\1\164\1\uffff\1\145\12\uffff\1\172\1\144\4\uffff\1\71\2\uffff\1\151\1\141\1\uffff\1\172\1\166\1\164\1\uffff\2\145\1\122\1\137\1\145\1\164\1\143\1\141\1\157\1\142\1\162\1\154\1\144\1\145\1\72\1\172\2\uffff";
    static final String DFA11_acceptS =
        "\6\uffff\1\6\1\7\6\uffff\1\17\4\uffff\1\25\1\26\1\uffff\1\17\1\uffff\1\3\1\4\1\16\1\5\1\21\1\6\1\7\1\10\1\11\1\12\2\uffff\1\15\1\20\1\22\1\23\1\uffff\1\24\1\25\2\uffff\1\13\3\uffff\1\14\20\uffff\1\1\1\2";
    static final String DFA11_specialS =
        "\1\0\7\uffff\1\1\1\6\1\4\4\uffff\1\2\1\3\1\5\62\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\24\2\23\1\24\1\7\23\24\1\7\1\24\1\17\1\21\3\24\1\20\1\12\3\24\1\6\3\24\12\22\1\4\2\24\1\5\3\24\1\1\31\16\1\11\3\24\1\16\1\24\2\16\1\2\1\13\1\14\16\16\1\3\6\16\1\10\1\15\uff83\24",
            "\1\25",
            "\1\27",
            "\1\30",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\33\43\uffff\1\34",
            "",
            "",
            "\173\37\1\uffff\uff84\37",
            "\0\40",
            "\0\41",
            "\1\42",
            "\1\43",
            "\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\0\45",
            "\0\45",
            "\0\46",
            "\1\51\1\uffff\12\50",
            "",
            "",
            "\1\53",
            "",
            "\1\54",
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
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\56",
            "",
            "",
            "",
            "",
            "\1\51\1\uffff\12\50",
            "",
            "",
            "\1\57",
            "\1\60",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
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
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | RULE_COMMA | RULE_SPACE | RULE_BRACKET_BLOCK_ALONE | RULE_ARRAY_BLOCK | RULE_PARENTHESIS_BLOCK | RULE_DO_WORD | RULE_END_WORD | RULE_BLOCK_PARAMS | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_INT | RULE_DECIMAL | RULE_BS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0=='A') ) {s = 1;}

                        else if ( (LA11_0=='c') ) {s = 2;}

                        else if ( (LA11_0=='t') ) {s = 3;}

                        else if ( (LA11_0==':') ) {s = 4;}

                        else if ( (LA11_0=='=') ) {s = 5;}

                        else if ( (LA11_0==',') ) {s = 6;}

                        else if ( (LA11_0=='\f'||LA11_0==' ') ) {s = 7;}

                        else if ( (LA11_0=='{') ) {s = 8;}

                        else if ( (LA11_0=='[') ) {s = 9;}

                        else if ( (LA11_0=='(') ) {s = 10;}

                        else if ( (LA11_0=='d') ) {s = 11;}

                        else if ( (LA11_0=='e') ) {s = 12;}

                        else if ( (LA11_0=='|') ) {s = 13;}

                        else if ( ((LA11_0>='B' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='b')||(LA11_0>='f' && LA11_0<='s')||(LA11_0>='u' && LA11_0<='z')) ) {s = 14;}

                        else if ( (LA11_0=='\"') ) {s = 15;}

                        else if ( (LA11_0=='\'') ) {s = 16;}

                        else if ( (LA11_0=='#') ) {s = 17;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 18;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')) ) {s = 19;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||LA11_0=='\u000B'||(LA11_0>='\r' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>=')' && LA11_0<='+')||(LA11_0>='-' && LA11_0<='/')||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='>' && LA11_0<='@')||(LA11_0>='\\' && LA11_0<='^')||LA11_0=='`'||(LA11_0>='}' && LA11_0<='\uFFFF')) ) {s = 20;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_8 = input.LA(1);

                        s = -1;
                        if ( ((LA11_8>='\u0000' && LA11_8<='z')||(LA11_8>='|' && LA11_8<='\uFFFF')) ) {s = 31;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( ((LA11_15>='\u0000' && LA11_15<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_16 = input.LA(1);

                        s = -1;
                        if ( ((LA11_16>='\u0000' && LA11_16<='\uFFFF')) ) {s = 37;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_10 = input.LA(1);

                        s = -1;
                        if ( ((LA11_10>='\u0000' && LA11_10<='\uFFFF')) ) {s = 33;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_17 = input.LA(1);

                        s = -1;
                        if ( ((LA11_17>='\u0000' && LA11_17<='\uFFFF')) ) {s = 38;}

                        else s = 20;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_9 = input.LA(1);

                        s = -1;
                        if ( ((LA11_9>='\u0000' && LA11_9<='\uFFFF')) ) {s = 32;}

                        else s = 20;

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