/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.pharmacy;

import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.Profile;

/**
 *
 * @author marri
 */
public class PharmacistProfile extends Profile {

    String qualification;
    Person person;

    public PharmacistProfile(Person p, String qualification) {
        super(p);
        person = p;
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String getRole() {
        return "Nurse";
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
