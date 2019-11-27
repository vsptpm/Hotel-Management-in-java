/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author akki
 */
public class AddCustomer extends javax.swing.JFrame {

    /**
     * Creates new form AddCustomer
     */
    public AddCustomer() {
        initComponents();
        Fillcombo();
    }
    private static final String URL = "jdbc:mysql://localhost:3306/hotelmanagement";
    private static final String USER = "root";
    private static final String PASS = "root";
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Statement st = null;
    ResultSetMetaData rsmd = null;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TFname = new javax.swing.JTextField();
        TFadd = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        TFid = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Croom = new javax.swing.JComboBox();
        TFdays = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Badd = new javax.swing.JButton();
        Bmain = new javax.swing.JButton();
        BReset = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("CHECK IN");

        jLabel2.setText("NAME");

        jLabel3.setText("ADDRESS");

        jLabel4.setText("ID NO");

        jLabel5.setText("ROOM");

        jLabel6.setText("DAYS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(80, 80, 80)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(84, 110, 122));

        TFname.setBackground(new java.awt.Color(84, 110, 122));
        TFname.setForeground(new java.awt.Color(255, 255, 255));
        TFname.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnameActionPerformed(evt);
            }
        });

        TFadd.setBackground(new java.awt.Color(84, 110, 122));
        TFadd.setForeground(new java.awt.Color(255, 255, 255));
        TFadd.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        TFid.setBackground(new java.awt.Color(84, 110, 122));
        TFid.setForeground(new java.awt.Color(255, 255, 255));
        TFid.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Croom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CroomActionPerformed(evt);
            }
        });

        TFdays.setBackground(new java.awt.Color(84, 110, 122));
        TFdays.setForeground(new java.awt.Color(255, 255, 255));
        TFdays.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Badd.setText("CHECK IN");
        Badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddActionPerformed(evt);
            }
        });

        Bmain.setText("Main Menu");
        Bmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmainActionPerformed(evt);
            }
        });

        BReset.setText("RESET");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TFadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(TFname, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TFid)
                        .addComponent(jSeparator3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Croom, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BReset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(TFdays, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(Badd, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bmain, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Bmain, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(TFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Croom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BReset))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Badd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
        TFname.setText(null);
        TFadd.setText(null);
        TFid.setText(null);
        TFdays.setText(null);

    }//GEN-LAST:event_BResetActionPerformed

    private void BmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmainActionPerformed
        // TODO add your handling code here:
        dispose();
        UserControlPanel mp = new UserControlPanel();
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
    }//GEN-LAST:event_BmainActionPerformed

    private void BaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddActionPerformed

        try {

            String name = TFname.getText();
            String address = TFadd.getText();
            String idno = TFid.getText();
            String days = TFdays.getText();
            String roomno = Croom.getSelectedItem().toString();

            String rm = "select * from room";
            pst = con.prepareStatement(rm);
            rs = pst.executeQuery();
            String st = "o";
            while(rs.next()){
                if(roomno.equals(rs.getString(1))){
                    if(st.equals(rs.getString(4))){
                        InfoMessage("Room is occupied","Can't select room");

                    }else{
                        String sel = "insert into customer values(?, ?, ?, ?, ?)";
                        con = DriverManager.getConnection(URL, USER, PASS);
                        pst = con.prepareStatement(sel);
                        pst.setString(1, name);
                        pst.setString(2, address);
                        pst.setString(3, idno);
                        pst.setString(4, roomno);
                        pst.setString(5, days);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Customer Details Added");
                        TFname.setText(null);
                        TFadd.setText(null);
                        TFid.setText(null);
                        TFdays.setText(null);
                        String uprm = "update room set status = 'o' where rno = ?";
                        ps = con.prepareStatement(uprm);
                        ps.setString(1,roomno);
                        ps.executeUpdate();
                        rs = ps.executeQuery();
                        
                    }

                }

            }

        } catch (SQLException ex) {
            System.out.println("Exception");

        }

    }//GEN-LAST:event_BaddActionPerformed

    private void CroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CroomActionPerformed
        // TODO add your handling code here:
        String roomno = Croom.getSelectedItem().toString();

    }//GEN-LAST:event_CroomActionPerformed

    private void TFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnameActionPerformed
    private void Fillcombo(){
    try{
    String sql = "select * from room";
    con = DriverManager.getConnection(URL, USER, PASS);
    pst = con.prepareStatement(sql);
    rs=pst.executeQuery();
    
    while(rs.next()){
    String rno =rs.getString("rno");
    Croom.addItem(rno);
    }
    } catch (Exception e){
    
    JOptionPane.showMessageDialog(null, e);
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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCustomer().setVisible(true);
            }
        });
    }
public void InfoMessage(String message, String tittle) {
       JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReset;
    private javax.swing.JButton Badd;
    private javax.swing.JButton Bmain;
    private javax.swing.JComboBox Croom;
    private javax.swing.JTextField TFadd;
    private javax.swing.JTextField TFdays;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
