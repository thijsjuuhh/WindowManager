package com.thijsjuuhh.WM.components;

import com.thijsjuuhh.WM.controlls.Keys;
import com.thijsjuuhh.WM.graphics.Sprite;
import com.thijsjuuhh.WM.graphics.SpriteLoader;

public class CheckBox extends Component {

	private int[] ctc = { 0xffff00fe };
	private int[] ctct = { 0xffdddddd };

	private int[] ctcm = { 0xffff00fe, 0xffff00fd, 0xffff00fc };
	private int[] ctctm = { 0xff009edd, 0xff007cbb, 0xff005aaa };

	private String text;
	private boolean checked, toggled = false;
	private SpriteLoader l;

	private double factor = 1.0;

	private Sprite c, m;

	public CheckBox(String name, String text, int x, int y, boolean checked, double factor, SpriteLoader l) {
		super(name, x, y);
		this.text = text;
		this.checked = checked;
		this.l = l;
		c = l.getCheckBox().scale(factor);
		m = l.getCheckMark().scale(factor);
		this.factor = factor;
	}

	public void toggle() {
		checked = !checked;
	}

	@Override
	public void render() {

		int xMin = (int) (x);
		int yMin = (int) (y);
		int xMax = (int) (x + c.getWidth());
		int yMax = (int) (y + c.getHeight());
		r.renderSprite(c, x, y, 0xffff00ff, ctc, ctct);
		r.renderText(text, (int) (xMax + 2 * factor), (int) (yMax - c.getHeight() * 0.6), factor * 0.6, l);
		
		if (checked) {
			r.renderSprite(m, x, y, 0xffff00ff, ctcm, ctctm);
		}
		if (Keys.mouseInside(xMin, xMax, yMin, yMax)) {
			if (Keys.left_click && !toggled) {
				toggle();
				toggled = true;
			} else if(!Keys.left_click){
				toggled = false;
			}
		}
	}

	public boolean getCheked() {
		return checked;
	}
	
	@Override
	public void update() {
	}

}
