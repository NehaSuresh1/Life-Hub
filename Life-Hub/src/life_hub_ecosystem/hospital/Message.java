/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import life_hub_ecosystem.hospital.profiles.NurseProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.time.LocalDate;

/**
 *
 * @author ojas
 */
public class Message {

    String id;
    String info;
    String date;
    NurseProfile np;
    PatientProfile pp;

    public Message(String id, String info, NurseProfile np, PatientProfile pp) {
        this.id = id;
        this.info = info;
        this.date = LocalDate.now().toString();
        this.np = np;
        this.pp = pp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String name) {
        this.info = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public NurseProfile getNp() {
        return np;
    }

    public void setNp(NurseProfile np) {
        this.np = np;
    }

    public PatientProfile getPp() {
        return pp;
    }

    public void setPp(PatientProfile pp) {
        this.pp = pp;
    }

}
