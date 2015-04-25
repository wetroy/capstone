import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Class that contains the main method for the program and creates the frame and all the buttons
 * 
 * @author Billy Troy
 * @version 4/24/15
 */
public class CityViewer implements ActionListener
{
    /**WIDTH  sets the width of the screen */
    private final int WIDTH = 1000;
    /**HEIGHT  sets the height of the screen */
    private final int HEIGHT = 1000;
    /**MIN  sets the minimum order to 1 */
    private final int MIN = 1;
    /**MAX  sets the maximum order to 10 */
    private final int MAX = 10;
    /**JButton  creates all five JButtons (increase, decrease, sky, space, and ufo) */
    private JButton increase, decrease, sky, space, ufo;
    /**JLabel   creates the labels*/
    private JLabel titleLabel, orderLabel;
    /**CityComponent    creates a new call the the city component class */
    private CityComponent drawing;
    /**JPanel   creates the JPanel */
    private JPanel panel, tools;
    /**JFrame   creates the JFrame */
    private JFrame frame;
    /**
     * Default constructor for objects of class CityViewer
     */
    public CityViewer()
    {
        /** creates the new JPanel to contain the buttons and makes it visible */
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.black);
        tools.setOpaque (true);

        titleLabel = new JLabel ("The City");
        titleLabel.setForeground (Color.black);
        /** creates the increase JButton and action listener */
        increase = new JButton (new ImageIcon ("increase.gif"));
        increase.setPressedIcon (new ImageIcon ("increasePressed.gif"));
        increase.setMargin (new Insets (0, 0, 50, 50));
        increase.addActionListener (this);
        /** creates the decrease JButton and action listener */
        decrease = new JButton (new ImageIcon ("decrease.gif"));
        decrease.setPressedIcon (new ImageIcon ("decreasePressed.gif"));
        decrease.setMargin (new Insets (0, 0, 50, 50));
        decrease.addActionListener (this);

        /** creates the sky JButton and action listener*/
        sky = new JButton (new ImageIcon ("sky.gif"));
        sky.setPressedIcon (new ImageIcon ("sky.gif"));
        sky.setMargin (new Insets (0, 0, 50, 50));
        sky.addActionListener (this);

        /** creates the space JButton and action listener */
        space = new JButton (new ImageIcon ("space.gif"));
        space.setPressedIcon (new ImageIcon ("space.gif"));
        space.setMargin (new Insets (0, 0, 50, 50));
        space.addActionListener (this);

        /** creates the ufo JButton and action listener*/
        ufo = new JButton (new ImageIcon ("ufo.gif"));
        ufo.setPressedIcon (new ImageIcon ("ufo.gif"));
        ufo.setMargin (new Insets (0, 0, 50, 50));
        ufo.addActionListener (this);

        orderLabel = new JLabel ("Order: 1");
        orderLabel.setForeground (Color.black);

        /** adds all the tools to the new JPanel */
        tools.add (titleLabel);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (decrease);
        tools.add (increase);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (sky);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (space);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (ufo);
        tools.add (Box.createHorizontalStrut (20));
        tools.add (orderLabel);

        /** creates a new city with an order of 1, no sky, no space, and no ufo */
        drawing = new CityComponent(1, 0, false, false);

        /**creates a JPanel to contain the old JPanel that contains the buttons and adds the city */
        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        /** creates a new JFrame with everything in it and sets it to visible */
        frame = new JFrame();
        frame.setTitle("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    /**
     * Checks all the action listeners to see which button was clicked and acts accordingly
     */
    public void actionPerformed (ActionEvent event)
    {
        int order = drawing.getOrder();
        /** checks to see if the increase button was clicked */
        if (event.getSource() == increase)
        {
            order++;
        }
        /** checks to see if the decrease button was clicked */
        else if(event.getSource() == decrease)
        {
            order--;
        }
        /** checks to see if the sky button was clicked */
        else if(event.getSource() == sky)
        {
            int s = drawing.getSky();
            if(s == 2)
            {
                s = 0;
            }
            else
            {
                s++;
            }
            drawing.setSky (s);
            frame.repaint();
        }
        /** checks to see if the space button was clicked */
        else if(event.getSource() == space)
        {
            boolean sp = drawing.getSpace();
            if(sp == false)
            {
                sp = true;
            }
            else
            {
                sp = false;
            }
            drawing.setSpace(sp);
            frame.repaint();
        }
        /** checks to see if the ufo button was clicked */
        else if(event.getSource() == ufo)
        {
            boolean u = drawing.getUfo();
            if(u == false)
            {
                u = true;
            }
            else
            {
                u = false;
            }
            drawing.setUfo(u);
            frame.repaint();
        }

        /** makes it so that the program can keep repeating itself and doesn't just have to close after the order gets to 10 */
        if (order > MAX)
        {
            order = 1;
        }

        /** makes sure that the order is between 1 and 10 */
        if (order >= MIN && order <= MAX)
        {
            orderLabel.setText ("Order: " + order);
            drawing.setOrder (order);
            frame.repaint();
        }
    }

    /**
     * creates the method that runs everything
     */
    public static void main(String[] args)
    {
        CityViewer viewer = new CityViewer();
    }

}
