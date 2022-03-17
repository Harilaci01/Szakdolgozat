package szakdolgozat;
import javax.swing.ImageIcon;
import static szakdolgozat.Szakdolgozat.id;

/**
 *
 * @author Harsányi László
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    
    public home() {          
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("../pictures/icon.png")).getImage());
        switch(id){
            case 2:
                workers.setVisible(false);
                logins.setVisible(false);                
                break;
            case 3:
                workers.setVisible(false);
                logins.setVisible(false);
                visitors.setVisible(false);
                break;
            case 5:
                drugs.setVisible(false);
                workers.setVisible(false);
                logins.setVisible(false);
                break;
            default:
                workers.setVisible(true);
                logins.setVisible(true);
                visitors.setVisible(true);
                drugs.setVisible(true);
                patiens.setVisible(true);
                
        }          
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logout = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        patiens = new javax.swing.JButton();
        workers = new javax.swing.JButton();
        drugs = new javax.swing.JButton();
        cures = new javax.swing.JButton();
        visitors = new javax.swing.JButton();
        logins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fő oldal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setText("Kijelentkezés");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Fő oldal");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 11, -1, -1));

        patiens.setText("Betegek");
        patiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patiensActionPerformed(evt);
            }
        });
        getContentPane().add(patiens, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 68, 200, -1));

        workers.setText("Dolgozók");
        workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workersActionPerformed(evt);
            }
        });
        getContentPane().add(workers, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 97, 200, -1));

        drugs.setText("Gyógyszerek");
        drugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsActionPerformed(evt);
            }
        });
        getContentPane().add(drugs, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 126, 200, -1));

        cures.setText("Kezelések");
        cures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curesActionPerformed(evt);
            }
        });
        getContentPane().add(cures, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 155, 200, -1));

        visitors.setText("Látogatás");
        visitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorsActionPerformed(evt);
            }
        });
        getContentPane().add(visitors, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 184, 200, -1));

        logins.setText("Bejelentkezések");
        logins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsActionPerformed(evt);
            }
        });
        getContentPane().add(logins, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 213, 200, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/home.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        login l=new login();
        l.setVisible(true);
        l.setLocationRelativeTo(null);
        dispose();    
    }//GEN-LAST:event_logoutActionPerformed

    private void workersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workersActionPerformed
        workers w= new workers();
        w.setVisible(true);
        w.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_workersActionPerformed

    private void patiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patiensActionPerformed
       patiens p=new patiens();
       p.setVisible(true);
       p.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_patiensActionPerformed

    private void drugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsActionPerformed
       drugs d=new drugs();
       d.setVisible(true);
       d.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_drugsActionPerformed

    private void curesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curesActionPerformed
       cures c=new cures();
       c.setVisible(true);
       c.setLocationRelativeTo(null);
       dispose();        
    }//GEN-LAST:event_curesActionPerformed

    private void visitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorsActionPerformed
       visitors v=new visitors();
       v.setVisible(true);
       v.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_visitorsActionPerformed

    private void loginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsActionPerformed
       logins l=new logins();
       l.setVisible(true);
       l.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_loginsActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cures;
    private javax.swing.JButton drugs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logins;
    private javax.swing.JButton logout;
    private javax.swing.JButton patiens;
    private javax.swing.JLabel title;
    private javax.swing.JButton visitors;
    private javax.swing.JButton workers;
    // End of variables declaration//GEN-END:variables
}
