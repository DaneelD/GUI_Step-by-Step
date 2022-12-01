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
    private JButton     cmdViewStReport;
    private JButton     cmdModifyStudent;

    private JButton     cmdEnterGrades;
    private JButton     cmdGenerateReport;

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
        cmdViewStReport = new JButton("View Student Record");
        cmdModifyStudent = new JButton("Modify Student Record");
        cmdEnterGrades= new JButton("Enter Student Grades");
        cmdGenerateReport = new JButton("Generate Student Report");
        
        cmdRegSt.addActionListener(new RegisterStudentButtonListener()); 
        cmdViewStReport.addActionListener(new ViewStudentReportButtonListener());
        cmdModifyStudent.addActionListener(new ModifyStudentReportButtonListener());
        cmdEnterGrades.addActionListener(new EnterGradesButtonListener());
        cmdGenerateReport.addActionListener(new GenerateReportButtonListener());

        cmdRegSt.setBackground(Color.CYAN);
        cmdViewStReport.setBackground(Color.CYAN);
        cmdModifyStudent.setBackground(Color.CYAN);
        cmdEnterGrades.setBackground(Color.CYAN);
        cmdGenerateReport.setBackground(Color.CYAN);

        pnlDisplay.add(new JLabel("ADMIN MENU"),BorderLayout.CENTER);
        pnlCommand.add(new JLabel("Select Option:"),BorderLayout.EAST);
        pnlCommand.add(cmdRegSt,BorderLayout.EAST );
        pnlCommand.add(cmdViewStReport,BorderLayout.CENTER);
        pnlCommand.add(cmdModifyStudent,BorderLayout.WEST);
        pnlCommand.add(cmdEnterGrades,BorderLayout.EAST);
        pnlCommand.add(cmdGenerateReport,BorderLayout.WEST);

        
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
            new Forms();
        }   
    }

    /**
     * Represent an action listener for the view student report button
     */
    private class ViewStudentReportButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }   
    }

    private class ModifyStudentReportButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }   
    }

    private class EnterGradesButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }   
    }

    private class GenerateReportButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }   
    }

    


public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        
                new AdminOptions();    
        }  
    }     
