import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.table.*;
import javax.swing.table.DefaultTableModel;
import java.util.Comparator;
import java.util.Collections;
import java.awt.Color;

/**
@author Daneel Downer
*/


public class Forms extends JPanel 
{
    private JButton     cmdGeneral;
    private JButton     cmdEmergenctContact;
    private JButton     cmdDietary;
    private JButton     cmdUpload;
    private JButton     cmdClose;
    
  
    private JPanel      pnlCommand1;
    private JPanel      pnlCommand2;

    public Forms() 
    {
        super(new GridLayout(3,1));
        pnlCommand1 = new JPanel();
        pnlCommand2= new JPanel();
        pnlComman1.setLayout(new GridLayout(3,1));

        cmdGeneral = new JButton("General Application Form");
        cmdEmergenctContact  = new JButton("Emergency Contact Form");
        cmdDietary   = new JButton("Dietary Form");
        cmdUpload   = new JButton("Upload Documents");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());
        cmdGeneral.addActionListener(new GeneralButtonListener());
        cmdEmergenctContact.addActionListener(new EmergencyContactButtonListener());
        cmdDietary.addActionListener(new DietaryButtonListener());
        cmdUpload.addActionListener(new UploadButtonListener());
        
        cmdGeneral.setBackground(Color.MAGENTA);
        cmdClose.setBackground(Color.MAGENTA);
        cmdEmergenctContact.setBackground(Color.MAGENTA);
        cmdDietary.setBackground(Color.MAGENTA);
        cmdUpload.setBackground(Color.MAGENTA);

        //pnlCommand.setBackground(Color.pink);
        //pnlDisplay.setBackground(Color.GREEN);

        pnlCommand1.add(cmdGeneral);
        pnlCommand1.add(cmdEmergenctContact);
        pnlCommand1.add(cmdDietary);
        pnlCommand2.add(cmdUpload);
        pnlCommand2.add(cmdClose);
       
        add(pnlCommand1);
        //add(pnlCommand2);
    }


    private static void ShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Forms");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Forms newContentPane = new Forms();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
                public void run() {
                    ShowGUI();
                }
        });
    }

    private class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }

    }

    /**
     * listener class for "General Parent" button
     */
    private class GeneralButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new GeneralForm();
        }
    }

    /**
     * listener class for "Emergency Contact Form" button
     */
    private class EmergencyContactButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
    
        }
    }

    /**
     * listener class for "Upload Documents" button
     */
    private class UploadButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
           
        }
    }

    /**
     * listener class for "Dietary Form" button
     */
    private class DietaryButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
        }
    }

}
