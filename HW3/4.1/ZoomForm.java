import javax.swing.*;

import java.awt.*;

public class ZoomForm {
	
	    private static final int IMAGE_WIDTH = 500;
	    private static final int IMAGE_HEIGHT = 500;
	    private static final int CAR_WIDTH = 70;
	    
	    public static void main (String[] args)
	    {
	    	
	    	JFrame frame = new JFrame();
	    	
	    	final MovingShape shape  = new ShapeOfCar(0, 0, CAR_WIDTH);
	    	
	    	 IconForShapes icon = new IconForShapes(shape,
	                 IMAGE_WIDTH, IMAGE_HEIGHT);
	    	
	    	 final JLabel label = new JLabel(icon);
	         frame.setLayout(new FlowLayout());
	         frame.add(label);

	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.pack();
	         frame.setVisible(true);

	         JButton zoomIn = new JButton("Zoom In"); //button to zoom in
	         JButton zoomOut = new JButton("Zoom Out"); //button to zoom out
	         
	         frame.add(zoomIn);
	         frame.add(zoomOut);

	         frame.pack();
	         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         frame.setVisible(true);

	         zoomIn.addActionListener(event -> {((ShapeOfCar) shape).increaseWidth();label.repaint();});
	         zoomOut.addActionListener(event -> {((ShapeOfCar) shape).decreaseWidth();label.repaint();});
	    }

}
