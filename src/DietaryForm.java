import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
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

    public Forms student;
    private JTextField txtname;
    
    public DietaryForm(){
        student = new Forms();
        setTitle("DIETARY'S INFORMATION");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(700,200));

        pnlDietary = new JPanel();
        pnlCommand = new JPanel();

        pnlDietary.setLayout(new GridLayout(4,2));
        
        pnlDietary.add(new JLabel("Student name"));
        txtname= new JTextField(40);
        pnlDietary.add(txtname);
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
            try
            {
                String name;
                String dietNeeds;
                String foodAlergies;
                String foodIntolerance;
                String religiousRestr;

                if(txtname.getText().isBlank())
                    name = "";
                else name = txtDietNeeds.getText();


                if(txtDietNeeds.getText().isBlank())
                    dietNeeds = "";
                else dietNeeds = txtDietNeeds.getText();

                if(txtFoodAlergies.getText().isBlank())
                foodAlergies = "";
                else foodAlergies = txtFoodAlergies.getText();

                if(txtFoodIntolerance.getText().isBlank())
                    foodIntolerance = "";
                else foodIntolerance = txtFoodIntolerance.getText();

                if(txtRelRestr.getText().isBlank())
                    religiousRestr = "";
                else religiousRestr = txtRelRestr.getText();
        
                if((dietNeeds.matches("[a-zA-Z]+"))&&(foodAlergies.matches("[a-zA-Z]+"))
                && (foodIntolerance.matches("[a-zA-Z]+"))&&(religiousRestr.matches("[a-zA-Z]+")))
                {
                    //student.studlist
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
            new DietaryForm();
} */
    
}
