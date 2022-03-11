package szakdolgozat;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static szakdolgozat.Szakdolgozat.id;

/**
 *
 * @author Harsányi László
 */
public class patiens extends javax.swing.JFrame {

    /**
     * Creates new form patiens
     */
    public patiens() {
        initComponents();
        TablaFeltolt(table);
        switch (id) {
            case 2:
                delete.setVisible(false);
                break;
            case 3:
                upload.setVisible(false);
                delete.setVisible(false);
                break;
            case 5:
                upload.setVisible(false);
                delete.setVisible(false);
                break;

        }
        ElotagBeszur(frontbox);
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
        patiens = new javax.swing.JLabel();
        frontl = new javax.swing.JLabel();
        surnamel = new javax.swing.JLabel();
        firstnamel = new javax.swing.JLabel();
        middlenamel = new javax.swing.JLabel();
        birthdatel = new javax.swing.JLabel();
        postcodel = new javax.swing.JLabel();
        cityl = new javax.swing.JLabel();
        otherl = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        middlename = new javax.swing.JTextField();
        birthdate = new javax.swing.JTextField();
        postcode = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        other = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        upload = new javax.swing.JButton();
        search = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        info = new javax.swing.JLabel();
        frontbox = new javax.swing.JComboBox<>();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Betegek");

        Back.setText("Vissza");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        patiens.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        patiens.setText("Betegek");

        frontl.setText("Előtag:");

        surnamel.setText("Vezetéknév:");

        firstnamel.setText("Keresztnév:");

        middlenamel.setText("Másodiknév:");

        birthdatel.setText("Születési dátum:");

        postcodel.setText("Irányítószám:");

        cityl.setText("Település:");

        otherl.setText("Egyéb cím:");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Előtag", "Vezetéknév", "Keresztnév", "Másodiknév", "Születési dátum", "Irányítószám", "Település", "Egyéb cím"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        upload.setText("Feltöltés");
        upload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadActionPerformed(evt);
            }
        });

        search.setText("Keresés");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        delete.setText("Törlés");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setText("Újra töltés");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(patiens)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(frontl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(frontbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(firstnamel)
                                    .addGap(31, 31, 31)
                                    .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(middlenamel)
                                    .addGap(29, 29, 29)
                                    .addComponent(middlename))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(birthdatel)
                                        .addComponent(postcodel)
                                        .addComponent(cityl)
                                        .addComponent(otherl))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(other)
                                        .addComponent(city)
                                        .addComponent(postcode)
                                        .addComponent(birthdate, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(surnamel)
                                    .addGap(29, 29, 29)
                                    .addComponent(surname)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(reset))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(patiens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(frontl)
                            .addComponent(frontbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(surnamel)
                            .addComponent(surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnamel)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(middlenamel)
                            .addComponent(middlename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthdatel)
                            .addComponent(birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(postcodel)
                            .addComponent(postcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityl)
                            .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(otherl)
                            .addComponent(other, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(upload)
                            .addComponent(search))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(reset)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(info)
                    .addComponent(Back))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        new home().setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BackActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadActionPerformed
        String fr = frontbox.getSelectedItem().toString();
        String su = surname.getText().replaceAll("[^A-Za-záéőúűóüöí /-]", "");;
        String fi = firstname.getText().replaceAll("[^A-Za-záéőúűóüöí /-]", "");;
        String mi = middlename.getText().replaceAll("[^A-Za-záéőúűóüöí /-]", "");;
        String da = birthdate.getText().replaceAll("[.]", "-");
        da = da.replaceAll("[^0-9/: /-]", "");
        String po = postcode.getText().replaceAll("[^0-9]", "");
        String ci = city.getText().replaceAll("[^A-Za-záéőúűóüöí /-]", "");
        String ot = other.getText().replaceAll("[^A-Za-záéőúűóüöí0-9 /./-]", "");
        surname.setText(su);
        firstname.setText(fi);
        birthdate.setText(da);
        postcode.setText(po);
        city.setText(ci);
        other.setText(ot);
        if (su.equals("") || fi.equals("") || da.equals("") || po.equals("") || ci.equals("") || ot.equals("")) {
            info.setForeground(Color.red);
            info.setText("Valamelyik mező üres.(A második keresztneven kívül)");
        } else {
            try {
                info.setForeground(Color.blue);
                info.setText("A helytelen karaktereket eltávolítottuk.");
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga", "root", "");
                Statement stmt = con.createStatement();
                String sqlparancs = "SELECT * FROM szemely WHERE elotag LIKE ? AND vezeteknev LIKE ? AND keresztnev LIKE ? AND masodik_keresztnev LIKE ?";
                PreparedStatement pst = con.prepareStatement(sqlparancs);
                pst.setString(1, fr);
                pst.setString(2, "%" + su + "%");
                pst.setString(3, "%" + fi + "%");
                pst.setString(4, "%" + mi + "%");
                ResultSet result = pst.executeQuery();                
                String insTestP = "INSERT INTO szemely (elotag, vezeteknev, keresztnev, masodik_keresztnev) VALUES (?,?,?,?)";
                PreparedStatement insTest = con.prepareStatement(insTestP);
                insTest.setString(1, fr);
                insTest.setString(2, su);
                insTest.setString(3, fi);
                insTest.setString(4, mi);
                if (result.next()) {
                   ResultSet result2 = stmt.executeQuery("SELECT b_id FROM betegek INNER JOIN szemely ON szemely.szem_id=betegek.b_id WHERE elotag='" + result.getString("elotag") + "' AND vezeteknev='" + result.getString("vezeteknev") + "' AND keresztnev='" + result.getString("keresztnev") + "' AND masodik_keresztnev='" + result.getString("masodik_keresztnev") + "'");
                    if (!result2.next()) {
                        String ins = "INSERT INTO betegek (b_id, szuletesi_datum, iranyitoszam, telepules, egyeb_cim) VALUES ((SELECT szem_id FROM szemely WHERE elotag='"+result.getString("elotag")+"' AND vezeteknev='"+result.getString("vezeteknev")+"' AND keresztnev='"+result.getString("keresztnev")+"' AND masodik_keresztnev='"+result.getString("masodik_keresztnev")+"'),?,?,?,?)";
                        PreparedStatement insB = con.prepareStatement(ins);
                        insB.setString(1, da);
                        insB.setString(2, po);
                        insB.setString(3, ci);
                        insB.setString(4, ot);
                        insB.executeUpdate();
                        info.setForeground(Color.blue);
                    info.setText("Sikeres feltöltés!");
                    } else {
                        info.setForeground(Color.red);
                        info.setText("A személy már szerepel a listában!");
                    }
                } else if (insTest.executeUpdate() > 0) {
                    String ins = "INSERT INTO betegek (b_id, szuletesi_datum, iranyitoszam, telepules, egyeb_cim) VALUES ((SELECT szem_id FROM szemely ORDER BY szem_id DESC LIMIT 1),?,?,?,?)";
                    PreparedStatement insB = con.prepareStatement(ins);
                    insB.setString(1, da);
                    insB.setString(2, po);
                    insB.setString(3, ci);
                    insB.setString(4, ot);
                    insB.executeUpdate();
                    info.setForeground(Color.blue);
                    info.setText("Sikeres feltöltés! \n Új személyt vett fel.");
                }
                surname.setText("");
                firstname.setText("");
                middlename.setText("");
                birthdate.setText("");
                postcode.setText("");
                city.setText("");
                other.setText("");
                TablaTorol(table);
                TablaFeltolt(table);
            } catch (Exception e) {
                System.err.println("Hiba: " + e);
            }
        }
    }//GEN-LAST:event_uploadActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga", "root", "");
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int sszam = table.getSelectedRow();
            String torles[] = new String[8];
            for (int i = 0; i < 8; i++) {
                torles[i] = table.getValueAt(sszam, i).toString();
            }
            stmt.executeUpdate("DELETE FROM szemely WHERE elotag='" + torles[0] + "' AND vezeteknev='" + torles[1] + "' AND keresztnev='" + torles[2] + "' AND masodik_keresztnev='" + torles[3] + "'");
            TablaTorol(table);
            TablaFeltolt(table);
        } catch (Exception e) {
            System.err.println("Hiba: " + e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String fr = frontbox.getSelectedItem().toString();
        String su = surname.getText().replaceAll("[^A-Za-záéőúűóüöí /%/-]", "");
        surname.setText(su);
        String fi = firstname.getText().replaceAll("[^A-Za-záéőúűóüöí /%/-]", "");
        firstname.setText(fi);
        String mi = middlename.getText().replaceAll("[^A-Za-záéőúűóüöí /%/-]", "");
        middlename.setText(mi);
        String da = birthdate.getText().replaceAll("[.]", "-");
        da = da.replaceAll("[^0-9/:/% /-]", "");
        birthdate.setText(da);
        String po = postcode.getText().replaceAll("[^0-9]", "");
        postcode.setText(po);
        String ci = city.getText().replaceAll("[^A-Za-záéőúűóüöí /%/-]", "");
        city.setText(ci);
        String ot = other.getText().replaceAll("[^A-Za-záéőúűóüöí0-9 /%/./-]", "");
        other.setText(ot);
        String sqlparancs = "SELECT szemely.elotag, szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev, betegek.szuletesi_datum,betegek.iranyitoszam,betegek.telepules,betegek.egyeb_cim FROM szemely INNER JOIN betegek ON szemely.szem_id=betegek.b_id WHERE elotag LIKE ? AND vezeteknev LIKE ? AND keresztnev LIKE ? AND masodik_keresztnev LIKE ? AND szuletesi_datum LIKE ? AND iranyitoszam LIKE ? AND telepules LIKE ? AND egyeb_cim LIKE ? ";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga", "root", "");
            TablaTorol(table);
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if (fr.equals("")) {
                fr = "%";
            }
            if (su.equals("")) {
                su = "%";
            }
            if (fi.equals("")) {
                fi = "%";
            }
            if (mi.equals("")) {
                mi = "%";
            }
            if (da.equals("")) {
                da = "%";
            }
            if (po.equals("")) {
                po = "%";
            }
            if (ci.equals("")) {
                ci = "%";
            }
            if (ot.equals("")) {
                ot = "%";
            }

            PreparedStatement pst = con.prepareStatement(sqlparancs);
            pst.setString(1, "%" + fr + "%");
            pst.setString(2, "%" + su + "%");
            pst.setString(3, "%" + fi + "%");
            pst.setString(4, "%" + mi + "%");
            pst.setString(5, "%" + da + "%");
            pst.setString(6, "%" + po + "%");
            pst.setString(7, "%" + ci + "%");
            pst.setString(8, "%" + ot + "%");
            ResultSet result = pst.executeQuery();
            String[] rekord = new String[8];
            while (result.next()) {

                rekord[0] = result.getString("elotag");
                rekord[1] = result.getString("vezeteknev");
                rekord[2] = result.getString("keresztnev");
                rekord[3] = result.getString("masodik_keresztnev");
                rekord[4] = result.getString("szuletesi_datum");
                rekord[5] = result.getString("iranyitoszam");
                rekord[6] = result.getString("telepules");
                rekord[7] = result.getString("egyeb_cim");
                model.addRow(rekord);
            }
            con.close();
            info.setForeground(Color.blue);
            info.setText("A helytelen karaktereket eltávolítottuk a sikeres keresés érdekében.");

        } catch (Exception e) {
            System.err.println("Hiba: " + e);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        TablaTorol(table);
        TablaFeltolt(table);
        surname.setText("");
        firstname.setText("");
        middlename.setText("");
        birthdate.setText("");
        postcode.setText("");
        city.setText("");
        other.setText("");
    }//GEN-LAST:event_resetActionPerformed
    public static void TablaFeltolt(JTable JTable) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga", "root", "");
            Statement stmt = con.createStatement();
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            ResultSet result = stmt.executeQuery("SELECT szemely.elotag, szemely.vezeteknev, szemely.keresztnev, szemely.masodik_keresztnev, betegek.szuletesi_datum,betegek.iranyitoszam,betegek.telepules,betegek.egyeb_cim FROM szemely INNER JOIN betegek ON szemely.szem_id=betegek.b_id");
            String[] rekord = new String[8];
            while (result.next()) {
                rekord[0] = result.getString("elotag");
                rekord[1] = result.getString("vezeteknev");
                rekord[2] = result.getString("keresztnev");
                rekord[3] = result.getString("masodik_keresztnev");
                rekord[4] = result.getString("szuletesi_datum");
                rekord[5] = result.getString("iranyitoszam");
                rekord[6] = result.getString("telepules");
                rekord[7] = result.getString("egyeb_cim");
                model.addRow(rekord);
            }
            con.close();
        } catch (Exception e) {
            System.err.println("Hiba: " + e);
        }
    }

    public static void TablaTorol(JTable JTable) {
        try {
            DefaultTableModel model = (DefaultTableModel) JTable.getModel();
            int ssz = model.getRowCount();
            for (int i = 0; i < ssz; i++) {
                model.removeRow(0);
            }
        } catch (Exception e) {
            System.err.println("Hiba: " + e);
        }
    }

    public static void ElotagBeszur(JComboBox belist) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/szakdoga", "root", "");
            String sqlparancs = "SELECT DISTINCT elotag FROM szemely ORDER BY elotag";
            PreparedStatement pst = con.prepareStatement(sqlparancs);
            ResultSet rs = pst.executeQuery();
            ArrayList<String> elotagok = new ArrayList<String>();
            while (rs.next()) {
                elotagok.add(rs.getString("elotag"));
            }
            con.close();
            for (int i = 0; i < elotagok.size(); i++) {
                belist.addItem(elotagok.get(i));
            }
        } catch (Exception e) {

        }
    }

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
            java.util.logging.Logger.getLogger(patiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patiens.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patiens().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField birthdate;
    private javax.swing.JLabel birthdatel;
    private javax.swing.JTextField city;
    private javax.swing.JLabel cityl;
    private javax.swing.JButton delete;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel firstnamel;
    private javax.swing.JComboBox<String> frontbox;
    private javax.swing.JLabel frontl;
    private javax.swing.JLabel info;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField middlename;
    private javax.swing.JLabel middlenamel;
    private javax.swing.JTextField other;
    private javax.swing.JLabel otherl;
    private javax.swing.JLabel patiens;
    private javax.swing.JTextField postcode;
    private javax.swing.JLabel postcodel;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTextField surname;
    private javax.swing.JLabel surnamel;
    private javax.swing.JTable table;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}
