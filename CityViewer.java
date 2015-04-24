import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * Write a description of class TreeViewer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CityViewer implements ActionListener
{
    /** description of instance variable x (add comment for each instance variable) */
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;

    private final int MIN = 1;
    private final int MAX = 10;

    private JButton increase, decrease, sky, space, ufo;
    private JLabel titleLabel, orderLabel;
    private CityComponent drawing;
    private JPanel panel, tools;
    private JFrame frame;
    /**
     * Default constructor for objects of class TreeViewer
     */
    public CityViewer()
    {
        tools = new JPanel ();
        tools.setLayout (new BoxLayout(tools, BoxLayout.X_AXIS));
        tools.setBackground (Color.black);
        tools.setOpaque (true);

        titleLabel = new JLabel ("The City");
        titleLabel.setForeground (Color.black);

        increase = new JButton (new ImageIcon ("increase.gif"));
        increase.setPressedIcon (new ImageIcon ("increasePressed.gif"));
        increase.setMargin (new Insets (0, 0, 50, 50));
        increase.addActionListener (this);
        decrease = new JButton (new ImageIcon ("decrease.gif"));
        decrease.setPressedIcon (new ImageIcon ("decreasePressed.gif"));
        decrease.setMargin (new Insets (0, 0, 50, 50));
        decrease.addActionListener (this);
        
        sky = new JButton (new ImageIcon ("sky.gif"));
        sky.setPressedIcon (new ImageIcon ("sky.gif"));
        sky.setMargin (new Insets (0, 0, 50, 50));
        sky.addActionListener (this);
        
        space = new JButton (new ImageIcon ("space.gif"));
        space.setPressedIcon (new ImageIcon ("space.gif"));
        space.setMargin (new Insets (0, 0, 50, 50));
        space.addActionListener (this);
        
        ufo = new JButton (new ImageIcon ("ufo.gif"));
        ufo.setPressedIcon (new ImageIcon ("ufo.gif"));
        ufo.setMargin (new Insets (0, 0, 50, 50));
        ufo.addActionListener (this);

        orderLabel = new JLabel ("Order: 1");
        orderLabel.setForeground (Color.black);

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

        drawing = new CityComponent(1, 0, false, false);

        panel = new JPanel();
        panel.add (tools);
        panel.add (drawing);

        frame = new JFrame();
        frame.setTitle("City");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(panel);
        frame.setVisible(true);
    }

    public void actionPerformed (ActionEvent event)
    {
        int order = drawing.getOrder();
        if (event.getSource() == increase)
        {
            order++;
        }
        else if(event.getSource() == decrease)
        {
            order--;
        }
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

        if (order > MAX)
        {
            order = 1;
        }

        if (order >= MIN && order <= MAX)
        {
            orderLabel.setText ("Order: " + order);
            drawing.setOrder (order);
            frame.repaint();
        }
    }

    public static void main(String[] args)
    {
        CityViewer viewer = new CityViewer();
    }

}
