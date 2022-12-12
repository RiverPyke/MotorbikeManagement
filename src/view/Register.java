package view;

import javax.swing.JOptionPane;
import model.User;
import model.UserManager;

public class Register extends javax.swing.JDialog {

    //Variables
    private Login login;
    private String faceIDPath;
    private UserManager userManager;

    //Constructor
    public Register(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        login = (Login) parent;
    }

    //Getter and Setter
    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        fullNameTextField = new javax.swing.JTextField();
        faceIDLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        fullNameLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        faceIDScanButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Times New Roman", 3, 34)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Register A New User");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordLabel.setText("Password");

        usernameTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        usernameLabel.setText("User Name");

        fullNameTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        faceIDLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        faceIDLabel.setText("Face ID");

        passwordTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        fullNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fullNameLabel.setText("Full Name");

        emailTextField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        emailLabel.setText("Email");

        faceIDScanButton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        faceIDScanButton.setText("Scan");
        faceIDScanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faceIDScanButtonActionPerformed(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(102, 204, 255));
        registerButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(102, 204, 255));
        exitButton.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(titleLabel)
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTextField)
                    .addComponent(emailTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullNameLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(faceIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faceIDScanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(registerButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(fullNameTextField)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fullNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faceIDLabel)
                    .addComponent(faceIDScanButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(registerButton)
                    .addComponent(exitButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if (faceIDScanButton.isEnabled()) {
            JOptionPane.showMessageDialog(this, "Face ID is required!");
        } else if (!isEmpty()) {
            register();
        }
        this.dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void faceIDScanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faceIDScanButtonActionPerformed
        faceIDPath = "C:\\faceID\\" + usernameTextField.getText();
        if (usernameTextField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Username is invalid!");
        } else {
            FaceDetection faceDetection = new FaceDetection(login, rootPaneCheckingEnabled);
            faceDetection.setUsername(faceIDPath);
            faceDetection.setVisible(true);
            faceIDScanButton.setEnabled(false);
        }
    }//GEN-LAST:event_faceIDScanButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Register dialog = new Register(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel faceIDLabel;
    private javax.swing.JButton faceIDScanButton;
    private javax.swing.JLabel fullNameLabel;
    private javax.swing.JTextField fullNameTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

    //Check information is empty or not
    private boolean isEmpty() {
        if (usernameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is not valid!");
            return true;
        }
        if (passwordTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is not valid!");
            return true;
        }
        if (fullNameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fullname is not valid!");
            return true;
        }
        if (emailTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email is not valid!");
            return true;
        }
        return false;
    }

    //Register a new user
    private void register() {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();
        String fullName = fullNameTextField.getText();
        String email = emailTextField.getText();
        String faceIDPath = "C:\\\\faceID\\\\" + usernameTextField.getText();
        User user = new User(username, password, fullName, email, faceIDPath);

        if (userManager.register(user)) {
            JOptionPane.showMessageDialog(this, "Register successful!");
            usernameTextField.setText("");
            passwordTextField.setText("");
            fullNameTextField.setText("");
            emailTextField.setText("");
            faceIDScanButton.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Username has been existed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
