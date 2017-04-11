package com.thijsjuuhh.WM.graphics;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.ArrayList;

import com.thijsjuuhh.WM.Window;
import com.thijsjuuhh.WM.components.Component;
import com.thijsjuuhh.WM.components.Panel;

public class Render {

	private BufferedImage img;

	private int WIDTH, HEIGHT;
	private int[] pixels;

	private Window w;

	public Render init(int w, int h, Panel p, Window window) {
		WIDTH = w;
		HEIGHT = h;
		img = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) img.getRaster().getDataBuffer()).getData();
		this.w = window;
		window.p.setRender(this);
		return this;
	}

	public void update() {

	}

	public void renderSprite(Sprite s, int xPos, int yPos) {
		int[] xts = {};
		int[] xtst = {};
		renderSprite(s, xPos, yPos, 0, xts, xtst);
	}

	public void renderSprite(Sprite s, int xPos, int yPos, int alphaColor) {
		int[] xts = {};
		int[] xtst = {};
		renderSprite(s, xPos, yPos, alphaColor, xts, xtst);

	}

	public void renderColor(int xPos, int yPos, int w, int h, int c) {
		for (int y = yPos; y < yPos + h; y++) {
			for (int x = xPos; x < xPos + w; x++) {
				if (!inBounds(x, y))
					continue;
				pixels[x + y * WIDTH] = c;
			}
		}
	}

	public void renderSprite(Sprite s, int xPos, int yPos, int alphaColor, int[] colorsToSwap, int[] colorsToSwapTo) {
		for (int y = 0; y < s.getHeight(); y++) {
			int yP = y + yPos;
			for (int x = 0; x < s.getWidth(); x++) {
				int xP = x + xPos;
				int col = s.pixels[x + y * s.getWidth()];
				if (!inBounds(xP, yP))
					continue;
				if (col == alphaColor)
					continue;
				for (int i = 0; i < colorsToSwap.length; i++)
					if (col == colorsToSwap[i])
						col = colorsToSwapTo[i];
				pixels[xP + yP * WIDTH] = col;
			}
		}

	}

	public void renderText(String text, int x, int y, double factor, SpriteLoader s) {
		Text t = new Text(text, x, y, factor, s);
		for (int i = 0; i < t.sprites.length; i++) {
			if (t.sprites[i] == null)
				continue;
			renderSprite(t.sprites[i], t.locations[i].getX(), t.locations[i].getY(), 0xffff00ff);
		}
	}

	public void renderText(String text, int x, int y, int w, int h, double factor, SpriteLoader s) {
		Text t = new Text(text, x, y, factor, s);
		for (int i = 0; i < t.sprites.length; i++) {
			if (t.sprites[i] == null)
				continue;
			renderSprite(t.sprites[i], t.locations[i].getX() + w / 2 - t.getWidth() / 2, (int ) (t.locations[i].getY() + 2 * factor), 0xffff00ff);
		}
	}

	public void clear(int col) {
		for (int i = 0; i < pixels.length; i++)
			pixels[i] = col;
	}

	private boolean inBounds(int x, int y) {
		return (x > 0 && x <= WIDTH && y > 0 && y <= HEIGHT);
	}

	public void render(Window wi) {
		if (pixels == null)
			return;
		BufferStrategy bs = wi.getFrame().getBufferStrategy();
		if (bs == null) {
			wi.getFrame().createBufferStrategy(2);
			return;
		}

		Graphics g = bs.getDrawGraphics();
		clear(0xff);
		w.p.render();

		g.drawImage(img, 0, 0, WIDTH, HEIGHT, null);
		g.dispose();
		bs.show();

	}

	public void renderAll(ArrayList<Component> c) {
		for (Component com : c)
			com.render();
	}

	public void updateAll(ArrayList<Component> c) {
		for (Component com : c)
			com.update();
	}

}
