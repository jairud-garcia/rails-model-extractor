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
    public static final int RULE_HAS_MANY_WORD=7;
    public static final int RULE_CLASS_WORD=4;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_HAS_AND_BELONGS_TO_MANY_WORD=9;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=18;
    public static final int RULE_MODULE_WORD=13;
    public static final int T__26=26;
    public static final int RULE_INT=17;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int RULE_SYMBOL=10;
    public static final int RULE_DEF_WORD=12;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_END_WORD=5;
    public static final int RULE_BELONGS_TO_WORD=11;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalRailsLexer() {;} 
    public InternalRailsLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRailsLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g"; }

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:11:7: ( ' ' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:11:9: ' '
            {
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:12:7: ( '<' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:12:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:13:7: ( '::' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:13:9: '::'
            {
            match("::"); 


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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:14:7: ( ',' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:14:9: ','
            {
            match(','); 

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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:15:7: ( ':' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:15:9: ':'
            {
            match(':'); 

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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:16:7: ( '=>' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:16:9: '=>'
            {
            match("=>"); 


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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:17:7: ( '?' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:17:9: '?'
            {
            match('?'); 

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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:18:7: ( '=' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "RULE_BELONGS_TO_WORD"
    public final void mRULE_BELONGS_TO_WORD() throws RecognitionException {
        try {
            int _type = RULE_BELONGS_TO_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:697:22: ( 'belongs_to' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:697:24: 'belongs_to'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:699:20: ( 'has_many' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:699:22: 'has_many'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:701:35: ( 'has_and_belongs_to_many' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:701:37: 'has_and_belongs_to_many'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:703:17: ( 'class' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:703:19: 'class'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:705:18: ( 'module' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:705:20: 'module'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:707:15: ( 'def' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:707:17: 'def'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:709:15: ( 'end' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:709:17: 'end'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:711:13: ( ':' RULE_ID )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:711:15: ':' RULE_ID
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:713:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:713:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:713:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:
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
            	    break loop1;
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:13: ( ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:15: ( '\"' ( options {greedy=false; } : . )* '\"' | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\"') ) {
                alt4=1;
            }
            else if ( (LA4_0=='\'') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:16: '\"' ( options {greedy=false; } : . )* '\"'
                    {
                    match('\"'); 
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:20: ( options {greedy=false; } : . )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0=='\"') ) {
                            alt2=2;
                        }
                        else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:48: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:56: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:61: ( options {greedy=false; } : . )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0=='\'') ) {
                            alt3=2;
                        }
                        else if ( ((LA3_0>='\u0000' && LA3_0<='&')||(LA3_0>='(' && LA3_0<='\uFFFF')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:715:89: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:717:17: ( '=begin' ( options {greedy=false; } : . )* '=end' )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:717:19: '=begin' ( options {greedy=false; } : . )* '=end'
            {
            match("=begin"); 

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:717:28: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='=') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='e') ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3=='n') ) {
                            int LA5_4 = input.LA(4);

                            if ( (LA5_4=='d') ) {
                                alt5=2;
                            }
                            else if ( ((LA5_4>='\u0000' && LA5_4<='c')||(LA5_4>='e' && LA5_4<='\uFFFF')) ) {
                                alt5=1;
                            }


                        }
                        else if ( ((LA5_3>='\u0000' && LA5_3<='m')||(LA5_3>='o' && LA5_3<='\uFFFF')) ) {
                            alt5=1;
                        }


                    }
                    else if ( ((LA5_1>='\u0000' && LA5_1<='d')||(LA5_1>='f' && LA5_1<='\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='<')||(LA5_0>='>' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:717:56: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:17: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:19: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:23: (~ ( ( '\\n' | '\\r' ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:23: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
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

            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:39: ( ( '\\r' )? '\\n' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\n'||LA8_0=='\r') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:40: ( '\\r' )? '\\n'
                    {
                    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:40: ( '\\r' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='\r') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:719:40: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

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
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:721:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:721:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:721:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:723:10: ( ( '0' .. '9' )+ )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:723:12: ( '0' .. '9' )+
            {
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:723:12: ( '0' .. '9' )+
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
            	    // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:723:13: '0' .. '9'
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
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:725:16: ( . )
            // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:725:18: .
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
        // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:8: ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_BELONGS_TO_WORD | RULE_HAS_MANY_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_CLASS_WORD | RULE_MODULE_WORD | RULE_DEF_WORD | RULE_END_WORD | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER )
        int alt11=23;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:10: T__19
                {
                mT__19(); 

                }
                break;
            case 2 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:16: T__20
                {
                mT__20(); 

                }
                break;
            case 3 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:22: T__21
                {
                mT__21(); 

                }
                break;
            case 4 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:28: T__22
                {
                mT__22(); 

                }
                break;
            case 5 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:34: T__23
                {
                mT__23(); 

                }
                break;
            case 6 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:40: T__24
                {
                mT__24(); 

                }
                break;
            case 7 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:46: T__25
                {
                mT__25(); 

                }
                break;
            case 8 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:52: T__26
                {
                mT__26(); 

                }
                break;
            case 9 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:58: RULE_BELONGS_TO_WORD
                {
                mRULE_BELONGS_TO_WORD(); 

                }
                break;
            case 10 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:79: RULE_HAS_MANY_WORD
                {
                mRULE_HAS_MANY_WORD(); 

                }
                break;
            case 11 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:98: RULE_HAS_AND_BELONGS_TO_MANY_WORD
                {
                mRULE_HAS_AND_BELONGS_TO_MANY_WORD(); 

                }
                break;
            case 12 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:132: RULE_CLASS_WORD
                {
                mRULE_CLASS_WORD(); 

                }
                break;
            case 13 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:148: RULE_MODULE_WORD
                {
                mRULE_MODULE_WORD(); 

                }
                break;
            case 14 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:165: RULE_DEF_WORD
                {
                mRULE_DEF_WORD(); 

                }
                break;
            case 15 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:179: RULE_END_WORD
                {
                mRULE_END_WORD(); 

                }
                break;
            case 16 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:193: RULE_SYMBOL
                {
                mRULE_SYMBOL(); 

                }
                break;
            case 17 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:205: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 18 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:213: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:225: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:241: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:265: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 23 :
                // ../co.gruposaberes.model/src-gen/co/gruposaberes/model/parser/antlr/internal/InternalRails.g:1:274: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\24\1\uffff\1\31\1\uffff\1\35\1\uffff\6\40\1\uffff\2\23\17\uffff\1\40\1\uffff\5\40\3\uffff\4\40\1\63\1\64\4\40\2\uffff\3\40\1\75\4\40\1\uffff\1\102\3\40\1\uffff\1\40\1\107\2\40\1\uffff\1\40\1\113\1\40\1\uffff\14\40\1\131\1\uffff";
    static final String DFA11_eofS =
        "\132\uffff";
    static final String DFA11_minS =
        "\1\0\1\11\1\uffff\1\72\1\uffff\1\76\1\uffff\1\145\1\141\1\154\1\157\1\145\1\156\1\uffff\2\0\17\uffff\1\154\1\uffff\1\163\1\141\1\144\1\146\1\144\3\uffff\1\157\1\137\1\163\1\165\2\60\1\156\1\141\1\163\1\154\2\uffff\1\147\1\141\1\156\1\60\1\145\1\163\1\156\1\144\1\uffff\1\60\1\137\1\171\1\137\1\uffff\1\164\1\60\1\142\1\157\1\uffff\1\145\1\60\1\154\1\uffff\1\157\1\156\1\147\1\163\1\137\1\164\1\157\1\137\1\155\1\141\1\156\1\171\1\60\1\uffff";
    static final String DFA11_maxS =
        "\1\uffff\1\40\1\uffff\1\172\1\uffff\1\142\1\uffff\1\145\1\141\1\154\1\157\1\145\1\156\1\uffff\2\uffff\17\uffff\1\154\1\uffff\1\163\1\141\1\144\1\146\1\144\3\uffff\1\157\1\137\1\163\1\165\2\172\1\156\1\155\1\163\1\154\2\uffff\1\147\1\141\1\156\1\172\1\145\1\163\1\156\1\144\1\uffff\1\172\1\137\1\171\1\137\1\uffff\1\164\1\172\1\142\1\157\1\uffff\1\145\1\172\1\154\1\uffff\1\157\1\156\1\147\1\163\1\137\1\164\1\157\1\137\1\155\1\141\1\156\1\171\1\172\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\7\6\uffff\1\21\2\uffff\1\24\1\25\1\26\1\27\1\1\1\25\1\2\1\3\1\20\1\5\1\4\1\6\1\23\1\10\1\7\1\uffff\1\21\5\uffff\1\22\1\24\1\26\12\uffff\1\16\1\17\10\uffff\1\14\4\uffff\1\15\4\uffff\1\12\3\uffff\1\11\15\uffff\1\13";
    static final String DFA11_specialS =
        "\1\0\15\uffff\1\1\1\2\112\uffff}>";
    static final String[] DFA11_transitionS = {
            "\11\23\2\21\2\23\1\21\22\23\1\1\1\23\1\16\1\20\3\23\1\17\4\23\1\4\3\23\12\22\1\3\1\23\1\2\1\5\1\23\1\6\1\23\32\15\4\23\1\15\1\23\1\15\1\7\1\11\1\13\1\14\2\15\1\10\4\15\1\12\15\15\uff85\23",
            "\2\25\2\uffff\1\25\22\uffff\1\25",
            "",
            "\1\27\6\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\33\43\uffff\1\34",
            "",
            "\1\37",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "\0\46",
            "\0\46",
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
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\65",
            "\1\67\13\uffff\1\66",
            "\1\70",
            "\1\71",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "\1\106",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\110",
            "\1\111",
            "",
            "\1\112",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\114",
            "",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
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
            return "1:1: Tokens : ( T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | RULE_BELONGS_TO_WORD | RULE_HAS_MANY_WORD | RULE_HAS_AND_BELONGS_TO_MANY_WORD | RULE_CLASS_WORD | RULE_MODULE_WORD | RULE_DEF_WORD | RULE_END_WORD | RULE_SYMBOL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_0 = input.LA(1);

                        s = -1;
                        if ( (LA11_0==' ') ) {s = 1;}

                        else if ( (LA11_0=='<') ) {s = 2;}

                        else if ( (LA11_0==':') ) {s = 3;}

                        else if ( (LA11_0==',') ) {s = 4;}

                        else if ( (LA11_0=='=') ) {s = 5;}

                        else if ( (LA11_0=='?') ) {s = 6;}

                        else if ( (LA11_0=='b') ) {s = 7;}

                        else if ( (LA11_0=='h') ) {s = 8;}

                        else if ( (LA11_0=='c') ) {s = 9;}

                        else if ( (LA11_0=='m') ) {s = 10;}

                        else if ( (LA11_0=='d') ) {s = 11;}

                        else if ( (LA11_0=='e') ) {s = 12;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||LA11_0=='a'||(LA11_0>='f' && LA11_0<='g')||(LA11_0>='i' && LA11_0<='l')||(LA11_0>='n' && LA11_0<='z')) ) {s = 13;}

                        else if ( (LA11_0=='\"') ) {s = 14;}

                        else if ( (LA11_0=='\'') ) {s = 15;}

                        else if ( (LA11_0=='#') ) {s = 16;}

                        else if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r') ) {s = 17;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) ) {s = 18;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\b')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||(LA11_0>='$' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='+')||(LA11_0>='-' && LA11_0<='/')||LA11_0==';'||LA11_0=='>'||LA11_0=='@'||(LA11_0>='[' && LA11_0<='^')||LA11_0=='`'||(LA11_0>='{' && LA11_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_14 = input.LA(1);

                        s = -1;
                        if ( ((LA11_14>='\u0000' && LA11_14<='\uFFFF')) ) {s = 38;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_15 = input.LA(1);

                        s = -1;
                        if ( ((LA11_15>='\u0000' && LA11_15<='\uFFFF')) ) {s = 38;}

                        else s = 19;

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