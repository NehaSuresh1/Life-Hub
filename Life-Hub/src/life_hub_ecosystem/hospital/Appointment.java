/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import life_hub_ecosystem.lab.LabTest;

import java.util.ArrayList;

/**
 *
 * @author ojas
 */
public class Appointment {

    String id;
    DoctorProfile dp;
    PatientProfile pp;
    MedPlan medPlan;
    ArrayList<LabTest> tests;
    boolean hasCompleted;

    public Appointment(String id, DoctorProfile dp, PatientProfile pp) {
        this.id = id;
        this.pp = pp;
        this.dp = dp;
        //this.medPlan = new MedPlan(id);
        this.tests = new ArrayList<>();
        hasCompleted = false;
    }

    public boolean isHasCompleted() {
        return hasCompleted;
    }

    public void setHasCompleted(boolean hasCompleted) {
        this.hasCompleted = hasCompleted;
    }

    public ArrayList<LabTest> getTests() {
        return tests;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DoctorProfile getDp() {
        return dp;
    }

    public void setDp(DoctorProfile dp) {
        this.dp = dp;
    }

    public PatientProfile getPp() {
        return pp;
    }

    public void setPp(PatientProfile pp) {
        this.pp = pp;
    }

    public MedPlan getMedPlan() {
        return medPlan;
    }

    public void setMedPlan(MedPlan medPlan) {
        this.medPlan = medPlan;
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getId();
    }

}
