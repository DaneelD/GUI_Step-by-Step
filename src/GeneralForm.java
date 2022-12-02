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
import java.awt.Component;
import java.awt.Container;


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

    private JPanel      pnlCommand;
    private JPanel      pnlPersonal;
    private JPanel      pnlDoctor;
    


    private JTextField txtPob;
    private Component txtMName;
    private JTextField txtMOccupation;
    private JTextField txtMContact;
    private JTextField txtMEmail;
    private JTextField txtFName;
    private JTextField txtFOccupation;
    private JTextField txtFContact;
    private JTextField txtFEmail;
    private JTextField txtDocContact;
    private JTextField txtDocName;
    private JTextField txtDocEmail;
    private JPanel pnlGender;
    private JPanel pnlDisplay;
    private JPanel pnlParents;
    private JPanel pnl;
    private Container pnlD;
    
    private JPanel pnlTitle;
    private JPanel pnlData;
    private JPanel pnlMother;
    private JPanel pnlFather;
    private JPanel pnlPTitle;
    private JPanel pnlDTitle;
    

    /**Constructor
     * Create a GUI interface to prompt user for student info and submit
     * @param 
     */
  
    public GeneralForm()
    { 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(1,1));
        setPreferredSize(new Dimension(1400,4000));
        setTitle("Registering Student");
        
        pnlDisplay = new JPanel();
        pnlCommand = new JPanel();
        
        pnlDisplay.setLayout(new GridLayout(3,1));

        //Setting up Child's Information Form
        pnlPersonal = new JPanel();
        pnlTitle= new JPanel();
        pnlData = new JPanel();
        pnlGender = new JPanel();

        pnlPersonal.setLayout(new BorderLayout(7,2));
        pnlData.setLayout(new GridLayout(7,2));

        pnlTitle.add(new JLabel("CHILD'S INFORMATION"),BorderLayout.NORTH);
        pnlData.add(new JLabel("Name of Child(First and Last):"));
        txtName = new JTextField(46);
        pnlData.add(txtName);
        pnlData.add(new JLabel("Address"));
        txtAddr = new JTextField(4);
        pnlData.add(txtAddr);
        pnlData.add(new JLabel("Date Of Birth (dd/mm/yy):"));
        txtDob = new JTextField(3);
        pnlData.add(txtDob);
        pnlData.add(new JLabel("Place Of Birth:"));
        txtPob = new JTextField(3);
        pnlData.add(txtPob);
        pnlData.add(new JLabel("Age")); 
        txtAge = new JTextField(2);
        pnlData.add(txtAge);
        pnlGender.add(new JLabel("Male"));
        cbMale = new JCheckBox();
        pnlGender.add(cbMale);
        pnlGender.add(new JLabel("Female"));
        cbFemale = new JCheckBox();
        pnlGender.add(cbFemale);
        pnlData.add(pnlGender);

        pnlPersonal.add(pnlTitle,BorderLayout.NORTH);
        pnlPersonal.add(pnlData,BorderLayout.CENTER);

        //Setting up Parent's Information Form
        pnlParents = new JPanel();
        pnlMother = new JPanel();
        pnlFather = new JPanel();
        pnlPTitle = new JPanel();
        pnl = new JPanel();

        pnlParents.setLayout(new BorderLayout(1,2));
        pnlMother.setLayout(new GridLayout(4,2));
        pnlFather.setLayout(new GridLayout(4,2));
        pnl.setLayout(new GridLayout(2,2));

        pnlPTitle.add(new JLabel("PARENT'S INFORMATION"),BorderLayout.NORTH);
        pnlMother.add(new JLabel("Mother's Name")); 
        txtMName = new JTextField();
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
        pnl.add(pnlMother);
        pnl.add(pnlFather);

        pnlParents.add(pnlPTitle, BorderLayout.NORTH);
        pnlParents.add(pnl, BorderLayout.CENTER);

        //Setting up Doctor's Information For
        pnlDoctor = new JPanel();
        pnlD = new JPanel();
        pnlDTitle = new JPanel();
        
        pnlDoctor.setLayout(new BorderLayout());
        pnlD.setLayout(new GridLayout(3,2));

        pnlDTitle.add(new JLabel("DOCTOR'S INFORMATION"),BorderLayout.NORTH);
        pnlD.add(new JLabel("Doctor's Name")); 
        txtDocName = new JTextField(2);
        pnlD.add(txtDocName);
        pnlD.add(new JLabel("Doctor's Telephone Number")); 
        txtDocContact = new JTextField(2);
        pnlD.add(txtDocContact);
        pnlD.add(new JLabel("Doctor's Address")); 
        txtDocEmail = new JTextField(2);
        pnlD.add(txtDocEmail);

        pnlDoctor.setSize(4, 5);

        pnlDoctor.add(pnlDTitle, BorderLayout.NORTH);
        pnlDoctor.add(pnlD,BorderLayout.CENTER);

        //pnlCommand.setLayout(new GridLayout(20,3));
       
        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);
        
        pnlDisplay.add(pnlPersonal);
        pnlDisplay.add(pnlParents);
        pnlDisplay.add(pnlDoctor);
        
        add(pnlDisplay,BorderLayout.CENTER);
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
        new GeneralForm();
}   

    
}
