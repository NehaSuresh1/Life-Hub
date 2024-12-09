/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package life_hub_ecosystem.ui.Admins;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.persona.UserAccount;
import life_hub_ecosystem.persona.UserAccountDirectory;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *

 * @author ojas

 */
// ... (previous imports remain unchanged)

/**
 * AdminDoctorJPanel class for managing doctor accounts.
 * Assumes UserAccount class has getPersonId() method and associated with DoctorProfile.
 */
public class AdminDoctorJPanel extends javax.swing.JPanel {

    private UserAccountDirectory userAccountDirectory;
    private JPanel cardSequencePanel;
    private void saveChanges() {
        int rowCount = table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String doctorId = (String) table.getValueAt(i, 0);
            boolean isEnabled = (Boolean) table.getValueAt(i, 5);

            // Iterate through the array to find the matching UserAccount by doctorId
            UserAccount matchingUserAccount = null;
            for (UserAccount userAccount : userAccountDirectory.getUserAccountList()) {
                if (userAccount.getAssociatedPersonProfile() instanceof DoctorProfile) {
                    DoctorProfile doctorProfile = (DoctorProfile) userAccount.getAssociatedPersonProfile();
                    if (doctorProfile.getPerson().getPersonId().equals(doctorId)) {
                        matchingUserAccount = userAccount;
                        break; // Exit the loop once a match is found
                    }
                }
            }

            if (matchingUserAccount != null) {
                System.out.println("Before Update - UserAccount: " + matchingUserAccount.getUserLoginName() + " - Enabled: " + matchingUserAccount.getIsEnabled());
                matchingUserAccount.setIsEnabled(isEnabled);
                System.out.println("After Update - UserAccount: " + matchingUserAccount.getUserLoginName() + " - Enabled: " + matchingUserAccount.getIsEnabled());
            }
        }

        // Save changes to the directory or a file
        System.out.println("Updated User Account List:");
        for (UserAccount userAccount : userAccountDirectory.getUserAccountList()) {
            System.out.println(userAccount.getUserLoginName() + " - Enabled: " + userAccount.getIsEnabled());
        }

        JOptionPane.showMessageDialog(this, "Changes saved successfully");
    }
    

    public AdminDoctorJPanel(UserAccountDirectory userAccountDirectory, JPanel cardPanel) {
         initComponents();
       
        this.userAccountDirectory = userAccountDirectory;
        this.cardSequencePanel = cardPanel;

        // Create the table model
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][]{}, // initial data
                new String[]{"Doctor ID", "Doctor Name", "Department", "Experience", "Highest Qualification", "Enabled"} // column headers
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 5 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 5; // Allow editing only for the "Enabled" column
            }
        };

        // Populate the table with data from the UserAccountDirectory for doctors
        for (UserAccount userAccount : userAccountDirectory.getUserAccountList()) {
            if (userAccount.getAssociatedPersonProfile() instanceof DoctorProfile) {
                DoctorProfile doctorProfile = (DoctorProfile) userAccount.getAssociatedPersonProfile();
                tableModel.addRow(new Object[]{
                    doctorProfile.getPerson().getPersonId(),
                    doctorProfile.getPerson().getName(),
                    doctorProfile.getDept().getDeptName(),
                    doctorProfile.getExperience(),
                    doctorProfile.getHighestQulification(),
                    userAccount.getIsEnabled()
                });
            }
        }

        // Initialize the table
        table = new JTable(tableModel);

        setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Add buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        buttonPanel.add(btnBack);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // ... (rest of the class remains unchanged)

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel1.setText("Doctor Admin Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jLabel1)
                    .addContainerGap(174, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(btnBack))
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        saveChanges();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         cardSequencePanel.remove(this);
        ((java.awt.CardLayout) cardSequencePanel.getLayout()).next(cardSequencePanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveButton;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
