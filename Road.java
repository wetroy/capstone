import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Write a description of class Road here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Road
{
    /** xLeft     the x point where the left side of the road starts to be drawn */
    private int xLeft;
    /** the y point where the top of the road starts to be drawn */    
    private int yTop;
    
    private Color lines;
    
    private Color pavement;
    
    private int length;
    private int height;
    /**
     * The constructor for objects of class Road
     * @param x     the x point where the left side of the road starts to be drawn
     * @param y     the y point where the top of the road starts to be drawn
     */
    public Road(int x, int y, Color l, Color p, int len, int h)
    {
        xLeft = x;
        yTop = y;
        lines = l;
        pavement = p;
        length = len;
        height = h;
    }

    /**
     * creates the road with its color, size, coordinates, and dashed lines
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double road1 = new Rectangle2D.Double(xLeft,yTop,500,500);
        g2.setPaint(pavement);
        g2.fillRect(xLeft,yTop, length,height);
        g2.setPaint(lines);
        int top = ((height / 2) - 10);
        for (int i = 1; i<12;i++){
            g2.fillRect(xLeft + 20, yTop + top, 70, 20);
            xLeft = xLeft  + 90;
        }
    }

}
