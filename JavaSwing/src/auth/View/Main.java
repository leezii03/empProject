package auth.View;

import Component.AlertMessager;
import Datebase.DBConnector;
import Themes.Theme;
import com.mysql.jdbc.PreparedStatement;
import home.view.HomeScreen;
import javax.swing.ImageIcon;
import java.sql.*;

public class Main extends javax.swing.JFrame {

    /*
    private void addAuthScreen(Component screen)
    {
        authScreen.removeAll();
        authScreen.add(screen);
        authScreen.repaint();
        authScreen.revalidate();
        
    }
*/
    public Main() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainScreen = new javax.swing.JPanel();
        authScreen = new javax.swing.JPanel();
        SignIn = new javax.swing.JPanel();
        GoToSignUp = new javax.swing.JLabel();
        Password1 = new javax.swing.JLabel();
        TitleSignIn = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        InputPassword1 = new javax.swing.JTextField();
        InputEmail1 = new javax.swing.JTextField();
        ButtonSignIn = new com.k33ptoo.components.KButton();
        InformSignIn1 = new javax.swing.JLabel();
        SignUp = new javax.swing.JPanel();
        Email2 = new javax.swing.JLabel();
        TitleSignUp = new javax.swing.JLabel();
        GoToSignIn = new javax.swing.JLabel();
        InputEmail2 = new javax.swing.JTextField();
        Password2 = new javax.swing.JLabel();
        InputPassword2 = new javax.swing.JTextField();
        CFPassword = new javax.swing.JLabel();
        InputCFPassword = new javax.swing.JTextField();
        ButtonSignUp = new com.k33ptoo.components.KButton();
        InformSignUp = new javax.swing.JLabel();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        MainScreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        authScreen.setLayout(new java.awt.CardLayout());

