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
 * @author neha
 */
public class NurseDirectory {

    ArrayList<NurseProfile> nurseList;

    public NurseDirectory() {

        nurseList = new ArrayList();

    }

    public NurseProfile newNurse(Person p, Department dept, String exp, Hospital hosp) {
        NurseProfile doc = new NurseProfile(p, dept, exp, hosp);
        nurseList.add(doc);
        return doc;

    }

    public NurseProfile findNurse(String id) {

        for (NurseProfile nurse : nurseList) {

            if (nurse.isMatch(id)) {
                return nurse;
            }
        }
        return null; //not found after going through the whole list
    }

}
