package com.thijsjuuhh.WM;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.thijsjuuhh.WM.components.Component;
import com.thijsjuuhh.WM.components.Panel;
import com.thijsjuuhh.WM.controlls.Controlls;
import com.thijsjuuhh.WM.controlls.Keys;
import com.thijsjuuhh.WM.graphics.Render;

public class Window {

	private JFrame frame;

	private int width;
	private int height;

	private String title;

	private Render r;

	public Panel p;

	public Window(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
		frame = new JFrame(title);
		frame.setSize(new Dimension(width, height));
		frame.setVisible(true);

		Controlls c = new Controlls(this);
		frame.addKeyListener(c);
		frame.addMouseListener(c);
		frame.addMouseMotionListener(c);

		p = new Panel(this);

		r = new Render().init(width, height, p, this);
		frame.setResizable(false);
	}

	public Window(int width, int height) {
		this(width, height, "");
	}

	// Setters
	public Window setOriginalSize() {
		frame.setSize(width, height);
		return this;
	}

	public Window setSize(int width, int height) {
		frame.setSize(width, height);
		return this;
	}

	public Window setDefaultCloseOperation(int o) {
		frame.setDefaultCloseOperation(o);
		return this;
	}

	public Window setResizable(boolean r) {
		frame.setResizable(r);
		return this;
	}

	public Window setVisible(boolean v) {
		frame.setVisible(v);
		return this;
	}

	public Window setLocation(int x, int y) {
		frame.setLocation(x, y);
		return this;
	}

	public Window setLocationRelativeTo(java.awt.Component c) {
		frame.setLocationRelativeTo(c);
		return this;
	}

	public Window setUndecorated(boolean u) {
		frame.setUndecorated(u);
		return this;
	}

	public Window setTitle(String title) {
		frame.setTitle(title);
		return this;
	}

	public Window setOriginalTitle() {
		return setTitle(title);
	}

	// Getters
	public int getWidth() {
		return frame.getWidth();
	}

	public int getHeight() {
		return frame.getHeight();
	}

	public int getOriginalWidth() {
		return width;
	}

	public int getOriginalHeight() {
		return height;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void render() {
		r.render(this);
	}

	public void update() {
		Keys.update();
		r.update();
	}

	public Window add(Component c) {
		p.add(c);
		return this;
	}

	public Render getRenderer() {
		return r;
	}

}
