package szakdolgozat;
import java.sql.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import static szakdolgozat.Szakdolgozat.id;
public class login extends javax.swing.JFrame {

    public login() {
        initComponents(); 
        this.setIconImage(new ImageIcon(getClass().getResource("../pictures/icon.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        button = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bejelentkezés");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setText("Bejelentkezés");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 11, -1, -1));

        username.setText("Felhasználónév:");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 71, -1, -1));

        password.setText("Jelszó:");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 123, -1, -1));

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 68, 155, -1));
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 120, 155, -1));

        button.setForeground(new java.awt.Color(0, 153, 0));
        button.setText("Belépés");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        getContentPane().add(button, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 98, 40));
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/doctor-ge3daf9422_640.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String n=user.getText();
        String p=String.valueOf(pw.getPassword());    
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            String sqlparancs="SELECT * FROM dolgozok WHERE felhasznalo=? AND jelszo=?";
            PreparedStatement pst=con.prepareStatement(sqlparancs);
            pst.setString(1, n); 
            pst.setString(2,p);
            ResultSet rs=pst.executeQuery();
            if(n.equals("")&&p.equals("")){
                info.setForeground(Color.red);
                info.setText("Kérem adjon meg belépési adatot!");
            }
            else{               
                if(rs.next()){
                   id=rs.getInt("beosz_id");
                   new home().setVisible(true);
                   dispose();    
                   sqlparancs="INSERT INTO bejelentkezes (f_id) VALUES ((SELECT dolgozok.d_id FROM dolgozok WHERE felhasznalo=?))";
                   pst=con.prepareStatement(sqlparancs);
                   pst.setString(1, n);         
                   pst.executeUpdate();
                }
                else{
                    info.setForeground(Color.red);
                    info.setText("Rossz belépési adatok!");
                }
            }            
            con.close();
                
        }
        catch(Exception e){System.err.println(e);
            info.setForeground(Color.red);
            info.setText("Nem sikerült csatlakozni a szerverhez!");
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton button;
    private javax.swing.JLabel info;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField pw;
    private javax.swing.JLabel title;
    private javax.swing.JTextField user;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
