import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

    public Forms student;
    

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
            try
            {
                String m_name = txtMName.getText();
                String m_contact = txtMContact.getText();
                String m_occupation = txtMOccupation.getText();
                String m_email = txtMEmail.getText();
                String f_name = txtFName.getText();
                String f_contact = txtFContact.getText();
                String f_occupation = txtFOccupation.getText();
                String f_email = txtFEmail.getText();
                String[] nextLine = m_name.split(" ");
                String m_fname= nextLine[0];
                String m_lname= nextLine[1];
                String[] nextLine2 = f_name.split(" ");
                String f_fname= nextLine[0];
                String f_lname= nextLine[1];
                
                if((nextLine.length == 2)&&(m_fname.matches("[a-zA-Z]+"))&&
                (m_lname.matches("[a-zA-Z]+"))&&(nextLine2.length == 2)&&(f_fname.matches("[a-zA-Z]+"))&&
                (f_lname.matches("[a-zA-Z]+"))&&(f_occupation.matches("[a-zA-Z]+"))&&(m_occupation.matches("[a-zA-Z]+")))
                {
                    //save parent contact info
                }
                else
                    JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);  //pop up an error window            
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);
            }
        }  
    }


/*public static void main(String[] args)  
{ 
            new ParentForm();
}*/ 
    
}
