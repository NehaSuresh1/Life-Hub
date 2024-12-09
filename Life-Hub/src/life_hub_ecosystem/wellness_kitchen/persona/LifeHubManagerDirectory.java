/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen.persona;

import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author hemin
 */
public class LifeHubManagerDirectory {

    ArrayList<LifeHubManagerProfile> managersList;

    public LifeHubManagerDirectory() {

        managersList = new ArrayList();

    }

    public LifeHubManagerProfile newManager(Person p, String exp) {
        LifeHubManagerProfile hhm = new LifeHubManagerProfile(p, exp);
        managersList.add(hhm);
        return hhm;

    }

    public LifeHubManagerProfile findManager(String id) {

        for (LifeHubManagerProfile hhm : managersList) {

            if (hhm.isMatch(id)) {
                return hhm;
            }
        }
        return null; //not found after going through the whole list
    }

}
