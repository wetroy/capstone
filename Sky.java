import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A sky for the backround of the window that can be places anywhere in the window
 * 
 * @author Billy Troy
 * @version 4/14/15
 */
public class Sky
{
    /** xLeft     the x point where the left side of the sky starts to be drawn */
    private int xLeft;
    /** the y point where the top of the sky starts to be drawn */    
    private int yTop;
    /** the color the sky will be */
    private Color color;
    /**
     * The constructor for objects of class Sky
     * @param x     the x point where the left side of the sky starts to be drawn
     * @param y     the y point where the top of the sky starts to be drawn
     * @param c     the color the sky will be drawn as
     */
    public Sky(int x, int y, Color c)
    {
        xLeft = x;
        yTop = y;
        color = c;
    }

    /**
     * creates the Sky with its color, size, and coordinates
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky1 = new Rectangle2D.Double(xLeft,yTop,500,500);
        g2.setPaint(color);
        g2.fillRect(xLeft,yTop, 1200,280);
    }

}
