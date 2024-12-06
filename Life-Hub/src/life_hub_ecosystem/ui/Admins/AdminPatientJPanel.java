/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package life_hub_ecosystem.ui.Admins;

import life_hub_ecosystem.hospital.profiles.PatientProfile;
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
 * @author Tarun
 */
public class AdminPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminPatientJPanel
     */
   private UserAccountDirectory userAccountDirectory;
    private JPanel cardSequencePanel;
   

    public AdminPatientJPanel(UserAccountDirectory userAccountDirectory, JPanel cardPanel) {
        initComponents();
        this.userAccountDirectory = userAccountDirectory;
        this.cardSequencePanel = cardPanel;

        // Create the table model
        DefaultTableModel tableModel = new DefaultTableModel(
                new Object[][]{}, // initial data
                new String[]{"Patient ID", "Patient Name", "Dietary Choice", "Street", "City", "State", "Zipcode", "Enabled"} // column headers
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 7 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 7; // Allow editing only for the "Enabled" column
            }
        };

        // Populate the table with data from the UserAccountDirectory for patients
        for (UserAccount userAccount : userAccountDirectory.getUserAccountList()) {
            if (userAccount.getAssociatedPersonProfile() instanceof PatientProfile) {
                PatientProfile patientProfile = (PatientProfile) userAccount.getAssociatedPersonProfile();
                tableModel.addRow(new Object[]{
                    patientProfile.getPerson().getPersonId(),
                    patientProfile.getPerson().getName(),
                    patientProfile.getDietaryChoice(),
                    patientProfile.getStreet(),
                    patientProfile.getCity(),
                    patientProfile.getState(),
                    patientProfile.getZipcode(),
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

    private void saveChanges() {
        int rowCount = table.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String patientId = (String) table.getValueAt(i, 0);
            boolean isEnabled = (Boolean) table.getValueAt(i, 7);

            // Iterate through the array to find the matching UserAccount by patientId
            UserAccount matchingUserAccount = null;
            for (UserAccount userAccount : userAccountDirectory.getUserAccountList()) {
                if (userAccount.getAssociatedPersonProfile() instanceof PatientProfile) {
                    PatientProfile patientProfile = (PatientProfile) userAccount.getAssociatedPersonProfile();
                    if (patientProfile.getPerson().getPersonId().equals(patientId)) {
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

        jLabel1.setText("Patient Admin Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(saveButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(btnBack))
                .addGap(36, 36, 36))
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
