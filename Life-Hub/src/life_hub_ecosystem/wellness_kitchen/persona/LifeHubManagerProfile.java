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
public class LifeHubManagerProfile extends Profile{

    String Experience;
    Person person;

    public LifeHubManagerProfile(Person p, String Experience) {
        super(p);
        person = p;
        this.Experience=Experience;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String Experience) {
        this.Experience = Experience;
    }

    @Override
    public String getRole() {
        return "Nurse";
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
