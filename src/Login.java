import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


/**
 * Extends the JFrame class
 * 
 * @author 
 */

public class Login extends JFrame
{
    private JTextField  txtUser;       
    private JTextField  txtPwd;     
    private JButton     cmdLogin;       
    private JPanel      pnlCommand;

    /**Constructor
     * 
     * @param 
     */
  
    public Login()
    {
        pnlCommand = new JPanel();

        pnlCommand.add(new JLabel("Username:")); 
        txtUser = new JTextField(3);
        pnlCommand.add(txtUser);
        pnlCommand.add(txtPwd);
        txtPwd = new JTextField(3);

        cmdLogin = new JButton("Login");

        cmdLogin.addActionListener(new LoginButtonListener());

        pnlCommand.add(cmdLogin);
        pack();
        setVisible(true);
    }

    /**
     * Represent an action listener for the login button
     */
    private class LoginButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            
        }   
    }

}
