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

public class ParentOptions extends JFrame
{     
    private JButton     cmdRegSt;      
    private JPanel      pnlCommand;
    private JPanel      pnlDisplay;

    /**Constructor
     * 
     * @param 
     */
  
    public ParentOptions()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));
        setTitle("Parents Options");
        setPreferredSize(new Dimension(700,200));

        pnlCommand = new JPanel();
        pnlDisplay = new JPanel();
        pnlCommand.setSize(new Dimension(500,200));

        cmdRegSt = new JButton("Register New Student");
        cmdRegSt.addActionListener(new RegisterStudentButtonListener()); 
        cmdRegSt.setBackground(Color.CYAN);

        pnlDisplay.add(new JLabel("PARENTS MENU"),BorderLayout.CENTER);
        pnlCommand.add(new JLabel("Select Option:"),BorderLayout.EAST);
        pnlCommand.add(cmdRegSt,BorderLayout.CENTER );
        
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

}
