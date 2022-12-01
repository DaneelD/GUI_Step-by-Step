import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;

/**
@author Daneel Downer
*/


public class Forms extends JPanel 
{
    private JButton     cmdChild;
    private JButton     cmdParent;
    private JButton     cmdDoctor;
    private JButton     cmdEmergenctContact;
    private JButton     cmdDietary;
    private JButton     cmdUpload;
    private JButton     cmdClose;
  
    private JPanel      pnlCommand1;
    private JPanel      pnlCommand2;
    private JPanel      pnlDisplay1;
    private JPanel      pnlDisplay2;
    private JPanel      pnl;
    private JPanel      pnlforms;
    public JLabel      cbChild;
    public JLabel      cbParent;
    public JLabel      cbDoctor;
    public JLabel      cbEmer;

<<<<<<< Updated upstream
=======
    private Forms   thisForm;
    
    private ArrayList<Student>  studlist;

>>>>>>> Stashed changes
    public Forms() 
    {
        super(new GridLayout(4,1));
        thisForm = this;
        pnlforms = new JPanel();
        pnlforms.setLayout(new GridLayout(7,2));

        pnlforms.add(new JLabel("Child's Personal Form"));
        cbChild = new JLabel("<not complete>");
        pnlforms.add(cbChild);
        pnlforms.add(new JLabel("Parent's Information Form"));
        cbParent = new JLabel("<not complete>");
        pnlforms.add(cbParent);
        pnlforms.add(new JLabel("Doctor's Information Form"));
        cbDoctor = new JLabel("<not complete>");
        pnlforms.add(cbDoctor);
        pnlforms.add(new JLabel("Emergency Contact Form"));
        cbEmer = new JLabel("<not complete>");
        pnlforms.add(cbEmer);
        pnlforms.add(new JLabel("Dietary Form"));
        JLabel cbDiet = new JLabel("<not complete>");
        pnlforms.add(cbDiet);
      
        pnlCommand1 = new JPanel();
        pnlCommand2= new JPanel();
        pnlDisplay1 = new JPanel();
        pnlDisplay2 = new JPanel();
        pnl = new JPanel();
        pnl.setLayout(new BorderLayout());

        cmdChild = new JButton("Child's Personal Form");
        cmdParent = new JButton("Parent's Information Form");
        cmdDoctor = new JButton("Doctor's Information Form");
        cmdEmergenctContact  = new JButton("Emergency Contact Form");
        cmdDietary   = new JButton("Dietary Form");
        cmdUpload   = new JButton("Upload Documents");
        cmdClose = new JButton("Close");

        pnlDisplay1.add(new JLabel("Click on forms to fill out. Fill out all forms."));
        pnlCommand1.add(cmdChild);
        pnlCommand1.add(cmdParent);
        pnlCommand1.add(cmdDoctor);
        pnlCommand1.add(cmdEmergenctContact);
        pnlCommand1.add(cmdDietary);
        pnl.add(pnlDisplay1,BorderLayout.NORTH);
        pnl.add(pnlCommand1,BorderLayout.CENTER);

        pnlDisplay2.add(new JLabel("Click here to upload documents:"));
        pnlDisplay2.add(cmdUpload);

        cmdClose.addActionListener(new CloseButtonListener());
        cmdChild.addActionListener(new ChildFormButtonListener());
        cmdParent.addActionListener(new ParentFormButtonListener());
        cmdDoctor.addActionListener(new DoctorFormButtonListener());
        cmdEmergenctContact.addActionListener(new EmergencyContactButtonListener());
        cmdDietary.addActionListener(new DietaryButtonListener());
        cmdUpload.addActionListener(new UploadButtonListener()); 
        
        cmdClose.setBackground(Color.MAGENTA);
        //cmdSave  = new JButton("Save");
        pnlCommand2.add(cmdClose);
       
        add(pnlforms);
        add(pnl);
        add(pnlDisplay2);
        add(pnlCommand2);

    }




    public static void ShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Forms");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        Forms newContentPane = new Forms();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    /** 
     * Method to add student
     * @param s represent a student
     */
    public void addStudent(Student s)
    {
        studlist.add(s);
    }


    public static void main(String[] args) 
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
                public void run() {
                    ShowGUI();
                }
        });
    }

    private class CloseButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }

    }

    /**
     * listener class for "General Parent" button
     */
    private class ChildFormButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new ChildForm(thisForm);
        }
    }

    /**
     * listener class for "General Parent" button
     */
    private class ParentFormButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new ParentForm();
        }
    }


    /**
     * listener class for "General Parent" button
     */
    private class DoctorFormButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new DoctorForm();
        }
    }

    /**
     * listener class for "Emergency Contact Form" button
     */
    private class EmergencyContactButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new EmergencyContactForm();
        }
    }

    /**
     * listener class for "Upload Documents" button
     */
    private class UploadButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
           
        }
    }

    /**
     * listener class for "Dietary Form" button
     */
    private class DietaryButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent ap)
        {
            new DietaryForm();
        }
    }

}
