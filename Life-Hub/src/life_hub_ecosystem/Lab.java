/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import life_hub_ecosystem.lab.persona.LabAssistantDirectory;

/**
 *
 * @author ojas
 */
public class Lab {

    String ID;
    String zipcode;
    String name;
    LabAssistantDirectory labAssistantDirectory;

    public Lab(String ID, String name, String zipcode) {
        this.name = name;
        this.ID = ID;
        this.zipcode = zipcode;
        labAssistantDirectory = new LabAssistantDirectory();
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getName() {
        return name;
    }

    public LabAssistantDirectory getLabAssistantDirectory() {
        return labAssistantDirectory;
    }
    

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getId() {
        return ID;
    }

    public void setId(String ID) {
        this.ID = ID;
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
