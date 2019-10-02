import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
/**
 An icon that has the shape of a circle
 */
public class PlanetIcon implements Icon
{
    /**
     Constructs a Circle icon of a given size.
     @param theSize the size of the icon
     */
    public PlanetIcon (int theSize, String clober)
    {
        size = theSize;
        this.clr = clober;
    }

    /**
     * Changes the color of the image
     * @param newColor of image.
     */
    public void changeColor(String newColor){
        this.clr = newColor;
    }

    public int getIconWidth()
    {
        return size;
    }

    public int getIconHeight()
    {
        return size;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y,
                size, size);


        if (clr.equals("blue")){
            g2.setColor(Color.BLUE);
        }
        else if (clr.equals("green")){
            g2.setColor(Color.GREEN);
        }
        else{
            g2.setColor(Color.RED);
        }
        g2.fill(planet);
    }
    private String clr;
    private int size;
}
