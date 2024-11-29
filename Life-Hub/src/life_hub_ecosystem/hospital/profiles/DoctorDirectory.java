/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.profiles;

import life_hub_ecosystem.Hospital;
import life_hub_ecosystem.hospital.departments.Department;
import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author marri
 */
public class DoctorDirectory {

    ArrayList<DoctorProfile> doctorList;


    public DoctorDirectory() {

        doctorList = new ArrayList();

    }

    public ArrayList<DoctorProfile> getDoctorList() {
        return doctorList;
    }
    public DoctorProfile newDoctor(Person p, Department dept, String exp, String highestQulification,Hospital hosp) {
        DoctorProfile doc = new DoctorProfile(p, dept, exp, highestQulification,hosp);
        doctorList.add(doc);
        return doc;

    }

    public DoctorProfile findDoctor(String id) {

        for (DoctorProfile doc : doctorList) {

            if (doc.isMatch(id)) {
                return doc;
            }
        }
        return null; //not found after going through the whole list
    }
    
        public String[] getDocNames() {
        //for()
        String[] names = new String[doctorList.size()];
        int count = 0;
        for (DoctorProfile doc : doctorList) {
            names[count] = doc.getPerson().getName();
            count++;
        }
        return names;
    }


}
