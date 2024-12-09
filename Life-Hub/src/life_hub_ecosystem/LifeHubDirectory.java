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
public class LifeHubDirectory {

    ArrayList<WellnessKitchen> hhlist;
    String name;
    String zipcode;

    public LifeHubDirectory() {

        hhlist = new ArrayList();
       

    }

    public WellnessKitchen newHH(String name, String zipcode) {
             
        WellnessKitchen p = new WellnessKitchen(UUID.randomUUID().toString(), name, zipcode);
        hhlist.add(p);
        return p;

    }

    public WellnessKitchen findHH(String id) {

        for (WellnessKitchen p : hhlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
     public String[] getList() {
        String[] hospName = new String[hhlist.size()];
        ArrayList<String> hosps = new ArrayList<String>();
        hhlist.forEach((hosp) -> {
            hosps.add(hosp.getName());

        });
        for (int i = 0; i < hhlist.size(); i++) {
            hospName[i] = hosps.get(i);
        }
        return hospName;
    }

    public WellnessKitchen findHubByName(String name) {

        for (WellnessKitchen p : hhlist) {

            if (p.getName() == null ? name == null : p.getName().equals(name)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
    


}
