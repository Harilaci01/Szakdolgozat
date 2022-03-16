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
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Harsányi László
 */
public class drugs extends javax.swing.JFrame {    
    
    /**
     * Creates new form drugs
     */        
    public drugs() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("../pictures/icon.png")).getImage());
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        id = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        company = new javax.swing.JTextField();
        value = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        noStock = new javax.swing.JButton();
        getStock = new javax.swing.JButton();
        valuebox = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        contain = new javax.swing.JTextArea();
        info = new javax.swing.JLabel();
        sellStock = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gyógyszerek");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("Vissza");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 583, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Gyógyszer azonosító", "Megnevezés", "Gyártó", "Tartalma", "Mennyiség"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 696, 275));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 102, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 102, -1));
        getContentPane().add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 102, -1));

        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });
        getContentPane().add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 102, -1));

        jLabel1.setText("Gyógyszer azonosító:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel2.setText("Megnevezés:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 360, -1, -1));

        jLabel3.setText("Gyártó:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel4.setText("Tartalma:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel5.setText("Mennyiség:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 548, -1, -1));

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 328, 90, -1));

        noStock.setText("Elfogyott");
        noStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noStockActionPerformed(evt);
            }
        });
        getContentPane().add(noStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 548, -1, -1));

        getStock.setText("Feltölt");
        getStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getStockActionPerformed(evt);
            }
        });
        getContentPane().add(getStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 548, 77, -1));

        valuebox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10", "50", "100" }));
        getContentPane().add(valuebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 549, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Gyógyszerek");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        contain.setColumns(20);
        contain.setRows(5);
        jScrollPane3.setViewportView(contain);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 188, 116));
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(487, 414, -1, -1));

        sellStock.setText("Eltávolít");
        sellStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellStockActionPerformed(evt);
            }
        });
        getContentPane().add(sellStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 548, 77, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/drugs.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new home().setVisible(true);
        dispose();     
    }//GEN-LAST:event_BackActionPerformed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valueActionPerformed
  
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{
            String az=id.getText().replaceAll("[^0-9]","");
            String na=name.getText().replaceAll("[^A-Za-záéőúűóüöí0-9 /-]","");
            String co=company.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
            String ta=contain.getText().replaceAll("[^A-Za-záéőúűóüöí0-9 /-]","");
            String me=value.getText().replaceAll("[^0-9]","");      
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            TablaTorol(table);
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            id.setText(az);
            name.setText(na);
            company.setText(co);
            contain.setText(ta);
            value.setText(me);
            String sqlparancs="SELECT * FROM gyogyszerek ";
            String conditions="WHERE";
            if(!az.equals("")){
                conditions+=" gy_id=? AND";
            }
            if(!na.equals("")){
                conditions+=" nev LIKE ? AND";
            }
            if(!co.equals("")){
                conditions+=" gyarto LIKE ? AND";
            }
            if(!ta.equals("")){
                conditions+=" tartalma LIKE ? AND";
            }if(!me.equals("")){
                conditions+=" mennyiseg=? AND";
            }       
            if(conditions.equals("WHERE"))conditions="";
            else conditions=conditions.substring(0,conditions.length()-4);
            sqlparancs+=conditions;
            PreparedStatement pst=con.prepareStatement(sqlparancs);
            if(!az.equals("")&&!na.equals("")&&!co.equals("")&&!ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");
                pst.setString(3, "%"+co+"%");
                pst.setString(4, "%"+ta+"%");
                pst.setString(5, me);
                
            }
            if(!az.equals("")&&!na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2,"%"+ na+"%");
                pst.setString(3, "%"+co+"%");
                pst.setString(4, ta);                
            }
            if(!az.equals("")&&!na.equals("")&&!co.equals("")&&ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");
                pst.setString(3, "%"+co+"%");
                pst.setString(4, me);                
            }
            if(!az.equals("")&&!na.equals("")&&co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");
                pst.setString(3, "%"+ta+"%");
                pst.setString(4, me);                
            }
            if(!az.equals("")&&na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+co+"%");
                pst.setString(3, "%"+ta+"%");
                pst.setString(4, me);                
            }
            if(az.equals("")&&!na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, na);
                pst.setString(2, "%"+co+"%");
                pst.setString(3, "%"+ta+"%");
                pst.setString(4, me);                
            }
            if(!az.equals("")&&na.equals("")&&co.equals("")&&!ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+ta+"%");
                pst.setString(3, me);               
            }
            if(!az.equals("")&&!na.equals("")&&!co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2,"%"+ na+"%");
                pst.setString(3, "%"+co+"%");               
            }
            if(!az.equals("")&&!na.equals("")&&co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");
                pst.setString(3, "%"+ta+"%");               
            }
            if(!az.equals("")&&!na.equals("")&&co.equals("")&&!ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");
                pst.setString(3, me);               
            }
            if(!az.equals("")&&na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+co+"%");
                pst.setString(3, "%"+ta+"%");               
            }
            if(!az.equals("")&&na.equals("")&&!co.equals("")&&ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+co+"%");
                pst.setString(3, me);               
            }
            if(az.equals("")&&!na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, "%"+na+"%");
                pst.setString(2, "%"+co+"%");
                pst.setString(3, "%"+ta+"%");               
            }
            if(az.equals("")&&!na.equals("")&&!co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, "%"+na+"%");
                pst.setString(2, "%"+co+"%");              
            }
            if(az.equals("")&&na.equals("")&&!co.equals("")&&!ta.equals("")&&!me.equals("")){
                pst.setString(1,"%"+ co+"%");
                pst.setString(2,"%"+ ta+"%");       
                pst.setString(3, me);
            }
            if(az.equals("")&&na.equals("")&&!co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1,"%"+ co+"%");
                pst.setString(2,"%"+ ta+"%");       
            }           
            if(!az.equals("")&&na.equals("")&&co.equals("")&&ta.equals("")&&!me.equals("")){
                pst.setString(1, az);
                pst.setString(2, me);              
            }
            if(!az.equals("")&&na.equals("")&&co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+ta+"%");              
            }
            if(!az.equals("")&&na.equals("")&&!co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+co+"%");              
            }
            if(!az.equals("")&&!na.equals("")&&co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, az);
                pst.setString(2, "%"+na+"%");              
            }
            if(!az.equals("")&&na.equals("")&&co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, az);              
            }
            if(az.equals("")&&!na.equals("")&&co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, "%"+na+"%");              
            }
            if(az.equals("")&&na.equals("")&&!co.equals("")&&ta.equals("")&&me.equals("")){
                pst.setString(1, "%"+co+"%");              
            }
            if(az.equals("")&&na.equals("")&&co.equals("")&&!ta.equals("")&&me.equals("")){
                pst.setString(1,"%"+ ta+"%");              
            }
            if(az.equals("")&&na.equals("")&&co.equals("")&&ta.equals("")&&!me.equals("")){
                pst.setString(1, me);              
            }
            if(az.equals("")&&na.equals("")&&co.equals("")&&ta.equals("")&&me.equals("")){
                info.setForeground(Color.blue);
                info.setText("A kereséshez adjon meg adatot.");
            }else {
                info.setForeground(Color.blue);
                info.setText("A nem kívánatos karaktereket eltávolítottuk a helyes keresés érdekében.");
            }            
            ResultSet result=pst.executeQuery();
            
            String[] rekord=new String[5];
            while(result.next()){
                
                rekord[0]=result.getString("gy_id");
                rekord[1]=result.getString("nev");
                rekord[2]=result.getString("gyarto");
                rekord[3]=result.getString("tartalma");
                rekord[4]=result.getString("mennyiseg");                
               if(rekord[4].equals("0")){
                    rekord[4]="ELFOGYOTT";                    
                    model.addRow(rekord);       
                }
                else {model.addRow(rekord);}
            }
            if(model.getRowCount()==0){
                info.setForeground(Color.red);
                info.setText("A keresett adat(ok) nem szerepelnek a rendszerben.");
            } 
         
            con.close();            
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }        
    }//GEN-LAST:event_searchActionPerformed

    private void noStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noStockActionPerformed
        int sszam=table.getSelectedRow();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            String kiv=table.getValueAt(sszam, 0).toString();
            String van=table.getValueAt(sszam, 4).toString();
            if(van.equals("ELFOGYOTT")){
                info.setForeground(Color.red);
                info.setText("A gyógyszer eddig se volt raktáron.");
            }else{
                stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=0 WHERE gy_id='"+kiv+"'");
                TablaTorol(table);
                TablaFeltolt(table);                
                info.setText("");
            }
        }
        catch(Exception e){System.out.println("Hiba:"+e);
            
        }
    }//GEN-LAST:event_noStockActionPerformed

    private void getStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getStockActionPerformed
        int sszam=table.getSelectedRow();
        int va=Integer.parseInt(valuebox.getSelectedItem().toString());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            int kiv=Integer.parseInt(table.getValueAt(sszam, 0).toString());
            switch(va){
                case 1:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg+1 WHERE gy_id='"+kiv+"'");
                break;
                case 5:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg+5 WHERE gy_id='"+kiv+"'");
                break;
                case 10:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg+10 WHERE gy_id='"+kiv+"'");
                break;
                case 50:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg+50 WHERE gy_id='"+kiv+"'");
                break;
                case 100:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg+100 WHERE gy_id='"+kiv+"'");
                break;
            }
            info.setForeground(Color.blue);
            info.setText("A feltöltés sikeres!");
            TablaTorol(table);
            TablaFeltolt(table);
            
        }
        catch(Exception e){System.out.println("Hiba:"+e);
            
        }
    }//GEN-LAST:event_getStockActionPerformed

    private void sellStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellStockActionPerformed
        int sszam=table.getSelectedRow();
        int va=Integer.parseInt(valuebox.getSelectedItem().toString());
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            int kiv=Integer.parseInt(table.getValueAt(sszam, 0).toString());
            switch(va){
                case 1:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg-1 WHERE gy_id='"+kiv+"'");
                break;
                case 5:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg-5 WHERE gy_id='"+kiv+"'");
                break;
                case 10:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg-10 WHERE gy_id='"+kiv+"'");
                break;
                case 50:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg-50 WHERE gy_id='"+kiv+"'");
                break;
                case 100:stmt.executeUpdate("UPDATE `gyogyszerek` SET `mennyiseg`=mennyiseg-100 WHERE gy_id='"+kiv+"'");
                break;
            }
            info.setForeground(Color.blue);
            info.setText("A kívétel sikeres!");
            TablaTorol(table);
            TablaFeltolt(table);
            
        }
        catch(Exception e){System.out.println("Hiba:"+e);
            
        }
    }//GEN-LAST:event_sellStockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void TablaFeltolt(JTable JTable){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) JTable.getModel();
            ResultSet result=stmt.executeQuery("SELECT * FROM gyogyszerek");
            String[] rekord=new String[5];
            while(result.next()){
                rekord[0]=result.getString("gy_id");
                rekord[1]=result.getString("nev");
                rekord[2]=result.getString("gyarto");
                rekord[3]=result.getString("tartalma");
                rekord[4]=result.getString("mennyiseg"); 
                if(rekord[4].equals("0")){
                    rekord[4]="ELFOGYOTT";                    
                    model.addRow(rekord);
                   /* model.getRowCount();
                    JTable.setBackground(Color.RED);*/                }
                else {model.addRow(rekord);
                    //JTable.setBackground(Color.gray);
                }
            }
            con.close();
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        }
        //https://www.tutorialspoint.com/how-to-set-the-color-to-alternate-rows-of-jtable-in-java
        /*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class AlternateRowColorTableTest extends JFrame {
   public AlternateRowColorTableTest() {
      setTitle("AlternateRowColorTable Test");
      JTable table = new JTable(new Object[][] {{"115", "Ramesh"}, {"120", "Adithya"}, {"125", "Jai"}, {"130", "Chaitanya"}, {"135", "Raja"}}, new String[] {"Employee Id", "Employee Name"}) {
         public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
            Component comp = super.prepareRenderer(renderer, row, column);
            Color alternateColor = new Color(200, 201, 210);
            Color whiteColor = Color.WHITE;
            if(!comp.getBackground().equals(getSelectionBackground())) {
               Color c = (row % 2 == 0 ? alternateColor : whiteColor);
               comp.setBackground(bg);
               c = null;
            }
            return returnComp;
         }
      };
      add(new JScrollPane(table));
      setSize(400, 300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }
   public static void main(String[] args) {
      new AlternateRowColorTableTest();
   }
}*/
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
            java.util.logging.Logger.getLogger(drugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drugs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drugs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField company;
    private javax.swing.JTextArea contain;
    private javax.swing.JButton getStock;
    private javax.swing.JTextField id;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField name;
    private javax.swing.JButton noStock;
    private javax.swing.JButton search;
    private javax.swing.JButton sellStock;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField value;
    private javax.swing.JComboBox<String> valuebox;
    // End of variables declaration//GEN-END:variables
}
