/**
 *
 * @author antoniacurtis
 */
public class StudentRecord extends javax.swing.JFrame {

    /**
     * Creates new form SearchStudent
     */
    public StudentRecord() {
        initComponents();
    }                        
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        GradeButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SeachLName = new javax.swing.JTextField();
        SearchDOB = new javax.swing.JTextField();
        ViewButton = new javax.swing.JButton();
        ViewReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("STUDENT RECORD");

        ModifyButton.setBackground(new java.awt.Color(0, 204, 153));
        ModifyButton.setText("MODIFY");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        GradeButton.setBackground(new java.awt.Color(102, 204, 255));
        GradeButton.setText("ENTER GRADES");
        GradeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeButtonActionPerformed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(204, 0, 0));
        CloseButton.setText("EXIT");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Complete the fields below and select the desired option");

        jLabel3.setText("Student Last Name:");

        jLabel4.setText("Student Date of Birth:");

        ViewButton.setBackground(new java.awt.Color(255, 255, 0));
        ViewButton.setText("VIEW");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        ViewReport.setBackground(new java.awt.Color(255, 153, 51));
        ViewReport.setText("VIEW REPORT");
        ViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(ViewButton)
                                .addGap(234, 234, 234)
                                .addComponent(GradeButton))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(243, 243, 243)
                            .addComponent(SeachLName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ModifyButton)
                                .addComponent(SearchDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ViewReport)
                .addGap(77, 77, 77)
                .addComponent(CloseButton)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(SeachLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SearchDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifyButton)
                    .addComponent(GradeButton)
                    .addComponent(ViewButton))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewReport)
                    .addComponent(CloseButton))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }                      

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new LikeForm().setVisible(true);
    }                                            

    private void GradeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        new GradeForm().setVisible(true);
    }                                           

    private void ViewReportActionPerformed(java.awt.event.ActionEvent evt) {                                           

    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) { try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton GradeButton;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JTextField SeachLName;
    private javax.swing.JTextField SearchDOB;
    private javax.swing.JButton ViewButton;
    private javax.swing.JButton ViewReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}
