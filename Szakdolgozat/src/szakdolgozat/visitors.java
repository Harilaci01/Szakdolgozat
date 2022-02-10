/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szakdolgozat;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.StringTokenizer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harsányi László
 */
public class visitors extends javax.swing.JFrame {

    /**
     * Creates new form visitors
     */
    public visitors() {
        initComponents();
        TablaFeltolt(table);
    }

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
        visitor = new javax.swing.JTextField();
        patient = new javax.swing.JTextField();
        arrival = new javax.swing.JTextField();
        exit = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        front1 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        front2 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                "Látogató", "Beteg", "Belépés", "Távozás"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        visitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorActionPerformed(evt);
            }
        });

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        upload.setText("Feltöltés");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        front1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"-", "Dr.", "Mr.", "Miss", "Mrs." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(front1);

        front2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"-", "Dr.", "Mr.", "Miss", "Mrs." };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(front2);

        jLabel1.setText("Látogató neve:");

        jLabel2.setText("Beteg neve:");

        jLabel3.setText("Bejelentkezés:");

        jLabel4.setText("Távozás:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(318, 318, 318))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(59, 59, 59))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(visitor, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(arrival, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(154, 154, 154))
                                    .addComponent(upload)
                                    .addComponent(jLabel5)
                                    .addComponent(info)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Back)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(visitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(upload))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrival, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(info))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addComponent(Back))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       new home().setVisible(true);
       dispose();  
    }//GEN-LAST:event_BackActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String vi=visitor.getText();
        String pa=patient.getText();
        String ar=arrival.getText();
        String ex=exit.getText();
        StringTokenizer st;
        String fr=front1.getSelectedValue();
        String fr2=front2.getSelectedValue();
        String su="%";
        String fi="%";
        String mi,mi2;
        String su2="%";
        String fi2="%"; 
        String condition1="WHERE";
        String condition2="WHERE";
        String condition3="AND";
        if(fr.equals("-")){
            fr="";
        }
        if(fr2.equals("-")){
            fr2="";
        }
        st = new StringTokenizer(vi," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens())su = st.nextToken();
               if (st.hasMoreTokens())fi= st.nextToken();
               condition1+=" elotag LIKE ('%"+fr+"%') AND vezeteknev LIKE ('%"+su+"%') AND keresztnev LIKE ('%"+fi+"%') AND";
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1+=" masodik_keresztnev LIKE ('%"+mi+"%') AND";
               }
        }
        st = new StringTokenizer(pa," ");
        if(st.countTokens()>0){       
              if (st.hasMoreTokens()) su2 = st.nextToken();
              if (st.hasMoreTokens()) fi2= st.nextToken();
               condition2+=" elotag  LIKE ('%"+fr2+"%') AND vezeteknev LIKE ('%"+su2+"%') AND keresztnev LIKE ('%"+fi2+"%') AND";
               if (st.hasMoreTokens()){          
               mi2=st.nextToken();
               condition2+=" masodik_keresztnev LIKE ('%"+mi2+"%') AND";
               }
        }
        
        if(!ar.equals("")){
            condition3+=" bejelentkezes LIKE ('%"+ar+"%') AND";
        }
        if(!ex.equals("")){
            condition3+=" tavozas LIKE ('%"+ex+"%') AND";
        }
        int l_id,b_id;
        
        if(condition1.equals("WHERE"))condition1="";
            else condition1=condition1.substring(0,condition1.length()-4);
        if(condition2.equals("WHERE"))condition2="";
            else condition2=condition2.substring(0,condition2.length()-4);
        if(condition3.equals("AND"))condition3="";
            else{ condition3=condition3.substring(0,condition3.length()-4);
        condition3=condition3.substring(4,condition3.length());}
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();            
            TablaTorol(table);
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();            
            //SELECT * FROM `latogatas` WHERE b_id in (Select szem_id from szemely condition2) and l_id in (Select szem_id from szemely condition1) and condition3
            ResultSet result=stmt.executeQuery("SELECT * FROM `latogatas` WHERE b_id in (Select szem_id from szemely "+condition2+") and l_id in (Select szem_id from szemely "+condition1+") "+condition3);
            String[] rekord=new String[4];
            while(result.next()){
                ResultSet rs=stmt2.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("l_id"));            
                ResultSet rs2=stmt3.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("b_id"));
                if (!rs.next()) System.err.println("false");
                if (!rs2.next()) System.err.println("false");

                rekord[0]=rs.getString("vezeteknev")+" "+rs.getString("keresztnev")+" "+rs.getString("masodik_keresztnev");
                rekord[1]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");
                rekord[2]=result.getString("bejelentkezes");  
                rekord[3]=result.getString("tavozas");
                model.addRow(rekord);
            }
         
            con.close();
         }
        catch(Exception e){System.err.println("Hiba: "+e);
            
        }
    }//GEN-LAST:event_searchActionPerformed

    private void visitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitorActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
         String vi=visitor.getText();
         String pa=patient.getText();
         String ar=arrival.getText();
         String ex=exit.getText();
         StringTokenizer st;
         String fr=front1.getSelectedValue();
        String fr2=front2.getSelectedValue();
         if(fr.equals("-")){
            fr="";
        }
        if(fr2.equals("-")){
            fr2="";
        }
         String su,fi,mi,su2,fi2,mi2,condition1,condition2;
         st = new StringTokenizer(vi," ");
               su = st.nextToken();
               fi= st.nextToken();
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1=" AND masodik_keresztnev='"+mi+"'";
               }else condition1="";
        st = new StringTokenizer(pa," ");
               su2 = st.nextToken();
               fi2= st.nextToken();
               if (st.hasMoreTokens()){          
               mi2=st.nextToken();
               condition2=" AND masodik_keresztnev='"+mi2+"'";
               } else condition2="";
        int l_id,b_id;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();
            ResultSet result=stmt.executeQuery("SELECT * FROM latogatas WHERE bejelentkezes='"+ar+"' AND tavozas='"+ex+"'");
            if(result.next()){
                info.setForeground(Color.red);
                info.setText("A látogatás már szerepel a listában!"); 
            }
            else{
                ResultSet rs=stmt2.executeQuery("SELECT szem_id FROM szemely WHERE elotag='"+fr+"' AND vezeteknev='"+su+"' AND keresztnev='"+fi+"'"+condition1);
                ResultSet rs2=stmt3.executeQuery("SELECT szem_id FROM szemely WHERE elotag='"+fr2+"' AND vezeteknev='"+su2+"' AND keresztnev='"+fi2+"'"+condition2);
                rs.next();
                rs2.next();
                l_id=rs.getInt("szem_id");
                b_id=rs2.getInt("szem_id");
                stmt.executeUpdate("INSERT INTO latogatas (l_id, b_id, bejelentkezes, tavozas) VALUES ('"+l_id+"','"+b_id+"','"+ar+"','"+ex+"')");
                visitor.setText("");
                patient.setText("");
                arrival.setText("");
                exit.setText("");
                info.setText("A látogatás feltöltése sikeres!"); 
            }
            /*DefaultTableModel model=(DefaultTableModel) table.getModel();
            int ssz=model.getRowCount();
            for (int i = 0; i < ssz; i++) {
                model.removeRow(0);
            }
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();
            model=(DefaultTableModel) table.getModel();
            result=stmt.executeQuery("SELECT bejelentkezes, tavozas FROM latogatas ORDER BY lat_id");
            ResultSet rs1=stmt2.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN latogatas ON szemely.szem_id=latogatas.l_id ORDER BY lat_id");
            ResultSet rs2=stmt3.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN latogatas ON szemely.szem_id=latogatas.b_id ORDER BY lat_id");
            String[] rekord=new String[4];
            while(result.next()){
                rs1.next();
                rs2.next();
                rekord[0]=rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev");
                rekord[1]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");
                rekord[2]=result.getString("bejelentkezes");  
                rekord[3]=result.getString("tavozas");
                model.addRow(rekord);
            }*/
            TablaTorol(table);
            TablaFeltolt(table);
            con.close();
        }
        
        
        catch(Exception e){System.err.println("Hiba: "+e);
        }
    }//GEN-LAST:event_uploadActionPerformed

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
            java.util.logging.Logger.getLogger(visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visitors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visitors().setVisible(true);
            }
        });
    }
    public static void TablaFeltolt(JTable JTable){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) JTable.getModel();
            ResultSet result=stmt.executeQuery("SELECT bejelentkezes, tavozas FROM latogatas ORDER BY lat_id");
            ResultSet rs1=stmt2.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN latogatas ON szemely.szem_id=latogatas.l_id ORDER BY lat_id");
            ResultSet rs2=stmt3.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN latogatas ON szemely.szem_id=latogatas.b_id ORDER BY lat_id");
            String[] rekord=new String[4];
            while(result.next()){
                rs1.next();
                rs2.next();
                rekord[0]=rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev");
                rekord[1]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");
                rekord[2]=result.getString("bejelentkezes");  
                rekord[3]=result.getString("tavozas");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField arrival;
    private javax.swing.JTextField exit;
    private javax.swing.JList<String> front1;
    private javax.swing.JList<String> front2;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField patient;
    private javax.swing.JButton search;
    private javax.swing.JTable table;
    private javax.swing.JButton upload;
    private javax.swing.JTextField visitor;
    // End of variables declaration//GEN-END:variables
}
