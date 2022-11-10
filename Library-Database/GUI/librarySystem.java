
package frontend;


public class librarySystem extends javax.swing.JFrame 
{

    
 
    public librarySystem()
    {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        librarianRoleButton = new javax.swing.JButton();
        adminRoleButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Library System");

        librarianRoleButton.setBackground(new java.awt.Color(0, 0, 0));
        librarianRoleButton.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        librarianRoleButton.setForeground(new java.awt.Color(255, 255, 255));
        librarianRoleButton.setText("Librarian Role");
        librarianRoleButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        librarianRoleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        librarianRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librarianRoleButtonActionPerformed(evt);
            }
        });

        adminRoleButton.setBackground(new java.awt.Color(0, 0, 0));
        adminRoleButton.setFont(new java.awt.Font("Javanese Text", 1, 36)); // NOI18N
        adminRoleButton.setForeground(new java.awt.Color(255, 255, 255));
        adminRoleButton.setText("Admin Role");
        adminRoleButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        adminRoleButton.setBorderPainted(false);
        adminRoleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminRoleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRoleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(librarianRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(adminRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(librarianRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(adminRoleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(205, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void librarianRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librarianRoleButtonActionPerformed
        
        this.setVisible(false);
        LibrarianLogin login = new LibrarianLogin();
        login.setVisible(true);
        
    }//GEN-LAST:event_librarianRoleButtonActionPerformed

    private void adminRoleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRoleButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminLogin login = new AdminLogin();
        login.setVisible(true);
       
    }//GEN-LAST:event_adminRoleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(librarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(librarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(librarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(librarySystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new librarySystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminRoleButton;
    private javax.swing.JButton librarianRoleButton;
    // End of variables declaration//GEN-END:variables
}
