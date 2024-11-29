/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.pharmacy;

import life_hub_ecosystem.hospital.Appointment;
import life_hub_ecosystem.hospital.MedPlan;
import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;

/**
 *
 * @author marri
 */
public class PharmaOrder {

    String id;
    MedPlan medsList;
    PatientProfile pp;
    DoctorProfile dp;
    Appointment apt;
    boolean isActive;
    String cost;

    public PharmaOrder(String id, MedPlan medsList, PatientProfile pp, DoctorProfile dp, Appointment apt) {
        this.id = id;
        this.medsList = medsList;
        this.pp = pp;
        this.dp = dp;
        this.isActive = false;
        this.apt = apt;
    }

    public MedPlan getMedsList() {
        return medsList;
    }

    public void setMedsList(MedPlan medsList) {
        this.medsList = medsList;
    }

    public Appointment getApt() {
        return apt;
    }

    public void setApt(Appointment apt) {
        this.apt = apt;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public MedPlan getmedsList() {
        return medsList;
    }

    public PatientProfile getPp() {
        return pp;
    }

    public DoctorProfile getDp() {
        return dp;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getId();
    }

}
