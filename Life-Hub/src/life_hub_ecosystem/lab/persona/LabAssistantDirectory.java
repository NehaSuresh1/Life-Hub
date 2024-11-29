/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab.persona;

import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author marri
 */
public class LabAssistantDirectory {

    ArrayList<LabAssistantProfile> labAssistantList;

    public LabAssistantDirectory() {

        labAssistantList = new ArrayList();

    }

    public LabAssistantProfile newLabAssistant(Person p) {
        LabAssistantProfile lap = new LabAssistantProfile(p);
        labAssistantList.add(lap);
        return lap;

    }

    public LabAssistantProfile findLabAsistant(String id) {

        for (LabAssistantProfile lap : labAssistantList) {

            if (lap.isMatch(id)) {
                return lap;
            }
        }
        return null; //not found after going through the whole list
    }

}
