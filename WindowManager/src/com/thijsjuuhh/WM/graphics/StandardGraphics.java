package com.thijsjuuhh.WM.graphics;

public class StandardGraphics extends SpriteLoader {

	private static final SpriteSheet IMAGES = new SpriteSheet("/Files/IMAGES.png", false);
	private static final Sprite LEFT_BUTTON = new Sprite(0, 0, 32, 32, IMAGES);
	private static final Sprite MIDDLE_BUTTON = new Sprite(33, 0, 32, 32, IMAGES);
	private static final Sprite RIGHT_BUTTON = new Sprite(65, 0, 32, 32, IMAGES);
	private static final Sprite CHECK_BOX = new Sprite(97, 0, 32, 32, IMAGES);
	private static final Sprite CHECK_MARK = new Sprite(129, 0, 32, 32, IMAGES);

	private static final SpriteSheet Arial = new SpriteSheet("/Files/Arial.png", true);
	private static final Sprite A = new Sprite(0, 0, 32, 32, Arial);
	private static final Sprite B = new Sprite(1, 0, 32, 32, Arial);
	private static final Sprite C = new Sprite(2, 0, 32, 32, Arial);
	private static final Sprite D = new Sprite(3, 0, 32, 32, Arial);
	private static final Sprite E = new Sprite(4, 0, 32, 32, Arial);
	private static final Sprite F = new Sprite(5, 0, 32, 32, Arial);
	private static final Sprite G = new Sprite(6, 0, 32, 32, Arial);
	private static final Sprite H = new Sprite(7, 0, 32, 32, Arial);
	private static final Sprite I = new Sprite(8, 0, 32, 32, Arial);
	private static final Sprite J = new Sprite(9, 0, 32, 32, Arial);
	private static final Sprite K = new Sprite(10, 0, 32, 32, Arial);
	private static final Sprite L = new Sprite(11, 0, 32, 32, Arial);
	private static final Sprite M = new Sprite(12, 0, 32, 32, Arial);
	private static final Sprite N = new Sprite(13, 0, 32, 32, Arial);
	private static final Sprite O = new Sprite(14, 0, 32, 32, Arial);
	private static final Sprite P = new Sprite(15, 0, 32, 32, Arial);
	private static final Sprite Q = new Sprite(16, 0, 32, 32, Arial);
	private static final Sprite R = new Sprite(17, 0, 32, 32, Arial);
	private static final Sprite S = new Sprite(18, 0, 32, 32, Arial);
	private static final Sprite T = new Sprite(19, 0, 32, 32, Arial);
	private static final Sprite U = new Sprite(0, 1, 32, 32, Arial);
	private static final Sprite V = new Sprite(1, 1, 32, 32, Arial);
	private static final Sprite W = new Sprite(2, 1, 32, 32, Arial);
	private static final Sprite X = new Sprite(3, 1, 32, 32, Arial);
	private static final Sprite Y = new Sprite(4, 1, 32, 32, Arial);
	private static final Sprite Z = new Sprite(5, 1, 32, 32, Arial);
	private static final Sprite a = new Sprite(6, 1, 32, 32, Arial);
	private static final Sprite b = new Sprite(7, 1, 32, 32, Arial);
	private static final Sprite c = new Sprite(8, 1, 32, 32, Arial);
	private static final Sprite d = new Sprite(9, 1, 32, 32, Arial);
	private static final Sprite e = new Sprite(10, 1, 32, 32, Arial);
	private static final Sprite f = new Sprite(11, 1, 32, 32, Arial);
	private static final Sprite g = new Sprite(12, 1, 32, 32, Arial);
	private static final Sprite h = new Sprite(13, 1, 32, 32, Arial);
	private static final Sprite i = new Sprite(14, 1, 32, 32, Arial);
	private static final Sprite j = new Sprite(15, 1, 32, 32, Arial);
	private static final Sprite k = new Sprite(16, 1, 32, 32, Arial);
	private static final Sprite l = new Sprite(17, 1, 32, 32, Arial);
	private static final Sprite m = new Sprite(18, 1, 32, 32, Arial);
	private static final Sprite n = new Sprite(19, 1, 32, 32, Arial);
	private static final Sprite o = new Sprite(0, 2, 32, 32, Arial);
	private static final Sprite p = new Sprite(1, 2, 32, 32, Arial);
	private static final Sprite q = new Sprite(2, 2, 32, 32, Arial);
	private static final Sprite r = new Sprite(3, 2, 32, 32, Arial);
	private static final Sprite s = new Sprite(4, 2, 32, 32, Arial);
	private static final Sprite t = new Sprite(5, 2, 32, 32, Arial);
	private static final Sprite u = new Sprite(6, 2, 32, 32, Arial);
	private static final Sprite v = new Sprite(7, 2, 32, 32, Arial);
	private static final Sprite w = new Sprite(8, 2, 32, 32, Arial);
	private static final Sprite x = new Sprite(9, 2, 32, 32, Arial);
	private static final Sprite y = new Sprite(10, 2, 32, 32, Arial);
	private static final Sprite z = new Sprite(11, 2, 32, 32, Arial);
	private static final Sprite DOT = new Sprite(12, 2, 32, 32, Arial);
	private static final Sprite COMMA = new Sprite(13, 2, 32, 32, Arial);
	private static final Sprite QUESTION_MARK = new Sprite(14, 2, 32, 32, Arial);
	private static final Sprite SINGLE_QUOTE_LEFT = new Sprite(15, 2, 32, 32, Arial);
	private static final Sprite SINGLE_QUOTE_RIGHT = new Sprite(16, 2, 32, 32, Arial);
	private static final Sprite QUOTE_LEFT = new Sprite(17, 2, 32, 32, Arial);
	private static final Sprite QUOTE_RIGHT = new Sprite(18, 2, 32, 32, Arial);
	private static final Sprite BACKSLASH = new Sprite(19, 2, 32, 32, Arial);
	private static final Sprite FRONTSLASH = new Sprite(0, 3, 32, 32, Arial);
	private static final Sprite SEMI_COLON = new Sprite(1, 3, 32, 32, Arial);
	private static final Sprite COLON = new Sprite(2, 3, 32, 32, Arial);
	private static final Sprite SQUARE_BRACKET_LEFT = new Sprite(3, 3, 32, 32, Arial);
	private static final Sprite SQUARE_BRACKET_RIGHT = new Sprite(4, 3, 32, 32, Arial);
	private static final Sprite BRACE_LEFT = new Sprite(5, 3, 32, 32, Arial);
	private static final Sprite BRACE_RIGHT = new Sprite(6, 3, 32, 32, Arial);
	private static final Sprite EURO = new Sprite(7, 3, 32, 32, Arial);
	private static final Sprite DOLLAR = new Sprite(8, 3, 32, 32, Arial);
	private static final Sprite AT = new Sprite(9, 3, 32, 32, Arial);
	private static final Sprite ROOF = new Sprite(10, 3, 32, 32, Arial);
	private static final Sprite AND = new Sprite(11, 3, 32, 32, Arial);
	private static final Sprite ASTRIX = new Sprite(12, 3, 32, 32, Arial);
	private static final Sprite BRACKET_LEFT = new Sprite(13, 3, 32, 32, Arial);
	private static final Sprite BRACKET_RIGHT = new Sprite(14, 3, 32, 32, Arial);
	private static final Sprite MINUS = new Sprite(15, 3, 32, 32, Arial);
	private static final Sprite UNDER_SCORE = new Sprite(16, 3, 32, 32, Arial);
	private static final Sprite EQUALS = new Sprite(17, 3, 32, 32, Arial);
	private static final Sprite PLUS = new Sprite(18, 3, 32, 32, Arial);
	private static final Sprite TILDE = new Sprite(19, 3, 32, 32, Arial);
	private static final Sprite ZERO = new Sprite(0, 4, 32, 32, Arial);
	private static final Sprite ONE = new Sprite(1, 4, 32, 32, Arial);
	private static final Sprite TWO = new Sprite(2, 4, 32, 32, Arial);
	private static final Sprite THREE = new Sprite(3, 4, 32, 32, Arial);
	private static final Sprite FOUR = new Sprite(4, 4, 32, 32, Arial);
	private static final Sprite FIVE = new Sprite(5, 4, 32, 32, Arial);
	private static final Sprite SIX = new Sprite(6, 4, 32, 32, Arial);
	private static final Sprite SEVEN = new Sprite(7, 4, 32, 32, Arial);
	private static final Sprite EIGHT = new Sprite(8, 4, 32, 32, Arial);
	private static final Sprite NINE = new Sprite(9, 4, 32, 32, Arial);
	private static final Sprite NULL = new Sprite(10, 4, 32, 32, Arial);
	private static final Sprite EXCLAMATION = new Sprite(11, 4, 32, 32, Arial);
	private static final Sprite ARROWL = new Sprite(12, 4, 32, 32, Arial);
	private static final Sprite ARROWR = new Sprite(13, 4, 32, 32, Arial);

