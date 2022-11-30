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

public class DietaryForm extends JFrame {
    
    private JButton cmdClose;
    private JButton cmdSave;
    private JPanel pnlDietary;
    private JPanel pnlCommand;
  
    private JTextField txtDietNeeds;
    private JTextField txtFoodAlergies;
    private JTextField txtRelRestr;
    private JTextField txtFoodIntolerance;
    
    public DietaryForm(){

        setTitle("DIETARY'S INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700,200));

        pnlDietary = new JPanel();
        pnlCommand = new JPanel();

        pnlDietary.setLayout(new GridLayout(4,2));
        
        pnlDietary.add(new JLabel("Special Dietary Needs")); 
        txtDietNeeds= new JTextField(40);
        pnlDietary.add(txtDietNeeds);
        pnlDietary.add(new JLabel("Food Alergies")); 
        txtFoodAlergies = new JTextField();
        pnlDietary.add(txtFoodAlergies);
        pnlDietary.add(new JLabel("Religious Restrictions")); 
        txtRelRestr= new JTextField();
        pnlDietary.add(txtRelRestr);
        pnlDietary.add(new JLabel("Food Intolerance")); 
        txtFoodIntolerance = new JTextField();
        pnlDietary.add(txtFoodIntolerance);
        
        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);

        add(pnlDietary,BorderLayout.CENTER);
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
            new DietaryForm();
} 
    
}
