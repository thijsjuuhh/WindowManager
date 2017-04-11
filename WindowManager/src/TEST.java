import com.thijsjuuhh.WM.Window;
import com.thijsjuuhh.WM.components.Button;
import com.thijsjuuhh.WM.components.CheckBox;
import com.thijsjuuhh.WM.components.listeners.ButtonListener;
import com.thijsjuuhh.WM.graphics.StandardGraphics;

public class TEST {
	private static int w = 800, h = 600;
	private static Window wi;
	private static boolean running = true;

	private static ButtonListener l = new ButtonListener() {

		@Override
		public void insideButton() {
			// TODO Auto-generated method stub

		}

		@Override
		public void buttonLeft() {
		}

		@Override
		public void buttonEntered() {
		}

		@Override
		public void buttonClicked() {
		}
	};

	public static void main(String[] args) {

		wi = new Window(w, h, "TEST").setDefaultCloseOperation(3)
				.add(new Button("Niels", "Niels", 80, 80, 0xffffff, 0xaaaaaa, 2.0, l))
				.add(new Button("Barry", "Barry", 80, 170, 0xff8b4513, 0xaaaaaa, 3.0, l))
				.add(new Button("Stijn", "Stijn", 80, 280, 0xffffff, 0xaaaaaa, 4.0, l).setClickColor(0xffd700))
				.add(new Button("Thijs", "Thijs", 80, 440, 0xffffff, 0xaaaaaa, 5.0, l).setClickColor(0xdddddd))
				.add(new CheckBox("CheckMe", "Check me", 500, 80, false, 0.5, new StandardGraphics()))
				
				
				;
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (running) {
					wi.render();
					wi.update();
				}
			}
		}).start();
	}

}
