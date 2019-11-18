import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class hw4 {
	
	private static final int CARS_TO_SHOW_UP = 3;
	private static final int TIME_DELAY = 100;
	private static final int ICON_WIDTH = 300;
	private static final int ICON_HEIGHT = 100;
	private static final int CAR_WIDTH = 100;
	
	
	public static void main(String[] args)
	{
		        // The First Question Part A
				BankAccount Test1 = new BankAccount();

				Thread one = new Thread(Test1);
				Thread two = new Thread(Test1);
				System.out.println("Question 1A: ");
				one.setName("Steve");
				two.setName("Laurene");
				one.start();
				two.start();
				
				//The First Question Part B 
			//	System.out.println("\n" + "Question 1B: ");
				SynchronizedBankAccount Test2 = new SynchronizedBankAccount();
				Thread uno = new Thread(Test2);
		        Thread dos = new Thread(Test2);
		        uno.setName("Bill");
		        dos.setName("Melinda");
		        uno.start();
		        dos.start();
		        
		        
		        
		        //Question 2
		        JFrame frame = new JFrame();
				frame.setLayout(new FlowLayout());
				
				for (int i = 0; i < CARS_TO_SHOW_UP; i++) {
					ShapeOfCar shape = new ShapeOfCar(0, 0, CAR_WIDTH);
					IconForShapes icon = new IconForShapes(shape, ICON_WIDTH, ICON_HEIGHT);
					JLabel label = new JLabel(icon);
					frame.add(label);
					
					RunnableCar Testable = new RunnableCar((i + 1) * TIME_DELAY, shape, label);
					Thread t = new Thread(Testable);
					t.start();
					
					
					
				}
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
		
	}

}
