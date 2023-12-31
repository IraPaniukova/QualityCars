/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qualitycars;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.WindowConstants;

/**
 *
 * @author I
 */
public class FrameHOME extends javax.swing.JFrame {
//        static IndividualCar car = new IndividualCar(null,"123456",null,null,0,null,0,null,null,null);

        static IndividualCar car=new IndividualCar(null);
        static Stock stock = new Stock();

        
        
    /**
     * Creates new form HOMEframe
     */
    public FrameHOME() {
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

        StockManagementButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rentalManagementButton = new javax.swing.JButton();
        EmployeeAndCustomerButton3 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StockManagementButton.setBackground(new java.awt.Color(215, 218, 218));
        StockManagementButton.setForeground(new java.awt.Color(35, 51, 76));
        StockManagementButton.setText("STOCK MANAGEMENT ");
        StockManagementButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(35, 51, 76)));
        StockManagementButton.setPreferredSize(new java.awt.Dimension(230, 33));
        StockManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockManagementButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 78, 115));
        jLabel1.setText("WELCOME TO THE CAR MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 78, 115));

        rentalManagementButton.setBackground(new java.awt.Color(215, 218, 218));
        rentalManagementButton.setForeground(new java.awt.Color(35, 51, 76));
        rentalManagementButton.setText("RENTAL MANAGEMENT");
        rentalManagementButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(35, 51, 76)));
        rentalManagementButton.setMaximumSize(new java.awt.Dimension(230, 23));
        rentalManagementButton.setMinimumSize(new java.awt.Dimension(230, 23));
        rentalManagementButton.setPreferredSize(new java.awt.Dimension(230, 33));
        rentalManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentalManagementButtonActionPerformed(evt);
            }
        });

        EmployeeAndCustomerButton3.setBackground(new java.awt.Color(215, 218, 218));
        EmployeeAndCustomerButton3.setForeground(new java.awt.Color(35, 51, 76));
        EmployeeAndCustomerButton3.setText("EMPLOYEE AND CLIENT MANAGEMENT ");
        EmployeeAndCustomerButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(35, 51, 76)));
        EmployeeAndCustomerButton3.setPreferredSize(new java.awt.Dimension(230, 33));
        EmployeeAndCustomerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeAndCustomerButton3ActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(215, 218, 218));
        exitButton.setForeground(new java.awt.Color(35, 51, 76));
        exitButton.setText("Exit");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(35, 51, 76)));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logoQC.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(339, 282));
        jLabel3.setMinimumSize(new java.awt.Dimension(339, 282));
        jLabel3.setPreferredSize(new java.awt.Dimension(339, 282));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(StockManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rentalManagementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EmployeeAndCustomerButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(StockManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rentalManagementButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EmployeeAndCustomerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void StockManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockManagementButtonActionPerformed
        // TODO add your handling code here:
        FrameMANAGE_Stock stock = new FrameMANAGE_Stock();
        stock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_StockManagementButtonActionPerformed

    private void rentalManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentalManagementButtonActionPerformed
        // TODO add your handling code here:
        FrameMANAGE_Rent rent=new FrameMANAGE_Rent();
        rent.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_rentalManagementButtonActionPerformed

    private void EmployeeAndCustomerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeAndCustomerButton3ActionPerformed
        // TODO add your handling code here:
        FrameMANAGE_Emloyee_Client empl=new FrameMANAGE_Emloyee_Client();
        empl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmployeeAndCustomerButton3ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System. exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameHOME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()  {
            public void run() {
                new FrameHOME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EmployeeAndCustomerButton3;
    private javax.swing.JButton StockManagementButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton rentalManagementButton;
    // End of variables declaration//GEN-END:variables
}
