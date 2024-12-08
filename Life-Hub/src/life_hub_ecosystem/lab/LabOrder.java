/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;

/**
 *
 * @author hemin
 */
public class LabOrder {

    String id;
    ArrayList<LabTest> labTestsList;
    PatientProfile pp;
    DoctorProfile dp;
    Boolean isActive;

    public LabOrder(String id, ArrayList<LabTest> labTestsList, PatientProfile pp, DoctorProfile dp) {
        this.id = id;
        this.labTestsList = labTestsList;
        this.pp = pp;
        this.dp = dp;
    }

    public String getId() {
        return id;
    }

    public void removeTest(LabTest lt) {
        this.labTestsList.remove(lt);
    }

    public ArrayList<LabTest> getLabTestsList() {
        return labTestsList;
    }

    public PatientProfile getPp() {
        return pp;
    }

    public DoctorProfile getDp() {
        return dp;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }
}
