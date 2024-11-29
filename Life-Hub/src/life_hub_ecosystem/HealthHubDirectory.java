/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class HealthHubDirectory {

    ArrayList<HealthHubEatery> hhlist;

    public HealthHubDirectory() {

        hhlist = new ArrayList();

    }

    public HealthHubEatery newHH(String name, String zipcode) {

        HealthHubEatery p = new HealthHubEatery(UUID.randomUUID().toString(), name, zipcode);
        hhlist.add(p);
        return p;

    }

    public HealthHubEatery findHH(String id) {

        for (HealthHubEatery p : hhlist) {

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

    public HealthHubEatery findHubByName(String name) {

        for (HealthHubEatery p : hhlist) {

            if (p.getName() == null ? name == null : p.getName().equals(name)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

    

}
