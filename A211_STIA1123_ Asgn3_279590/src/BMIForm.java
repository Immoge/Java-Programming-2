
import javax.swing.JOptionPane;

public class BMIForm extends javax.swing.JFrame {
    private int ind;
    private Student stud;
    private StudentOperation operation;
    
    public BMIForm() {
        initComponents();
        ind = -1;
        operation = new StudentOperation();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftPanel = new javax.swing.JPanel();
        lblMatricNumber = new javax.swing.JLabel();
        tfMatricNumber = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblProgram = new javax.swing.JLabel();
        rbDegree = new javax.swing.JRadioButton();
        rbMaster = new javax.swing.JRadioButton();
        lblUnivrsity = new javax.swing.JLabel();
        cbUniversity = new javax.swing.JComboBox<>();
        lblWeight = new javax.swing.JLabel();
        tfWeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        tfHeight = new javax.swing.JTextField();
        lblBmi = new javax.swing.JLabel();
        tfBmi = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        btnCalculateBmi = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMatricNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblMatricNumber.setText("Matric Number");

        tfMatricNumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfMatricNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMatricNumberActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblName.setText("Name");

        tfName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        lblProgram.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblProgram.setText("Program");

        rbDegree.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbDegree.setText("Degree");
        rbDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDegreeActionPerformed(evt);
            }
        });

        rbMaster.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rbMaster.setText("Master");
        rbMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasterActionPerformed(evt);
            }
        });

        lblUnivrsity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUnivrsity.setText("University");

        cbUniversity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cbUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please select your university", "UUM", "USM", "UPM", "UM" }));

        lblWeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWeight.setText("Weight (in KG)");

        tfWeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfWeightActionPerformed(evt);
            }
        });

        lblHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblHeight.setText("Height (in meter)");

        tfHeight.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHeightActionPerformed(evt);
            }
        });

        lblBmi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblBmi.setText("BMI");

        tfBmi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBmiActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblStatus.setText("Status");

        tfStatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tfStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfStatusActionPerformed(evt);
            }
        });

        btnCalculateBmi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnCalculateBmi.setText("Calculate BMI");
        btnCalculateBmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBmiActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDisplay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDisplay.setText("Display All");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSearch.setText("Search by Matric No");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        taDisplay.setColumns(20);
        taDisplay.setRows(5);
        jScrollPane1.setViewportView(taDisplay);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMatricNumber)
                    .addComponent(lblName)
                    .addComponent(lblProgram)
                    .addComponent(lblUnivrsity)
                    .addComponent(lblWeight)
                    .addComponent(lblBmi)
                    .addComponent(lblHeight)
                    .addComponent(lblStatus)
                    .addComponent(btnCalculateBmi))
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfBmi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHeight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leftPanelLayout.createSequentialGroup()
                                .addComponent(rbDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbMaster, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMatricNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbUniversity, javax.swing.GroupLayout.Alignment.LEADING, 0, 301, Short.MAX_VALUE)
                            .addComponent(tfWeight, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfStatus))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnSave)
                        .addGap(27, 27, 27)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplay)
                        .addGap(46, 46, 46)
                        .addComponent(btnSearch)))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMatricNumber)
                            .addComponent(tfMatricNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProgram)
                            .addComponent(rbDegree)
                            .addComponent(rbMaster))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUnivrsity)
                            .addComponent(cbUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(tfWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeight)
                            .addComponent(tfHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBmi)
                            .addComponent(tfBmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculateBmi)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnDisplay)
                    .addComponent(btnSearch))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMatricNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMatricNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMatricNumberActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void rbDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbDegreeActionPerformed

    private void rbMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasterActionPerformed

    private void tfWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfWeightActionPerformed

    private void tfHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHeightActionPerformed

    private void tfBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBmiActionPerformed

    private void tfStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfStatusActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int matricNumber = Integer.parseInt(tfMatricNumber.getText());
        String name = tfName.getText();
        String program = null;
        if(rbDegree.isSelected())
            program = "Degree";
        if (rbMaster.isSelected())
            program = "Master";
        String university = (String) cbUniversity.getSelectedItem();
        double weight = Double.parseDouble(tfWeight.getText());
        double height = Double.parseDouble(tfHeight.getText());
        double bmi = Double.parseDouble(tfBmi.getText());
        String status = tfStatus.getText();
       
        taDisplay.setText(matricNumber + "\n" + name + "\n" + program + "\n" + university + "\n" + weight
                          + "\n" + height + "\n" + bmi+ "\n" + status); 
        stud = new Student (matricNumber, name, program, university, weight, height, bmi, status);
        ind++;
        System.out.println("Index at now = " + ind);
        operation.saveRecord(stud, ind); //Save record
        JOptionPane.showMessageDialog(this, "The record has been saved successfully in the array of objects");
        
        //Reset input field
        tfMatricNumber.setText("");
        tfName.setText("");
        rbDegree.setSelected(false);
        rbMaster.setSelected(false);
        cbUniversity.setSelectedIndex(0);
        tfWeight.setText("");
        tfHeight.setText("");
        tfBmi.setText("");
        tfStatus.setText("");
        taDisplay.setText("");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Reset all the input field
        tfMatricNumber.setText("");
        tfName.setText("");
        rbDegree.setSelected(false);
        rbMaster.setSelected(false);
        cbUniversity.setSelectedIndex(0);
        tfWeight.setText("");
        tfHeight.setText("");
        tfBmi.setText("");
        tfStatus.setText("");
        taDisplay.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        String output = operation.readAllRecord();     
        taDisplay.setText(output); //Display record in display area
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int searchedMatricNumber =  Integer.parseInt(tfMatricNumber.getText());
        String found = operation.searchRecord(searchedMatricNumber);
       
        if (found == null)
            JOptionPane.showMessageDialog(this, "This record is not found");
        else
            JOptionPane.showMessageDialog(this, "The reocrd of this matric number: " + searchedMatricNumber + " have beeen found.");
           taDisplay.setText(found);
     
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnCalculateBmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBmiActionPerformed
        double weight = 0.0, height = 0.0;
        boolean status;
           
            try{
            if(tfWeight.getText().length() == 0){//Check the weight input is empty or not 
                JOptionPane.showMessageDialog(null, "Please enter weight");
                status = false;
            }
            else{
                 weight = Double.parseDouble(tfWeight.getText());
                 status = true;
            }
            } catch (NumberFormatException e){ //catch the excaption
                JOptionPane.showMessageDialog(null, "Invalid weight data inserted", "ERROR",JOptionPane.ERROR_MESSAGE);
                status = false;
            }

            try{
            if(tfHeight.getText().length() == 0){//Check the height input is empty or not 
                JOptionPane.showMessageDialog(null, "Please enter height");
                status = false;
            }
            else{
                 weight = Double.parseDouble(tfHeight.getText());
                 status = true;
            }
            } catch (NumberFormatException e){//catch the excaption
                JOptionPane.showMessageDialog(null, "Invalid height data inserted", "ERROR",JOptionPane.ERROR_MESSAGE);
                status = false;
            }
            
        if (status == true){
            weight = Double.parseDouble(tfWeight.getText());
            height = Double.parseDouble(tfHeight.getText());           
            double bmi = operation.calculateBMI(weight, height); // calculate BMI
            String bmiStatus = operation.getStatusBMI(bmi);   //get BMI status  
            System.out.println(bmi);
            System.out.println(bmiStatus);
            
            tfBmi.setText(bmi + ""); //set text at tfBmi
            tfStatus.setText(bmiStatus); //set text at tfStatus
        } 
    }//GEN-LAST:event_btnCalculateBmiActionPerformed

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
            java.util.logging.Logger.getLogger(BMIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMIForm().setVisible(true);
            }
        });
    }//main method

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateBmi;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbUniversity;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBmi;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblMatricNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUnivrsity;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JRadioButton rbDegree;
    private javax.swing.JRadioButton rbMaster;
    private javax.swing.JTextArea taDisplay;
    private javax.swing.JTextField tfBmi;
    private javax.swing.JTextField tfHeight;
    private javax.swing.JTextField tfMatricNumber;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfWeight;
    // End of variables declaration//GEN-END:variables
}
