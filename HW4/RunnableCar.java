import javax.swing.JLabel;

public class RunnableCar implements Runnable {

	
	private int delay;
	private ShapeOfCar shape;
	private JLabel label;
	
	public RunnableCar(int delay, final ShapeOfCar shape, final JLabel label) {
		this.shape = shape;
		this.label = label;
		this.delay = delay;
	}

	@Override
	public void run() {
		try {
			while (true) {
				shape.move(1, 0);
				label.repaint();
				Thread.sleep(delay);
			}
		} catch (InterruptedException exception) {
	
		}
		
	}
}