	@Override
	public Sprite[] getButtonSprites() {
		Sprite result[] = { LEFT_BUTTON, MIDDLE_BUTTON, RIGHT_BUTTON };
		return result;
	}

	@Override
	public Sprite getA() {
		return A;
	}

	@Override
	public Sprite getB() {
		return B;
	}

	@Override
	public Sprite getC() {
		return C;
	}

	@Override
	public Sprite getD() {
		return D;
	}

	@Override
	public Sprite getE() {
		return E;
	}

	@Override
	public Sprite getF() {
		return F;
	}

	@Override
	public Sprite getG() {
		return G;
	}

	@Override
	public Sprite getH() {
		return H;
	}

	@Override
	public Sprite getI() {
		return I;
	}

	@Override
	public Sprite getJ() {
		return J;
	}

	@Override
	public Sprite getK() {
		return K;
	}

	@Override
	public Sprite getL() {
		return L;
	}

	@Override
	public Sprite getM() {
		return M;
	}

	@Override
	public Sprite getN() {
		return N;
	}

	@Override
	public Sprite getO() {
		return O;
	}

	@Override
	public Sprite getP() {
		return P;
	}

	@Override
	public Sprite getQ() {
		return Q;
	}

	@Override
	public Sprite getR() {
		return R;
	}

