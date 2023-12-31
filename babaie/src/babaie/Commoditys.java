/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package babaie;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Notebook
 */
public class Commoditys extends javax.swing.JFrame {

    /**
     * Creates new form Commoditys
     */
    String barcode;
    String commodityName;
    String purchase;
    String sales;
    Connection c;
    Statement st;
    ResultSet rs1;
    ResultSet rs2;
    DefaultTableModel tblmodel;
    int range;
    public Commoditys() {
        initComponents();
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/babaiemarket" , "root" , "363831");
            st = c.createStatement();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Commoditys.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.tblmodel = (DefaultTableModel) commodity_table.getModel();
        
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
        commodity_table = new javax.swing.JTable();
        new_b = new javax.swing.JButton();
        edit_b = new javax.swing.JButton();
        delete_b = new javax.swing.JButton();
        back_b = new javax.swing.JButton();
        add_b = new javax.swing.JButton();
        edit_l = new javax.swing.JLabel();
        add_l = new javax.swing.JLabel();
        new_l = new javax.swing.JLabel();
        delete_l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(238, 238, 238));

        commodity_table.setBackground(new java.awt.Color(238, 238, 238));
        commodity_table.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        commodity_table.setForeground(new java.awt.Color(34, 40, 49));
        commodity_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "کد محصول", "نام کالا", "قیمت خرید", "قیمت فروش"
            }
        ));
        commodity_table.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        commodity_table.setShowGrid(true);
        jScrollPane1.setViewportView(commodity_table);

        new_b.setBackground(new java.awt.Color(255, 87, 34));
        new_b.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        new_b.setForeground(new java.awt.Color(45, 64, 89));
        new_b.setText("اضافه کردن محصول");
        new_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_bActionPerformed(evt);
            }
        });

        edit_b.setBackground(new java.awt.Color(255, 87, 34));
        edit_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        edit_b.setForeground(new java.awt.Color(45, 64, 89));
        edit_b.setText("تکمیل ویرایش");
        edit_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_bActionPerformed(evt);
            }
        });

        delete_b.setBackground(new java.awt.Color(255, 87, 34));
        delete_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        delete_b.setForeground(new java.awt.Color(45, 64, 89));
        delete_b.setText("حذف محصول");
        delete_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_bActionPerformed(evt);
            }
        });

        back_b.setBackground(new java.awt.Color(255, 87, 34));
        back_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        back_b.setForeground(new java.awt.Color(45, 64, 89));
        back_b.setText("برگشت");
        back_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_bActionPerformed(evt);
            }
        });

        add_b.setBackground(new java.awt.Color(255, 87, 34));
        add_b.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        add_b.setForeground(new java.awt.Color(45, 64, 89));
        add_b.setText("ثبت محصول");
        add_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bActionPerformed(evt);
            }
        });

        edit_l.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edit_l.setForeground(new java.awt.Color(34, 40, 49));
        edit_l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        add_l.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        add_l.setForeground(new java.awt.Color(34, 40, 49));
        add_l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        new_l.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        new_l.setForeground(new java.awt.Color(34, 40, 49));
        new_l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        delete_l.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        delete_l.setForeground(new java.awt.Color(34, 40, 49));
        delete_l.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back_b, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(delete_l, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(delete_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(edit_l, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(edit_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(add_l, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(add_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(new_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(new_l, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit_l, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_l, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(new_l, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_l, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(add_b, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(new_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(back_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edit_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_b, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void new_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_bActionPerformed
        // TODO add your handling code here:
        tblmodel.addRow(new Object[]{"کد کالا", "نام کالا" , "قیمت خرید" , "قیمت فروش"});
        new_l.setText("سطر جدید اضافه شد");
        Timer t = new Timer (3000 , new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    new_l.setText("");
                }
            });
        t.start();
        
    }//GEN-LAST:event_new_bActionPerformed

    private void back_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_bActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_back_bActionPerformed

    private void add_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bActionPerformed
        // TODO add your handling code here:
        int row = commodity_table.getSelectedRow();
        barcode = (String) commodity_table.getValueAt(row, 0);
        commodityName = (String) commodity_table.getValueAt(row, 1);
        purchase = (String) commodity_table.getValueAt(row, 2);
        sales = (String) commodity_table.getValueAt(row, 3);
        try {
            st.executeUpdate("INSERT INTO commodity VALUES ('" + barcode + "','" + commodityName + "','" + purchase + "','" + sales + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Commoditys.class.getName()).log(Level.SEVERE, null, ex);
        }
        add_l.setText("کالا اضافه شد");
        Timer t = new Timer (3000 , new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    add_l.setText("");
                }
            });
        t.start();
    }//GEN-LAST:event_add_bActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            rs1 = st.executeQuery("SELECT COUNT(*) FROM commodity");
            if (rs1.next()) {
                range = rs1.getInt(1);
                String[][] values = new String[4*range][4];
                int num = 0;
                rs2 = st.executeQuery("SELECT * FROM commodity");
                while (num<4*range && rs2.next()) {
                    values[num][0] = rs2.getString("barcode");
                    values[num][1] = rs2.getString("commodityname");
                    values[num][2] = rs2.getString("purchase");
                    values[num][3] = rs2.getString("sales");
                    num++;
                }
                
                // make rows in java table
                for (int i = 0 ; i<range ; i++) {
                    tblmodel.addRow(values[i]);
                }   
            }
        } catch (SQLException ex) {
            Logger.getLogger(Commoditys.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void delete_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_bActionPerformed
        // TODO add your handling code here:
        int row = commodity_table.getSelectedRow();
        barcode = (String) commodity_table.getValueAt(row, 0);
        tblmodel.removeRow(row);
        try {
            st.executeUpdate("DELETE FROM commodity WHERE barcode LIKE '" + barcode + "'");
        } catch (SQLException ex) {
            Logger.getLogger(Commoditys.class.getName()).log(Level.SEVERE, null, ex);
        }
        delete_l.setText("حذف شد");
        Timer t = new Timer (3000 , new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    delete_l.setText("");
                }
            });
        t.start();
    }//GEN-LAST:event_delete_bActionPerformed

    private void edit_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_bActionPerformed
        // TODO add your handling code here:
        int row = commodity_table.getSelectedRow();
        barcode = (String) commodity_table.getValueAt(row, 0);
        commodityName = (String) commodity_table.getValueAt(row, 1);
        purchase = (String) commodity_table.getValueAt(row, 2);
        sales = (String) commodity_table.getValueAt(row, 3);
        try {
            st.executeUpdate("UPDATE commodity SET commodityname = '" + commodityName + "', purchase = '" + purchase + "', sales = '" + sales + "' WHERE barcode LIKE '" + barcode + "';" );
        } catch (SQLException ex) {
            Logger.getLogger(Commoditys.class.getName()).log(Level.SEVERE, null, ex);
        }
        edit_l.setText("ویرایش شد ");
        Timer t = new Timer (3000 , new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    edit_l.setText("");
                }
            });
        t.start();
    }//GEN-LAST:event_edit_bActionPerformed

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
                new Commoditys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_b;
    private javax.swing.JLabel add_l;
    private javax.swing.JButton back_b;
    private javax.swing.JTable commodity_table;
    private javax.swing.JButton delete_b;
    private javax.swing.JLabel delete_l;
    private javax.swing.JButton edit_b;
    private javax.swing.JLabel edit_l;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton new_b;
    private javax.swing.JLabel new_l;
    // End of variables declaration//GEN-END:variables
}
