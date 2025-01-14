
package librarybookinventory;

import com.sun.jdi.connect.spi.Connection;
import java.beans.Statement;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LibraryBookInventory extends javax.swing.JFrame {



    public LibraryBookInventory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        javax.swing.JButton jbtnRefresh = new javax.swing.JButton();
        javax.swing.JButton jbtnAddBook = new javax.swing.JButton();
        javax.swing.JButton jbtnDeleteBook = new javax.swing.JButton();
        javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        jtxtBookID = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        jtxtTitle = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jtxtAuthor = new javax.swing.JTextField();
        jtxtYear = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 330, 290));

        jbtnRefresh.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnRefresh.setText("Refresh");
        jbtnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRefreshActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, -1));

        jbtnAddBook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnAddBook.setText("Add Book");
        jbtnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddBookActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, -1));

        jbtnDeleteBook.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jbtnDeleteBook.setText("Delete Book");
        jbtnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteBookActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDeleteBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 180, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 230, 270));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 8));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Book ID");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 30));

        jtxtBookID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(jtxtBookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 330, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Title");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 110, 30));

        jtxtTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtTitleActionPerformed(evt);
            }
        });
        jPanel4.add(jtxtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 330, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Author");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jtxtAuthor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(jtxtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 330, -1));

        jtxtYear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel4.add(jtxtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 330, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Year");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 110, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Title", "Author", "Year"
            }
        ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 470, 90));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 500, 270));

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LIBRARY BOOK INVENTORY");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddBookActionPerformed
        // TODO add your handling coimport javax.swing.JFrame;
        String bookID = jtxtBookID.getText(); 
        String title = jtxtTitle.getText(); 
        String author = jtxtAuthor.getText(); 
        String year = jtxtYear.getText(); 
        if(bookID.isEmpty() || title.isEmpty() || author.isEmpty() || year.isEmpty()){
        JOptionPane.showMessageDialog(this,
                "Please enter all fields", "Try again", JOptionPane.ERROR_MESSAGE);
                
        } else{ 
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.addRow (new Object [] {bookID, title, author, year});
                
                jtxtBookID.setText("");
                jtxtTitle.setText("");
                jtxtAuthor.setText("");
                jtxtYear.setText("");
        }
    }//GEN-LAST:event_jbtnAddBookActionPerformed

    private void jtxtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtTitleActionPerformed

    private void jbtnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRefreshActionPerformed

    private void jbtnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteBookActionPerformed
      DefaultTableModel model = (DefaultTableModel) Table.getModel();      
         if(Table.getSelectedRowCount()==1){         
         model.removeRow(Table.getSelectedRow());
         } 
    }//GEN-LAST:event_jbtnDeleteBookActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked

    }//GEN-LAST:event_TableMouseClicked


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
            java.util.logging.Logger.getLogger(LibraryBookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryBookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryBookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryBookInventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryBookInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtAuthor;
    private javax.swing.JTextField jtxtBookID;
    private javax.swing.JTextField jtxtTitle;
    private javax.swing.JTextField jtxtYear;
    // End of variables declaration//GEN-END:variables

    private static class PrepareStatement {

        public PrepareStatement() {
        }
    }
}