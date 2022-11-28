import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;


import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;    
import java.awt.BorderLayout;
import java.awt.GridLayout;


/**
 * Extends the JPanel class
 * 
 * @author
 */

public class Welcome extends JPanel
{
    private JButton             cmdParent;
    private JButton             cmdAdmin;
    private JPanel              pnlCommand1;
    private JPanel              pnlDisplay;
    
    /**Constructor
     * 
     */
    public Welcome() 
    {
        super(new GridLayout(2,1));
        setPreferredSize(new Dimension(700,500));
        pnlCommand1 = new JPanel();
        pnlDisplay = new JPanel();
        pnlCommand1.setSize(new Dimension(500,500));

        cmdParent = new JButton("Parent");
        cmdAdmin = new JButton("Admin Staff");
        
        cmdParent.addActionListener(new ParentButtonListener()); 
        cmdAdmin.addActionListener(new AdminButtonListener());

        cmdParent.setBackground(Color.CYAN);
        cmdAdmin.setBackground(Color.CYAN);

        pnlDisplay.add(new JLabel("WELCOME TO STEP-BY-STEP SYSTEM"),BorderLayout.CENTER);
        pnlCommand1.add(new JLabel("Select User:"),BorderLayout.EAST);
        pnlCommand1.add(cmdParent,BorderLayout.CENTER );
        pnlCommand1.add(cmdAdmin,BorderLayout.WEST);
        
        add(pnlDisplay);
        add(pnlCommand1);
    }
  
    private static void ShowGUI() 
    {
        //Create and set up the window.
        JFrame frame = new JFrame("Welcome to Step-by-Step");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(500,200));
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.blue,3);
        label.setBorder(border);
        frame.add(label);
        //ImageIcon image = new ImageIcon("logo.png");
        //frame.setIconImage(image.getImage());

        //Create and set up the content pane.
        Welcome newContentPane = new Welcome();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.setVisible(true);
        frame.pack();    
    }

    
    /** 
     * Main method to execute program
     * @param args
     */
    public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ShowGUI();
            }
        });    
    }   
    

    /**
     * Represent an action listener for the parent button
     */
    private class ParentButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new ParentOptions();
        }
    }

    /**
     * Represent an action listener for the admin button
     */
    private class AdminButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Login();
        }
    }

    
}
