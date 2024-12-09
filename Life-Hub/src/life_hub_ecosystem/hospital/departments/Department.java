/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.departments;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.NurseProfile;
import java.util.ArrayList;

/**
 *
 * @author hemin
 */
public class Department {

    private String deptID;
    private String deptName;
    private ArrayList<DoctorProfile> docList;
    private ArrayList<NurseProfile> nurseList;

    public Department(String deptID, String deptName) {
        this.deptID = deptID;
        this.deptName = deptName;
        this.docList = new ArrayList<>();
        this.nurseList = new ArrayList<>();
    }

    public String getDeptID() {
        return deptID;
    }
    
     public String getDeptName() {
        return deptName;
    }

    public boolean isMatch(String id) {
        if (getDeptID().equals(id)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return deptName;
    }
}
