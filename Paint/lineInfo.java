package com.mycompany.paint;
import java.awt.*;
public class lineInfo extends javax.swing.JFrame {

    /**
     * Creates new form lineInfo
     */
    public lineInfo() 
    {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        startingLabel = new javax.swing.JLabel();
        xStartingLabel = new javax.swing.JLabel();
        endingLabel = new javax.swing.JLabel();
        xEndingLabel = new javax.swing.JLabel();
        yStartingLabel = new javax.swing.JLabel();
        yEndingLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xStartingTextField = new javax.swing.JTextField();
        yStartingTextField = new javax.swing.JTextField();
        xEndingTextField = new javax.swing.JTextField();
        yEndingTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        fillColorButton = new javax.swing.JButton();
        borderColorButton = new javax.swing.JButton();
        createLineButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Line Details");

        startingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        startingLabel.setText("Starting Point");

        xStartingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        xStartingLabel.setText("x:");

        endingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        endingLabel.setText("Ending Point");

        xEndingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        xEndingLabel.setText("x:");

        yStartingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yStartingLabel.setText("y:");

        yEndingLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yEndingLabel.setText("y:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Coordinates:");

        xStartingTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xStartingTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Colors:");

        fillColorButton.setText("Fill Color");
        fillColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fillColorButtonActionPerformed(evt);
            }
        });

        borderColorButton.setText("Border Color");
        borderColorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borderColorButtonActionPerformed(evt);
            }
        });

        createLineButton.setText("Create Line");
        createLineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLineButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fillColorButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                        .addGap(77, 77, 77)
                                        .addComponent(borderColorButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(startingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                            .addComponent(endingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(xStartingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                            .addComponent(xEndingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(xStartingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(xEndingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(yStartingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(yEndingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yStartingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yEndingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createLineButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startingLabel)
                    .addComponent(xStartingLabel)
                    .addComponent(yStartingLabel)
                    .addComponent(xStartingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yStartingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endingLabel)
                    .addComponent(xEndingLabel)
                    .addComponent(yEndingLabel)
                    .addComponent(xEndingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yEndingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fillColorButton)
                    .addComponent(borderColorButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(createLineButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xStartingTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xStartingTextFieldActionPerformed
      
    }//GEN-LAST:event_xStartingTextFieldActionPerformed

    private void fillColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fillColorButtonActionPerformed
        // TODO add your handling code here:
        Color col = Color.BLUE;
        Color fillColor = jColorChooser1.showDialog(null, "Select a filling color", col);
        
    }//GEN-LAST:event_fillColorButtonActionPerformed

    private void borderColorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borderColorButtonActionPerformed
        Color col = Color.BLUE;
        Color borderColor = jColorChooser1.showDialog(null, "Select a border color", col);
    }//GEN-LAST:event_borderColorButtonActionPerformed

    private void createLineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLineButtonActionPerformed
        // TODO add your handling code here:
        int startingX = Integer.parseInt(xStartingTextField.getText());
        int endingX = Integer.parseInt(xEndingTextField.getText());
        int startingY = Integer.parseInt(yStartingTextField.getText());
        int endingY = Integer.parseInt(yEndingTextField.getText());
        
    }//GEN-LAST:event_createLineButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(lineInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lineInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lineInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lineInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() 
            {
                new lineInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borderColorButton;
    private javax.swing.JButton createLineButton;
    private javax.swing.JLabel endingLabel;
    private javax.swing.JButton fillColorButton;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel startingLabel;
    private javax.swing.JLabel xEndingLabel;
    private javax.swing.JTextField xEndingTextField;
    private javax.swing.JLabel xStartingLabel;
    private javax.swing.JTextField xStartingTextField;
    private javax.swing.JLabel yEndingLabel;
    private javax.swing.JTextField yEndingTextField;
    private javax.swing.JLabel yStartingLabel;
    private javax.swing.JTextField yStartingTextField;
    // End of variables declaration//GEN-END:variables
}
