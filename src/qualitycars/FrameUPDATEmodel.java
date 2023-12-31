/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qualitycars;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import qualitycars.CarModel;
import qualitycars.FrameADDcar;
import qualitycars.FrameHOME;
import qualitycars.IndividualCar;

/**
 *
 * @author I
 */
public class FrameUPDATEmodel extends javax.swing.JFrame {
 
    /**
     * Creates new form FrameADDmodel
     */
    public FrameUPDATEmodel() {
        initComponents();
        fuelComboBox.setModel(new DefaultComboBoxModel<>(EnumFuelType.values()));
       
        
    }
    // to get model data from the FrameUPDATEcar here:
    public void my_update(String model,String manufacrr,int engnSize,int seats,String fuel ) 
        {modelTextField.setText(model);
         manufactureTextField.setText(manufacrr);
         engineSizeTextField.setText(engnSize+"");
         seatsTextField.setText(seats+"");
         if (fuel.equals("DIESEL"))  
         {fuelComboBox.setSelectedItem(EnumFuelType.DIESEL);}
         else if (fuel.equals("HYBRID")) 
         {fuelComboBox.setSelectedItem(EnumFuelType.HYBRID);}
        
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        manufactureTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        engineSizeTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seatsTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        fuelComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 78, 115));
        jLabel1.setText("WELCOME TO THE CAR MANAGEMENT SYSTEM");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Close window");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 78, 115));
        jLabel3.setText("UPDATE MODEL:");

        jLabel4.setText(" MODEL NAME");

        modelTextField.setEditable(false);
        modelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTextFieldActionPerformed(evt);
            }
        });

        manufactureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufactureTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("MANUFACTURER");

        engineSizeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engineSizeTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("ENGINE SIZE");

        seatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatsTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("NUMBER OF SEATS");

        jLabel8.setText("FUEL TYPE");

        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("(number only)");

        jLabel9.setText("cc");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(modelTextField)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 130, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(156, 156, 156))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(engineSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateButton)
                                    .addComponent(fuelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(seatsTextField)
                            .addComponent(manufactureTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeButton)
                        .addGap(73, 73, 73)
                        .addComponent(CloseButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(manufactureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(engineSizeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(seatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fuelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(updateButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(homeButton)
                    .addComponent(CloseButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System. exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        FrameUPDATEcar uc=new FrameUPDATEcar();
        uc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void modelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelTextFieldActionPerformed

    private void manufactureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufactureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufactureTextFieldActionPerformed

    private void engineSizeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engineSizeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_engineSizeTextFieldActionPerformed

    private void seatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatsTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        String model = modelTextField.getText();
        CarModel found = FrameHOME.car.searchModel(model);
        try{
            modelTextField.setBackground(Color.white);
            String manufacturer=manufactureTextField.getText();
            int engineSize= Integer.parseInt(engineSizeTextField.getText() );
            int seats= Integer.parseInt(seatsTextField.getText() );
            EnumFuelType fuel = (EnumFuelType)(fuelComboBox.getModel().getSelectedItem());

            CarModel carModel = new CarModel(model,manufacturer,engineSize,seats,fuel);
            FrameHOME.stock.replaceCarModel(model, carModel);  //update model in the CarModel ArrayList

            if (FrameHOME.stock.getRentedCars().isEmpty()==false)//update model in the RentedCar ArrayList
            {   for (int i = 0;i<FrameHOME.stock.getRentedCars().size();i++)
                { if (FrameHOME.stock.getRentedCars().get(i).getCar().getCarModel()==found)
                    {FrameHOME.stock.getRentedCars().get(i).getCar().setCarModel(carModel);}}
            }

            found.setManufacturer(manufacturer);//update model in the IndividualCar ArrayList
            found.setEngineSize(engineSize);
            found.setSeats(seats);
            found.setFuelType(fuel);

            JOptionPane.showMessageDialog(rootPane, "The model "+model+ " was updated.");
            modelTextField.setText("");
            manufactureTextField.setText("");
            engineSizeTextField.setText("");
            seatsTextField.setText("");

            FrameUPDATEcar u = new FrameUPDATEcar();
            u.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception ex){
                    JOptionPane.showMessageDialog(rootPane,  "     Engine size and Number of seats fields can contain only positive digits."
                                + "                             \n Our cars do not have more than 15 seats. Engine size is smaller than 14000cc.");
                }
         
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // TODO add your handling code here:
        FrameHOME home = new FrameHOME();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameUPDATEmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUPDATEmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUPDATEmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUPDATEmodel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUPDATEmodel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CloseButton;
    private javax.swing.JTextField engineSizeTextField;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox<qualitycars.EnumFuelType> fuelComboBox;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField manufactureTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField seatsTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
