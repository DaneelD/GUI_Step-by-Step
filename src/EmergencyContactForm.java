import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Dimension;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class EmergencyContactForm extends JFrame {
    
    private JButton cmdClose;
    private JButton cmdSave;

    private JPanel pnlEmer1;
    private JPanel pnlEmer2;
    private JPanel pnlEmer; 
    private JPanel pnlCommand;
    private JPanel pnl1;
    private JPanel pnl2;

    private JTextField txtEmerName1;
    private JTextField txtEmerAddr1;
    private JTextField txtEmerContact1;
    private JTextField txtEmerRelation1;

    private JTextField txtEmerName2;
    private JTextField txtEmerAddr2;
    private JTextField txtEmerContact2;
    private JTextField txtEmerRelation2;
    private JPanel pnlTitle1;
    private JPanel pnlTitle2;

    public Forms  student;

    public EmergencyContactForm(){

        setTitle("EMERGENCY CONTACT INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1000,500));

        pnlEmer1 = new JPanel();
        pnlEmer2 = new JPanel();
        pnlEmer = new JPanel();
        pnlCommand = new JPanel();
        pnlTitle1 = new JPanel();
        pnlTitle2 = new JPanel();
        pnl1 = new JPanel();
        pnl2 = new JPanel();

        pnlEmer1.setLayout(new GridLayout(4,2));
        pnlEmer2.setLayout(new GridLayout(4,2));
        pnlEmer.setLayout(new GridLayout(2,1,50,50));
        pnl1.setLayout(new BorderLayout(10,15));
        pnl2.setLayout(new BorderLayout(10,15));

        pnlEmer1.add(new JLabel("Name")); 
        txtEmerName1 = new JTextField(40);
        pnlEmer1.add(txtEmerName1);
        pnlEmer1.add(new JLabel("Address")); 
        txtEmerAddr1 = new JTextField();
        pnlEmer1.add(txtEmerAddr1);
        pnlEmer1.add(new JLabel("Telephone Number")); 
        txtEmerContact1 = new JTextField();
        pnlEmer1.add(txtEmerContact1);
        pnlEmer1.add(new JLabel("Relation")); 
        txtEmerRelation1 = new JTextField();
        pnlEmer1.add(txtEmerRelation1);
        
        pnlEmer2.add(new JLabel("Name")); 
        txtEmerName2 = new JTextField(40);
        pnlEmer2.add(txtEmerName2);
        pnlEmer2.add(new JLabel("Address")); 
        txtEmerAddr2 = new JTextField();
        pnlEmer2.add(txtEmerAddr2);
        pnlEmer2.add(new JLabel("Telephone Number")); 
        txtEmerContact2 = new JTextField();
        pnlEmer2.add(txtEmerContact2);
        pnlEmer2.add(new JLabel("Relation")); 
        txtEmerRelation2 = new JTextField();
        pnlEmer2.add(txtEmerRelation2);

        pnlTitle1.add(new JLabel("Emergency Contact 1"));
        pnlTitle2.add(new JLabel("Emergency Contact 2"));
        pnl1.add(pnlTitle1, BorderLayout.NORTH);
        pnl1.add(pnlEmer1, BorderLayout.CENTER);
        pnl2.add(pnlTitle2, BorderLayout.NORTH);
        pnl2.add(pnlEmer2, BorderLayout.CENTER);;
      
        pnlEmer.add(pnl1);
        pnlEmer.add(pnl2);

        cmdSave  = new JButton("Save");
        cmdClose = new JButton("Close");

        cmdClose.addActionListener(new CloseButtonListener());  //add listener to "Close" button
        cmdSave.addActionListener(new SaveButtonListener());    //add listener to "Save" button

        pnlCommand.add(cmdSave);
        pnlCommand.add(cmdClose);

        add(pnlEmer,BorderLayout.CENTER);
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
                String name = txtEmerName1.getText();
                String contact = txtEmerContact1.getText();
                String addr = txtEmerAddr1.getText();
                String relation = txtEmerRelation1.getText();
                String name2 = txtEmerName2.getText();
                String contact2 = txtEmerContact2.getText();
                String addr2 = txtEmerAddr2.getText();
                String relation2 = txtEmerRelation2.getText();
                String[] nextLine = name.split(" ");
                String fname= nextLine[0];
                String lname= nextLine[1];
                String[] nextLine2 = name2.split(" ");
                String fname2= nextLine[0];
                String lname2= nextLine[1];
                
                if((nextLine.length == 2)&&(fname.matches("[a-zA-Z]+"))&&
                (lname.matches("[a-zA-Z]+"))&&(nextLine2.length == 2)&&(fname2.matches("[a-zA-Z]+"))&&
                (lname2.matches("[a-zA-Z]+"))&&(relation.matches("[a-zA-Z]+"))&&(relation.matches("[a-zA-Z]+")))
                {
                    //save emergency contact info
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
            new EmergencyContactForm();
} */
    
}