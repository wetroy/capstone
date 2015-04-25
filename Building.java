import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.util.Random;

/**
 * A building with a customizable color that can be put anywhere in the window
 * 
 * @author Billy Troy 
 * @version 4/24/15
 */
public class Building
{
    /** xLeft     the x point where the left side of the building starts to be drawn */
    private int xLeft;
    /** the y point where the top of the building starts to be drawn */    
    private int yTop;
    /** the height the building will be */
    private int height;
    /** the width the building will be */
    private int width;
    /** the color the building will be */
    private Color color;
    /**
     * The constructor for objects of class Building
     * @param x     the x point where the left side of the building starts to be drawn
     * @param y     the y point where the top of the building starts to be drawn
     * @param w     the width the building will be
     * @param h     the height the building will be
     * @param c     the color the building will be
     */
    public Building(int x1, int y1, int w, int h, Color c)
    {
        xLeft = x1;
        yTop = y1;
        width = w;
        height = h;
        color = c;
    }

    /**
     * creates the building with its color, size, coordinates, and windows
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Random randomGenerator = new Random();
        Rectangle2D.Double building1 = new Rectangle2D.Double(xLeft,yTop,50,50);
        g2.setPaint(color);
        //int width = xRight - xLeft;
        //int height = yBottom - yTop;
        g2.fillRect(xLeft,yTop, width,height);
        g2.setPaint(Color.lightGray);
        for (int i = 1; i< width / 20 ;i++){
            xLeft = xLeft + 17;
            int randomH = randomGenerator.nextInt(7);
            int times = 0;
            if(randomH == 1)
            {
                g2.setPaint(Color.yellow);
                g2.fillRect(xLeft, yTop + 20, 10,10);
                g2.setPaint(Color.lightGray);
            }
            else
            {
                g2.fillRect(xLeft, yTop + 20, 10,10);
            }
            for (int j = 1; j<height / 20 ;j++)
            {
                yTop = yTop + 20;
                times++;
                int randomV = randomGenerator.nextInt(7);
                if(randomV == 1)
                {
                    g2.setPaint(Color.yellow);
                    g2.fillRect(xLeft, yTop, 10,10);
                    g2.setPaint(Color.lightGray);
                }
                else
                {
                    g2.fillRect(xLeft, yTop, 10,10);
                }
            }
            yTop = yTop - (times * 20);
        }

    }

}
