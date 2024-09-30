/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AccountManager;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;
import model.AccountDirectory;

/**
 *
 * @author lingduan
 */
public class ViewAccountJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private AccountDirectory accountDirectory;
    private Account account;
    
    /**
     * Creates new form ViewAccountJPanel
     */
    public ViewAccountJPanel(JPanel userProcessContainer, AccountDirectory accountDirectory, Account account ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        
        refreshTextFields();
        setViewMode();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblRoutingNumber = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        lblAccountNumber = new javax.swing.JLabel();
        txtAccountNumber = new javax.swing.JTextField();
        lblBankName = new javax.swing.JLabel();
        txtBankName = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        btnBack.setText("<<< Back");

        lblTitle.setText("View Account");

        lblRoutingNumber.setText("Routing Number");

        lblAccountNumber.setText("Account Number");

        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });

        lblBankName.setText("Bank Name:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 2778, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btnSave)
                .addGap(44, 44, 44)
                .addComponent(btnUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addGap(0, 271, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        setEditMode();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
          String routingNumber = txtRoutingNumber.getText();
        String accountNumber = txtAccountNumber.getText();
        String bankName = txtBankName.getText();
        
        if (routingNumber.isBlank() || bankName.isBlank() || accountNumber.isBlank()){
             JOptionPane.showMessageDialog(this, "All fields are mandatory", "Error", JOptionPane.ERROR_MESSAGE);
             // pause until the user closes the dialog.
             return; 
        }
        
        account.setRoutingNumber(routingNumber);
        account.setAccountNumber(accountNumber);
        account.setBankName(bankName);
        
        JOptionPane.showMessageDialog(null, "Account successfully updated", "warning", JOptionPane.WARNING_MESSAGE);
        
        setViewMode();
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAccountNumber;
    private javax.swing.JLabel lblBankName;
    private javax.swing.JLabel lblRoutingNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables

    private void refreshTextFields() {
   

    txtRoutingNumber.setText(account.getRoutingNumber());
    txtAccountNumber.setText(account.getAccountNumber());
    txtBankName.setText(account.getBankName());
    }

    private void setViewMode() {
    txtRoutingNumber.setEnabled(false);
    txtAccountNumber.setEnabled(false);
    txtBankName.setEnabled(false);
    
    btnSave.setEnabled(false);
    btnUpdate.setEnabled(false);
        
    }

    private void setEditMode() {
    txtRoutingNumber.setEnabled(true);
    txtAccountNumber.setEnabled(true);
    txtBankName.setEnabled(true);
    
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(true);
    }
}
    

    






