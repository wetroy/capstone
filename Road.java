import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * A road with a customizable color and dashed lines that can be places anywhere in the window
 * 
 * @author Billy Troy
 * @version 4/24/15
 */
public class Road
{
    /** xLeft     the x point where the left side of the road starts to be drawn */
    private int xLeft;
    /** the y point where the top of the road starts to be drawn */    
    private int yTop;
    /** the color the dashed lines will be */
    private Color lines;
    /** the main color of the road or pavement */
    private Color pavement;
    /** the length of the road */
    private int length;
    /** the height of the road */
    private int height;
    /**
     * The constructor for objects of class Road
     * @param x     the x point where the left side of the road starts to be drawn
     * @param y     the y point where the top of the road starts to be drawn
     * @param l     the color the dashed lines will be
     * @param p     the main color the road will be
     * @param len   the length the road will be
     * @param h     the height the road will be
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
