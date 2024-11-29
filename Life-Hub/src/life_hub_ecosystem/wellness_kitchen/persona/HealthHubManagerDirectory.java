/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen.persona;

import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author marri
 */
public class HealthHubManagerDirectory {

    ArrayList<HealthHubManagerProfile> managersList;

    public HealthHubManagerDirectory() {

        managersList = new ArrayList();

    }

    public HealthHubManagerProfile newManager(Person p, String exp) {
        HealthHubManagerProfile hhm = new HealthHubManagerProfile(p, exp);
        managersList.add(hhm);
        return hhm;

    }

    public HealthHubManagerProfile findManager(String id) {

        for (HealthHubManagerProfile hhm : managersList) {

            if (hhm.isMatch(id)) {
                return hhm;
            }
        }
        return null; //not found after going through the whole list
    }

}
