/////////////////////////////////////////////////////////////////morteza mahdi zadeh
/////////////////////////////////////////////////////////////////4012023030
import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Sent extends javax.swing.JFrame {

    /**
     * Creates new form Sent
     */
    public Sent() {
        initComponents();
    }
    
    public Sent(String accountName) {
        initComponents();
        accountName_l.setText(accountName);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sent_table = new javax.swing.JTable();
        accountName_l = new javax.swing.JLabel();
        ok_b = new javax.swing.JButton();
        remove_b = new javax.swing.JButton();
        see_b = new javax.swing.JButton();
        seeError_l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(229, 229, 229));

        sent_table.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        sent_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "From/To", "Subject", "Date&Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        sent_table.setRowHeight(30);
        jScrollPane1.setViewportView(sent_table);

        accountName_l.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        accountName_l.setForeground(new java.awt.Color(252, 163, 17));

        ok_b.setBackground(new java.awt.Color(255, 255, 255));
        ok_b.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        ok_b.setText("Ok");
        ok_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_bActionPerformed(evt);
            }
        });

        remove_b.setBackground(new java.awt.Color(255, 255, 255));
        remove_b.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        remove_b.setText("Remove");
        remove_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_bActionPerformed(evt);
            }
        });

        see_b.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        see_b.setText("See");
        see_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                see_bActionPerformed(evt);
            }
        });

        seeError_l.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 12)); // NOI18N
        seeError_l.setForeground(new java.awt.Color(230, 55, 69));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accountName_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ok_b, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(seeError_l, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(see_b, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(remove_b, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accountName_l, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(seeError_l, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(remove_b, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ok_b, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(see_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        //create an object for the table
        DefaultTableModel tblmodel1 = (DefaultTableModel) sent_table.getModel();
        TableColumnModel columnModel = sent_table.getColumnModel();
        String user = accountName_l.getText().substring(0, accountName_l.getText().indexOf('@'));
        int range = 0;
        Connection c;
        try {
            // an object for connect to sql
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emails" , "root" , "363831");
            Statement st = c.createStatement();
                // take count of rows in user sql table
            ResultSet rs2 = st.executeQuery("SELECT COUNT(*) FROM sented_" + user);
            if (rs2.next()) {
                range = rs2.getInt(1);
                System.out.println(range);
            }
                
            String[][] values2 = new String[3*range][3];
            int num1 = 0;
            // take records in each row
            ResultSet rs = st.executeQuery("SELECT * FROM sented_" + user);
               
            while (num1<3*range && rs.next()) {
                values2[num1][0] = rs.getString("sender");
                values2[num1][1] = rs.getString("subject");
                values2[num1][2] = rs.getString("date");
            num1++;

            }
            
            // make rows in java table
            for (int i = 0 ; i<range ; i++) {
                tblmodel1.addRow(values2[i]);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void ok_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_bActionPerformed
        // TODO add your handling code here:
        Inbox i = new Inbox(accountName_l.getText());
        i.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_ok_bActionPerformed

    private void see_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_see_bActionPerformed
        // TODO add your handling code here:
        // create an object for table
        DefaultTableModel tblmodel = (DefaultTableModel) sent_table.getModel();
        String user = accountName_l.getText().substring(0, accountName_l.getText().indexOf('@'));
        int row = sent_table.getSelectedRow();
        Connection c;
        try {
            // connect to sql
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emails" , "root" , "363831");
            Statement st = c.createStatement();
            // recieve values from java table in a special row
            String from = (String) tblmodel.getValueAt(row, 0);
            String subject = (String) tblmodel.getValueAt(row, 1);
            String date = (String) tblmodel.getValueAt(row, 2);
            String message = null;
            // recieve message record from sql table
            ResultSet rs = st.executeQuery("SELECT * FROM sented_" + user + " WHERE sender = '" + from + "' AND subject = '" + subject + "' AND date = '" + date + "'");
            // save this record on string message
            if (rs.next()) {
                message = rs.getString("message");
            }
            // make an object for class see and set it visible
            See s = new See(from , subject , message , accountName_l.getText());
            s.setVisible(true);
               
            
        } catch (SQLException ex) {
            Logger.getLogger(Sent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_see_bActionPerformed

    private void remove_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_bActionPerformed
        // TODO add your handling code here:
        String user = accountName_l.getText().substring(0, accountName_l.getText().indexOf('@'));
        DefaultTableModel tblmodel = (DefaultTableModel) sent_table.getModel();
        int row = sent_table.getSelectedRow();
        String value1 = tblmodel.getValueAt(row, 0).toString();
        String value2 = tblmodel.getValueAt(row, 1).toString();
        String value3 = tblmodel.getValueAt(row, 2).toString();
        Connection c;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/emails" , "root" , "363831");
            Statement st = c.createStatement();
            // remmove selected row from sql table
            st.executeUpdate("DELETE FROM sented_" + user + " WHERE sender LIKE '" + value1 + "' AND subject LIKE '" + value2 + "' AND date LIKE '" + value3 + "'");
            // remove selected row from java table
            tblmodel.removeRow(row);
        } catch (SQLException ex) {
            Logger.getLogger(Sent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_remove_bActionPerformed

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
            java.util.logging.Logger.getLogger(Sent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accountName_l;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton ok_b;
    private javax.swing.JButton remove_b;
    private javax.swing.JLabel seeError_l;
    private javax.swing.JButton see_b;
    private javax.swing.JTable sent_table;
    // End of variables declaration//GEN-END:variables
}