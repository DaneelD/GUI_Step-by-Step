import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;


/**
 * Extends the JFrame class
 * 
 * @author 
 */

public class AdminOptions extends JFrame
{     
    private JButton     cmdRegSt;
    private JButton     cmdStudent;
    private JButton     cmdEmployee;

    private JPanel      pnlCommand;
    private JPanel      pnlDisplay;

    /**Constructor
     * 
     * @param 
     */
  
    public AdminOptions()
    {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        setTitle("Admin Options");
        setPreferredSize(new Dimension(700,200));

        pnlCommand = new JPanel();
        pnlDisplay = new JPanel();
        pnlCommand.setSize(new Dimension(500,200));

        cmdRegSt = new JButton("Register New Student");
        cmdStudent = new JButton("Student Record");
        cmdEmployee = new JButton("Employee Record");
        
        cmdRegSt.addActionListener(new RegisterStudentButtonListener()); 
        cmdStudent.addActionListener(new StudentButtonListener());
        cmdEmployee.addActionListener(new EmployeeButtonListener());

        cmdRegSt.setBackground(Color.CYAN);
        cmdStudent.setBackground(Color.CYAN);
        cmdEmployee.setBackground(Color.CYAN);

        pnlDisplay.add(new JLabel("ADMIN MENU"),BorderLayout.CENTER);
        pnlCommand.add(new JLabel("Select Option:"),BorderLayout.EAST);
        pnlCommand.add(cmdRegSt,BorderLayout.EAST );
        pnlCommand.add(cmdStudent,BorderLayout.CENTER);
        pnlCommand.add(cmdEmployee,BorderLayout.WEST);

        
        add(pnlDisplay); 
        add(pnlCommand);

        pack();
        setVisible(true);
    }

    /**
     * Represent an action listener for the register student button
     */
    private class RegisterStudentButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Forms().setVisible(true);
        }   
    }

    private class StudentButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new StudentRecord().setVisible(true);
        }   
    }
    private class EmployeeButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new EmployeeRecord().setVisible(true);
        }   
    }
}
