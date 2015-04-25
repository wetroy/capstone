import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.geom.Rectangle2D;

/**
 * A UfO with a beam coming down that can be put anywhere in the window
 * 
 * @author Billy Troy
 * @version 4/24/15
 */
public class UFO
{
    /** xLeft     the x point where the left side of the UFO starts to be drawn */
    private int xLeft;
    /** the y point where the top of the UFO starts to be drawn */    
    private int yTop;
    /**
     * The constructor for objects of class UFO
     * @param x     the x point where the left side of the UFO starts to be drawn
     * @param y     the y point where the top of the UFO starts to be drawn
     */
    public UFO(int x, int y)
    {
        xLeft = x;
        yTop = y;
    }

    /**
     * creates the UFO with its color, size, coordinates, window, and beam
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        int[] xPoints = {xLeft + 40, xLeft + 110, xLeft - 30};
        int[] yPoints = {yTop, yTop + 155, yTop + 155};
        
        Polygon ray1 = new Polygon(xPoints, yPoints, 3);
        g2.setPaint(Color.lightGray);
        g2.fillPolygon(xPoints, yPoints, 3);
        
        Ellipse2D.Double ufo1 = new Ellipse2D.Double(xLeft, yTop, 80,30);
        g2.setPaint(Color.gray);
        g2.fillArc(xLeft,yTop,80,30,0,360);        
        g2.fillArc(xLeft + 30,yTop - 10,20,20,0,360);
        
        Rectangle2D.Double window = new Rectangle2D.Double(xLeft,yTop,80,30);
        g2.setPaint(Color.green);
        g2.fillRect(xLeft + 35, yTop - 5, 10,10);
        g2.setPaint(Color.yellow);
        g2.fillRect(xLeft + 37, yTop - 2, 6,6);
        
    }


}