	@Override
	public Sprite getS() {
		return S;
	}

	@Override
	public Sprite getT() {
		return T;
	}

	@Override
	public Sprite getU() {
		return U;
	}

	@Override
	public Sprite getV() {
		return V;
	}

	@Override
	public Sprite getW() {
		return W;
	}

	@Override
	public Sprite getX() {
		return X;
	}

	@Override
	public Sprite getY() {
		return Y;
	}

	@Override
	public Sprite getZ() {
		return Z;
	}

	@Override
	public Sprite geta() {
		return a;
	}

	@Override
	public Sprite getb() {
		return b;
	}

	@Override
	public Sprite getc() {
		return c;
	}

	@Override
	public Sprite getd() {
		return d;
	}

	@Override
	public Sprite gete() {
		return e;
	}

	@Override
	public Sprite getf() {
		return f;
	}

	@Override
	public Sprite getg() {
		return g;
	}

	@Override
	public Sprite geth() {
		return h;
	}

	@Override
	public Sprite geti() {
		return i;
	}

	@Override
	public Sprite getj() {
		return j;
	}

	@Override
	public Sprite getk() {
		return k;
	}

	@Override
	public Sprite getl() {
		return l;
	}

	@Override
	public Sprite getm() {
		return m;
	}

	@Override
	public Sprite getn() {
		return n;
	}

	@Override
	public Sprite geto() {
		return o;
	}

	@Override
	public Sprite getp() {
		return p;
	}

	@Override
	public Sprite getq() {
		return q;
	}

	@Override
	public Sprite getr() {
		return r;
	}

	@Override
	public Sprite gets() {
		return s;
	}

