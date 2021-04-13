/* The following code was generated by JFlex 1.4.3 on 04-12-21 08:11 PM */

package proyectocompi;
import java_cup.runtime.Symbol;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 04-12-21 08:11 PM from the specification file
 * <tt>../ProyectoCompi/src/proyectocompi/lexer_syn.flex</tt>
 */
class Lexer_Syn implements java_cup.runtime.Scanner {

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
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  4,  0,  0,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    33,  0, 13,  0,  0,  0, 30, 12,  5,  6, 25, 24,  7, 24, 18, 25, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2,  0,  0, 27, 26, 28,  0, 
     0, 23, 36, 14, 11,  9, 31, 41, 32, 21,  1,  1, 17, 40, 10, 15, 
    34,  1, 20, 16, 22, 39, 38, 19, 35, 37,  1,  0,  0,  0,  0,  8, 
     0, 23, 36, 14, 11,  9, 31, 41, 32, 21,  1,  1, 17, 40, 10, 15, 
    34,  1, 20, 16, 22, 39, 38, 19, 35, 37,  1,  0,  0,  0, 29,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\3\3\1\12\1\13\7\3\1\14\1\15"+
    "\1\16\2\17\1\2\1\20\3\3\1\21\1\1\1\21"+
    "\3\3\1\22\7\3\1\23\1\24\1\3\1\25\1\26"+
    "\1\17\5\3\1\27\2\3\1\30\3\3\1\31\4\3"+
    "\1\32\4\3\1\0\1\33\1\34\1\3\1\35\2\3"+
    "\1\36\2\3\1\37\4\3\1\0\4\3\1\40\3\3"+
    "\1\41\1\3\1\42\1\43\1\3\1\44\4\3\1\45"+
    "\2\3\1\46\1\3\1\47\1\0\1\3\1\50\2\0"+
    "\1\51\15\0\1\52\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[136];
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
    "\0\0\0\52\0\124\0\176\0\250\0\322\0\176\0\374"+
    "\0\176\0\176\0\176\0\u0126\0\u0150\0\u017a\0\176\0\176"+
    "\0\u01a4\0\u01ce\0\u01f8\0\u0222\0\u024c\0\u0276\0\u02a0\0\176"+
    "\0\176\0\u02ca\0\u02f4\0\u031e\0\u02ca\0\176\0\u0348\0\u0372"+
    "\0\u039c\0\u03c6\0\u03f0\0\176\0\u041a\0\u0444\0\u046e\0\250"+
    "\0\u0498\0\u04c2\0\u04ec\0\u0516\0\u0540\0\u056a\0\u0594\0\250"+
    "\0\250\0\u05be\0\250\0\176\0\176\0\u05e8\0\u0612\0\u063c"+
    "\0\u0666\0\u0690\0\u06ba\0\u06e4\0\u070e\0\250\0\u0738\0\u0762"+
    "\0\u078c\0\250\0\u07b6\0\u07e0\0\u080a\0\u0834\0\250\0\u085e"+
    "\0\u0888\0\u08b2\0\u08dc\0\u0906\0\u0930\0\250\0\u095a\0\250"+
    "\0\u0984\0\u09ae\0\250\0\u09d8\0\u0a02\0\250\0\u0a2c\0\u0a56"+
    "\0\u0a80\0\u0aaa\0\u0ad4\0\u0afe\0\u0b28\0\u0b52\0\u0b7c\0\250"+
    "\0\u0ba6\0\u0bd0\0\u0bfa\0\250\0\u0c24\0\176\0\250\0\u0c4e"+
    "\0\250\0\u0c78\0\u0ca2\0\u0ccc\0\u0cf6\0\250\0\u0d20\0\u0d4a"+
    "\0\250\0\u0d74\0\250\0\u0d9e\0\u0dc8\0\250\0\u0df2\0\u0e1c"+
    "\0\250\0\u0e46\0\u0e70\0\u0e9a\0\u0ec4\0\u0eee\0\u0f18\0\u0f42"+
    "\0\u0f6c\0\u0f96\0\u0fc0\0\u0fea\0\u1014\0\u103e\0\176\0\176";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[136];
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
    "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37"+
    "\1\5\1\7\2\5\1\40\3\5\1\41\1\5\4\7"+
    "\1\42\45\7\15\43\1\44\34\43\53\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\2\0\1\6\53\0\1\10\46\0\2\5\5\0"+
    "\2\5\1\45\1\5\2\0\3\5\1\46\1\0\5\5"+
    "\7\0\2\5\1\0\10\5\1\0\2\5\5\0\1\5"+
    "\1\47\2\5\2\0\4\5\1\0\5\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\50\2\5\1\0\2\5\1\51\2\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\52\2\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\3\5"+
    "\1\53\1\5\7\0\2\5\1\0\5\5\1\54\2\5"+
    "\1\0\2\5\5\0\4\5\2\0\1\5\1\55\2\5"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\5\5\7\0\1\5"+
    "\1\56\1\0\10\5\1\0\2\5\5\0\2\5\1\57"+
    "\1\5\2\0\4\5\1\0\5\5\7\0\1\60\1\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\61\2\5\1\0\5\5\7\0\1\5\1\62\1\0"+
    "\10\5\1\0\2\5\5\0\4\5\2\0\2\5\1\63"+
    "\1\5\1\0\5\5\7\0\2\5\1\0\10\5\32\0"+
    "\1\64\51\0\1\65\1\0\1\65\47\0\1\65\20\0"+
    "\2\5\5\0\4\5\2\0\1\5\1\66\2\5\1\0"+
    "\5\5\7\0\2\5\1\0\5\5\1\67\2\5\1\0"+
    "\2\5\5\0\4\5\2\0\1\5\1\70\2\5\1\0"+
    "\5\5\7\0\2\5\1\0\3\5\1\71\4\5\1\0"+
    "\2\5\5\0\4\5\2\0\1\5\1\72\2\5\1\0"+
    "\5\5\7\0\2\5\1\0\10\5\4\0\1\42\45\0"+
    "\15\43\1\0\34\43\1\0\2\5\5\0\3\5\1\73"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\2\5\1\74\1\5"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\5\5\7\0\2\5"+
    "\1\0\1\5\1\75\6\5\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\6\5"+
    "\1\76\1\5\1\0\2\5\5\0\2\5\1\77\1\5"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\1\5\1\100\2\5\2\0\4\5"+
    "\1\0\1\5\1\101\3\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\5\5"+
    "\7\0\2\5\1\0\2\5\1\102\5\5\1\0\2\5"+
    "\5\0\4\5\2\0\1\5\1\103\2\5\1\0\5\5"+
    "\7\0\2\5\1\0\10\5\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\2\5\1\104\2\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\4\5"+
    "\1\0\3\5\1\105\1\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\1\5\1\106\2\5\2\0\4\5"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\1\5\1\107\3\5"+
    "\7\0\2\5\1\0\10\5\1\0\2\5\5\0\2\5"+
    "\1\110\1\5\2\0\4\5\1\0\5\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\1\5"+
    "\1\111\2\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\5\5"+
    "\7\0\2\5\1\0\4\5\1\112\3\5\1\0\2\5"+
    "\5\0\3\5\1\113\2\0\4\5\1\0\5\5\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\5\5\7\0\2\5\1\114\10\5\1\0"+
    "\2\5\5\0\1\5\1\115\2\5\2\0\4\5\1\0"+
    "\5\5\7\0\2\5\1\0\10\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\3\5\1\116\1\5\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\4\5\2\0"+
    "\2\5\1\117\1\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\4\5\2\0\4\5\1\0"+
    "\5\5\7\0\2\5\1\0\1\120\7\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\2\5\1\121\2\5"+
    "\7\0\2\5\1\0\5\5\1\122\2\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\5\5\7\0\2\5"+
    "\1\0\1\123\7\5\1\0\2\5\5\0\4\5\2\0"+
    "\3\5\1\124\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\1\5\1\125\2\5\2\0\4\5"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\2\5\1\126\1\5\2\0\4\5\1\0\5\5"+
    "\7\0\2\5\1\0\10\5\1\0\2\5\5\0\4\5"+
    "\2\0\1\127\3\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\4\5\2\0\3\5\1\130"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\4\5\1\131\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\5\5\7\0\2\5\1\0\5\5\1\132"+
    "\2\5\25\0\1\133\25\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\2\5\1\134\2\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\4\5\2\0\1\5\1\135"+
    "\2\5\1\0\5\5\7\0\2\5\1\0\10\5\1\0"+
    "\2\5\5\0\2\5\1\136\1\5\2\0\4\5\1\0"+
    "\5\5\7\0\2\5\1\0\10\5\1\0\2\5\5\0"+
    "\4\5\2\0\1\137\3\5\1\0\5\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\1\5\1\140\2\5"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\5\5"+
    "\7\0\2\5\1\0\7\5\1\141\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\3\5\1\142\1\5\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\1\5\1\143"+
    "\2\5\2\0\4\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\4\5\2\0\3\5\1\144"+
    "\1\0\5\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\3\5\1\145\1\0\5\5\7\0"+
    "\2\5\1\0\10\5\37\0\1\146\13\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\5\5\7\0\1\147\1\5"+
    "\1\0\10\5\1\0\2\5\5\0\4\5\2\0\3\5"+
    "\1\150\1\0\5\5\7\0\2\5\1\0\10\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\0\5\5\7\0"+
    "\2\5\1\0\7\5\1\151\1\0\2\5\5\0\4\5"+
    "\2\0\4\5\1\0\3\5\1\152\1\5\7\0\2\5"+
    "\1\0\10\5\1\0\2\5\5\0\1\5\1\153\2\5"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\1\0\2\5\5\0\4\5\2\0\4\5\1\0\2\5"+
    "\1\154\2\5\7\0\2\5\1\0\10\5\1\0\2\5"+
    "\5\0\4\5\2\0\4\5\1\0\4\5\1\155\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\1\5\1\156"+
    "\2\5\2\0\4\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\1\5\1\157\2\5\2\0"+
    "\4\5\1\0\5\5\7\0\2\5\1\0\10\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\0\5\5\7\0"+
    "\2\5\1\0\5\5\1\160\2\5\1\0\2\5\5\0"+
    "\4\5\2\0\4\5\1\0\1\5\1\161\3\5\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\4\5\2\0"+
    "\1\5\1\162\2\5\1\0\5\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\2\5\1\163\1\5\2\0"+
    "\4\5\1\0\5\5\7\0\2\5\1\0\10\5\1\0"+
    "\2\5\5\0\4\5\2\0\4\5\1\164\5\5\7\0"+
    "\2\5\1\0\10\5\1\0\2\5\5\0\4\5\2\0"+
    "\4\5\1\0\1\5\1\165\3\5\7\0\2\5\1\0"+
    "\10\5\1\0\2\5\5\0\2\5\1\166\1\5\2\0"+
    "\4\5\1\0\5\5\7\0\2\5\1\0\10\5\23\0"+
    "\1\167\1\170\26\0\2\5\5\0\1\5\1\171\2\5"+
    "\2\0\4\5\1\0\5\5\7\0\2\5\1\0\10\5"+
    "\24\0\1\172\36\0\1\173\65\0\1\174\53\0\1\175"+
    "\50\0\1\176\36\0\1\177\47\0\1\200\61\0\1\201"+
    "\51\0\1\202\55\0\1\203\51\0\1\204\36\0\1\205"+
    "\51\0\1\206\50\0\1\207\51\0\1\210\40\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4200];
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
    "\2\11\7\1\2\11\4\1\1\11\5\1\1\11\17\1"+
    "\2\11\26\1\1\0\16\1\1\0\12\1\1\11\15\1"+
    "\1\0\2\1\2\0\1\1\15\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[136];
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
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer_Syn(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer_Syn(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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
        case 15: 
          { return new Symbol (sym.OpRel, yycolumn, yyline, yytext());
          }
        case 44: break;
        case 14: 
          { return new Symbol (sym.Igual, yycolumn, yyline, yytext());
          }
        case 45: break;
        case 9: 
          { return new Symbol (sym.Coma, yycolumn, yyline, yytext());
          }
        case 46: break;
        case 41: 
          { return new Symbol (sym.Structure, yycolumn, yyline, yytext());
          }
        case 47: break;
        case 26: 
          { return new Symbol (sym.For, yycolumn, yyline, yytext());
          }
        case 48: break;
        case 20: 
          { return new Symbol (sym.To, yycolumn, yyline, yytext());
          }
        case 49: break;
        case 42: 
          { return new Symbol (sym.Read, yycolumn, yyline, yytext());
          }
        case 50: break;
        case 1: 
          { return new Symbol (sym.ContString, yycolumn, yyline, yytext());
          }
        case 51: break;
        case 2: 
          { return new Symbol (sym.Error, yycolumn, yyline, yytext());
          }
        case 52: break;
        case 27: 
          { return new Symbol (sym.Else, yycolumn, yyline, yytext());
          }
        case 53: break;
        case 23: 
          { return new Symbol (sym.End, yycolumn, yyline, yytext());
          }
        case 54: break;
        case 39: 
          { return new Symbol (sym.TypeBoolean, yycolumn, yyline, yytext());
          }
        case 55: break;
        case 33: 
          { return new Symbol (sym.ByVal, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 8: 
          { return new Symbol (sym.Parder, yycolumn, yyline, yytext());
          }
        case 57: break;
        case 24: 
          { return new Symbol (sym.Dim, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 17: 
          { yybegin(YYINITIAL);
          }
        case 59: break;
        case 38: 
          { return new Symbol (sym.TypeInteger, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 4: 
          { return new Symbol (sym.Num, yycolumn, yyline, yytext());
          }
        case 61: break;
        case 13: 
          { return new Symbol (sym.MultDiv, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 16: 
          { return new Symbol (sym.Ampersand, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 10: 
          { yybegin(COMMENT);
          }
        case 64: break;
        case 30: 
          { return new Symbol (sym.Loop, yycolumn, yyline, yytext());
          }
        case 65: break;
        case 36: 
          { return new Symbol (sym.TypeString, yycolumn, yyline, yytext());
          }
        case 66: break;
        case 6: 
          { return new Symbol (sym.Newline, yycolumn, yyline, yytext());
          }
        case 67: break;
        case 31: 
          { return new Symbol (sym.Then, yycolumn, yyline, yytext());
          }
        case 68: break;
        case 11: 
          { yybegin(STRING);
          }
        case 69: break;
        case 32: 
          { return new Symbol (sym.While, yycolumn, yyline, yytext());
          }
        case 70: break;
        case 3: 
          { return new Symbol (sym.Id, yycolumn, yyline, yytext());
          }
        case 71: break;
        case 28: 
          { return new Symbol (sym.Next, yycolumn, yyline, yytext());
          }
        case 72: break;
        case 22: 
          { return new Symbol (sym.OpRel2, yycolumn, yyline, yytext());
          }
        case 73: break;
        case 7: 
          { return new Symbol (sym.Parizq, yycolumn, yyline, yytext());
          }
        case 74: break;
        case 43: 
          { return new Symbol (sym.Write, yycolumn, yyline, yytext());
          }
        case 75: break;
        case 25: 
          { return new Symbol (sym.Sub, yycolumn, yyline, yytext());
          }
        case 76: break;
        case 18: 
          { return new Symbol (sym.Do, yycolumn, yyline, yytext());
          }
        case 77: break;
        case 12: 
          { return new Symbol (sym.SumaResta, yycolumn, yyline, yytext());
          }
        case 78: break;
        case 19: 
          { return new Symbol (sym.If, yycolumn, yyline, yytext());
          }
        case 79: break;
        case 21: 
          { return new Symbol (sym.As, yycolumn, yyline, yytext());
          }
        case 80: break;
        case 34: 
          { return new Symbol (sym.EndIf, yycolumn, yyline, yytext());
          }
        case 81: break;
        case 29: 
          { return new Symbol (sym.Step, yycolumn, yyline, yytext());
          }
        case 82: break;
        case 40: 
          { return new Symbol (sym.Function, yycolumn, yyline, yytext());
          }
        case 83: break;
        case 35: 
          { return new Symbol (sym.ElseIf, yycolumn, yyline, yytext());
          }
        case 84: break;
        case 37: 
          { return new Symbol (sym.Module, yycolumn, yyline, yytext());
          }
        case 85: break;
        case 5: 
          { 
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
