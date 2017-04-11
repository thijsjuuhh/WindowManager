package com.thijsjuuhh.WM.components;

import java.util.ArrayList;

import com.thijsjuuhh.WM.Window;
import com.thijsjuuhh.WM.graphics.Render;

public class Panel extends Component {

	private ArrayList<Component> c = new ArrayList<Component>();

	public Panel(Window w) {
		super(w);
	}

	@Override
	public void render() {
		r.renderAll(c);
	}

	@Override
	public void update() {
	}

	public void setRender(Render r) {
		this.r = r;
	}

	public void add(Component c) {
		this.c.add(c);
		c.r = r;
	}

}
