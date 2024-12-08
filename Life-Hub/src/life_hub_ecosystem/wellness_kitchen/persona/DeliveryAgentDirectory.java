/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen.persona;

import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author ojas
 */
public class DeliveryAgentDirectory {

    ArrayList<DelieryAgentProfile> deliveryAgentList;

    public DeliveryAgentDirectory() {

        deliveryAgentList = new ArrayList();

    }

    public DelieryAgentProfile newDA(Person p, String zip) {
        DelieryAgentProfile dap = new DelieryAgentProfile(p, zip);
        deliveryAgentList.add(dap);
        return dap;

    }

    public DelieryAgentProfile findDA(String id) {

        for (DelieryAgentProfile dap : deliveryAgentList) {

            if (dap.isMatch(id)) {
                return dap;
            }
        }
        return null; //not found after going through the whole list
    }

}
