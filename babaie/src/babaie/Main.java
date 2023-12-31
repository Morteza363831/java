/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package babaie;
import java.sql.*;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Notebook
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    Connection c;
    Statement st;
    ResultSet rs;
    private List<String> list;
    String sql;
    public Main() {
        initComponents();
        list = new ArrayList<>();
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
        commodity_b = new javax.swing.JButton();
        newCustomer_b = new javax.swing.JButton();
        newServer_b = new javax.swing.JButton();
        customers_cb = new javax.swing.JComboBox<>();
        export_b = new javax.swing.JButton();
        file_b = new javax.swing.JButton();
        import_b = new javax.swing.JButton();
        search_t = new javax.swing.JTextField();
        search_b = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        commodity_b.setBackground(new java.awt.Color(255, 87, 34));
        commodity_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        commodity_b.setForeground(new java.awt.Color(45, 64, 89));
        commodity_b.setText("کالا ها");
        commodity_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commodity_bActionPerformed(evt);
            }
        });

        newCustomer_b.setBackground(new java.awt.Color(255, 87, 34));
        newCustomer_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newCustomer_b.setForeground(new java.awt.Color(45, 64, 89));
        newCustomer_b.setText("مشتری جدید");
        newCustomer_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newCustomer_bActionPerformed(evt);
            }
        });

        newServer_b.setBackground(new java.awt.Color(255, 87, 34));
        newServer_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        newServer_b.setForeground(new java.awt.Color(45, 64, 89));
        newServer_b.setText("ساخت  سرور جدید");
        newServer_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newServer_bActionPerformed(evt);
            }
        });

        customers_cb.setBackground(new java.awt.Color(255, 87, 34));
        customers_cb.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        customers_cb.setForeground(new java.awt.Color(45, 64, 89));
        customers_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customers_cbActionPerformed(evt);
            }
        });

        export_b.setBackground(new java.awt.Color(255, 87, 34));
        export_b.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        export_b.setForeground(new java.awt.Color(45, 64, 89));
        export_b.setText("دریافت فایل");
        export_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export_bActionPerformed(evt);
            }
        });

        file_b.setBackground(new java.awt.Color(255, 87, 34));
        file_b.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        file_b.setForeground(new java.awt.Color(45, 64, 89));
        file_b.setText("انتخاب فایل");
        file_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                file_bActionPerformed(evt);
            }
        });

        import_b.setBackground(new java.awt.Color(255, 87, 34));
        import_b.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        import_b.setForeground(new java.awt.Color(45, 64, 89));
        import_b.setText("اضافه کردن");
        import_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                import_bActionPerformed(evt);
            }
        });

        search_t.setBackground(new java.awt.Color(255, 87, 34));
        search_t.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        search_t.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        search_b.setBackground(new java.awt.Color(255, 87, 34));
        search_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        search_b.setForeground(new java.awt.Color(34, 40, 49));
        search_b.setText("جست و جو ");
        search_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_bActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customers_cb, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newCustomer_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commodity_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(newServer_b, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(import_b, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(export_b, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(file_b, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(search_t, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(search_b, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(commodity_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(newCustomer_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(search_t)
                    .addComponent(search_b, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(customers_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(export_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(import_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newServer_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void newServer_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newServer_bActionPerformed
        try {
            // TODO add your handling code here:
            c = DriverManager.getConnection("jdbc:mysql://localhost/" , "root" , "363831");
            st = c.createStatement();
            st.executeUpdate("CREATE DATABASE babaiemarket CHARACTER SET utf8 COLLATE utf8_general_ci");
            st.executeUpdate("use babaiemarket");
            st.executeUpdate("CREATE TABLE commodity\n" +
                            "   (\n" +
                            "   barcode  VARCHAR(32) PRIMARY KEY NOT NULL,\n" +
                            "   commodityname  VARCHAR(32) NOT NULL,\n" +
                            "   purchase  VARCHAR(32) NOT NULL,\n" +
                            "   sales     VARCHAR(32) NOT NULL\n" +
                            "   );");
            st.executeUpdate("CREATE TABLE customers\n" +
                            "   (\n" +
                            "   customername  VARCHAR(32) NOT NULL,\n" +
                            "   result  INT NOT NULL\n" +
                            "   );");
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newServer_bActionPerformed

    private void commodity_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commodity_bActionPerformed
        // TODO add your handling code here:
        Commoditys commodity = new Commoditys();
        commodity.setVisible(true);
        
    }//GEN-LAST:event_commodity_bActionPerformed

    private void newCustomer_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newCustomer_bActionPerformed
        // TODO add your handling code here:
        NewCustomer nc = new NewCustomer();
        nc.setVisible(true);
        dispose();
    }//GEN-LAST:event_newCustomer_bActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost/babaiemarket" , "root" , "363831");
            st = c.createStatement();
            // TODO add your handling code here:
            rs = st.executeQuery("SHOW TABLES");
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        customers_cb.addItem("لطفا یک مشتری انتخاب کنید !");
        for (int i = 0; i<list.size(); i++) {
            if (list.get(i).equals("commodity") || list.get(i).equals("customers")) {
                continue;
            }
            customers_cb.addItem(list.get(i));
        }

    }//GEN-LAST:event_formWindowOpened

    private void customers_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customers_cbActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i<list.size(); i++) {
            if (customers_cb.getSelectedItem() == list.get(i)){
                Customer customer = new Customer((String) customers_cb.getSelectedItem());
                customer.setVisible(true);
                
            }
        }
    }//GEN-LAST:event_customers_cbActionPerformed

    private void file_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_file_bActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int returnVal = chooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
           sql =  chooser.getSelectedFile().getAbsolutePath();
           sql = sql.replace('\\', '/');
           System.out.print(sql);
           
        }
    }//GEN-LAST:event_file_bActionPerformed

    private void export_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export_bActionPerformed
        try {
            // TODO add your handling code here:
            String dbName = "babaiemarket";
            String dbUser = "root";
            String dbPass = "363831";
            String backupPath = "mybackup.sql";
            String executeCmd = "C:/Program Files/MySQL/MySQL Server 8.0/bin/mysqldump -u " + dbUser + " -p" + dbPass + " " + dbName + " -r " + backupPath;
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();
            if (processComplete == 0) {
                JOptionPane.showMessageDialog(this, "دیتا بیس ذخیره شد", "ذخیره کردن دیتا بیس", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "موفقیت امیز نبود", "ذخیره کردن دیتا بیس", JOptionPane.OK_OPTION);
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_export_bActionPerformed

    private void import_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_import_bActionPerformed

            // TODO add your handling code here:
            System.out.print(sql);
            String dbName = "babaiemarket";
            String dbUser = "root";
            String dbPass = "363831";
            String backupPath = sql;
        ProcessBuilder processBuilder = new ProcessBuilder(
        "C:/Program Files/MySQL/MySQL Server 8.0/bin/mysql",
        "-u", dbUser,
        "-p" + dbPass,
        dbName);

        File backupFile = new File(backupPath);
        processBuilder.redirectInput(backupFile);

        try {
            Process process = processBuilder.start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                JOptionPane.showMessageDialog(this, "دیتا بیس اضافه شد", "اضافه کردن دیتا بیس", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "موفقیت امیز نبود", "اضافه کردن دیتا بیس", JOptionPane.OK_OPTION);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_import_bActionPerformed

    private void search_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_bActionPerformed
        // TODO add your handling code here:
        for (String customer : list) {
        if (customer.toLowerCase().contains(search_t.getText())) {
            customers_cb.removeAllItems();
            customers_cb.addItem("جست و جو انجام شد");
            customers_cb.addItem(customer);
        }
    }
    }//GEN-LAST:event_search_bActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton commodity_b;
    private javax.swing.JComboBox<String> customers_cb;
    private javax.swing.JButton export_b;
    private javax.swing.JButton file_b;
    private javax.swing.JButton import_b;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newCustomer_b;
    private javax.swing.JButton newServer_b;
    private javax.swing.JButton search_b;
    private javax.swing.JTextField search_t;
    // End of variables declaration//GEN-END:variables
}
