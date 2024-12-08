/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author hemin
 */
public class MedPlan {

    //ArrayList<Med> meds;
    String id;
    HashMap<Med, String> associations;
    boolean isActive;
    //Boolean hasConsumed;

    public MedPlan() {
        //meds = new ArrayList();
        this.id = UUID.randomUUID().toString();
        associations = new HashMap<Med, String>();
        isActive = true;
        //hasConsumed = false;
    }

    public HashMap<Med, String> getAssociations() {
        return associations;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public Med addMedicine(Med med, String timing, String period) {

        //Med p = new Med(UUID.randomUUID().toString(), name);
        //meds.add(p);
        associations.put(med, timing + "," + period);
        return med;

    }

    public Med findMedicine(String id) {

        for (Med p : associations.keySet()) {

            if (p.getId() == null ? id == null : p.getId().equals(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

}
