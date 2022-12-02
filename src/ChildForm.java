import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Color;

public class ChildForm extends JFrame 
{
    private JPanel      pnlData;
    private JPanel      pnlGender;
    private JPanel      pnlCommand;

    private JTextField  txtName;
    private JTextField  txtAddr;
    private JTextField  txtDob;
    private JTextField  txtPob;
    private JTextField  txtAge;

    private JCheckBox   cbMale;
    private JCheckBox   cbFemale;
    private JButton cmdClose;
    private JButton cmdSave;

    public Forms reg;
    private Admin admin;

    public ChildForm(){
        //reg = student;
        admin = new Admin("Jonmarc Young", "DD-MM-YYY", Sex.MALE, "Kingston 15", "jonmarcyoungjy7@gmail.com",
        "876-582-9568", EType.ADMIN);
        setTitle("CHILD'S INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000,500));

        pnlData = new JPanel();
        pnlGender = new JPanel();
        pnlCommand = new JPanel();
        pnlData.setLayout(new GridLayout(7,2));

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

        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);

        add(pnlData,BorderLayout.CENTER);
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
                String name = txtName.getText();
                String addr = txtAddr.getText();
                String dob = txtDob.getText();
                String pob = txtPob.getText();
                Integer age = Integer.parseInt(txtAge.getText());
                
                Sex gender = Sex.MALE;
                if (cbFemale.isSelected())
                    gender=Sex.FEMALE;
                
                String[] nextLine = name.split(" ");
                String fname= nextLine[0];
                String lname= nextLine[1];
                String[] nextLine2 = dob.split("/");
                int d = Integer.parseInt(nextLine2[0]);
                int m = Integer.parseInt(nextLine2[1]);
                int y = Integer.parseInt(nextLine2[2]);

                String std2name="Mary Smith";
                String std2DOB="01/09/2020";
                Sex std2sex=Sex.FEMALE;
                String std2address= "Kingston 9";
                String std2dName="Dr. Green";
                String std2dEmail="green@yahoo.com";
                String std2dTel= "876 773 8735";
                String std2dislike1="Green Peas";
                String std2dislike2="Orange Juice";
                //std2dislike.add(std2dislike1);
                //std2dislike.add(std2dislike2);

                String std2pname="Charles Smith";
                String std2pdob="26/08/1976";
                Sex std2psex=Sex.MALE;
                String std2paddr="Kingston 9";
                String std2pemail="";
                String std2ptelNum="876 836 7234";
                String std2pemg="876 238 6771";
                String std2poccupation="Electrician";

                String std2p2name="Jane Smith";
                String std2p2dob="17/11/1973";
                Sex std2p2sex=Sex.FEMALE;
                String std2p2addr="Kingston 9";
                String std2p2email="";
                String std2p2telNum="876 999 1822";
                String std2p2emg="876 261 9873";
                String std2p2occupation="Teacher";

                ArrayList<String> std2dislike = new ArrayList<String>();
                
                if((nextLine.length == 2)&&(age<10)&&(fname.matches("[a-zA-Z]+"))&&
                (lname.matches("[a-zA-Z]+"))&& (d>0 && d<32)&&(m>0 && m<13)&&(y>0))
                {
                    //Parent p = new Parent("","",Sex.FEMALE,"","","","");
                    //Parent p2 = new Parent("","",Sex.MALE,"","","","");
                    ArrayList<String> emgc1 = new ArrayList<String>();
                    ArrayList<String> emgc2 = new ArrayList<String>();
                    ArrayList<String> dislikes = new ArrayList<String>();
                    HashMap<String, Integer> grades= new HashMap<>();
                    Grade grade = new Grade(grades);
                    Student student = new Student(name, std2DOB, std2sex, 
                    std2address,std2dName , std2dEmail, std2dTel, std2dislike, 
                    grade, std2pname, std2pdob, std2psex, std2paddr,
                    std2pemail, std2ptelNum, std2pemg, std2poccupation, 
                    std2p2name, std2p2dob, std2p2sex, std2p2addr, std2p2email, 
                    std2p2telNum, std2p2emg, std2p2occupation); 
                    //reg.cbChild.setText("Completed");
                    //ChildForm.this.reg.addStudent(student); //add student to list
                    
                    String excelFilePath = "C://Users//Student//Documents//GitHub//GUI_Step-by-Step//Mean.xlsx";
                    if(new File(excelFilePath).exists()){
                        admin.regStudent(student);
                    //System.out.println(admin.removeRecords());
                    }
                    else{
                        admin.createExcel();
                     }
                    setVisible(false);
                   /* try
                    {
                        FileWriter file = new FileWriter("StudentDetails.txt", true); //opening the file to print to in append mode
                        PrintWriter outWriter = new PrintWriter(new BufferedWriter(file));
                        outWriter.println(student); // writing to the file
                        outWriter.close();
                    }
                    catch(IOException io){} */   
                }
                else
                    JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);  //pop up an error window            
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,"Please input correct info","Invalid Input",JOptionPane.PLAIN_MESSAGE);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }  
    }


public static void main(String[] args)  
{ 
        new ChildForm();
} 
    
}
