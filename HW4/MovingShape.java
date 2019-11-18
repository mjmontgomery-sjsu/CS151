
import java.awt.*;

public interface MovingShape {
	
	/**
    Draws the shape.
     @param g2 the graphics context
  */
  void draw(Graphics2D g2);
  /**
     Moves the shape.
     It is up to the shape to move itself, for example by tracking the time since 
     its last movement, its position, and velocity.
  */
  void move(double x_move, double y_move);	

}
