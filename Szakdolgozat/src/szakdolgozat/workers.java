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
import javax.swing.ImageIcon;
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
        this.setIconImage(new ImageIcon(getClass().getResource("/pictures/icon.png")).getImage());
        ElotagBeszur(front);
        TablaFeltolt(tablew);
        password.setVisible(false);
        confirm.setVisible(false);
        activate.setVisible(false);
        info.setForeground(Color.white);
        info.setText("Kérem adjon meg adatokat a kereséshez.");
        
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
        tablew = new javax.swing.JTable();
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
        nonactive = new javax.swing.JButton();
        activate = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dolgozók");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("Vissza");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 316, -1, -1));

        tablew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Név", "Beosztás", "Felhasználó"
            }
        ));
        jScrollPane1.setViewportView(tablew);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 389, 275));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 36, 155, -1));
        getContentPane().add(job, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 70, 155, -1));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 103, 155, -1));

        jLabel1.setText("Név:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 39, -1, -1));

        jLabel2.setText("Beosztás:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 73, -1, -1));

        jLabel3.setText("Felhasználó:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 106, -1, -1));

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 35, -1, -1));

        fire.setText("Elbocsát");
        fire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fireActionPerformed(evt);
            }
        });
        getContentPane().add(fire, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 175, 100, -1));

        hire.setText("Felvesz");
        hire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hireActionPerformed(evt);
            }
        });
        getContentPane().add(hire, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 141, 82, -1));

        front.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontActionPerformed(evt);
            }
        });
        getContentPane().add(front, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        reset.setText("Összes dolgozó");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 69, -1, -1));
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 236, 419, 18));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 142, 155, -1));

        nonactive.setText("Nem aktív dolgozók");
        nonactive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonactiveActionPerformed(evt);
            }
        });
        getContentPane().add(nonactive, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        activate.setText("Aktívál");
        activate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activateActionPerformed(evt);
            }
        });
        getContentPane().add(activate, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, -1, -1));

        confirm.setText("Véglegesít");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        getContentPane().add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(721, 141, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Dolgozók");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/workers.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        home h = new home();
                   h.setVisible(true);
                   h.setLocationRelativeTo(null);
                   dispose();            // Új főoldal megjelenitése
    }//GEN-LAST:event_BackActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String na=name.getText().replaceAll("[^A-Za-záéőúűóüöí /%/-]","");
        String jo=job.getText().replaceAll("[^A-Za-záéőúűóüöí ]","");
        String us=username.getText();
        StringTokenizer st;
        String fr=front.getSelectedItem().toString();
        String su="";
        String fi="";
        String mi="";        
        String condition1="WHERE elotag LIKE ('"+fr+"') AND";
        password.setVisible(false);
        confirm.setVisible(false);
        activate.setVisible(false);
        String sqlparancs="SELECT szemely.elotag, szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev, dolgozok.felhasznalo, beosztas.megnevezes FROM dolgozok INNER JOIN beosztas ON beosztas.beosz_id=dolgozok.beosz_id INNER JOIN szemely ON szemely.szem_id=dolgozok.d_id co1";
        if(na.equals(""))na="%";
        if(na.equals("%")){
            su="%";
            mi="%";
            fi="%";
            condition1 += " vezeteknev LIKE ? AND keresztnev LIKE ? AND masodik_keresztnev LIKE ? AND";
        }else{
            st = new StringTokenizer(na, " ");
            if (st.countTokens() > 0) {
                if (st.hasMoreTokens()) {
                    su = st.nextToken();
                    condition1 += " vezeteknev LIKE ? AND";
                }
                if (st.hasMoreTokens()) {
                    fi = st.nextToken();
                }else fi="%";
                condition1 += " keresztnev LIKE ? AND";
                if (st.hasMoreTokens()) {
                    mi = st.nextToken();                     
                }else mi="%";
                condition1 += " masodik_keresztnev LIKE ? AND";
                
            } 
        }       
        
        if(!jo.equals("")){
            condition1+=" beosztas.megnevezes LIKE ? AND";
        }else{
            jo="%";
            condition1+=" beosztas.megnevezes LIKE ? AND";}
        if(!us.equals("")){
            condition1+=" felhasznalo LIKE ? AND";
        }else{ us="%";
            condition1+=" felhasznalo LIKE ? AND";
        }
        
        //^ Az adatok bekérése és átírása, a feltételek megadása a bevitt adatok alapján 
        if(condition1.equals("WHERE"))condition1="";
            else condition1=condition1.substring(0,condition1.length()-4); 
        sqlparancs = sqlparancs.replace("co1", condition1);          
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            PreparedStatement pst=con.prepareStatement(sqlparancs);  
            pst.setString(1,"%"+su+"%");
            pst.setString(2,"%"+fi+"%");
            pst.setString(3,"%"+mi+"%");
            pst.setString(4,"%"+jo+"%");
            pst.setString(5,"%"+us+"%");
            TablaTorol(tablew);
            DefaultTableModel model=(DefaultTableModel) tablew.getModel(); 
            ResultSet result=pst.executeQuery();
            String[] rekord=new String[3];
            while(result.next()){
                rekord[0]=result.getString("elotag")+" "+result.getString("vezeteknev")+" "+result.getString("keresztnev")+" "+result.getString("masodik_keresztnev");
                rekord[1]=result.getString("beosztas.megnevezes");  
                rekord[2]=result.getString("felhasznalo");
                if(!result.getString("vezeteknev").equals(""))model.addRow(rekord);
            }
            if(model.getRowCount()==0){
                info.setForeground(Color.red);
                info.setText("A dolgozó nincs az adatbázisban!");
            }else{
                info.setForeground(Color.white);
                info.setText("A nem kívánatos karaktereket eltávolítottuk a helyes keresés érdekében.");
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
        TablaTorol(tablew);
        TablaFeltolt(tablew);
        info.setForeground(Color.white);
        info.setText("Kérem adjon meg adatokat a kereséshez.");
        password.setVisible(false);
        confirm.setVisible(false);
        activate.setVisible(false);
    }//GEN-LAST:event_resetActionPerformed

    private void hireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hireActionPerformed
        password.setVisible(true);     
        confirm.setVisible(true);
        info.setForeground(Color.white);
        info.setText("Kérem adjon meg egy jelszót");
        activate.setVisible(false);
    }//GEN-LAST:event_hireActionPerformed

    private void fireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fireActionPerformed
        StringTokenizer st;
        password.setVisible(false);        
        confirm.setVisible(false);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) tablew.getModel();
            int sszam=tablew.getSelectedRow();//Kijelölt sor elmentése
            String sszamS=tablew.getValueAt(sszam, 0).toString();
            String torles[]={"","","",""};
            String d_id;
            st = new StringTokenizer(sszamS," ");//A kijelölt sor adatainak elmentése egy tömbbe
            for (int i = 0; i < 4; i++) {                
                if (st.hasMoreTokens()) torles[i]=st.nextToken();
            }            
            ResultSet result=stmt.executeQuery("Select d_id FROM szemely INNER JOIN dolgozok ON dolgozok.d_id=szemely.szem_id WHERE elotag='"+torles[0]+"' AND vezeteknev='"+torles[1]+"' AND keresztnev='"+torles[2]+"' AND masodik_keresztnev='"+torles[3]+"'");
            result.next();            
            d_id=result.getString("d_id");            
            stmt.executeUpdate("UPDATE szemely SET aktivitas=0 WHERE szem_id='"+d_id+"'");            
            TablaTorol(tablew);
            TablaFeltolt(tablew);            
            info.setForeground(Color.green);
            info.setText("A deaktíválás sikeres!");
            
        }
        catch(Exception e){System.err.println("Hiba: "+e); 
            info.setForeground(Color.red);
            info.setText("Kérem jelöljön ki a törölendő sort.");
        }
        password.setVisible(false);        
        confirm.setVisible(false);
        activate.setVisible(false);
        
    }//GEN-LAST:event_fireActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        String na=name.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
        String jo=job.getText().replaceAll("[^A-Za-záéőúűóüöí ]","");
        String us=username.getText();       
        String pw=String.valueOf(password.getPassword());
        StringTokenizer st;
        String fr=front.getSelectedItem().toString();
        String su="%";
        String fi="%";
        String mi="";       
        activate.setVisible(false);
        String testP="SELECT * FROM szemely WHERE elotag=? AND vezeteknev=? AND keresztnev=? AND masodik_keresztnev=?";
        st = new StringTokenizer(na," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens())su = st.nextToken();
               if (st.hasMoreTokens())fi= st.nextToken();
              
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               
               }
        }
        if(na.equals("")||jo.equals("")){
            info.setForeground(Color.RED);
            info.setText("A név és beosztás mező nem lehet üres!");
        }
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();            
            DefaultTableModel model=(DefaultTableModel) tablew.getModel();
            PreparedStatement test=con.prepareStatement(testP);
            test.setString(1,fr);
            test.setString(2,su);
            test.setString(3,fi);
            test.setString(4,mi);
           ResultSet result=test.executeQuery();
           String insTestP="INSERT INTO szemely (elotag, vezeteknev, keresztnev, masodik_keresztnev) VALUES (?,?,?,?)";
           PreparedStatement insTest=con.prepareStatement(insTestP);
            insTest.setString(1,fr);
            insTest.setString(2,su);
            insTest.setString(3,fi);
            insTest.setString(4,mi);
            if(result.next()){                
                ResultSet result2=stmt.executeQuery("SELECT d_id FROM dolgozok INNER JOIN szemely ON szemely.szem_id=dolgozok.d_id WHERE elotag='"+result.getString("elotag")+"' AND vezeteknev='"+result.getString("vezeteknev")+"' AND keresztnev='"+result.getString("keresztnev")+"' AND masodik_keresztnev='"+result.getString("masodik_keresztnev")+"'");
                if(!result2.next()){
                    String insP="INSERT INTO dolgozok (d_id, beosz_id, felhasznalo, jelszo) VALUES ((SELECT szem_id FROM szemely WHERE elotag='"+result.getString("elotag")+"' AND vezeteknev='"+result.getString("vezeteknev")+"' AND keresztnev='"+result.getString("keresztnev")+"' AND masodik_keresztnev='"+result.getString("masodik_keresztnev")+"'),(SELECT beosz_id FROM beosztas WHERE beosztas.megnevezes LIKE ?),?,?)";
                    PreparedStatement ins=con.prepareStatement(insP);
                    ins.setString(1,"%"+jo+"%");
                    ins.setString(2, us);
                    ins.setString(3,pw);
                    ins.executeUpdate();
                    password.setVisible(false);     
                    confirm.setVisible(false);
                    password.setText("");
                    TablaTorol(tablew);
                    TablaFeltolt(tablew);
                    info.setForeground(Color.white);
                    info.setText("Sikeres feltöltés!");
                }else {
                    info.setForeground(Color.red);
                    info.setText("A személy már szerepel a listában!"); 
                    password.setText("");
                }
            }
            
            else if(insTest.executeUpdate()>0){
                String insDolgP="INSERT INTO dolgozok (d_id, beosz_id, felhasznalo, jelszo) VALUES ((SELECT szem_id FROM szemely ORDER BY szem_id DESC LIMIT 1),(SELECT beosz_id FROM beosztas WHERE beosztas.megnevezes LIKE ?),?,?)";
                PreparedStatement insDolg=con.prepareStatement(insDolgP);
                insDolg.setString(1,"%"+jo+"%");
                insDolg.setString(2, us);
                insDolg.setString(3,pw);
                insDolg.executeUpdate();
                info.setForeground(Color.white);
                info.setText("Sikeres feltöltés! \n Új személyt vett fel.");
                password.setVisible(false);     
                confirm.setVisible(false);
                activate.setVisible(false);
                TablaTorol(tablew);
                TablaFeltolt(tablew);
                password.setText("");
            }           
        
            
       }
       catch(Exception e){System.err.println("Hiba: "+e);
        
        }
    }//GEN-LAST:event_confirmActionPerformed

    private void nonactiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonactiveActionPerformed
       TablaTorol(tablew);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) tablew.getModel();
            ResultSet rs1=stmt.executeQuery("SELECT szemely.szem_id,szemely.elotag,szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN dolgozok ON szemely.szem_id=dolgozok.d_id WHERE aktivitas=0 ORDER BY d_id");
            String[] rekord=new String[3];
            while(rs1.next()){
                ResultSet rs2=stmt2.executeQuery("SELECT felhasznalo, beosztas.megnevezes FROM dolgozok INNER JOIN beosztas ON dolgozok.beosz_id=beosztas.beosz_id where d_id="+rs1.getString("szem_id"));                
                rs2.next();
                rekord[0]=rs1.getString("elotag")+" "+rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev"); 
                rekord[1]=rs2.getString("megnevezes");
                if(rs2.getString("felhasznalo").equals(""))rekord[2]="Nincs jogosultság";
                else rekord[2]=rs2.getString("felhasznalo");
                if(!rs1.getString("vezeteknev").equals(""))model.addRow(rekord);
               
            }
            con.close();
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        info.setForeground(Color.red);
            info.setText("Kérem jelöljön ki sort.");
        }
       activate.setVisible(true);
        
    }//GEN-LAST:event_nonactiveActionPerformed

    private void activateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activateActionPerformed
        StringTokenizer st;
        password.setVisible(false);
        confirm.setVisible(false);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) tablew.getModel();
            int sszam=tablew.getSelectedRow();
            String sszamS=tablew.getValueAt(sszam, 0).toString();
            String torles[]={"","","",""};
            String d_id;
            st = new StringTokenizer(sszamS," ");
            for (int i = 0; i < 4; i++) {
                if (st.hasMoreTokens()) torles[i]=st.nextToken();
            }
            ResultSet result=stmt.executeQuery("Select d_id FROM szemely INNER JOIN dolgozok ON dolgozok.d_id=szemely.szem_id WHERE elotag='"+torles[0]+"' AND vezeteknev='"+torles[1]+"' AND keresztnev='"+torles[2]+"' AND masodik_keresztnev='"+torles[3]+"'");
            result.next();
            d_id=result.getString("d_id");            
            stmt.executeUpdate("UPDATE szemely SET aktivitas=1 WHERE szem_id='"+d_id+"'");
            TablaTorol(tablew);            
            TablaFeltolt(tablew);
            con.close();

            activate.setVisible(false);            
            info.setForeground(Color.green);
            info.setText("Az aktíválás sikeres!");

        }
        catch(Exception e){System.err.println("Hiba: "+e);
        info.setForeground(Color.red);
            info.setText("Kérem jelöljön ki sort.");
        }
    }//GEN-LAST:event_activateActionPerformed

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
            ResultSet rs1=stmt.executeQuery("SELECT szemely.szem_id, szemely.elotag,szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN dolgozok ON szemely.szem_id=dolgozok.d_id WHERE aktivitas=1 ORDER BY d_id");
            String[] rekord=new String[3];
            while(rs1.next()){
                ResultSet rs2=stmt2.executeQuery("SELECT felhasznalo, beosztas.megnevezes FROM dolgozok INNER JOIN beosztas ON dolgozok.beosz_id=beosztas.beosz_id where d_id="+rs1.getString("szem_id"));
                rs2.next();
                rekord[0]=rs1.getString("elotag")+" "+rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev"); 
                rekord[1]=rs2.getString("megnevezes");
                if(rs2.getString("felhasznalo").equals(""))rekord[2]="Nincs jogosultság";
                else rekord[2]=rs2.getString("felhasznalo");
                if(!rs1.getString("vezeteknev").equals(""))model.addRow(rekord);
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
    private javax.swing.JButton activate;
    private javax.swing.JButton confirm;
    private javax.swing.JButton fire;
    private javax.swing.JComboBox<String> front;
    private javax.swing.JButton hire;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField job;
    private javax.swing.JTextField name;
    private javax.swing.JButton nonactive;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTable tablew;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
