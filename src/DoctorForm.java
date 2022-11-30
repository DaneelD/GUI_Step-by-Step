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

public class DoctorForm extends JFrame {
    
    private JButton cmdClose;
    private JButton cmdSave;
    private JPanel pnlDoctor;
    private JPanel pnlCommand;
  
    private JTextField txtDName;
    private JTextField txtDContact;
    private 
    JTextField txtDAddr;

    public Forms  student;
    
    public DoctorForm(){

        setTitle("DOCTOR'S INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700,200));

        pnlDoctor = new JPanel();
        pnlCommand = new JPanel();

        pnlDoctor.setLayout(new GridLayout(3,2));
        
        pnlDoctor.add(new JLabel("Doctor's Name")); 
        txtDName = new JTextField(40);
        pnlDoctor.add(txtDName);
        pnlDoctor.add(new JLabel("Doctor's Telephone Number")); 
        txtDContact = new JTextField();
        pnlDoctor.add(txtDContact);
        pnlDoctor.add(new JLabel("Doctor's Address")); 
        txtDAddr = new JTextField();
        pnlDoctor.add(txtDAddr);
        
        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);

        add(pnlDoctor,BorderLayout.CENTER);
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
                String name = txtDName.getText();
                String contact = txtDContact.getText();
                String addr = txtDAddr.getText();
                String[] nextLine = name.split(" ");
                String fname= nextLine[0];
                String lname= nextLine[1];
                
                if((nextLine.length == 2)&&(fname.matches("[a-zA-Z]+"))&&
                (lname.matches("[a-zA-Z]+")))
                {
                    //save info
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
            new DoctorForm();
} */
    
}
