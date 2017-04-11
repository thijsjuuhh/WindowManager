package com.thijsjuuhh.WM.components;

import com.thijsjuuhh.WM.Window;
import com.thijsjuuhh.WM.graphics.Render;

public abstract class Component {

	protected String name;
	protected int x, y;
	protected boolean enabled;

	protected Render r;
	protected Window w;
	
	protected Component(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
	}

	protected Component(Window w) {
		r = w.getRenderer();
	}

	public String getName() {
		return name;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public abstract void render();

	public abstract void update();

}
