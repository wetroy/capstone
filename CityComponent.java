import java.awt.*;
import javax.swing.JPanel;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
/**
 * Write a description of class TreeComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityComponent extends JPanel 
{
    /** description of instance variable x (add comment for each instance variable) */

    private final int PANEL_WIDTH = 1000;
    private final int PANEL_HEIGHT = 1000;

    private int current;
    private int sky;
    private boolean space;
    private boolean ufo;
    Random randomGenerator = new Random();
    /**
     * Default constructor for objects of class TreeComponent
     */
    public CityComponent(int currentOrder, int s, boolean sp, boolean u)
    {
        current = currentOrder;
        sky = s;
        space = sp;
        ufo = u;
        setBackground (Color.black);
        setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
    }

    public void drawCity (int order, Graphics2D g2,int sky, boolean space, boolean ufo)
    {
        Color brown = new Color(156, 93, 82);
        Grass grass1 = new Grass(0,0, Color.green);
        Grass sidewalk = new Grass(0,300,Color.lightGray);
        Road dirt = new Road(0, 675, brown, brown, 1200, 150);

        House house1 = new House(440, 600, Color.blue);
        House house2 = new House(600, 600, Color.orange);
        House house3 = new House(280, 600, Color.cyan);
        House house4 = new House(120, 600, Color.pink);
        House house5 = new House(440, 400, Color.magenta);
        House house6 = new House(600, 400, Color.yellow);
        House house7 = new House(280, 400, Color.red);
        House house8 = new House(120, 400, Color.black);
        House house9 = new House(760, 400, Color.cyan);
        House house10 = new House(760, 600, Color.black);

        //Building smallBuilding1 = new Building(410,550, 80, 90, Color.blue);
        Building smallBuilding2 = new Building(570,550, 80, 90, Color.orange);
        Building smallBuilding3 = new Building(250,550, 80, 90, Color.cyan);
        Building smallBuilding4 = new Building(90,550, 80, 90, Color.pink);
        Building smallBuilding5 = new Building(410,350, 80, 90, Color.magenta);
        Building smallBuilding6 = new Building(570,350, 80, 90, Color.yellow);
        Building smallBuilding7 = new Building(250,350, 80, 90, Color.red);
        Building smallBuilding8 = new Building(90,350, 80, 90, Color.black);
        Building smallBuilding9 = new Building(730,350, 80, 90, Color.cyan);
        Building smallBuilding10 = new Building(730,550, 80, 90, Color.black);

        Building mediumBuilding2 = new Building(570,520, 100, 120, Color.orange);
        Building mediumBuilding3 = new Building(250,520, 100, 120, Color.cyan);
        Building mediumBuilding4 = new Building(90,520, 100, 120, Color.pink);
        Building mediumBuilding5 = new Building(410,320, 100, 120, Color.magenta);
        Building mediumBuilding6 = new Building(570,320, 100, 120, Color.yellow);
        Building mediumBuilding7 = new Building(250,320, 100, 120, Color.red);
        Building mediumBuilding8 = new Building(90,320, 100, 120, Color.black);
        Building mediumBuilding9 = new Building(730,320, 100, 120, Color.cyan);
        Building mediumBuilding10 = new Building(730,520, 100, 120, Color.black);

        Building largeBuilding2 = new Building(570,480, 120, 160, Color.orange);
        Building largeBuilding3 = new Building(250,480, 120, 160, Color.cyan);
        Building largeBuilding4 = new Building(90,480, 120, 160, Color.pink);
        Building largeBuilding5 = new Building(410,280, 120, 160, Color.magenta);
        Building largeBuilding6 = new Building(570,280, 120, 160, Color.yellow);
        Building largeBuilding7 = new Building(250,280, 120, 160, Color.red);
        Building largeBuilding8 = new Building(90,280, 120, 160, Color.black);
        Building largeBuilding9 = new Building(730,280, 120, 160, Color.cyan);
        Building largeBuilding10 = new Building(730,480, 120, 160, Color.black);

        if (order == 1)
        {
            grass1.draw(g2);
        }

        else if(order == 2)
        {
            grass1.draw(g2);

            house1.draw(g2);
        }

        else if(order == 3)
        {
            grass1.draw(g2);

            house1.draw(g2);

            dirt.draw(g2);
        }

        else if(order == 4)
        {
            grass1.draw(g2);

            dirt.draw(g2);

            house1.draw(g2);
            house2.draw(g2);
            house6.draw(g2);
        }

        else if(order == 5)
        {
            grass1.draw(g2);

            house1.draw(g2);
            house2.draw(g2);
            house3.draw(g2);
            house4.draw(g2);
            house5.draw(g2);
            house6.draw(g2);
            house7.draw(g2);
            house8.draw(g2);
            house9.draw(g2);
            house10.draw(g2);

            Road pave1 = new Road(0, 675, Color.black, Color.black, 1200, 150);
            Road smallPave1 = new Road(0, 458, Color.black, Color.black, 1200, 100);
            pave1.draw(g2);
            smallPave1.draw(g2);
        }

        else if(order == 6)
        {
            grass1.draw(g2);

            Road pave2 = new Road(0, 675, Color.yellow, Color.black, 1200, 150);
            Road smallPave2 = new Road(0, 458, Color.yellow, Color.black, 1200, 100);
            pave2.draw(g2);
            smallPave2.draw(g2);

            house1.draw(g2);
            house2.draw(g2);
            house3.draw(g2);
            house4.draw(g2);
            house5.draw(g2);
            house6.draw(g2);
            house7.draw(g2);
            smallBuilding8.draw(g2);
            house9.draw(g2);
            house10.draw(g2);
        }

        else if(order == 7)
        {
            grass1.draw(g2);

            Road pave2 = new Road(0, 675, Color.yellow, Color.black, 1200, 150);
            Road smallPave2 = new Road(0, 458, Color.yellow, Color.black, 1200, 100);
            pave2.draw(g2);
            smallPave2.draw(g2);

            house1.draw(g2);
            smallBuilding2.draw(g2);
            smallBuilding3.draw(g2);
            house4.draw(g2);
            house5.draw(g2);
            house6.draw(g2);
            house7.draw(g2);
            smallBuilding8.draw(g2);
            house9.draw(g2);
            house10.draw(g2);
        }

        else if(order == 8)
        {
            grass1.draw(g2);

            Road pave2 = new Road(0, 675, Color.yellow, Color.black, 1200, 150);
            Road smallPave2 = new Road(0, 458, Color.yellow, Color.black, 1200, 100);
            pave2.draw(g2);
            smallPave2.draw(g2);

            mediumBuilding2.draw(g2);
            house1.draw(g2);
            mediumBuilding10.draw(g2);
            smallBuilding3.draw(g2);
            smallBuilding4.draw(g2);
            smallBuilding5.draw(g2);
            smallBuilding6.draw(g2);
            smallBuilding7.draw(g2);
            mediumBuilding8.draw(g2);
            smallBuilding9.draw(g2);
        }

        else if(order == 9)
        {
            grass1.draw(g2);

            Road pave2 = new Road(0, 675, Color.yellow, Color.black, 1200, 150);
            Road smallPave2 = new Road(0, 458, Color.yellow, Color.black, 1200, 100);
            pave2.draw(g2);
            smallPave2.draw(g2);

            house1.draw(g2);
            largeBuilding2.draw(g2);
            mediumBuilding3.draw(g2);
            mediumBuilding4.draw(g2);
            largeBuilding5.draw(g2);
            mediumBuilding6.draw(g2);
            mediumBuilding7.draw(g2);
            largeBuilding8.draw(g2);
            mediumBuilding9.draw(g2);
            mediumBuilding10.draw(g2);
        }

        else if(order == 10)
        {
            grass1.draw(g2);

            Road pave2 = new Road(0, 675, Color.yellow, Color.black, 1200, 150);
            Road smallPave2 = new Road(0, 458, Color.yellow, Color.black, 1200, 100);
            pave2.draw(g2);
            smallPave2.draw(g2);

            house1.draw(g2);
            largeBuilding2.draw(g2);
            largeBuilding3.draw(g2);
            largeBuilding4.draw(g2);
            largeBuilding5.draw(g2);
            largeBuilding6.draw(g2);
            largeBuilding7.draw(g2);
            largeBuilding8.draw(g2);
            largeBuilding9.draw(g2);
            largeBuilding10.draw(g2);
        }

        if(sky != 0)
        {
            if(sky == 1)
            {
                Sky dSky = new Sky(0,0, Color.blue);
                dSky.draw(g2);
                if(space == true)
                {
                    if(order == 1)
                    {
                        Space dspace1 = new Space(975,200, Color.yellow ,Color.yellow,Color.blue);
                        dspace1.draw(g2);
                    }
                    else if(order == 2)
                    {
                        Space dspace2 = new Space(863,143, Color.yellow ,Color.yellow,Color.blue);
                        dspace2.draw(g2);
                    }
                    else if(order == 3)
                    {
                        Space dspace3 = new Space(752,87, Color.yellow ,Color.yellow,Color.blue);
                        dspace3.draw(g2);
                    }
                    else if(order == 4)
                    {
                        Space dspace4 = new Space(641,31, Color.yellow ,Color.yellow,Color.blue);
                        dspace4.draw(g2);
                    }
                    else if(order == 5)
                    {
                        Space dspace5 = new Space(530,-25, Color.yellow ,Color.yellow,Color.blue);
                        dspace5.draw(g2);
                    }
                    else if(order == 6)
                    {
                        Space dspace6 = new Space(419,-25, Color.yellow ,Color.yellow,Color.blue);
                        dspace6.draw(g2);
                    }
                    else if(order == 7)
                    {
                        Space dspace7 = new Space(308,31, Color.yellow ,Color.yellow,Color.blue);
                        dspace7.draw(g2);
                    }
                    else if(order == 8)
                    {
                        Space dspace8 = new Space(197,87, Color.yellow ,Color.yellow,Color.blue);
                        dspace8.draw(g2);
                    }
                    else if(order == 9)
                    {
                        Space dspace9 = new Space(86,143, Color.yellow ,Color.yellow,Color.blue);
                        dspace9.draw(g2);
                    }
                    else if(order == 10)
                    {
                        Space dspace10 = new Space(-25,200, Color.yellow ,Color.yellow,Color.blue);
                        dspace10.draw(g2);
                    }
                }
            }
            else 
            {
                Sky nSky = new Sky(0,0,Color.DARK_GRAY);
                nSky.draw(g2);
                if(space == true)
                {
                    if(order == 1)
                    {
                        Space nspace1 = new Space(975,200, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace1.draw(g2);
                    }
                    else if(order == 2)
                    {
                        Space nspace2 = new Space(863,143, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace2.draw(g2);
                    }
                    else if(order == 3)
                    {
                        Space nspace3 = new Space(752,87, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace3.draw(g2);
                    }
                    else if(order == 4)
                    {
                        Space nspace4 = new Space(641,31, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace4.draw(g2);
                    }
                    else if(order == 5)
                    {
                        Space nspace5 = new Space(530,-25, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace5.draw(g2);
                    }
                    else if(order == 6)
                    {
                        Space nspace6 = new Space(419,-25, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace6.draw(g2);
                    }
                    else if(order == 7)
                    {
                        Space nspace7 = new Space(308,31, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace7.draw(g2);
                    }
                    else if(order == 8)
                    {
                        Space nspace8 = new Space(197,87, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace8.draw(g2);
                    }
                    else if(order == 9)
                    {
                        Space nspace9 = new Space(86,143, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace9.draw(g2);
                    }
                    else if(order == 10)
                    {
                        Space nspace10 = new Space(-25,200, Color.gray ,Color.DARK_GRAY,Color.white);
                        nspace10.draw(g2);
                    }
                }
            }
        }

        if(ufo == true)
        {
            int x = randomGenerator.nextInt(950);
            int y = randomGenerator.nextInt(950);
            UFO ufo1 = new UFO(x,y);
            ufo1.draw(g2);
        }
    }

    //-----------------------------------------------------------------
    //  Performs the initial calls to the drawFractal method.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent (page);
        Graphics2D g2 = (Graphics2D) page;

        drawCity (current, g2, sky, space, ufo);
    }

    //-----------------------------------------------------------------
    //  Sets the fractal order to the value specified.
    //-----------------------------------------------------------------
    public void setOrder (int order)
    {
        current = order;
    }

    //-----------------------------------------------------------------
    //  Returns the current order.
    //-----------------------------------------------------------------
    public int getOrder ()
    {
        return current;
    }

    public void setSky(int s)
    {
        sky = s;
    }

    public int getSky()
    {
        return sky;
    }

    public void setSpace(boolean sp)
    {
        space = sp;
    }

    public boolean getSpace()
    {
        return space;
    }
    
    public void setUfo(boolean u)
    {
        ufo = u;
    }
    
    public boolean getUfo()
    {
        return ufo;
    }
}

