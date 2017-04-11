package com.thijsjuuhh.WM.graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class Sprite {

	private int x, y, w, h;
	private BufferedImage img;
	private SpriteSheet s;
	public int pixels[];

	public Sprite(int x, int y, int w, int h, SpriteSheet s) {
		this.x = x;
		this.y = y;
		if (s.square == true) {
			this.x = x * w;
			this.y = y * h;
		}
		this.w = w;
		this.h = h;
		this.s = s;

		pixels = new int[w * h];

		load();
	}

	public Sprite(BufferedImage img) {
		w = img.getWidth();
		h = img.getHeight();
		img.getRGB(0, 0, w, h, pixels, 0, w);
	}

	private Sprite(Sprite s, double f) {
		img = new BufferedImage((int) (s.w * f), (int) (s.h * f), BufferedImage.TYPE_INT_RGB);
		Image i = s.img.getScaledInstance((int) (s.w * f), (int) (s.h * f), BufferedImage.SCALE_DEFAULT);
		Graphics g = img.getGraphics();
		g.drawImage(i, 0, 0, null);
		g.dispose();
		w = img.getWidth();
		h = img.getHeight();
		pixels = new int[w * h];
		img.getRGB(0, 0, w, h, pixels, 0, w);
	}

	private void load() {
		for (int y = 0; y < h; y++)
			for (int x = 0; x < w; x++)
				pixels[x + y * w] = s.pixels[(this.x + +x) + (this.y + y) * s.getWidth()];

	}

	public int getHeight() {
		return h;
	}

	public int getWidth() {
		return w;
	}

	public Sprite scale(double d) {
		img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		img.setRGB(0, 0, w, h, pixels, 0, w);
		return new Sprite(this, d);
	}

}
