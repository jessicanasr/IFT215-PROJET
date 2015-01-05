

package ift215.jn;

import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

  
    public GUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        cbxCountry.equals("Lebanon");
        rbCash.setSelected(false);
        rbCard.setSelected(false);
        rootPane.setDefaultButton(btnSubmit);
        this.setTitle("Shipping Information");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlShippingInformation = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAAddress = new javax.swing.JTextArea();
        cbxCountry = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        lblExpirationDate = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblSecurityCode = new javax.swing.JLabel();
        rbCard = new javax.swing.JRadioButton();
        txtCard = new javax.swing.JTextField();
        txtExpirationDate1 = new javax.swing.JTextField();
        txtExpirationdate2 = new javax.swing.JTextField();
        txtSecurityCode = new javax.swing.JTextField();
        rbCash = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAShippingInformation = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlShippingInformation.setBorder(javax.swing.BorderFactory.createTitledBorder("Buyer Information"));

        lblName.setText("Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblCountry.setText("Country:");

        lblAddress.setText("Address:");

        txtAAddress.setColumns(20);
        txtAAddress.setRows(5);
        jScrollPane1.setViewportView(txtAAddress);

        cbxCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lebanon", "USA", "France" }));
        cbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCountryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlShippingInformationLayout = new javax.swing.GroupLayout(pnlShippingInformation);
        pnlShippingInformation.setLayout(pnlShippingInformationLayout);
        pnlShippingInformationLayout.setHorizontalGroup(
            pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShippingInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlShippingInformationLayout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(51, 51, 51))
                    .addGroup(pnlShippingInformationLayout.createSequentialGroup()
                        .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)))
                .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlShippingInformationLayout.setVerticalGroup(
            pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlShippingInformationLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCountry)
                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlShippingInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Payment Method"));

        lblExpirationDate.setText("Expiration date ");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblSecurityCode.setText("Security code ");

        buttonGroup2.add(rbCard);
        rbCard.setText("Card");
        rbCard.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbCardStateChanged(evt);
            }
        });

        txtCard.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCard.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtSecurityCode.setText(" ");

        buttonGroup2.add(rbCash);
        rbCash.setText("Cash");
        rbCash.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbCashStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnSubmit)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbCash)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblExpirationDate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExpirationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtExpirationdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(lblSecurityCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbCard)
                        .addGap(32, 32, 32)
                        .addComponent(txtCard)))
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbCash)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbCard)
                    .addComponent(txtCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpirationDate)
                    .addComponent(lblSecurityCode)
                    .addComponent(txtExpirationDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExpirationdate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Shipping Information"));

        txtAShippingInformation.setEditable(false);
        txtAShippingInformation.setColumns(20);
        txtAShippingInformation.setRows(5);
        jScrollPane2.setViewportView(txtAShippingInformation);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlShippingInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlShippingInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
                if(txtName.getText().trim().equals("")){
                    JOptionPane.showMessageDialog(this, "Please enter  name","Waring",JOptionPane.INFORMATION_MESSAGE);
                }  else{          
            int country =
                    Integer.parseInt(
                            cbxCountry.getSelectedItem().toString());        if(cbxCountry.equals ("Lebanon")){
                                
                    rbCash.setSelected(true);
                    rbCard.setSelected(false);
        }
 
            
        else if(cbxCountry.equals("USA")){
                    rbCard.setSelected(true);
                    rbCash.setSelected(false);
        }
        else{
            cbxCountry.equals("France");
            rbCash.setSelected(true);
            rbCard.setSelected(true);
        }
            
            boolean cash;
            
            boolean card;
            card = rbCard.isSelected();
                        
            String name = txtName.getText();
            
            String address = txtAAddress.getText();
            
            ShippingInformation si = 
                    new ShippingInformation( country,  name,  address);
            
            txtAShippingInformation.setText(si.getShippingInformation());
            
                }
    }
    private void changeCountryValues(String name){
        
        cbxCountry.removeAllItems();
        switch(name){
            case"Cash":
                cbxCountry.addItem("Lebanon");
                break;
            case "Card":
                cbxCountry.addItem("USA");
                cbxCountry.addItem("France");
                break;
            default:
                cbxCountry.addItem("France");
        
        }
    
    
        
    }//GEN-LAST:event_btnSubmitActionPerformed
    private void rbCardStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbCardStateChanged
        // TODO add your handling code here:
        if (cbxCountry.equals("USA")){
            rbCash.setSelected(true);
            txtCard.setText(" ");
            }
    }//GEN-LAST:event_rbCardStateChanged
    
 
    private void rbCashStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbCashStateChanged
        // TODO add your handling code here:
        if (cbxCountry.equals("Lebanon")){
            rbCash.setSelected(true);
        }
    }//GEN-LAST:event_rbCashStateChanged

    private void cbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCountryActionPerformed
        // TODO add your handling code here:
        if(cbxCountry.equals("Lebanon")){
            rbCash.setSelected(true);
        }
        else{
            if(cbxCountry.equals("USA")){
                rbCard.setSelected(true); 
            }
            
            else{cbxCountry.equals("France");
            
            }   
        }
        
        
        
    }//GEN-LAST:event_cbxCountryActionPerformed
    
        

                     
                  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbxCountry;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblExpirationDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSecurityCode;
    private javax.swing.JPanel pnlShippingInformation;
    private javax.swing.JRadioButton rbCard;
    private javax.swing.JRadioButton rbCash;
    private javax.swing.JTextArea txtAAddress;
    private javax.swing.JTextArea txtAShippingInformation;
    private javax.swing.JTextField txtCard;
    private javax.swing.JTextField txtExpirationDate1;
    private javax.swing.JTextField txtExpirationdate2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSecurityCode;
    // End of variables declaration//GEN-END:variables

    //private void changeCountryValues(String lebanon) {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