        SignIn.setBackground(new java.awt.Color(255, 255, 255));
        SignIn.setPreferredSize(new java.awt.Dimension(900, 600));
        SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoToSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GoToSignUp.setForeground(new java.awt.Color(45, 45, 45));
        GoToSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToSignUp.setText("Create New Account ?");
        GoToSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToSignUpMouseClicked(evt);
            }
        });
        SignIn.add(GoToSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 600, 50));

        Password1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password1.setForeground(new java.awt.Color(45, 45, 45));
        Password1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Password1.setText("Password       :");
        Password1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignIn.add(Password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 120, 50));

        TitleSignIn.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TitleSignIn.setForeground(new java.awt.Color(45, 45, 45));
        TitleSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleSignIn.setText("SIGN IN");
        SignIn.add(TitleSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 600, 50));

        Email1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email1.setForeground(new java.awt.Color(45, 45, 45));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email1.setText("Email              :");
        Email1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignIn.add(Email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 120, 50));

        InputPassword1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InputPassword1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignIn.add(InputPassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 300, 50));

        InputEmail1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InputEmail1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        InputEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmail1ActionPerformed(evt);
            }
        });
        SignIn.add(InputEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 300, 50));

        ButtonSignIn.setText("Log In");
        ButtonSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonSignIn.setkBorderRadius(45);
        ButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSignInActionPerformed(evt);
            }
        });
        SignIn.add(ButtonSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        InformSignIn1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InformSignIn1.setForeground(new java.awt.Color(45, 45, 45));
        InformSignIn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InformSignIn1.setText("Welcome back, Continue with your Gmail and Password");
        SignIn.add(InformSignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 590, 50));

        authScreen.add(SignIn, "card2");

        SignUp.setBackground(new java.awt.Color(255, 255, 255));
        SignUp.setPreferredSize(new java.awt.Dimension(900, 600));
        SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Email2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email2.setForeground(new java.awt.Color(45, 45, 45));
        Email2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email2.setText("Email                       :");
        Email2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignUp.add(Email2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 50));

        TitleSignUp.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        TitleSignUp.setForeground(new java.awt.Color(45, 45, 45));
        TitleSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleSignUp.setText("SIGN UP");
        SignUp.add(TitleSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 16, 600, 40));

        GoToSignIn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GoToSignIn.setForeground(new java.awt.Color(45, 45, 45));
        GoToSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GoToSignIn.setText("Do you have an account ?");
        GoToSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoToSignInMouseClicked(evt);
            }
        });
        SignUp.add(GoToSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 600, 40));

        InputEmail2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InputEmail2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InputEmail2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        InputEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEmail2ActionPerformed(evt);
            }
        });
        SignUp.add(InputEmail2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 290, 50));

        Password2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password2.setForeground(new java.awt.Color(45, 45, 45));
        Password2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Password2.setText("Password                :");
        Password2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignUp.add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 50));

        InputPassword2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InputPassword2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InputPassword2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        InputPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPassword2ActionPerformed(evt);
            }
        });
        SignUp.add(InputPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 290, 50));

        CFPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CFPassword.setForeground(new java.awt.Color(45, 45, 45));
        CFPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CFPassword.setText("Confirm Password :");
        CFPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        SignUp.add(CFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 50));

        InputCFPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InputCFPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        InputCFPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(45, 45, 45)));
        InputCFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCFPasswordActionPerformed(evt);
            }
        });
        SignUp.add(InputCFPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 290, 50));

        ButtonSignUp.setText("Sign Up");
        ButtonSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ButtonSignUp.setkBorderRadius(45);
        ButtonSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSignUpActionPerformed(evt);
            }
        });
        SignUp.add(ButtonSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, -1, -1));

        InformSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        InformSignUp.setForeground(new java.awt.Color(45, 45, 45));
        InformSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InformSignUp.setText("Create New Account");
        SignUp.add(InformSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 600, 40));

        authScreen.add(SignUp, "card3");

        MainScreen.add(authScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 600, 500));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/SignIn1.jpg"))); // NOI18N
        MainScreen.add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainScreen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(900, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InputEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEmail1ActionPerformed

    private void ButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSignInActionPerformed
        String email = InputEmail1.getText();
        String password = InputPassword1.getText();
        
        if(!email.isEmpty() && !password.isEmpty()){
            
            try {
                String sql = "SELECT `id` FROM `authantication` WHERE `email` = ? AND `password` = MD5(?)";
                DBConnector connector = new DBConnector();
                PreparedStatement ps;
                ResultSet rs ;
                
                ps = (PreparedStatement) connector.connector().prepareStatement(sql);
                ps.setString(1, email);
                ps.setString(2,password);
                
                rs = ps.executeQuery();
                
                if(rs.next()){
                    new HomeScreen().setVisible(true);
                    dispose();
                }else{
                    AlertMessager.error("Your Account Not Found");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_ButtonSignInActionPerformed

    private void InputEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputEmail2ActionPerformed

    private void InputPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPassword2ActionPerformed

    private void InputCFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputCFPasswordActionPerformed

    private void GoToSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToSignUpMouseClicked
        authScreen.removeAll();
        authScreen.add(SignUp);
        authScreen.repaint();
        authScreen.revalidate();
        Image.setIcon(new ImageIcon("D:/Java Etec/JavaSwing/src/Image/SignUp1.jpg"));
    }//GEN-LAST:event_GoToSignUpMouseClicked

    private void GoToSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoToSignInMouseClicked
        authScreen.removeAll();
        authScreen.add(SignIn);
        authScreen.repaint();
        authScreen.revalidate();
        Image.setIcon(new ImageIcon("D:/Java Etec/JavaSwing/src/Image/SignIn1.jpg"));
    }//GEN-LAST:event_GoToSignInMouseClicked

    private void ButtonSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSignUpActionPerformed
            String email = InputEmail2.getText();
            String password = InputPassword2.getText();
            String cfpassword = InputCFPassword.getText();

            if(!email.isEmpty() || !password.isEmpty() || !cfpassword.isEmpty()){
                if(password.equals(cfpassword)){
                    DBConnector connector = new DBConnector();

                    PreparedStatement ps ;
                    ResultSet rs ;
                    String sql = "SELECT `email` FROM `authantication` WHERE email = ?";
                    try {
                        ps = (PreparedStatement) connector.connector().prepareStatement(sql);
                        ps.setString(1, email);
                        rs = ps.executeQuery();
                        if(rs.next()){
                            AlertMessager.error("Your Email is used");
                        }else{
                            String sql1 = "INSERT INTO `authantication`(`email`, `password`) VALUES (?,MD5(?))";
                            ps = (PreparedStatement) connector.connector().prepareStatement(sql1);
                            ps.setString(1 , email);
                            ps.setString(2, password);
                            int result = ps.executeUpdate();

                            if(result > 0){
                                AlertMessager.success("Create Account Success");
                                new HomeScreen().setVisible(true);
                                dispose();
                            }else{
                                AlertMessager.error("Can't Create Account");
                            }
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }else{
                    AlertMessager.warning("Your Confirm Password is incorrect");
                }
            }else{
                AlertMessager.warning("Please Enter You Data");
            }
    }//GEN-LAST:event_ButtonSignUpActionPerformed

    public static void main(String args[]) {
        new Theme("light");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton ButtonSignIn;
    private com.k33ptoo.components.KButton ButtonSignUp;
    private javax.swing.JLabel CFPassword;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel Email2;
    private javax.swing.JLabel GoToSignIn;
    private javax.swing.JLabel GoToSignUp;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel InformSignIn1;
    private javax.swing.JLabel InformSignUp;
    private javax.swing.JTextField InputCFPassword;
    private javax.swing.JTextField InputEmail1;
    private javax.swing.JTextField InputEmail2;
    private javax.swing.JTextField InputPassword1;
    private javax.swing.JTextField InputPassword2;
    private javax.swing.JPanel MainScreen;
    private javax.swing.JLabel Password1;
    private javax.swing.JLabel Password2;
    private javax.swing.JPanel SignIn;
    private javax.swing.JPanel SignUp;
    private javax.swing.JLabel TitleSignIn;
    private javax.swing.JLabel TitleSignUp;
    private javax.swing.JPanel authScreen;
    // End of variables declaration//GEN-END:variables
}
