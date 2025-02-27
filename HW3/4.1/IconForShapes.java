
import java.awt.*;


import java.util.*;
import javax.swing.*;

public class IconForShapes implements Icon {
	 private int width;
     private int height;
     private MovingShape shape;
	
	public IconForShapes(MovingShape shape, int width, int height)
	{
		 this.shape = shape;
	        this.width = width;
	        this.height = height;
	}
	
	public int getIconWidth()
    {
       return width;
    }
 
    public int getIconHeight()
    {
       return height;
    }
 
    public void paintIcon(Component c, Graphics g, int x, int y)
    {
       Graphics2D g2 = (Graphics2D) g;
       shape.draw(g2);
    }
	
	
	

}
