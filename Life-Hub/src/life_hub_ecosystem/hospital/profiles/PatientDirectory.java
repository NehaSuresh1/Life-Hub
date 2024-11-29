/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.profiles;

import life_hub_ecosystem.Hospital;
import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author marri
 */
public class PatientDirectory {

    ArrayList<PatientProfile> patientList;

    public PatientDirectory() {

        patientList = new ArrayList();

    }

    public PatientProfile newPatient(String dietaryChoice, String Street, String city, String state, String zipcode, Person p, Hospital hosp) {
        PatientProfile pp = new PatientProfile(dietaryChoice, Street, city, state, zipcode, p, hosp);
        patientList.add(pp);
        return pp;

    }

    public PatientProfile findDoctor(String id) {

        for (PatientProfile pp : patientList) {

            if (pp.isMatch(id)) {
                return pp;
            }
        }
        return null; //not found after going through the whole list
    }

}
