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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fő oldal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logout.setText("Kijelentkezés");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Fő oldal");

        patiens.setText("Betegek");
        patiens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patiensActionPerformed(evt);
            }
        });

        workers.setText("Dolgozók");
        workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workersActionPerformed(evt);
            }
        });

        drugs.setText("Gyógyszerek");
        drugs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugsActionPerformed(evt);
            }
        });

        cures.setText("Kezelések");
        cures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curesActionPerformed(evt);
            }
        });

        visitors.setText("Látogatás");
        visitors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorsActionPerformed(evt);
            }
        });

        logins.setText("Bejelentkezések");
        logins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(295, Short.MAX_VALUE)
                        .addComponent(logout))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(title))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(workers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(patiens, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(drugs, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cures, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(visitors, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logins, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(28, 28, 28)
                .addComponent(patiens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(drugs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cures)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visitors)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logins)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(logout)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new login().setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void workersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workersActionPerformed
       new workers().setVisible(true);
       dispose();
    }//GEN-LAST:event_workersActionPerformed

    private void patiensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patiensActionPerformed
       new patiens().setVisible(true);
       dispose();
    }//GEN-LAST:event_patiensActionPerformed

    private void drugsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugsActionPerformed
       new drugs().setVisible(true);
       dispose();
    }//GEN-LAST:event_drugsActionPerformed

    private void curesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curesActionPerformed
       new cures().setVisible(true);
       dispose();        
    }//GEN-LAST:event_curesActionPerformed

    private void visitorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorsActionPerformed
       new visitors().setVisible(true);
       dispose();
    }//GEN-LAST:event_visitorsActionPerformed

    private void loginsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginsActionPerformed
       new logins().setVisible(true);
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
    private javax.swing.JButton logins;
    private javax.swing.JButton logout;
    private javax.swing.JButton patiens;
    private javax.swing.JLabel title;
    private javax.swing.JButton visitors;
    private javax.swing.JButton workers;
    // End of variables declaration//GEN-END:variables
}
