import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;


/**
 * Extends the JFrame class
 * 
 * @author 
 */

public class ParentOptions extends JFrame
{     
    private JButton     cmdRegSt;
    private JButton     cmdViewStReport;       
    private JPanel      pnlCommand;

    /**Constructor
     * 
     * @param 
     */
  
    public ParentOptions()
    {
        pnlCommand = new JPanel();
        pnlCommand.setSize(new Dimension(500,200));

        cmdRegSt = new JButton("Register New Student");
        cmdViewStReport = new JButton("View Student Record");
        
        cmdRegSt.addActionListener(new RegisterStudentButtonListener()); 
        cmdViewStReport.addActionListener(new ViewStudentReportButtonListener());

        cmdRegSt.setBackground(Color.CYAN);
        cmdViewStReport.setBackground(Color.CYAN);

        pnlCommand.add(new JLabel("WHO ARE YOU?"),BorderLayout.EAST);
        pnlCommand.add(cmdRegSt,BorderLayout.CENTER );
        pnlCommand.add(cmdViewStReport,BorderLayout.WEST);
 
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

}
