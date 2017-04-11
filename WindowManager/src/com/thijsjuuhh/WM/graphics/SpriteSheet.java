package com.thijsjuuhh.WM.graphics;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class SpriteSheet {

	private int w, h;
	private String path;
	public int[] pixels;
	public boolean square;
	public SpriteSheet(String path, boolean square) {
		this.path = path;
		this.square = square;
		load();
	}

	private void load() {
		try {
			System.out.print("Trying to load: " + path + " : ");
			BufferedImage img = ImageIO.read(SpriteSheet.class.getResource(path));
			w = img.getWidth();
			h = img.getHeight();
			pixels = new int[w * h];
			img.getRGB(0, 0, w, h, pixels, 0, w);
			System.out.println("Succeded!");
		} catch (Exception e) {
			System.err.println("FAILED!");
			e.printStackTrace();
		}
	}

	public int getWidth() {
		return w;
	}

	public int getHeight() {
		return h;
	}

}