	@Override
	public Sprite gett() {
		return t;
	}

	@Override
	public Sprite getu() {
		return u;
	}

	@Override
	public Sprite getv() {
		return v;
	}

	@Override
	public Sprite getw() {
		return w;
	}

	@Override
	public Sprite getx() {
		return x;
	}

	@Override
	public Sprite gety() {
		return y;
	}

	@Override
	public Sprite getz() {
		return z;
	}

	@Override
	public Sprite getComma() {
		return COMMA;
	}

	@Override
	public Sprite getDot() {
		return DOT;
	}

	@Override
	public Sprite getQuestionMark() {
		return QUESTION_MARK;
	}

	@Override
	public Sprite getSingleQuoteL() {
		return SINGLE_QUOTE_LEFT;
	}

	@Override
	public Sprite getSingleQuoteR() {
		return SINGLE_QUOTE_RIGHT;
	}

	@Override
	public Sprite getQuoteL() {
		return QUOTE_LEFT;
	}

	@Override
	public Sprite getQuouteR() {
		return QUOTE_RIGHT;
	}

	@Override
	public Sprite getBackSlash() {
		return BACKSLASH;
	}

	@Override
	public Sprite getFrontSlash() {
		return FRONTSLASH;
	}

	@Override
	public Sprite getSemiColon() {
		return SEMI_COLON;
	}

	@Override
	public Sprite getColon() {
		return COLON;
	}

	@Override
	public Sprite getSquareBrackedL() {
		return SQUARE_BRACKET_LEFT;
	}

	@Override
	public Sprite getSquareBrackedR() {
		return SQUARE_BRACKET_RIGHT;
	}

	@Override
	public Sprite getBraceL() {
		return BRACE_LEFT;
	}

	@Override
	public Sprite getBraceR() {
		return BRACE_RIGHT;
	}

	@Override
	public Sprite getEuro() {
		return EURO;
	}

	@Override
	public Sprite getDollar() {
		return DOLLAR;
	}

	@Override
	public Sprite getAt() {
		return AT;
	}

	@Override
	public Sprite getRoof() {
		return ROOF;
	}

	@Override
	public Sprite getAnd() {
		return AND;
	}

	@Override
	public Sprite getAstrix() {
		return ASTRIX;
	}

	@Override
	public Sprite getBracketL() {
		return BRACKET_LEFT;
	}

	@Override
	public Sprite getBracketR() {
		return BRACKET_RIGHT;
	}

	@Override
	public Sprite getMinus() {
		return MINUS;
	}

	@Override
	public Sprite getUnderScore() {
		return UNDER_SCORE;
	}

	@Override
	public Sprite getEquals() {
		return EQUALS;
	}

	@Override
	public Sprite getPlus() {
		return PLUS;
	}

	@Override
	public Sprite getTilde() {
		return TILDE;
	}

	@Override
	public Sprite get0() {
		return ZERO;
	}

	@Override
	public Sprite get1() {
		return ONE;
	}

	@Override
	public Sprite get2() {
		return TWO;
	}

	@Override
	public Sprite get3() {
		return THREE;
	}

	@Override
	public Sprite get4() {
		return FOUR;
	}

	@Override
	public Sprite get5() {
		return FIVE;
	}

	@Override
	public Sprite get6() {
		return SIX;
	}

	@Override
	public Sprite get7() {
		return SEVEN;
	}

	@Override
	public Sprite get8() {
		return EIGHT;
	}

	@Override
	public Sprite get9() {
		return NINE;
	}

	@Override
	public Sprite getNull() {
		return NULL;
	}

	@Override
	public Sprite getExclamation() {
		return EXCLAMATION;
	}

	@Override
	public Sprite getArrowL() {
		return ARROWL;
	}

	@Override
	public Sprite getArrowR() {
		return ARROWR;
	}

	@Override
	public Sprite getCheckBox() {
		return CHECK_BOX;
	}

	@Override
	public Sprite getCheckMark() {
		return CHECK_MARK;
	}
	
}
