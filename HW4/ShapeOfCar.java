import java.awt.*;

import java.awt.geom.*;
import java.util.*;

public class ShapeOfCar implements MovingShape {
	
	    double decreaseBy = 2;
	    double increaseBy = 2;
	    private int x;
	    private int y;
	    private int width;
	
	public ShapeOfCar(int x, int y, int width)
	{
		this.x = x;
        this.y = y;
        this.width = width;
	}

	public void move(double x_move, double y_move)
    {
		   x += x_move;
		   y += y_move;
    }

    /**
     * Decreases the width 
     */
    public void decreaseWidth(){
        width = (int) (width/decreaseBy);
    }

    /**
     * increases the width
     */
    public void increaseWidth(){
        width = (int) (width * increaseBy);
    }

    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body
                = new Rectangle2D.Double(x, y + width / 6,
                width - 1, width / 6);
        
        g2.draw(body);
        
        
        Ellipse2D.Double frontWheel
        
                = new Ellipse2D.Double(x + width / 6, y + width / 3,
                width / 6, width / 6);
        
        g2.draw(frontWheel);
        
        
        Ellipse2D.Double rearWheel
                = new Ellipse2D.Double(x + width * 2 / 3, y + width / 3,
                width / 6, width / 6);

        g2.draw(rearWheel);
        
        Point2D.Double r1
                = new Point2D.Double(x + width / 6, y + width / 6);
        //  roof
        Point2D.Double r2
                = new Point2D.Double(x + width / 3, y);
        // roof
        Point2D.Double r3
                = new Point2D.Double(x + width * 2 / 3, y);
        // The bottom 
        Point2D.Double r4
                = new Point2D.Double(x + width * 5 / 6, y + width / 6);
        
        
        
        Line2D.Double frontWindshield
        
                = new Line2D.Double(r1, r2);
        
        g2.draw(frontWindshield);
        
        Line2D.Double roofTop
                = new Line2D.Double(r2, r3);
        
        g2.draw(roofTop);
        
        Line2D.Double rearWindshield
                = new Line2D.Double(r3, r4);

       
       
       
       
       
        g2.draw(rearWindshield);
    }

}
