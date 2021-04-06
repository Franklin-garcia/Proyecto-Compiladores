/* The following code was generated by JFlex 1.4.3 on 04-05-21 07:57 PM */

package proyectocompi;
import static proyectocompi.Tokens.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 04-05-21 07:57 PM from the specification file
 * <tt>../ProyectoCompi/src/proyectocompi/lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 4;
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\2\0\1\3\22\0\1\3\1\0\1\15\3\0"+
    "\1\35\1\14\1\5\1\6\1\31\1\30\1\7\1\30\1\22\1\31"+
    "\12\2\2\0\1\33\1\32\1\34\2\0\1\27\1\42\1\16\1\13"+
    "\1\11\1\36\1\47\1\37\1\25\2\1\1\21\1\46\1\12\1\17"+
    "\1\40\1\1\1\24\1\20\1\26\1\45\1\44\1\23\1\41\1\43"+
    "\1\1\4\0\1\10\1\0\1\27\1\42\1\16\1\13\1\11\1\36"+
    "\1\47\1\37\1\25\2\1\1\21\1\46\1\12\1\17\1\40\1\1"+
    "\1\24\1\20\1\26\1\45\1\44\1\23\1\41\1\43\1\1\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\3\3\1\12\1\13\7\3\1\14\1\15"+
    "\1\16\2\17\1\20\3\3\1\21\1\1\1\21\3\3"+
    "\1\22\7\3\1\23\1\24\1\3\1\25\1\17\5\3"+
    "\1\26\2\3\1\27\3\3\1\30\4\3\1\31\4\3"+
    "\1\32\1\33\1\3\1\34\2\3\1\35\2\3\1\36"+
    "\10\3\1\37\3\3\1\40\1\3\1\41\1\3\1\42"+
    "\4\3\1\43\2\3\1\44\1\3\1\45\1\0\1\3"+
    "\1\46\2\0\1\47\15\0\1\50\1\51";

  private static int [] zzUnpackAction() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\170\0\360"+
    "\0\170\0\170\0\170\0\u0118\0\u0140\0\u0168\0\170\0\170"+
    "\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258\0\u0280\0\170"+
    "\0\170\0\170\0\u02a8\0\u02d0\0\170\0\u02f8\0\u0320\0\u0348"+
    "\0\u0370\0\u0398\0\170\0\u03c0\0\u03e8\0\u0410\0\240\0\u0438"+
    "\0\u0460\0\u0488\0\u04b0\0\u04d8\0\u0500\0\u0528\0\240\0\240"+
    "\0\u0550\0\240\0\170\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\u0618"+
    "\0\240\0\u0640\0\u0668\0\240\0\u0690\0\u06b8\0\u06e0\0\240"+
    "\0\u0708\0\u0730\0\u0758\0\u0780\0\240\0\u07a8\0\u07d0\0\u07f8"+
    "\0\u0820\0\u0848\0\240\0\u0870\0\240\0\u0898\0\u08c0\0\240"+
    "\0\u08e8\0\u0910\0\240\0\u0938\0\u0960\0\u0988\0\u09b0\0\u09d8"+
    "\0\u0a00\0\u0a28\0\u0a50\0\240\0\u0a78\0\u0aa0\0\u0ac8\0\240"+
    "\0\u0af0\0\240\0\u0b18\0\240\0\u0b40\0\u0b68\0\u0b90\0\u0bb8"+
    "\0\240\0\u0be0\0\u0c08\0\240\0\u0c30\0\240\0\u0c58\0\u0c80"+
    "\0\240\0\u0ca8\0\u0cd0\0\240\0\u0cf8\0\u0d20\0\u0d48\0\u0d70"+
    "\0\u0d98\0\u0dc0\0\u0de8\0\u0e10\0\u0e38\0\u0e60\0\u0e88\0\u0eb0"+
    "\0\u0ed8\0\170\0\170";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\4\1\14\1\15\1\16\1\17\1\20\1\21\1\5"+
    "\1\22\1\23\1\4\1\24\1\5\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\3\5"+
    "\1\37\3\5\1\40\1\5\4\7\1\41\43\7\15\42"+
    "\1\43\32\42\51\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\5\5\6\0\12\5\2\0\1\6\51\0\1\10"+
    "\44\0\2\5\5\0\2\5\1\44\1\5\2\0\3\5"+
    "\1\45\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\1\5\1\46\2\5\2\0\4\5\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\1\5\1\47"+
    "\2\5\1\0\2\5\1\50\2\5\6\0\12\5\1\0"+
    "\2\5\5\0\4\5\2\0\1\5\1\51\2\5\1\0"+
    "\5\5\6\0\12\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\3\5\1\52\1\5\6\0\7\5\1\53"+
    "\2\5\1\0\2\5\5\0\4\5\2\0\1\5\1\54"+
    "\2\5\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\5\5\6\0\1\5\1\55"+
    "\10\5\1\0\2\5\5\0\2\5\1\56\1\5\2\0"+
    "\4\5\1\0\5\5\6\0\1\57\11\5\1\0\2\5"+
    "\5\0\4\5\2\0\1\5\1\60\2\5\1\0\5\5"+
    "\6\0\1\5\1\61\10\5\1\0\2\5\5\0\4\5"+
    "\2\0\2\5\1\62\1\5\1\0\5\5\6\0\12\5"+
    "\32\0\1\63\1\0\1\63\45\0\1\63\16\0\2\5"+
    "\5\0\4\5\2\0\1\5\1\64\2\5\1\0\5\5"+
    "\6\0\7\5\1\65\2\5\1\0\2\5\5\0\4\5"+
    "\2\0\1\5\1\66\2\5\1\0\5\5\6\0\5\5"+
    "\1\67\4\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\70\2\5\1\0\5\5\6\0\12\5\4\0\1\41"+
    "\43\0\15\42\1\0\32\42\1\0\2\5\5\0\3\5"+
    "\1\71\2\0\4\5\1\0\5\5\6\0\12\5\1\0"+
    "\2\5\5\0\4\5\2\0\2\5\1\72\1\5\1\0"+
    "\5\5\6\0\12\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\5\5\6\0\3\5\1\73\6\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\0\5\5\6\0"+
    "\10\5\1\74\1\5\1\0\2\5\5\0\2\5\1\75"+
    "\1\5\2\0\4\5\1\0\5\5\6\0\12\5\1\0"+
    "\2\5\5\0\1\5\1\76\2\5\2\0\4\5\1\0"+
    "\1\5\1\77\3\5\6\0\12\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\5\5\6\0\4\5\1\100"+
    "\5\5\1\0\2\5\5\0\4\5\2\0\1\5\1\101"+
    "\2\5\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\2\5\1\102\2\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\4\5\1\0"+
    "\3\5\1\103\1\5\6\0\12\5\1\0\2\5\5\0"+
    "\1\5\1\104\2\5\2\0\4\5\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\4\5\1\0"+
    "\1\5\1\105\3\5\6\0\12\5\1\0\2\5\5\0"+
    "\2\5\1\106\1\5\2\0\4\5\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\1\5\1\107"+
    "\2\5\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\5\5\6\0\6\5\1\110"+
    "\3\5\1\0\2\5\5\0\3\5\1\111\2\0\4\5"+
    "\1\0\5\5\6\0\12\5\1\0\2\5\5\0\1\5"+
    "\1\112\2\5\2\0\4\5\1\0\5\5\6\0\12\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\3\5"+
    "\1\113\1\5\6\0\12\5\1\0\2\5\5\0\4\5"+
    "\2\0\2\5\1\114\1\5\1\0\5\5\6\0\12\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\5\5"+
    "\6\0\2\5\1\115\7\5\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\2\5\1\116\2\5\6\0\7\5"+
    "\1\117\2\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\5\5\6\0\2\5\1\120\7\5\1\0\2\5"+
    "\5\0\4\5\2\0\3\5\1\121\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\1\5\1\122\2\5\2\0"+
    "\4\5\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\2\5\1\123\1\5\2\0\4\5\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\1\124\3\5"+
    "\1\0\5\5\6\0\12\5\1\0\2\5\5\0\4\5"+
    "\2\0\3\5\1\125\1\0\5\5\6\0\12\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\0\4\5\1\126"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\5\5\6\0\7\5\1\127\2\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\2\5\1\130\2\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\131\2\5\1\0\5\5\6\0\12\5\1\0\2\5"+
    "\5\0\2\5\1\132\1\5\2\0\4\5\1\0\5\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\1\133"+
    "\3\5\1\0\5\5\6\0\12\5\1\0\2\5\5\0"+
    "\1\5\1\134\2\5\2\0\4\5\1\0\5\5\6\0"+
    "\12\5\1\0\2\5\5\0\4\5\2\0\4\5\1\0"+
    "\5\5\6\0\11\5\1\135\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\3\5\1\136\1\5\6\0\12\5"+
    "\1\0\2\5\5\0\1\5\1\137\2\5\2\0\4\5"+
    "\1\0\5\5\6\0\12\5\1\0\2\5\5\0\4\5"+
    "\2\0\3\5\1\140\1\0\5\5\6\0\12\5\1\0"+
    "\2\5\5\0\4\5\2\0\3\5\1\141\1\0\5\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\5\5\6\0\1\142\11\5\1\0\2\5\5\0"+
    "\4\5\2\0\3\5\1\143\1\0\5\5\6\0\12\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\5\5"+
    "\6\0\11\5\1\144\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\3\5\1\145\1\5\6\0\12\5\1\0"+
    "\2\5\5\0\1\5\1\146\2\5\2\0\4\5\1\0"+
    "\5\5\6\0\12\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\2\5\1\147\2\5\6\0\12\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\0\4\5\1\150"+
    "\6\0\12\5\1\0\2\5\5\0\1\5\1\151\2\5"+
    "\2\0\4\5\1\0\5\5\6\0\12\5\1\0\2\5"+
    "\5\0\1\5\1\152\2\5\2\0\4\5\1\0\5\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\5\5\6\0\7\5\1\153\2\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\1\5\1\154\3\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\155\2\5\1\0\5\5\6\0\12\5\1\0\2\5"+
    "\5\0\2\5\1\156\1\5\2\0\4\5\1\0\5\5"+
    "\6\0\12\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\157\5\5\6\0\12\5\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\1\5\1\160\3\5\6\0\12\5"+
    "\1\0\2\5\5\0\2\5\1\161\1\5\2\0\4\5"+
    "\1\0\5\5\6\0\12\5\23\0\1\162\1\163\24\0"+
    "\2\5\5\0\1\5\1\164\2\5\2\0\4\5\1\0"+
    "\5\5\6\0\12\5\24\0\1\165\34\0\1\166\63\0"+
    "\1\167\51\0\1\170\46\0\1\171\34\0\1\172\45\0"+
    "\1\173\57\0\1\174\47\0\1\175\53\0\1\176\47\0"+
    "\1\177\34\0\1\200\47\0\1\201\46\0\1\202\47\0"+
    "\1\203\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3840];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\1\1\11\2\1\1\11\1\1\3\11\3\1"+
    "\2\11\7\1\3\11\2\1\1\11\5\1\1\11\17\1"+
    "\1\11\73\1\1\0\2\1\2\0\1\1\15\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexema;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 160) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { lexema=yytext(); return MultDiv;
          }
        case 42: break;
        case 31: 
          { lexema=yytext(); return While;
          }
        case 43: break;
        case 24: 
          { lexema=yytext(); return Sub;
          }
        case 44: break;
        case 37: 
          { lexema=yytext(); return TypeBoolean;
          }
        case 45: break;
        case 30: 
          { lexema=yytext(); return Then;
          }
        case 46: break;
        case 16: 
          { lexema=yytext(); return Ampersand;
          }
        case 47: break;
        case 1: 
          { lexema=yytext(); return ContString;
          }
        case 48: break;
        case 2: 
          { lexema=yytext(); return Error;
          }
        case 49: break;
        case 40: 
          { lexema=yytext(); return Read;
          }
        case 50: break;
        case 26: 
          { lexema=yytext(); return Else;
          }
        case 51: break;
        case 36: 
          { lexema=yytext(); return TypeInteger;
          }
        case 52: break;
        case 25: 
          { lexema=yytext(); return For;
          }
        case 53: break;
        case 34: 
          { lexema=yytext(); return TypeString;
          }
        case 54: break;
        case 18: 
          { lexema=yytext(); return Do;
          }
        case 55: break;
        case 3: 
          { lexema=yytext(); return Id;
          }
        case 56: break;
        case 27: 
          { lexema=yytext(); return Next;
          }
        case 57: break;
        case 29: 
          { lexema=yytext(); return Loop;
          }
        case 58: break;
        case 41: 
          { lexema=yytext(); return Write;
          }
        case 59: break;
        case 17: 
          { yybegin(YYINITIAL);
          }
        case 60: break;
        case 21: 
          { lexema=yytext(); return As;
          }
        case 61: break;
        case 39: 
          { lexema=yytext(); return Structure;
          }
        case 62: break;
        case 35: 
          { lexema=yytext(); return Module;
          }
        case 63: break;
        case 4: 
          { lexema=yytext(); return Num;
          }
        case 64: break;
        case 10: 
          { yybegin(COMMENT);
          }
        case 65: break;
        case 20: 
          { lexema=yytext(); return To;
          }
        case 66: break;
        case 38: 
          { lexema=yytext(); return Function;
          }
        case 67: break;
        case 22: 
          { lexema=yytext(); return End;
          }
        case 68: break;
        case 28: 
          { lexema=yytext(); return Step;
          }
        case 69: break;
        case 11: 
          { yybegin(STRING);
          }
        case 70: break;
        case 19: 
          { lexema=yytext(); return If;
          }
        case 71: break;
        case 32: 
          { lexema=yytext(); return ByVal;
          }
        case 72: break;
        case 23: 
          { lexema=yytext(); return Dim;
          }
        case 73: break;
        case 15: 
          { lexema=yytext(); return OpRel;
          }
        case 74: break;
        case 33: 
          { lexema=yytext(); return ElseIf;
          }
        case 75: break;
        case 7: 
          { lexema=yytext(); return Parizq;
          }
        case 76: break;
        case 9: 
          { lexema=yytext(); return Coma;
          }
        case 77: break;
        case 8: 
          { lexema=yytext(); return Parder;
          }
        case 78: break;
        case 12: 
          { lexema=yytext(); return SumaResta;
          }
        case 79: break;
        case 14: 
          { lexema=yytext(); return Igual;
          }
        case 80: break;
        case 5: 
          { 
          }
        case 81: break;
        case 6: 
          { return Newline;
          }
        case 82: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
