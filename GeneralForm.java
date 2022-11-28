import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedWriter;

import java.util.ArrayList;

/**
 * Extends the JFrame class
 * Creates a window to add student
 * @author 
 */

public class GeneralForm extends JFrame
{
    private JTextField  txtName;       
    private JTextField  txtDob;
    private JTextField  txtAge;     
    private JTextField  txtAddr;

    private JCheckBox cbFemale;
    private JCheckBox cbMale;

    private JButton     cmdSave; 
    private JButton     cmdClose;            
    private JButton     cmdClearAll;   

    private JPanel      pnlDisplay;
    private JPanel      pnlCommand;
    

    /**Constructor
     * Create a GUI interface to prompt user for student info and submit
     * @param 
     */
  
    public GeneralForm()
    { 
        setTitle("Registering Student");
        pnlDisplay = new JPanel();
        pnlCommand = new JPanel();

        pnlDisplay.add(new JLabel("Name (First and Last):"));
        txtName = new JTextField(46);
        pnlDisplay.add(txtName);
        pnlDisplay.add(new JLabel("Date Of Birth (dd/mm/yy):"));
        txtDob = new JTextField(3);
        pnlDisplay.add(txtDob);
        pnlDisplay.add(new JLabel("Age")); 
        txtAge = new JTextField(2);
        pnlDisplay.add(txtAge);
        pnlDisplay.add(new JLabel("Address"));
        txtAddr = new JTextField(4);
        pnlDisplay.add(txtAddr);
        pnlDisplay.add(new JLabel("Male"));
        cbMale = new JCheckBox();
        pnlDisplay.add(cbMale);
        pnlDisplay.add(new JLabel("Female"));
        cbFemale = new JCheckBox();
        pnlDisplay.add(cbFemale);

        pnlDisplay.setLayout(new GridLayout(6,3));
       
        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);
        
        add(pnlDisplay, BorderLayout.NORTH);
        add(pnlCommand, BorderLayout.CENTER);

        pack();
        setVisible(true);
    }

    /**
     * Represent an action listener for the close button
     */
    private class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            setVisible(false);//close window
        }   
    }

    /**
     * Represent an action listener for the save button
     */
    private class SaveButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent s)
        {
            /*try
            {
                String name = txtName.getText();
                String dob = txtDob.getText();
                Integer age = Integer.parseInt(txtAge.getText());
                String addr = txtAddr.getText();
                String[] nextLine = name.split(" ");
                String fname= nextLine[0];
                String lname= nextLine[1];
                String[] nextLine2 = dob.split("/");
                int d = Integer.parseInt(nextLine2[0]);
                int m = Integer.parseInt(nextLine2[1]);
                int y = Integer.parseInt(nextLine2[2]);
                
                if (cbFemale.isSelected())
                    gender = Sex.FEMALE;
                else gender = Sex.MALE;

                if((nextLine.length == 2)&&(age<10)&&(fname.matches("[a-zA-Z]+"))&&
                (lname.matches("[a-zA-Z]+"))&& (d>0 && d<32)&&(m>0 && m<13)&&(y>0))
                {
                    Student student = new Student(fname, lname, dob, age, addr, gender); //create a student
                }
                else
                    JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);  //pop up an error window            
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);
            }
        } */  
    }

    

    public static void main(String[] args) 
    { 
        new GeneralForm();
    }   

    }
}