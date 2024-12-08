/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author ojas
 */
public class AppointmentDirectory {

    ArrayList<Appointment> appointmentsList;

    public AppointmentDirectory() {

        appointmentsList = new ArrayList();

    }

    public ArrayList<Appointment> getAppointmentsList() {
        return appointmentsList;
    }

    public Appointment newApt(DoctorProfile dp, PatientProfile pp) {
        Appointment apt = new Appointment(UUID.randomUUID().toString(), dp, pp);
        appointmentsList.add(apt);
        return apt;
    }

    public Appointment findApt(String id) {

        for (Appointment dept : appointmentsList) {

            if (dept.isMatch(id)) {
                return dept;
            }
        }
        return null; //not found after going through the whole list
    }
}
