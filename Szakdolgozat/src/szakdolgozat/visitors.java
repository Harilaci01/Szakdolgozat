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
import javax.swing.JTextField;
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
        this.setIconImage(new ImageIcon(getClass().getResource("../pictures/icon.png")).getImage());
        TablaFeltolt(table);
        ElotagBeszur(frontbox);
        ElotagBeszur(frontbox2);
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
        visitor = new javax.swing.JTextField();
        patient = new javax.swing.JTextField();
        arrival = new javax.swing.JTextField();
        exit = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        upload = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        info = new javax.swing.JLabel();
        frontbox = new javax.swing.JComboBox<>();
        frontbox2 = new javax.swing.JComboBox<>();
        title = new javax.swing.JLabel();
        all = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        date1 = new com.toedter.calendar.JDateChooser();
        date2 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Látogatás");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setText("Vissza");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 527, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 35, 730, 317));

        visitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visitorActionPerformed(evt);
            }
        });
        getContentPane().add(visitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 376, 181, -1));
        getContentPane().add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 410, 181, -1));
        getContentPane().add(arrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 450, 181, -1));
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 481, 181, -1));

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 375, 99, -1));

        upload.setText("Feltöltés");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });
        getContentPane().add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 409, 99, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Látogató neve:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 384, 143, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Beteg neve:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 412, 143, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bejelentkezés:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 453, 143, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Távozás:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 484, 143, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(769, 478, -1, -1));
        getContentPane().add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 533, -1, -1));

        getContentPane().add(frontbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 378, -1, -1));

        frontbox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frontbox2ActionPerformed(evt);
            }
        });
        getContentPane().add(frontbox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 409, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Látogatás");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        all.setText("Összes látogató");
        all.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allActionPerformed(evt);
            }
        });
        getContentPane().add(all, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 375, -1, -1));

        jLabel6.setText("Pontos dátum:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 453, -1, -1));

        jLabel7.setText("Pontos dátum:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(522, 484, -1, -1));
        getContentPane().add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 450, -1, -1));
        getContentPane().add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(638, 481, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/visiting.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
       new home().setVisible(true);
       dispose();  
    }//GEN-LAST:event_BackActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String vi=visitor.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
        String pa=patient.getText().replaceAll("[^A-Za-záéőúűóüöí /-/%]","");
        String ar,ex;
        String datum1=((JTextField)date1.getDateEditor().getUiComponent()).getText();
        String datum2=((JTextField)date2.getDateEditor().getUiComponent()).getText();        
        if(datum1.equals("")){ar=arrival.getText().replaceAll("[.]","-");
        ar=ar.replaceAll("[^0-9/: /-]","");
        }else {
            ar=datum1;
            ar=ar.replaceAll("[.]","-");
            ar=ar.substring(0,ar.length()-1);
        }
        if(datum2.equals("")){ex=exit.getText().replaceAll("[.]","-");
        ex=ex.replaceAll("[^0-9/: /-]","");
        }else{
            ex=datum2;
            ex=ex.replaceAll("[.]","-");
            ex=ex.substring(0,ex.length()-1);
        }
        StringTokenizer st,st2;
        String fr=frontbox.getSelectedItem().toString();
        String fr2=frontbox2.getSelectedItem().toString();
        String su="";
        String fi="";
        String mi=""; 
        String mi2="";
        String su2="";
        String fi2=""; 
        String condition1="WHERE elotag LIKE ? AND";
        String condition2="WHERE elotag LIKE ? AND";
        String condition3="AND";
        String sqlparancs="SELECT * FROM `latogatas` WHERE l_id in (Select szem_id from szemely co2 )and b_id in (Select szem_id from szemely co1 )  co3";
        visitor.setText(vi);
        patient.setText(pa);
        arrival.setText(ar);
        exit.setText(ex);
        st = new StringTokenizer(vi," ");
        if(st.countTokens()>0){
               if (st.hasMoreTokens()){
                   su = st.nextToken(); 
                   condition2+=" vezeteknev LIKE ? AND";}
               if (st.hasMoreTokens()){
                   fi= st.nextToken();
                   condition2+=" keresztnev LIKE ? AND";}
               if (st.hasMoreTokens()){ 
                    mi=st.nextToken();
                    condition2+=" masodik_keresztnev LIKE ? AND";
               }
         }
        st2 = new StringTokenizer(pa," ");
        if(st2.countTokens()>0){       
              if (st2.hasMoreTokens()){
                    su2 = st2.nextToken();
                    condition1+=" vezeteknev LIKE ? AND";}
              if (st2.hasMoreTokens()){ 
                    fi2= st2.nextToken();
                    condition1+=" keresztnev LIKE ? AND";}
               if (st2.hasMoreTokens()){          
               mi2=st2.nextToken();
               condition1+=" masodik_keresztnev LIKE ? AND";
               }
        }
        
        if(!ar.equals("")){
            condition3+=" bejelentkezes LIKE ? AND";
        }
        if(!ex.equals("")){
            condition3+=" tavozas LIKE ? AND";
        }        
        if(condition1.equals("WHERE"))condition1="";
            else condition1=condition1.substring(0,condition1.length()-4);
        if(condition2.equals("WHERE"))condition2="";
            else condition2=condition2.substring(0,condition2.length()-4);
        if(condition3.equals("AND"))condition3="";
            else{ condition3=condition3.substring(0,condition3.length()-4);
        }       
        sqlparancs=sqlparancs.replace("co1", condition1);
        sqlparancs=sqlparancs.replace("co2", condition2);
        sqlparancs=sqlparancs.replace("co3", condition3);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");           
            TablaTorol(table);
            DefaultTableModel model=(DefaultTableModel) table.getModel();
            Statement stmt2=con.createStatement();
            Statement stmt3=con.createStatement();   
            PreparedStatement test=con.prepareStatement(sqlparancs);
            test.setString(1,fr);
            if(!mi.equals("")&&!mi2.equals("")&&!ar.equals("")&&!ex.equals("")&&!su.equals("")&&!fi.equals("")&&!su2.equals("")&&!fi2.equals("")){ //ÖSSZES TELE
                if (!su.equals(""))test.setString(2,"%"+su+"%");
                if (!fi.equals(""))test.setString(3,"%"+fi+"%");
                test.setString(4,"%"+mi+"%");
                test.setString(5,fr2);
                if (!su2.equals(""))test.setString(6,"%"+su2+"%");
                if (!fi2.equals("")) test.setString(7,"%"+fi2+"%");
                test.setString(8,"%"+mi2+"%");
                test.setString(9,"%"+ar+"%");
                test.setString(10,"%"+ex+"%");                
            }
            
            if(ar.equals("")&&ex.equals("")&&!su.equals("")&&!fi.equals("")&&!su2.equals("")&&!fi2.equals("")){ //NINCS 2 DATUM 
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){
                    test.setString(4,"%"+mi+"%");
                    test.setString(5,fr2);
                    test.setString(6,"%"+su2+"%");
                    test.setString(7,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(8,"%"+mi2+"%");}
                }
                 else{
                    test.setString(4,fr2);
                    test.setString(5,"%"+su2+"%");
                    test.setString(6,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(7,"%"+mi2+"%");}
                }
            }
            
            if(!mi2.equals("")&&ar.equals("")&&!ex.equals("")&&!su.equals("")&&!fi.equals("")&&!su2.equals("")&&!fi2.equals("")){ //NINCS elso DATUM 
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){
                    test.setString(4,"%"+mi+"%");
                    test.setString(5,fr2);
                    test.setString(6,"%"+su2+"%");
                    test.setString(7,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(8,"%"+mi2+"%");
                        test.setString(9,"%"+ex+"%");
                    }else test.setString(8,"%"+ex+"%");
                }
                else{
                    test.setString(4,fr2);
                    test.setString(5,"%"+su2+"%");
                    test.setString(6,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(7,"%"+mi2+"%");
                        test.setString(8,"%"+ex+"%");
                    }else test.setString(7,"%"+ex+"%");
                    
                }
            }
            
            if(!mi.equals("")&&!mi2.equals("")&&!ar.equals("")&&ex.equals("")&&!su.equals("")&&!fi.equals("")&&!su2.equals("")&&!fi2.equals("")){ //NINCS masodik DATUM 
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){
                    test.setString(4,"%"+mi+"%");
                    test.setString(5,fr2);
                    test.setString(6,"%"+su2+"%");
                    test.setString(7,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(8,"%"+mi2+"%");
                        test.setString(9,"%"+ar+"%");
                    }else test.setString(8,"%"+ar+"%");
                    test.setString(9,"%"+ar+"%");}
                else{
                    test.setString(4,fr2);
                    test.setString(5,"%"+su2+"%");
                    test.setString(6,"%"+fi2+"%");
                    if(!mi2.equals("")){
                        test.setString(7,"%"+mi2+"%");
                        test.setString(8,"%"+ar+"%");
                    }else test.setString(7,"%"+ar+"%");
                    
                }
            }
            
            if(pa.equals("")&&vi.equals("")&&!ar.equals("")&&!ex.equals("")){ //CSAK 2 datum
                test.setString(1,fr);
                test.setString(2,fr2);
                test.setString(3,"%"+ ar+"%");
                test.setString(4,"%"+ ex+"%");
            }else if(pa.equals("")&&vi.equals("")&&!ar.equals("")&&ex.equals("")){
                test.setString(1,fr);
                test.setString(2, fr2);
                test.setString(3,"%"+ ar+"%");
            } else if(pa.equals("")&&vi.equals("")&&ar.equals("")&&!ex.equals("")){
                test.setString(1,fr);
                test.setString(2, fr2);
                test.setString(3,"%"+ ex+"%");
            }
            
            if(pa.equals("")&&vi.equals("")&&!ar.equals("")&&ex.equals("")){//csak elso datum
                test.setString(1,fr);
                test.setString(2, fr2);
                test.setString(3,"%"+ ar+"%");
            }
            
            if(pa.equals("")&&!vi.equals("")&&!ar.equals("")&&ex.equals("")){//csak elso datum +elso nev
                test.setString(1,fr);
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){
                    test.setString(4,"%"+mi+"%");
                    test.setString(5, fr2);
                    test.setString(6,"%"+ ar+"%");
                }else{
                test.setString(4, fr2);
                test.setString(5,"%"+ ar+"%");}
            }
            
            if(!pa.equals("")&&vi.equals("")&&!ar.equals("")&&ex.equals("")){//csak elso datum +masodik nev
                test.setString(1,fr);                
                test.setString(2, fr2);
                test.setString(3,"%"+su2+"%");
                test.setString(4,"%"+fi2+"%");
                if(!mi2.equals("")){
                    test.setString(5,"%"+mi2+"%");
                    test.setString(6,"%"+ ar+"%");
                }else
                test.setString(5,"%"+ ar+"%");
            }
            
            if(pa.equals("")&&!vi.equals("")&&ar.equals("")&&!ex.equals("")){//csak madosik datum +elso nev
                test.setString(1,fr);
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){
                    test.setString(4,"%"+mi+"%");
                    test.setString(5, fr2);
                    test.setString(6,"%"+ ex+"%");
                }else{
                test.setString(4, fr2);
                test.setString(5,"%"+ ex+"%");}
            }
            
            if(!pa.equals("")&&vi.equals("")&&ar.equals("")&&!ex.equals("")){//csak masodik datum +masodik nev
                test.setString(1,fr);                
                test.setString(2, fr2);
                test.setString(3,"%"+su2+"%");
                test.setString(4,"%"+fi2+"%");
                if(!mi2.equals("")){
                    test.setString(5,"%"+mi2+"%");
                    test.setString(6,"%"+ ex+"%");
                }else
                test.setString(5,"%"+ ex+"%");
            }
            
            if(pa.equals("")&&vi.equals("")&&ar.equals("")&&!ex.equals("")){//csak masodik datum
                test.setString(1,fr);
                test.setString(2, fr2);
                test.setString(3,"%"+ ex+"%");
            }
            
            if(!su.equals("")&&!fi.equals("")&&pa.equals("")&&ar.equals("")&&ex.equals("")){     //CSAK első név          
                test.setString(2,"%"+su+"%");
                test.setString(3,"%"+fi+"%");
                if(!mi.equals("")){test.setString(4,"%"+mi+"%");
                test.setString(5, fr2);}else test.setString(4, fr2);
                
            }  
            
            if(!su2.equals("")&&!fi2.equals("")&&vi.equals("")&&ar.equals("")&&ex.equals("")){  //CSAK masodik név             
                test.setString(1, fr);
                test.setString(2, fr2);
                test.setString(3,"%"+su2+"%");
                test.setString(4,"%"+fi2+"%");
                if(!mi2.equals(""))test.setString(5,"%"+mi2+"%");
            }
            
            if(mi.equals("")&&mi2.equals("")&&!ar.equals("")&&!ex.equals("")&&!su.equals("")&&fi.equals("")&&!su2.equals("")&&fi2.equals("")){//csak vezetéknevek és dátumok
                test.setString(1,fr);
                test.setString(2,"%"+su+"%");
                test.setString(3,fr2);
                test.setString(4,"%"+su2+"%");
                test.setString(5,"%"+ar+"%");
                test.setString(6,"%"+ex+"%");
            }
            
            if(mi.equals("")&&mi2.equals("")&&ar.equals("")&&ex.equals("")&&!su.equals("")&&fi.equals("")&&!su2.equals("")&&fi2.equals("")){//csak vezetéknevek 
                test.setString(1,fr);
                test.setString(2,"%"+su+"%");
                test.setString(3,fr2);
                test.setString(4,"%"+su2+"%");
            }
            
            if(mi2.equals("")&&vi.equals("")&&!fi2.equals("")&&!su2.equals("")){//NINCS első név és más. keresztnév
                 if((!ar.equals(""))&&(!ex.equals(""))) {
                        test.setString(1,fr);
                        test.setString(2, fr2);
                        test.setString(3, "%"+su2+"%");
                        test.setString(4, "%"+fi2+"%");
                        test.setString(5,"%"+ar+"%");
                        test.setString(6,"%"+ex+"%");
                    } else if(!ar.equals("")){
                        test.setString(1,fr);
                        test.setString(2, fr2);
                        test.setString(3, "%"+su2+"%");
                        test.setString(4, "%"+fi2+"%");
                        test.setString(5,"%"+ar+"%");
                    }
                    else if (ar.equals("")&&!ex.equals("")){
                        test.setString(1,fr);
                        test.setString(2, fr2);
                        test.setString(3, "%"+su2+"%");
                        test.setString(4, "%"+fi2+"%");
                        test.setString(5,"%"+ex+"%");
                    }
            }
            
            if(mi.equals("")&&!su.equals("")&&pa.equals("")&&!fi.equals("")){//NINCS második név és más. keresztnév
                 if((!ar.equals(""))&&(!ex.equals(""))) {
                        test.setString(1,fr);                        
                        test.setString(2, "%"+su+"%");
                        test.setString(3, "%"+fi+"%");
                        test.setString(4, fr2);
                        test.setString(5,"%"+ar+"%");
                        test.setString(6,"%"+ex+"%");
                    } else if(!ar.equals("")){
                        test.setString(1,fr);
                        test.setString(2, "%"+su+"%");
                        test.setString(3, "%"+fi+"%");
                        test.setString(4, fr2);
                        test.setString(5,"%"+ar+"%");
                    }
                    else if (ar.equals("")&&!ex.equals("")){
                        test.setString(1,fr);
                        test.setString(2, "%"+su+"%");
                        test.setString(3, "%"+fi+"%");
                        test.setString(4, fr2);
                        test.setString(5,"%"+ex+"%");
                    }
            }
            if(mi.equals("")&&mi2.equals("")&&ar.equals("")&&ex.equals("")&&su.equals("")&&fi.equals("")&&su2.equals("")&&fi2.equals(""))test.setString(2, fr2);// üres minden          
         
            ResultSet result=test.executeQuery();
            String[] rekord=new String[4];
            while(result.next()){
                ResultSet rs=stmt2.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("l_id"));            
                ResultSet rs2=stmt3.executeQuery("SELECT * FROM szemely where szem_id="+result.getInt("b_id"));
                rs.next();
                rs2.next();
                rekord[0]=rs.getString("vezeteknev")+" "+rs.getString("keresztnev")+" "+rs.getString("masodik_keresztnev");
                rekord[1]=rs2.getString("vezeteknev")+" "+rs2.getString("keresztnev")+" "+rs2.getString("masodik_keresztnev");
                rekord[2]=result.getString("bejelentkezes");  
                rekord[3]=result.getString("tavozas");
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

    private void visitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visitorActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        try{
        String vi=visitor.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
        String pa=patient.getText().replaceAll("[^A-Za-záéőúűóüöí /-]","");
        String ar,ex;
        String datum1=((JTextField)date1.getDateEditor().getUiComponent()).getText();
        String datum2=((JTextField)date2.getDateEditor().getUiComponent()).getText();        
        if(datum1.equals("")){ar=arrival.getText().replaceAll("[.]","-");
        ar=ar.replaceAll("[^0-9/: /-]","");
        }else {
            ar=datum1;
            ar=ar.substring(0,ar.length()-1);
        }
        if(datum2.equals("")){ex=exit.getText().replaceAll("[.]","-");
        ex=ex.replaceAll("[^0-9/: /-]","");
        }else{
            ex=datum2;
            ex=ex.substring(0,ex.length()-1);
        }
        StringTokenizer st;
        String fr=frontbox.getSelectedItem().toString();
        String fr2=frontbox2.getSelectedItem().toString();         
        String su="",fi="",su2="",fi2="";
        String condition1="";
        String condition2="";
        String mi="";
        String mi2="";
        int l_id,b_id;
        String sqlparancs="SELECT * FROM latogatas WHERE bejelentkezes=? AND tavozas=? AND b_id=? AND l_id=?";
        String sqlparancs2="SELECT szem_id FROM szemely WHERE elotag='"+fr+"' AND vezeteknev=? AND keresztnev=? co1";
        String sqlparancs3="SELECT szem_id FROM szemely WHERE elotag='"+fr2+"' AND vezeteknev=? AND keresztnev=? co2";    
        String sqlparancs4="";
        st = new StringTokenizer(vi," "); 
        if(st.countTokens()>0){
               su = st.nextToken();
               fi= st.nextToken();
               if (st.hasMoreTokens()){ 
               mi=st.nextToken();
               condition1="AND masodik_keresztnev=?";
               }
        }
        st = new StringTokenizer(pa," ");
        if(st.countTokens()>0){
               su2 = st.nextToken();
               fi2= st.nextToken();
               if (st.hasMoreTokens()){          
               mi2=st.nextToken();
               condition2="AND masodik_keresztnev=?";
               } 
        }
        sqlparancs2=sqlparancs2.replace("co1",condition1);
        sqlparancs3=sqlparancs3.replace("co2",condition2);        
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga","root","");            
            if(vi.equals("")||pa.equals("")||ar.equals("")||ex.equals("")){
                info.setForeground(Color.red);
                info.setText("Valamelyik mező üres!"); 
            } else{
                PreparedStatement pst2=con.prepareStatement(sqlparancs2);
                    PreparedStatement pst3=con.prepareStatement(sqlparancs3);
                    pst2.setString(1,su);
                    pst2.setString(2,fi);
                    if(!mi.equals(""))pst2.setString(3,mi);
                    pst3.setString(1,su2);
                    pst3.setString(2,fi2);
                    if(!mi2.equals(""))pst3.setString(3,mi2);
                    ResultSet rs=pst2.executeQuery();
                    ResultSet rs2=pst3.executeQuery();
                    if(!rs.next()){
                        info.setForeground(Color.red);
                        info.setText("A látogató nincs az adatbázisban!"); 
                    } else 
                    if(!rs2.next()){
                        info.setForeground(Color.red);
                        info.setText("A beteg nincs az adatbázisban!"); }
                    else{
                    l_id=rs.getInt("szem_id");
                    b_id=rs2.getInt("szem_id");
                        PreparedStatement pst = con.prepareStatement(sqlparancs);
                        pst.setString(1, ar);
                        pst.setString(2, ex);
                        pst.setString(3, rs2.getString("szem_id"));
                        pst.setString(4, rs.getString("szem_id"));
                        ResultSet result = pst.executeQuery();

                        if (result.next()) {
                            info.setForeground(Color.red);
                            info.setText("A látogatás már szerepel a listában!");
                        } else if (vi.equals(pa)) {
                            info.setForeground(Color.red);
                            info.setText("A két személy nem lehet ugyan az!"); 
                }          
                else{                    
                    sqlparancs4="INSERT INTO latogatas (l_id, b_id, bejelentkezes, tavozas) VALUES ('"+l_id+"','"+b_id+"',?,?)";
                    PreparedStatement pst4=con.prepareStatement(sqlparancs4);
                    pst4.setString(1, ar);
                    pst4.setString(2, ex);
                    pst4.executeUpdate();
                    visitor.setText("");
                    patient.setText("");
                    arrival.setText("");
                    exit.setText("");
                    info.setForeground(Color.blue);
                    info.setText("A látogatás feltöltése sikeres!"); }
                }
            }
            
            TablaTorol(table);
            TablaFeltolt(table);
            con.close();
        }
        
        
        catch(Exception e){System.err.println("Hiba: "+e);
                info.setForeground(Color.red);
                info.setText("A beteg/látogató nincs az adatbázisban!");
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void frontbox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frontbox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_frontbox2ActionPerformed

    private void allActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allActionPerformed
        TablaTorol(table);
        TablaFeltolt(table);
        info.setText("");
    }//GEN-LAST:event_allActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton all;
    private javax.swing.JTextField arrival;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JTextField exit;
    private javax.swing.JComboBox<String> frontbox;
    private javax.swing.JComboBox<String> frontbox2;
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
    private javax.swing.JTable table;
    private javax.swing.JLabel title;
    private javax.swing.JButton upload;
    private javax.swing.JTextField visitor;
    // End of variables declaration//GEN-END:variables
}
