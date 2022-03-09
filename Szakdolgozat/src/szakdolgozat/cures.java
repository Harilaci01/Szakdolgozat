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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Harsányi László
 */
public class cures extends javax.swing.JFrame {

    /**
     * Creates new form cures
     */
    public cures() {
        initComponents();
        ElotagBeszur(frontbox);
        TablaFeltolt(table);
        info.setForeground(Color.blue);
        info.setText("Ha nem ismeri az illető teljes nevét írjon %-ot a helyére. Példa: Lakatos % József");
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
        patient = new javax.swing.JTextField();
        sickness = new javax.swing.JTextField();
        drug = new javax.swing.JTextField();
        start = new javax.swing.JTextField();
        finish = new javax.swing.JTextField();
        doctor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        frontbox = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        startd = new com.toedter.calendar.JDateChooser();
        finishd = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kezelések");

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
                "Kezelés azonosító", "Beteg neve", "Betegség", "Gyógyszer", "Befekvés", "Gyógyulás", "Kezelő orvos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        jLabel1.setText("Beteg neve:");

        jLabel2.setText("Betegség:");

        jLabel3.setText("Gyógyszer:");

        jLabel4.setText("Befekvés:");

        jLabel5.setText("Gyógyulás:");

        jLabel6.setText("Kezelő orvos neve:");

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

        delete.setText("Törlés");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Kezelések");

        jLabel7.setText("Pontos dátum:");

        jLabel8.setText("Pontos dátum:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 871, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(60, 60, 60)
                        .addComponent(frontbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sickness, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drug, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(startd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finishd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search)
                            .addComponent(upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(search)
                            .addGap(43, 43, 43)
                            .addComponent(upload)
                            .addGap(32, 32, 32)
                            .addComponent(delete))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(frontbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sickness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(drug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addComponent(startd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(finish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addComponent(finishd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Back)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new home().setVisible(true);
        dispose();  
    }//GEN-LAST:event_BackActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String fr=frontbox.getSelectedItem().toString();
        String fr2="Dr.";
        String pa=patient.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
        String be=sickness.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
        String gy=drug.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
        String strt,end;
        String datum1=((JTextField)startd.getDateEditor().getUiComponent()).getText();
        String datum2=((JTextField)finishd.getDateEditor().getUiComponent()).getText();        
        if(datum1.equals("")){strt=start.getText().replaceAll("[.]","-");
        strt=strt.replaceAll("[^0-9/: /-]","");
        }else {
            strt=datum1;
            strt=strt.replaceAll("[.]","-");
            strt=strt.substring(0,strt.length()-1);
        }
        if(datum2.equals("")){end=finish.getText().replaceAll("[.]","-");
        end=end.replaceAll("[^0-9/: /-]","");
        }else{
            end=datum2;
            end=end.replaceAll("[.]","-");
            end=end.substring(0,end.length()-1);
        }
        String dr=doctor.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
        StringTokenizer st;
        String su="";
        String fi="";
        String mi,mi2;
        String su2="";
        String fi2=""; 
        String condition1="WHERE elotag LIKE ('"+fr+"') AND";
        String condition2="WHERE elotag LIKE ('"+fr2+"') AND";
        String condition3="AND";
        String sqlparancs="SELECT kez_id, b_id, kezelo_orvos, betegseg.megnevezes ,gyogyszerek.nev, befekves, gyogyulas FROM kezeles INNER JOIN betegseg ON betegseg.bet_id=kezeles.bet_id INNER JOIN gyogyszerek ON gyogyszerek.gy_id=kezeles.gy_id WHERE b_id in (Select szem_id from szemely co1 ) and kezelo_orvos in (Select szem_id from szemely co2 ) co3";
        st = new StringTokenizer(pa," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens())su = st.nextToken();
               if (st.hasMoreTokens())fi= st.nextToken();
               condition1+=" vezeteknev LIKE ? AND keresztnev LIKE ? AND";
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1+=" masodik_keresztnev LIKE ? AND";
               }
        }
        
        st = new StringTokenizer(dr," ");
        if(st.countTokens()>0){       
              if (st.hasMoreTokens()) su2 = st.nextToken();
              if (st.hasMoreTokens()) fi2= st.nextToken();
               condition2+=" vezeteknev LIKE ? AND keresztnev LIKE ? AND";
               if (st.hasMoreTokens()){          
               mi2=st.nextToken();
               condition2+=" masodik_keresztnev LIKE ? AND";
               }
        }
        
        if(!be.equals("")){
            condition3+=" betegseg.megnevezes LIKE ? AND";
        }
        if(!gy.equals("")){
            condition3+=" gyogyszerek.nev LIKE ? AND";
        }
        if(!strt.equals("")){
            condition3+=" befekves LIKE ? AND";
        }
        if(!end.equals("")){
            condition3+=" gyogyulas LIKE ? AND";
        }
        
        condition1=condition1.substring(0,condition1.length()-4);
        condition2=condition2.substring(0,condition2.length()-4);
        if(condition3.equals("AND"))condition3="";
            else{ condition3=condition3.substring(0,condition3.length()-4);}
        sqlparancs=sqlparancs.replace("co1", condition1);
        sqlparancs=sqlparancs.replace("co2", condition2);
        sqlparancs=sqlparancs.replace("co3", condition3);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();            
            TablaTorol(table);
            PreparedStatement pst=con.prepareStatement(sqlparancs);
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();
            ResultSet result=pst.executeQuery();
            System.err.println("SELECT kez_id, b_id, kezelo_orvos, betegseg.megnevezes ,gyogyszerek.nev, befekves, gyogyulas FROM kezeles INNER JOIN betegseg ON betegseg.bet_id=kezeles.bet_id INNER JOIN gyogyszerek ON gyogyszerek.gy_id=kezeles.gy_id WHERE b_id in (Select szem_id from szemely "+condition1+") and kezelo_orvos in (Select szem_id from szemely "+condition2+") "+condition3);
            String[] rekord=new String[7];
            while(result.next()){
                /*ResultSet rs2=stmt3.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN kezeles ON szemely.szem_id=kezeles.kezelo_orvos WHERE ");
                ResultSet rs1=stmt2.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN kezeles ON szemely.szem_id=kezeles.b_id WHERE b_id='"++"'");*/
                ResultSet rs1=stmt2.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("b_id"));            
                ResultSet rs2=stmt3.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("kezelo_orvos"));
                rs1.next();
                rs2.next();
                rekord[0]=result.getString("kez_id");
                rekord[1]=rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev");
                rekord[2]=result.getString("betegseg.megnevezes");
                rekord[3]=result.getString("gyogyszerek.nev");
                rekord[4]=result.getString("befekves"); 
                rekord[5]=result.getString("gyogyulas");
                rekord[6]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");                
                model.addRow(rekord);
            }
                if(model.getRowCount()==0){
                info.setForeground(Color.red);
                info.setText("A keresett adat(ok) nem szerepelnek a rendszerben.");
            } else {
                info.setForeground(Color.blue);
                info.setText("A helytelen karaktereket eltávolítottuk/módosítottuk a helyes keresés érdekében.");
            
            }
         
            con.close();
         }
        catch(Exception e){System.err.println("Hiba: "+e);
            info.setForeground(Color.red);
            info.setText("A keresett adat(ok) nem szerepelnek a rendszerben.");
        }                                     
    }//GEN-LAST:event_searchActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        try{
            String fr=frontbox.getSelectedItem().toString();
            String fr2="Dr.";
            String pa=patient.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
            String be=sickness.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
            String gy=drug.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
            String strt,end;
            String datum1=((JTextField)startd.getDateEditor().getUiComponent()).getText();
            String datum2=((JTextField)finishd.getDateEditor().getUiComponent()).getText();        
            if(datum1.equals("")){strt=start.getText().replaceAll("[.]","-");
            strt=strt.replaceAll("[^0-9/: /-]","");
            }else {
                strt=datum1;
                strt=strt.replaceAll("[.]","-");
                strt=strt.substring(0,strt.length()-1);
            }
            if(datum2.equals("")){end=finish.getText().replaceAll("[.]","-");
            end=end.replaceAll("[^0-9/: /-]","");
            }else{
                end=datum2;
                end=end.replaceAll("[.]","-");
                end=end.substring(0,end.length()-1);
            }
            String dr=doctor.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
            StringTokenizer st;
            String su="";
            String fi="";
            String mi="",mi2="",condition1,condition2;
            String su2="";
            String fi2=""; 
            int d_id,b_id;
            st = new StringTokenizer(pa," ");
                   su = st.nextToken();
                   fi= st.nextToken();
                   if (st.hasMoreTokens()){ 
                   mi=st.nextToken();
                   condition1="AND masodik_keresztnev=?";
                   }else condition1="";
            st = new StringTokenizer(dr," ");
                   su2 = st.nextToken();
                   fi2= st.nextToken();
                   if (st.hasMoreTokens()){          
                   mi2=st.nextToken();
                   condition2="AND masodik_keresztnev=?";
                   } else condition2="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            String testparancs="SELECT * FROM kezeles WHERE befekves=? AND gyogyulas=?";
            PreparedStatement test=con.prepareStatement(testparancs);
            test.setString(1,strt);
            test.setString(2,end);
            ResultSet result=test.executeQuery();
            if(dr.equals("")||pa.equals("")||strt.equals("")||end.equals("")||gy.equals("")||be.equals("")){
                info.setForeground(Color.red);
                info.setText("Valamelyik mező üres!"); 
            }
            else if(result.next()){
                info.setForeground(Color.red);
                info.setText("A kezelés már szerepel a listában!"); 
            }
            else{
                String sqlparancs2="SELECT szem_id FROM szemely WHERE elotag='"+fr+"' AND vezeteknev=? AND keresztnev=? co1";                
                String sqlparancs3="SELECT szem_id FROM szemely WHERE elotag='"+fr2+"' AND vezeteknev=? AND keresztnev=? co2";
                sqlparancs2=sqlparancs2.replace("co1", condition1);
                sqlparancs3=sqlparancs3.replace("co2", condition2);
                PreparedStatement pst2=con.prepareStatement(sqlparancs2);                               
                pst2.setString(1,su);
                pst2.setString(2,fi);
                if(!mi.equals(""))pst2.setString(3,mi);
                ResultSet rs=pst2.executeQuery();
                PreparedStatement pst3=con.prepareStatement(sqlparancs3);
                pst3.setString(1,su2);
                pst3.setString(2,fi2);
                if(!mi2.equals(""))pst3.setString(3,mi2);                
                ResultSet rs2=pst3.executeQuery();               
                if(!rs.next()){
                        info.setForeground(Color.red);
                        info.setText("A beteg nincs az adatbázisban!"); 
                    } else 
                    if(!rs2.next()){
                        info.setForeground(Color.red);
                        info.setText("Az orvos nincs az adatbázisban!");                     
                    }else{                        
                        b_id=rs.getInt("szem_id");
                        d_id=rs2.getInt("szem_id");
                        String sqlparancs="INSERT INTO kezeles (b_id, bet_id,gy_id,befekves, gyogyulas,kezelo_orvos) VALUES ((SELECT szemely.szem_id FROM szemely WHERE szem_id='"+b_id+"'),(SELECT bet_id FROM betegseg WHERE megnevezes=?),(SELECT gy_id FROM gyogyszerek WHERE nev=?),?,?,(SELECT szemely.szem_id FROM szemely WHERE szem_id='"+d_id+"'))";
                        PreparedStatement pst=con.prepareStatement(sqlparancs);
                        pst.setString(1,be);
                        pst.setString(2,gy);
                        pst.setString(3,strt);
                        pst.setString(4,end);
                        pst.executeUpdate();          
                        patient.setText("");
                        sickness.setText("");
                        drug.setText("");
                        start.setText("");
                        finish.setText("");
                        doctor.setText("");              
                        info.setText("A kezelés feltöltése sikeres!");}
            }
            TablaTorol(table);
            TablaFeltolt(table);
            con.close();
        }
        catch(Exception e){System.err.println("Hiba: "+e);
            info.setForeground(Color.red);
            info.setText("Kérem adja meg a feltöltendő adatokat.");
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            int sszam=table.getSelectedRow();
            int kij=Integer.parseInt(table.getValueAt(sszam, 0).toString());                    
            stmt.executeUpdate("DELETE FROM kezeles WHERE kez_id='"+kij+"'");
            TablaTorol(table);
            TablaFeltolt(table);   
            info.setText("A törlés sikeres!");
            
        }
        catch(Exception e){System.err.println("Hiba: "+e);
        info.setForeground(Color.red);
        info.setText("Kérem jelöljön ki a törölendő sort.");
        
        }
    }//GEN-LAST:event_deleteActionPerformed

    /**
     * @param args the command line arguments
     */
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
      public static void TablaFeltolt(JTable JTable){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");
            Statement stmt=con.createStatement();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();
            DefaultTableModel model=(DefaultTableModel) JTable.getModel();
            ResultSet result=stmt.executeQuery("SELECT kez_id, betegseg.megnevezes ,gyogyszerek.nev, befekves, gyogyulas FROM kezeles INNER JOIN betegseg ON betegseg.bet_id=kezeles.bet_id INNER JOIN gyogyszerek ON gyogyszerek.gy_id=kezeles.gy_id");
            ResultSet rs2=stmt3.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN kezeles ON szemely.szem_id=kezeles.kezelo_orvos ORDER BY kez_id");
            ResultSet rs1=stmt2.executeQuery("SELECT szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev FROM szemely INNER JOIN kezeles ON szemely.szem_id=kezeles.b_id ORDER BY kez_id");
            String[] rekord=new String[7];
            while(result.next()){
                rs1.next();
                rs2.next();
                rekord[0]=result.getString("kez_id");
                rekord[1]=rs1.getString("vezeteknev")+" "+rs1.getString("keresztnev")+" "+rs1.getString("masodik_keresztnev");
                rekord[2]=result.getString("betegseg.megnevezes");
                rekord[3]=result.getString("gyogyszerek.nev");
                rekord[4]=result.getString("befekves"); 
                rekord[5]=result.getString("gyogyulas");
                rekord[6]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");                
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
            java.util.logging.Logger.getLogger(cures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cures.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cures().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton delete;
    private javax.swing.JTextField doctor;
    private javax.swing.JTextField drug;
    private javax.swing.JTextField finish;
    private com.toedter.calendar.JDateChooser finishd;
    private javax.swing.JComboBox<String> frontbox;
    private javax.swing.JLabel info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patient;
    private javax.swing.JButton search;
    private javax.swing.JTextField sickness;
    private javax.swing.JTextField start;
    private com.toedter.calendar.JDateChooser startd;
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
