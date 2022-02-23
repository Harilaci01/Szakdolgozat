/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harsányi László
 */
public class workers extends javax.swing.JFrame {


    public workers() {
        initComponents();
        ElotagBeszur(front);
        TablaFeltolt(table);
        password.setVisible(false);
        workers.setVisible(false);
        database.setVisible(false);
        confirm.setVisible(false);
        
    }

/**
     * Creates new form workers
     */
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        job = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        fire = new javax.swing.JButton();
        hire = new javax.swing.JButton();
        front = new javax.swing.JComboBox<>();
        reset = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        database = new javax.swing.JButton();
        workers = new javax.swing.JButton();
        confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dolgozók");

        Back.setText("Vissza");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Név", "Beosztás", "Felhasználó"
            }
        ));
        jScrollPane1.setViewportView(table);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel1.setText("Név:");

        jLabel2.setText("Beosztás:");

        jLabel3.setText("Felhasználó:");

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        fire.setText("Elbocsát");
        fire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireActionPerformed(evt);
            }
        });

        hire.setText("Felvesz");
        hire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireActionPerformed(evt);
            }
        });

        front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontActionPerformed(evt);
            }
        });

        reset.setText("Összes dolgozó");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        database.setText("Adatbázisból");
        database.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databaseActionPerformed(evt);
            }
        });

        workers.setText("Dolgozókból");
        workers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workersActionPerformed(evt);
            }
        });

        confirm.setText("Véglegesít");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(job, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(username)
                            .addComponent(name)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(info)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(search)
                                .addGap(18, 18, 18)
                                .addComponent(reset)
                                .addGap(18, 18, 18)
                                .addComponent(fire))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(database)
                                .addGap(26, 26, 26)
                                .addComponent(workers)
                                .addGap(18, 18, 18)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(hire)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Back)
                            .addComponent(confirm))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(front, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hire)
                            .addComponent(search)
                            .addComponent(fire)
                            .addComponent(reset))
                        .addGap(28, 28, 28)
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(database)
                            .addComponent(workers)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirm))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new home().setVisible(true);
        dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String na=name.getText();
        String jo=job.getText();
        String us=username.getText();
        StringTokenizer st;
        String fr=front.getSelectedItem().toString();
        String su="%";
        String fi="%";
        String mi;        
        String condition1="WHERE elotag LIKE ('"+fr+"') AND";
        st = new StringTokenizer(na," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens())su = st.nextToken();
               if (st.hasMoreTokens())fi= st.nextToken();
               condition1+=" vezeteknev LIKE ('%"+su+"%') AND keresztnev LIKE ('%"+fi+"%') AND";
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1+=" masodik_keresztnev LIKE ('%"+mi+"%') AND";
               }
        }       
        
        if(!jo.equals("")){
            condition1+=" beosztas.megnevezes LIKE ('%"+jo+"%') AND";
        }
        if(!us.equals("")){
            condition1+=" felhasznalo LIKE ('%"+us+"%') AND";
        }
        
        if(condition1.equals("WHERE"))condition1="";
            else condition1=condition1.substring(0,condition1.length()-4);
        /*if(condition2.equals("AND"))condition2="";
            else condition2=condition2.substring(0,condition2.length()-4);
        if(condition3.equals("AND"))condition3="";
            else{ condition3=condition3.substring(0,condition3.length()-4);
        condition3=condition3.substring(4,condition3.length());}*/
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();            
            TablaTorol(table);
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();            
            //SELECT * FROM `latogatas` WHERE b_id in (Select szem_id from szemely condition2) and l_id in (Select szem_id from szemely condition1) and condition3
            ResultSet result=stmt.executeQuery("SELECT szemely.elotag, szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev, dolgozok.felhasznalo, beosztas.megnevezes FROM dolgozok INNER JOIN beosztas ON beosztas.beosz_id=dolgozok.beosz_id INNER JOIN szemely ON szemely.szem_id=dolgozok.d_id "+condition1);
            String[] rekord=new String[3];
            while(result.next()){
                rekord[0]=result.getString("elotag")+" "+result.getString("vezeteknev")+" "+result.getString("keresztnev")+" "+result.getString("masodik_keresztnev");
                rekord[1]=result.getString("beosztas.megnevezes");  
                rekord[2]=result.getString("felhasznalo");
                model.addRow(rekord);
            }
         
            con.close();
         }
        catch(Exception e){System.err.println("Hiba: "+e);
            
        }   
    }//GEN-LAST:event_searchActionPerformed

    private void frontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frontActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        TablaTorol(table);
        TablaFeltolt(table);
    }//GEN-LAST:event_resetActionPerformed

    private void hireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireActionPerformed
        password.setVisible(true);     
        confirm.setVisible(true);
        info.setForeground(Color.blue);
        info.setText("Kérem adjon meg egy jelszót");
    }//GEN-LAST:event_hireActionPerformed

    private void fireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireActionPerformed
        info.setForeground(Color.blue);
        info.setText("Kérem válasszon honnan szeretné törölni a személyt");
        workers.setVisible(true);
        database.setVisible(true);
        
    }//GEN-LAST:event_fireActionPerformed

    private void databaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databaseActionPerformed
        StringTokenizer st;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            int sszam=table.getSelectedRow();
            String sszamS=table.getValueAt(sszam, 1).toString();
            String torles[]=new String[4];
            for (int i = 0; i < 4; i++) {
                st = new StringTokenizer(sszamS," ");
                if (st.hasMoreTokens()) torles[i]=st.nextToken();
            }            
            stmt.executeUpdate("DELETE FROM szemely WHERE elotag='"+torles[0]+"' AND vezeteknev='"+torles[1]+"' AND keresztnev='"+torles[2]+"' AND masodik_keresztnev='"+torles[3]+"'");
            TablaTorol(table);
            TablaFeltolt(table);
            info.setForeground(Color.green);
            info.setText("A törlés sikeres!");
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }
    }//GEN-LAST:event_databaseActionPerformed

    private void workersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workersActionPerformed
        StringTokenizer st;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            int sszam=table.getSelectedRow();
            String sszamS=table.getValueAt(sszam, 1).toString();
            String torles[]=new String[4];
            int d_id;
            for (int i = 0; i < 4; i++) {
                st = new StringTokenizer(sszamS," ");
                if (st.hasMoreTokens()) torles[i]=st.nextToken();
            }            
            ResultSet result=stmt.executeQuery("Select d_id FROM szemely WHERE elotag='"+torles[0]+"' AND vezeteknev='"+torles[1]+"' AND keresztnev='"+torles[2]+"' AND masodik_keresztnev='"+torles[3]+"'");
            result.next();
            d_id=result.getInt("d_id");
            stmt.executeUpdate("DELETE FROM dolgozok WHERE d_id='"+d_id+"'");            
            TablaTorol(table);
            TablaFeltolt(table);
            info.setForeground(Color.green);
            info.setText("A törlés sikeres!");
            
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }
    }//GEN-LAST:event_workersActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String na=name.getText();
        String jo=job.getText();
        String us=username.getText();       
        String pw=String.valueOf(password.getPassword());
        StringTokenizer st;
        String fr=front.getSelectedItem().toString();
        String su="%";
        String fi="%";
        String mi="";        
        String condition1="WHERE elotag LIKE ('"+fr+"') AND"; 
        st = new StringTokenizer(na," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens())su = st.nextToken();
               if (st.hasMoreTokens())fi= st.nextToken();
               condition1+=" vezeteknev LIKE ('%"+su+"%') AND keresztnev LIKE ('%"+fi+"%') AND";
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1+=" masodik_keresztnev LIKE ('%"+mi+"%') AND";
               }
        }       
        
        if(!jo.equals("")){
            condition1+=" beosztas.megnevezes LIKE ('%"+jo+"%') AND";
        }
        if(!us.equals("")){
            condition1+=" felhasznalo LIKE ('%"+us+"%') AND";
        }
        
        if(condition1.equals("WHERE"))condition1="";
            else condition1=condition1.substring(0,condition1.length()-4);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
           ResultSet result=stmt.executeQuery("SELECT * FROM szemely WHERE elotag='"+fr+"' AND vezeteknev='"+su+"' AND keresztnev='"+fi+"' AND masodik_keresztnev='"+mi+"'");
            if(result.next()){                
                result=stmt.executeQuery("SELECT d_id FROM dolgozok INNER JOIN szemely ON szemely.szem_id=dolgozok.d_id WHERE elotag='"+fr+"' AND vezeteknev='"+su+"' AND keresztnev='"+fi+"' AND masodik_keresztnev='"+mi+"'");
                if(!result.next()){
                stmt.executeUpdate("INSERT INTO dolgozok (d_id, beosz_id, felhasznalo, jelszo) VALUES ((SELECT szem_id FROM szemely ORDER BY szem_id DESC LIMIT 1),(SELECT beosz_id FROM beosztas WHERE beosztas.megnevezes LIKE ('%"+jo+"%')),'"+us+"','"+pw+"')");
                }else {
                    info.setForeground(Color.red);
                    info.setText("A személy már szerepel a listában!"); 
                }
            }
            
            else if(stmt.executeUpdate("INSERT INTO szemely (elotag, vezeteknev, keresztnev, masodik_keresztnev) VALUES ('"+fr+"','"+su+"','"+fi+"','"+mi+"')")>0){
                stmt.executeUpdate("INSERT INTO dolgozok (d_id, beosz_id, felhasznalo, jelszo) VALUES ((SELECT szem_id FROM szemely ORDER BY szem_id DESC LIMIT 1),(SELECT beosz_id FROM beosztas WHERE beosztas.megnevezes LIKE ('%"+jo+"%')),'"+us+"','"+pw+"')");
                info.setText("");
            }
            password.setVisible(false);     
            confirm.setVisible(false);
        
            
       }
       catch(Exception e){System.err.println("Hiba: "+e);
        
        }
    }//GEN-LAST:event_confirmActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void TablaFeltolt(JTable JTable){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) JTable.getModel();
            ResultSet rs1=stmt.executeQuery("SELECT szemely.elotag,szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN dolgozok ON szemely.szem_id=dolgozok.d_id ORDER BY d_id");
            ResultSet rs2=stmt2.executeQuery("SELECT felhasznalo, beosztas.megnevezes FROM dolgozok INNER JOIN beosztas ON dolgozok.beosz_id=beosztas.beosz_id ORDER BY d_id");
            String[] rekord=new String[3];
            while(rs1.next()){
                rs2.next();
                rekord[0]=rs1.getString("elotag")+" "+rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev"); 
                rekord[1]=rs2.getString("megnevezes");
                rekord[2]=rs2.getString("felhasznalo");
                model.addRow(rekord);
            }
            con.close();
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }
    }
    public static void TablaTorol(JTable JTable){
        try{
            DefaultTableModel model=(DefaultTableModel) JTable.getModel();
            int ssz=model.getRowCount();
            for (int i = 0; i < ssz; i++) {
                model.removeRow(0);
            }
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }
    }
    public static void ElotagBeszur(JComboBox belist){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            String sqlparancs="SELECT DISTINCT elotag FROM szemely ORDER BY elotag";
            PreparedStatement pst=con.prepareStatement(sqlparancs);
            ResultSet rs=pst.executeQuery();
            ArrayList<String> elotagok=new ArrayList<String>();
            while(rs.next())elotagok.add(rs.getString("elotag"));
            con.close();
            for (int i = 0; i < elotagok.size(); i++) {
                belist.addItem(elotagok.get(i));
            }
        }
        catch(Exception e){
            
        }
    }
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
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new workers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton confirm;
    private javax.swing.JButton database;
    private javax.swing.JButton fire;
    private javax.swing.JComboBox<String> front;
    private javax.swing.JButton hire;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField job;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTable table;
    private javax.swing.JTextField username;
    private javax.swing.JButton workers;
    // End of variables declaration//GEN-END:variables
}
