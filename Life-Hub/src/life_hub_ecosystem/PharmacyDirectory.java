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
public class PharmacyDirectory {
      ArrayList<Pharmacy> pharmacyList;

    public PharmacyDirectory() {

        pharmacyList = new ArrayList();

    }

    public Pharmacy newPharmacy(String name, String zipcode) {

        Pharmacy p = new Pharmacy(UUID.randomUUID().toString(),name, zipcode);
        pharmacyList.add(p);
        return p;

    }

     public String[] getList() {
        String[] hospName = new String[pharmacyList.size()];
        ArrayList<String> hosps = new ArrayList<String>();
        pharmacyList.forEach((hosp) -> {
            hosps.add(hosp.getName());

        });
        for (int i = 0; i < pharmacyList.size(); i++) {
            hospName[i] = hosps.get(i);
        }
        return hospName;
    }

    public Pharmacy findLabByName(String name) {

        for (Pharmacy p : pharmacyList) {

            if (p.getName() == null ? name == null : p.getName().equals(name)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

    public Pharmacy findPharmacy(String id) {

        for (Pharmacy p : pharmacyList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }


    
}
