import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.util.Random;

/**
 * The space that goes in the sky
 * 
 * @author Billy
 * @version 10/1/14
 */
public class Space
{
    /** xLeft     the x point where the left side of the moon starts to be drawn */
    private int xLeft;
    /** the y point where the top of the moon starts to be drawn */    
    private int yTop;
    /** the main color of the moon or sun */
    private Color main;
    /** if it is drawing a moon this will create the color of the craters */
    private Color secondary;
    /** this is the color that the stars will be if it is night time */
    private Color stars;
    /**
     * The constructor for objects of class Moon
     * @param x     the x point where the left side of the moon/sun starts to be drawn
     * @param y     the y point where the top of the moon/sun starts to be drawn
     * @param m     the main color of the moon or sun
     * @param s     if it is drawing a moon this will create the color of the craters
     * @param star  this is the color that the stars will be if it is night time
     */
    public Space(int x, int y, Color m, Color s, Color star)
    {
        xLeft = x;
        yTop = y;
        main = m;
        secondary = s;
        stars = star;
    }

    /**
     * creates the spaceon with its various objects and colors 
     *
     * @param    g2    a graphics object that is imported 
     */
    public void draw(Graphics2D g2)
    {
        Random randomGenerator = new Random();
        Ellipse2D.Double object = new Ellipse2D.Double(xLeft, yTop, 50,50);
        g2.setPaint(stars);
        int randomNum = randomGenerator.nextInt(20) + 10;
        for(int i = 0; i < randomNum; i++)
        {
            int randomX = randomGenerator.nextInt(1200);
            int randomY = randomGenerator.nextInt(280);
            g2.fillArc(randomX, randomY, 5,5,0,360);
        }
        g2.setPaint(main);
        g2.fillArc(xLeft,yTop,75,75,0,360);
        g2.setPaint(secondary);
        g2.fillArc(xLeft + 45, yTop + 10,10,10, 0, 360);
        g2.fillArc(xLeft + 20, yTop + 15,15,15, 0, 360);
        g2.fillArc(xLeft + 55, yTop + 50,10,10, 0, 360);
        g2.fillArc(xLeft + 35, yTop + 45,12,12, 0, 360);
    }

}
