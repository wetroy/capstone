import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.awt.Polygon;

/**
 * Write a description of class House here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class House
{
    /** xLeft     the x point where the left side of the building starts to be drawn */
    private int xLeft;
    /** the y point where the top of the building starts to be drawn */    
    private int yTop;
    /** the color the building will be */
    private Color color;
    /**
     * The constructor for objects of class Building
     * @param x     the x point where the left side of the building starts to be drawn
     * @param y     the y point where the top of the building starts to be drawn
     * @param c     the color the building will be
     */
    public House(int x, int y, Color c)
    {
        xLeft = x;
        yTop = y;
        color = c;
    }

    /**
     * creates the building with its color, size, coordinates, and windows
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        int[] xPoints = {xLeft + 30, xLeft + 70, xLeft - 10};
        int[] yPoints = {yTop - 30, yTop , yTop };
        
        Polygon top = new Polygon(xPoints, yPoints, 3);
        g2.setPaint(color);
        g2.fillPolygon(xPoints, yPoints, 3);
        
        Rectangle2D.Double base = new Rectangle2D.Double(xLeft,yTop,50,50);
        g2.fillRect(xLeft,yTop, 60,40);
        
        g2.setPaint(Color.lightGray);
        g2.fillRect(xLeft + 10, yTop + 15, 10,10);
        g2.fillRect(xLeft + 40, yTop + 15, 10,10);
        
        g2.setPaint(Color.orange);
        g2.fillRect(xLeft + 25, yTop + 20, 10, 20);
    }

}

