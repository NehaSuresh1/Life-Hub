/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.time.LocalDate;

/**
 *
 * @author marri
 */
public class MealOrder {

    String Id;
    DoctorProfile dp;
    PatientProfile pp;    
    String period;
    boolean isActive;
    String startDate;

    public MealOrder(String Id, DoctorProfile dp, PatientProfile pp, String period) {
        this.Id = Id;
        this.dp = dp;
        this.pp = pp;
        this.period = period;
        this.isActive = false;
        this.startDate = LocalDate.now().toString();
    }

    public String getStartDate() {
        return startDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
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
