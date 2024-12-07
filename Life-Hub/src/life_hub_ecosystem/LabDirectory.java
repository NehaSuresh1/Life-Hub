/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author ojas
 */
public class LabDirectory {

    ArrayList<Lab> labsList;

    public LabDirectory() {

        labsList = new ArrayList();

    }
//     public Lab newLab(String name) {
     public String[] getList() {
        String[] hospName = new String[labsList.size()];
        ArrayList<String> hosps = new ArrayList<String>();
        labsList.forEach((hosp) -> {
            hosps.add(hosp.getName());

        });
        for (int i = 0; i < labsList.size(); i++) {
            hospName[i] = hosps.get(i);
        }
        return hospName;
    }


    public Lab findLabByName(String name) {

        for (Lab p : labsList) {

            if (p.getName() == null ? name == null : p.getName().equals(name)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

   public Lab newLab(String name, String zipcode) {

        Lab p = new Lab(UUID.randomUUID().toString(), name, zipcode);
        labsList.add(p);
        return p;

    }

    public Lab findLab(String id) {

        for (Lab p : labsList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

}
