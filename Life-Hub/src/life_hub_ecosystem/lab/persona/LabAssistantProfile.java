/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab.persona;

import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.Profile;

/**
 *
 * @author marri
 */
public class LabAssistantProfile extends Profile {
    

    Person person;

    public LabAssistantProfile(Person p) {
        super(p);
        person = p;
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
