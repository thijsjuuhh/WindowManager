package com.thijsjuuhh.WM.graphics;

import com.thijsjuuhh.WM.math.Location;

class Text {

	Sprite[] sprites;
	Location[] locations;
	int x, y, w, h;
	String text;

	private static String lower;
	private static String higher;
	private static String smaller;
	private static String numbers;
	private static String bigger;

	private int s;
	private int sw;
	private int bw;
	private int b;
	private int l;
	private int u;
	private int space;
	private int normalwidth;
	private int n;

	Text(String text, int x, int y, double factor, SpriteLoader l) {
		this.text = text;
		this.x = x;
		this.y = y;

		sprites = getText(text, l, factor);
		setLocations(factor);
	}

	int getX() {
		return x;
	}

	int getY() {
		return y;
	}

	int getWidth() {
		return w;
	}

	int getHeight() {
		return h;
	}

	void setLocations(double factor) {
		if (sprites.length <= 0)
			try {
				throw new Exception("The string does not have any characters!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		s = 8;
		sw = 19;
		bw = 26;
		b = -4;
		l = 4;
		u = 4;
		space = 22;
		normalwidth = 23;
		n = -4;

		numbers = "0123456789";
		bigger = "ABGHKMNOPQRSVWamowvksndhgey";
		lower = "gjpqy,;";
		higher = "";
		smaller = "Iijlrt?";

		locations = new Location[text.length()];
		int xP = w = x;
		int yP = h = y;

		for (int i = 0; i < sprites.length; i++) {
			boolean xSet = false;
			char c = text.charAt(i);
			if (c == ' ') {
				xP += space * factor;
				continue;
			}
			for (int j = 0; j < lower.length(); j++) {
				if (lower.charAt(j) == c) {
					yP += l * factor;
					if (c == 'g')
						yP += 2;
				}

			}
			for (int j = 0; j < higher.length(); j++) {
				if (higher.charAt(j) == c) {
					yP -= u * factor;
				}
			}
			for (int j = 0; j < smaller.length(); j++) {
				if (smaller.charAt(j) == c) {
					xP -= s * factor;
				}
			}
			for (int j = 0; j < bigger.length(); j++) {
				if (bigger.charAt(j) == c) {
					xP += b * factor;
					if (c == 'm' || c == 'w' || c == 'M' || c == 'W') {
						xP += 4;
					}
				}
			}
			for (int j = 0; j < numbers.length(); j++) {
				if (numbers.charAt(j) == c) {
					xP += n * factor;
				}
			}
			locations[i] = new Location(xP, yP);
			for (int j = 0; j < lower.length(); j++) {
				if (lower.charAt(j) == c) {
					yP -= l * factor;
					if (c == 'g')
						yP -= 2;
				}
			}
			for (int j = 0; j < higher.length(); j++) {
				if (higher.charAt(j) == c) {
					yP += u * factor;
				}
			}
			for (int j = 0; j < smaller.length(); j++) {
				if (smaller.charAt(j) == c) {
					xP += sw * factor;
					xSet = true;
				}
			}
			for (int j = 0; j < bigger.length(); j++) {
				if (bigger.charAt(j) == c) {
					xP += bw * factor;
					if (c == 'm' || c == 'w' || c == 'M' || c == 'W') {
						xP += 4 * factor;
					}
					xSet = true;
				}
			}
			if (xSet)
				continue;
			xP += normalwidth * factor;
		}
		w = xP;
		h = sprites[0].getHeight();

	}

	private Sprite[] getText(String text, SpriteLoader s, double factor) {
		Sprite[] sprites = new Sprite[text.length()];
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			switch (c) {
			case ' ':
				sprites[i] = null;
				break;
			case 'A':
				sprites[i] = s.getA();
				break;
			case 'B':
				sprites[i] = s.getB();
				break;
			case 'C':
				sprites[i] = s.getC();
				break;
			case 'D':
				sprites[i] = s.getD();
				break;
			case 'E':
				sprites[i] = s.getE();
				break;
			case 'F':
				sprites[i] = s.getF();
				break;
			case 'G':
				sprites[i] = s.getG();
				break;
			case 'H':
				sprites[i] = s.getH();
				break;
			case 'I':
				sprites[i] = s.getI();
				break;
			case 'J':
				sprites[i] = s.getJ();
				break;
			case 'K':
				sprites[i] = s.getK();
				break;
			case 'L':
				sprites[i] = s.getL();
				break;
			case 'M':
				sprites[i] = s.getM();
				break;
			case 'N':
				sprites[i] = s.getN();
				break;
			case 'O':
				sprites[i] = s.getO();
				break;
			case 'P':
				sprites[i] = s.getP();
				break;
			case 'Q':
				sprites[i] = s.getQ();
				break;
			case 'R':
				sprites[i] = s.getR();
				break;
			case 'S':
				sprites[i] = s.getS();
				break;
			case 'T':
				sprites[i] = s.getT();
				break;
			case 'U':
				sprites[i] = s.getU();
				break;
			case 'V':
				sprites[i] = s.getV();
				break;
			case 'W':
				sprites[i] = s.getW();
				break;
			case 'X':
				sprites[i] = s.getX();
				break;
			case 'Y':
				sprites[i] = s.getY();
				break;
			case 'Z':
				sprites[i] = s.getZ();
				break;
			case 'a':
				sprites[i] = s.geta();
				break;
			case 'b':
				sprites[i] = s.getb();
				break;
			case 'c':
				sprites[i] = s.getc();
				break;
			case 'd':
				sprites[i] = s.getd();
				break;
			case 'e':
				sprites[i] = s.gete();
				break;
			case 'f':
				sprites[i] = s.getf();
				break;
			case 'g':
				sprites[i] = s.getg();
				break;
			case 'h':
				sprites[i] = s.geth();
				break;
			case 'i':
				sprites[i] = s.geti();
				break;
			case 'j':
				sprites[i] = s.getj();
				break;
			case 'k':
				sprites[i] = s.getk();
				break;
			case 'l':
				sprites[i] = s.getl();
				break;
			case 'm':
				sprites[i] = s.getm();
				break;
			case 'n':
				sprites[i] = s.getn();
				break;
			case 'o':
				sprites[i] = s.geto();
				break;
			case 'p':
				sprites[i] = s.getp();
				break;
			case 'q':
				sprites[i] = s.getq();
				break;
			case 'r':
				sprites[i] = s.getr();
				break;
			case 's':
				sprites[i] = s.gets();
				break;
			case 't':
				sprites[i] = s.gett();
				break;
			case 'u':
				sprites[i] = s.getu();
				break;
			case 'v':
				sprites[i] = s.getv();
				break;
			case 'w':
				sprites[i] = s.getw();
				break;
			case 'x':
				sprites[i] = s.getx();
				break;
			case 'y':
				sprites[i] = s.gety();
				break;
			case 'z':
				sprites[i] = s.getz();
				break;
			case '.':
				sprites[i] = s.getDot();
				break;
			case ',':
				sprites[i] = s.getComma();
				break;
			case '?':
				sprites[i] = s.getQuestionMark();
				break;
			case '\'':
				sprites[i] = s.getSingleQuoteL();
				break;
			case '"':
				sprites[i] = s.getQuoteL();
				break;
			case '\\':
				sprites[i] = s.getBackSlash();
				break;
			case '/':
				sprites[i] = s.getFrontSlash();
				break;
			case ';':
				sprites[i] = s.getSemiColon();
				break;
			case ':':
				sprites[i] = s.getColon();
				break;
			case '[':
				sprites[i] = s.getSquareBrackedL();
				break;
			case ']':
				sprites[i] = s.getSquareBrackedR();
				break;
			case '{':
				sprites[i] = s.getBraceL();
				break;
			case '}':
				sprites[i] = s.getBraceR();
				break;
			case '€':
				sprites[i] = s.getEuro();
				break;
			case '$':
				sprites[i] = s.getDollar();
				break;
			case '@':
				sprites[i] = s.getAt();
				break;
			case '^':
				sprites[i] = s.getRoof();
				break;
			case '&':
				sprites[i] = s.getAnd();
				break;
			case '*':
				sprites[i] = s.getAstrix();
				break;
			case '(':
				sprites[i] = s.getBracketL();
				break;
			case ')':
				sprites[i] = s.getBracketR();
				break;
			case '-':
				sprites[i] = s.getMinus();
				break;
			case '_':
				sprites[i] = s.getUnderScore();
				break;
			case '=':
				sprites[i] = s.getEquals();
				break;
			case '+':
				sprites[i] = s.getPlus();
				break;
			case '~':
				sprites[i] = s.getTilde();
				break;
			case '0':
				sprites[i] = s.get0();
				break;
			case '1':
				sprites[i] = s.get1();
				break;
			case '2':
				sprites[i] = s.get2();
				break;
			case '3':
				sprites[i] = s.get3();
				break;
			case '4':
				sprites[i] = s.get4();
				break;
			case '5':
				sprites[i] = s.get5();
				break;
			case '6':
				sprites[i] = s.get6();
				break;
			case '7':
				sprites[i] = s.get7();
				break;
			case '8':
				sprites[i] = s.get8();
				break;
			case '9':
				sprites[i] = s.get9();
				break;
			case '!':
				sprites[i] = s.getExclamation();
				break;
			case '<':
				sprites[i] = s.getArrowL();
				break;
			case '>':
				sprites[i] = s.getArrowR();
				break;
			default:
				sprites[i] = s.getNull();
				break;
			}
			if (sprites[i] != null)
				sprites[i] = sprites[i].scale(factor);
		}
		return sprites;
	}

}
