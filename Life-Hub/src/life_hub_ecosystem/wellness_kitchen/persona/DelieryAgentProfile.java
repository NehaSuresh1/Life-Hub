/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen.persona;

import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.Profile;

/**
 *
 * @author marri
 */
public class DelieryAgentProfile extends Profile {

    String Zipcode;
    Person person;

    public DelieryAgentProfile(Person p, String zip) {
        super(p);
        person = p;
        this.Zipcode = zip;
    }

//    public String getExperience() {
//        return Experience;
//    }
//
//    public void setExperience(String Experience) {
//        this.Experience = Experience;
//    }
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
