package com.thijsjuuhh.WM.components;

import com.thijsjuuhh.WM.components.listeners.ButtonListener;
import com.thijsjuuhh.WM.controlls.Keys;
import com.thijsjuuhh.WM.graphics.Sprite;
import com.thijsjuuhh.WM.graphics.SpriteLoader;
import com.thijsjuuhh.WM.graphics.StandardGraphics;

public class Button extends Component {

	private int normal_color;
	private int lit_color;

	int[] ctc = { 0xffff00fe };
	int[] ctct = new int[1];

	private final Sprite left;
	private final Sprite middle;
	private final Sprite right;

	private double scale;

	private ButtonListener l;
	private SpriteLoader s;

	private boolean button = true;
	private boolean first = true;
	private String text;

	private int cc = 0xffffffff;
	
	public Button(String name, String text, int x, int y, int normal_color, int lit_color, SpriteLoader s, double scale, ButtonListener l) {
		super(name, x, y);
		this.text = text;
		this.normal_color = normal_color;
		this.lit_color = lit_color;
		this.scale = scale;
		this.s = s;
		ctct[0] = normal_color;
		left = s.getButtonSprites()[0].scale(scale);
		middle = s.getButtonSprites()[1].scale(scale);
		right = s.getButtonSprites()[2].scale(scale);
		this.l = l;
	}

	public Button(String name, String text, int x, int y, int normal_color, int lit_color, double scale, ButtonListener l) {
		this(name, text, x, y, normal_color, lit_color, new StandardGraphics(), scale, l);
	}

	public Button setClickColor(int col) {
		this.cc = col;
		return this;
	}
	
	
	@Override
	public void render() {

		int xMin = (int) (x + 6.5 * scale);
		int yMin = (int) (y + 2 * scale);
		int xMax = (int) (x + 89 * scale);
		int yMax = (int) (y + 30 * scale);

		if (left == null || right == null || middle == null || r == null)
			return;

		r.renderSprite(left, x, y, 0xffff00ff, ctc, ctct);
		r.renderSprite(middle, x + left.getWidth(), y, 0xffff00ff, ctc, ctct);
		r.renderSprite(right, x + left.getWidth() + middle.getWidth(), y, 0xffff00ff, ctc, ctct);

		r.renderText(text, xMin, yMin, xMax, yMax, scale * 0.6, s);

		if (Keys.mouseInside(xMin, xMax, yMin, yMax)) {
			l.insideButton();
			ctct[0] = lit_color;
			if (button) {
				l.buttonEntered();
				button = !button;
			}
			if (Keys.left_click) {
				if (first) {
					l.buttonClicked();
					first = false;
				}
				ctct[0] = cc;
			} else {
				first = true;
			}

		} else
		{
			if (!button) {
				l.buttonLeft();
				button = !button;
			}
			ctct[0] = normal_color;
		}

	}

	@Override
	public void update() {
	}

}
