/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.pharmacy;

import life_hub_ecosystem.hospital.Appointment;
import life_hub_ecosystem.hospital.MedPlan;
import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class PharmaOrderDirectory {

    ArrayList<PharmaOrder> ordersList;

    public PharmaOrderDirectory() {
        ordersList = new ArrayList();
    }

    public PharmaOrder newOrder(MedPlan medPlan, PatientProfile pp, DoctorProfile dp, Appointment apt) {
        PharmaOrder po = new PharmaOrder(UUID.randomUUID().toString(), medPlan, pp, dp, apt);
        ordersList.add(po);
        return po;
    }

    public ArrayList<PharmaOrder> getOrdersList() {
        return ordersList;
    }

    public PharmaOrder findOrder(String id) {

        for (PharmaOrder dept : ordersList) {

            if (dept.isMatch(id)) {
                return dept;
            }
        }
        return null; //not found after going through the whole list
    }
}
