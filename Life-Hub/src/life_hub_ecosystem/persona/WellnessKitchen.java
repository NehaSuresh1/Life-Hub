package life_hub_ecosystem.persona;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import life_hub_ecosystem.wellness_kitchen.persona.DeliveryAgentDirectory;
import life_hub_ecosystem.wellness_kitchen.persona.HealthHubManagerDirectory;

/**
 *
 * @author ojas
 */
public class WellnessKitchen {

    String Id;
    String zipcode;
    String name;
    HealthHubManagerDirectory healthHubManagerDirectory;
    DeliveryAgentDirectory deliveryAgentDirectory;

    public WellnessKitchen(String id, String name,String zipcode) {
        this.name = name;
        this.Id = id;
        this.zipcode=zipcode;
        healthHubManagerDirectory = new HealthHubManagerDirectory();
        deliveryAgentDirectory = new DeliveryAgentDirectory();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public HealthHubManagerDirectory getHealthHubManagerDirectory() {
        return healthHubManagerDirectory;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
