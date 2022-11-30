import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ParentForm extends JFrame {
    
    private JButton cmdClose;
    private JButton cmdSave;
    private JPanel pnlMother;
    private JPanel pnlFather;
    private JPanel pnlCommand;
    private JPanel pnlParents;
    private JTextField txtMName;
    private JTextField txtMOccupation;
    private JTextField txtMContact;
    private JTextField txtMEmail;
    private JTextField txtFName;
    private JTextField txtFOccupation;
    private JTextField txtFContact;
    private JTextField txtFEmail;
    

    public ParentForm(){

        setTitle("PARENT'S INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000,500));

        pnlMother = new JPanel();
        pnlFather = new JPanel();
        pnlParents = new JPanel();
        pnlCommand = new JPanel();

        pnlMother.setLayout(new GridLayout(4,2));
        pnlFather.setLayout(new GridLayout(4,2));
        pnlParents.setLayout(new GridLayout(2,2,20,20));

        pnlMother.add(new JLabel("Mother's Name")); 
        txtMName = new JTextField(40);
        pnlMother.add(txtMName);
        pnlMother.add(new JLabel("Mother's Occupation")); 
        txtMOccupation = new JTextField();
        pnlMother.add(txtMOccupation);
        pnlMother.add(new JLabel("Mother's Telephone Number")); 
        txtMContact = new JTextField();
        pnlMother.add(txtMContact);
        pnlMother.add(new JLabel("Mother's Email")); 
        txtMEmail = new JTextField();
        pnlMother.add(txtMEmail);
        pnlFather.add(new JLabel("Father's Name")); 
        txtFName = new JTextField();
        pnlFather.add(txtFName);
        pnlFather.add(new JLabel("Father's Occupation")); 
        txtFOccupation = new JTextField();
        pnlFather.add(txtFOccupation);
        pnlFather.add(new JLabel("Father's Telephone Number")); 
        txtFContact = new JTextField();
        pnlFather.add(txtFContact);
        pnlFather.add(new JLabel("Father's Email")); 
        txtFEmail = new JTextField();
        pnlFather.add(txtFEmail);
        pnlParents.add(pnlMother);
        pnlParents.add(pnlFather);

        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);

        add(pnlParents,BorderLayout.CENTER);
        add(pnlCommand,BorderLayout.SOUTH);
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
    }}


public static void main(String[] args)  
{ 
            new ParentForm();
} 
    
}
