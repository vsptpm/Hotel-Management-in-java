/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management;
import static com.mysql.jdbc.StringUtils.isNullOrEmpty;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Logger;
/**
 *
 * @author akki
 */
public class AdminAccess extends javax.swing.JFrame {

    /**
     * Creates new form AdminAccess
     */
    public AdminAccess() {
        initComponents();
        Fillcombou();
        Fillcombo();
    }
    private static final String URL = "jdbc:mysql://localhost:3306/hotelmanagement";
    private static final String USER = "root";
    private static final String PASS = "root";
    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    ResultSet rst = null;
    Statement st = null;
    ResultSetMetaData rsmd = null;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        TFusername = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TFpassword = new javax.swing.JPasswordField();
        Badduser = new javax.swing.JButton();
        TFroomno = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        Ctype = new javax.swing.JComboBox();
        TFrate = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Baddroom = new javax.swing.JButton();
        BReset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Bdeluser = new javax.swing.JButton();
        Croom = new javax.swing.JComboBox();
        Cuser = new javax.swing.JComboBox();
        blogout = new javax.swing.JButton();
        Brefresh = new javax.swing.JButton();
        Bdelroom = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(84, 110, 122));

        TFusername.setBackground(new java.awt.Color(84, 110, 122));
        TFusername.setForeground(new java.awt.Color(255, 255, 255));
        TFusername.setAutoscrolls(false);
        TFusername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TFusername.setMargin(new java.awt.Insets(1, 1, 1, 1));

        TFpassword.setBackground(new java.awt.Color(84, 110, 122));
        TFpassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Badduser.setBackground(new java.awt.Color(255, 255, 255));
        Badduser.setText("Add User");
        Badduser.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Badduser.setBorderPainted(false);
        Badduser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Badduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BadduserActionPerformed(evt);
            }
        });

        TFroomno.setBackground(new java.awt.Color(84, 110, 122));
        TFroomno.setForeground(new java.awt.Color(255, 255, 255));
        TFroomno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        TFroomno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFroomnoActionPerformed(evt);
            }
        });

        Ctype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "luxury", "ordinary" }));
        Ctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CtypeActionPerformed(evt);
            }
        });

        TFrate.setBackground(new java.awt.Color(84, 110, 122));
        TFrate.setForeground(new java.awt.Color(255, 255, 255));
        TFrate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Baddroom.setBackground(new java.awt.Color(255, 255, 255));
        Baddroom.setText("Add Room");
        Baddroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaddroomActionPerformed(evt);
            }
        });

        BReset.setBackground(new java.awt.Color(255, 255, 255));
        BReset.setText("RESET");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        Bdeluser.setText("Delete User");
        Bdeluser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeluserActionPerformed(evt);
            }
        });

        Cuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuserActionPerformed(evt);
            }
        });

        blogout.setText("log out");
        blogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blogoutActionPerformed(evt);
            }
        });

        Brefresh.setText("Refresh");
        Brefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrefreshActionPerformed(evt);
            }
        });

        Bdelroom.setText("Delete Room");
        Bdelroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdelroomActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TFroomno))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Brefresh)
                                .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ctype, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFrate, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(jSeparator4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Baddroom, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(BReset, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(blogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Badduser, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Croom, 0, 97, Short.MAX_VALUE)
                                    .addComponent(Cuser, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Bdeluser, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(Bdelroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bdeluser)
                    .addComponent(Cuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Croom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Brefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bdelroom))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TFusername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Badduser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TFroomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(Ctype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Baddroom, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(TFrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blogout)
                    .addComponent(BReset))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 11)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Room number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Room Type");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Rate");

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\akki\\Downloads\\Java Eproject (Hotel Managment)\\Java Eproject (Hotel Managment)\\HMS_Main\\images\\change pass.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BadduserActionPerformed
        // TODO add your handling code here:
        try{
    String username = TFusername.getText();
    String password = String.valueOf(TFpassword.getPassword());
    if(isNullOrEmpty(username) && isNullOrEmpty(password))
    {
    JOptionPane.showMessageDialog(this, "Invalid input");
    
    }else
    {
        String sel = "insert into users values(?, ?)";
        con = DriverManager.getConnection(URL, USER, PASS);
        pst = con.prepareStatement(sel);
        pst.setString(1, username);
        pst.setString(2, password);
        pst.executeUpdate();
        TFusername.setText(null);
        TFpassword.setText(null);
        JOptionPane.showMessageDialog(this, "User Details Added");
    }
    
        } catch (Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    }
    }//GEN-LAST:event_BadduserActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        // TODO add your handling code here:
        TFroomno.setText(null);
        TFrate.setText(null);
        TFusername.setText(null);
        TFpassword.setText(null);

    }//GEN-LAST:event_BResetActionPerformed

    private void TFroomnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFroomnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFroomnoActionPerformed

    private void BaddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaddroomActionPerformed
        // TODO add your handling code here:
         try{
    String roomno = TFroomno.getText();
    String rate = TFrate.getText();
    String status = "u";
    String type = Ctype.getSelectedItem().toString();
    if(isNullOrEmpty(roomno) && isNullOrEmpty(rate) )
    {
    JOptionPane.showMessageDialog(this, "Invalid input");
    
    }else
    {
    
            String sel = "insert into room values(?, ? , ? ,?)";
            con = DriverManager.getConnection(URL, USER, PASS);
            pst = con.prepareStatement(sel);
            pst.setString(1, roomno);
            pst.setString(2, type);
            pst.setString(3, rate);
            pst.setString(4, status);
            pst.executeUpdate();
            TFroomno.setText(null);
            TFrate.setText(null);
            JOptionPane.showMessageDialog(this, "Room Added");
    }
    } catch (Exception e){
    
    JOptionPane.showMessageDialog(null, e);
    }
        
    }//GEN-LAST:event_BaddroomActionPerformed

    private void CtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CtypeActionPerformed

    private void CuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuserActionPerformed

    private void BdeluserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeluserActionPerformed
        // TODO add your handling code here:
    try
    {
       String rm = "select * from users"; 
       String username = Cuser.getSelectedItem().toString();
       pst = con.prepareStatement(rm);
       rs = pst.executeQuery();
       while(rs.next())
            {
                if(username.equals(rs.getString(1)))
                {
                    String del = "delete from users where username = ?";
                    ps = con.prepareStatement(del);
                    ps.setString(1,username);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "User deleted");

                }
            }
       
    
    }catch (SQLException ex)
    {
            JOptionPane.showMessageDialog(this, ex);
    }   
    
    
    }//GEN-LAST:event_BdeluserActionPerformed

    private void blogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        MainScreen mp = new MainScreen();
        mp.setLocationRelativeTo(null);
        mp.setVisible(true);
    }//GEN-LAST:event_blogoutActionPerformed

    private void BrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrefreshActionPerformed
        // TODO add your handling code here:
        AdminAccess ad = new AdminAccess();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_BrefreshActionPerformed

    private void BdelroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdelroomActionPerformed
        // TODO add your handling code here:
        try
    {
       String rm = "select * from room"; 
       String roomno = Croom.getSelectedItem().toString();
       pst = con.prepareStatement(rm);
       rs = pst.executeQuery();
       while(rs.next())
            {
                if(roomno.equals(rs.getString(1)))
                {
                    String del = "delete from room where rno = ?";
                    ps = con.prepareStatement(del);
                    ps.setString(1,roomno);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "room deleted");

                }
            }
       
    
    }catch (SQLException ex)
    {
            JOptionPane.showMessageDialog(this, ex);
    }
        
    }//GEN-LAST:event_BdelroomActionPerformed
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
    private void Fillcombou(){
    try{
    String sql = "select username from users";
    con = DriverManager.getConnection(URL, USER, PASS);
    pst = con.prepareStatement(sql);
    rs=pst.executeQuery();
    
    while(rs.next()){
    String un =rs.getString("username");
    Cuser.addItem(un);
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
            java.util.logging.Logger.getLogger(AdminAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAccess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAccess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BReset;
    private javax.swing.JButton Baddroom;
    private javax.swing.JButton Badduser;
    private javax.swing.JButton Bdelroom;
    private javax.swing.JButton Bdeluser;
    private javax.swing.JButton Brefresh;
    private javax.swing.JComboBox Croom;
    private javax.swing.JComboBox Ctype;
    private javax.swing.JComboBox Cuser;
    private javax.swing.JPasswordField TFpassword;
    private javax.swing.JTextField TFrate;
    private javax.swing.JTextField TFroomno;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton blogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}