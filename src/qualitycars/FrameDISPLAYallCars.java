/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qualitycars;

import java.util.ArrayList;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author I
 */
public class FrameDISPLAYallCars extends javax.swing.JFrame {

    /**
     * Creates new form FrameDISPLAYcars
     */
    public FrameDISPLAYallCars() {
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

        displayCarsButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        modelTable = new javax.swing.JTable();
        homeButton = new javax.swing.JButton();
        stockManagementButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        displayCarsButton.setText("DISPLAY ALL CARS");
        displayCarsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayCarsButtonActionPerformed(evt);
            }
        });

        modelTable.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        modelTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REG No", "MODEL", "MANUFACTURER", "ENGINE SIZE", "No OF SEATS", "FUEL TYPE", "WOF EXPIRY DATE", "BODY TYPE", "YEAR", "COLOUR", "RENT PER DAY, $", "STATUS", "RENTED ON", "BACK DUE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(modelTable);

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        stockManagementButton.setText("Stock management");
        stockManagementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockManagementButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(432, 432, 432)
                .addComponent(displayCarsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(homeButton)
                                .addGap(446, 446, 446)
                                .addComponent(stockManagementButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                                .addComponent(exitButton))
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(displayCarsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stockManagementButton)
                    .addComponent(exitButton)
                    .addComponent(homeButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayCarsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayCarsButtonActionPerformed

        
        DefaultTableModel table = (DefaultTableModel) modelTable.getModel();
        Object rowColumns[]=new Object[14];
        table.setRowCount(0);  //it would not show the same rows again and again
        ArrayList<IndividualCar> car = FrameHOME.stock.getCars();
        for(int i=0;i<car.size();i++)
        {   
            rowColumns[1]=car.get(i).getCarModel().getModel();           
            rowColumns[2]=car.get(i).getCarModel().getManufacturer();     
            rowColumns[3]=car.get(i).getCarModel().getEngineSize();       
            rowColumns[4]=car.get(i).getCarModel().getSeats();              
            rowColumns[5]=car.get(i).getCarModel().getFuelType();         
                        
            rowColumns[0]= car.get(i).getRegNumber();
            rowColumns[6]= car.get(i).getExpDateWOF();
            rowColumns[7]= car.get(i).getBodyType();
            rowColumns[8]= car.get(i).getYear();
            rowColumns[9]= car.get(i).getColour();
            rowColumns[10]= car.get(i).getRentPerDay();
            rowColumns[11]= car.get(i).getStatus();
            rowColumns[12]= car.get(i).getRentDate();
            rowColumns[13]= car.get(i).getBackDueDate();
            
            table.addRow(rowColumns);
//            System.out.println(car.get(i).getCarModel().getModel()+ " -- "+FrameHOME.stock.getCars().get(i).getRegNumber());

        }
        
    }//GEN-LAST:event_displayCarsButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        FrameHOME home = new FrameHOME();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed

    private void stockManagementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockManagementButtonActionPerformed
        // TODO add your handling code here:
        FrameMANAGE_Stock stock = new FrameMANAGE_Stock();
        stock.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_stockManagementButtonActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDISPLAYallCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDISPLAYallCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDISPLAYallCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDISPLAYallCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDISPLAYallCars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayCarsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable modelTable;
    private javax.swing.JButton stockManagementButton;
    // End of variables declaration//GEN-END:variables
}
