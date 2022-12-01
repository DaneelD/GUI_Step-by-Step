/**
 *
 * @author antoniacurtis
 */
public class EmployeeRecord extends javax.swing.JFrame {

    /**
     * Creates new form SearchStudent
     */
    public EmployeeRecord() {
        initComponents();
    }
                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ModifyButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SeachLName = new javax.swing.JTextField();
        ViewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("EMPLOYEE RECORD");

        ModifyButton.setBackground(new java.awt.Color(0, 204, 153));
        ModifyButton.setText("MODIFY");
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(102, 204, 255));
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
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

        jLabel3.setText("Employee Last Name:");

        ViewButton.setText("VIEW");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
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
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ViewButton)
                        .addGap(31, 31, 31)
                        .addComponent(ModifyButton)
                        .addGap(38, 38, 38)
                        .addComponent(AddButton)
                        .addGap(43, 43, 43)
                        .addComponent(CloseButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(SeachLName, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SeachLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewButton)
                    .addComponent(ModifyButton)
                    .addComponent(AddButton)
                    .addComponent(CloseButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        System.exit(0);
    }                                           

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }                                          

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
    }                                            

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new EmployeeForm().setVisible(true);
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton CloseButton;
    private javax.swing.JButton ModifyButton;
    private javax.swing.JTextField SeachLName;
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}

