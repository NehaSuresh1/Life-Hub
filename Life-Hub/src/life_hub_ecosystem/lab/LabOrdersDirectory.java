/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class LabOrdersDirectory {

    ArrayList<LabOrder> ordersList;

    public LabOrdersDirectory() {

        ordersList = new ArrayList();

    }

    public ArrayList<LabOrder> getOrdersList() {
        return ordersList;
    }

    public LabOrder newOrder(ArrayList<LabTest> labTestsList, PatientProfile pp, DoctorProfile dp) {
        LabOrder apt = new LabOrder(UUID.randomUUID().toString(), labTestsList, pp, dp);
        ordersList.add(apt);
        return apt;
    }

    public LabOrder findOrder(String id) {

        for (LabOrder dept : ordersList) {

            if (dept.isMatch(id)) {
                return dept;
            }
        }
        return null; //not found after going through the whole list
    }
}
