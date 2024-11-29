/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.pharmacy;

import life_hub_ecosystem.persona.Person;
import java.util.ArrayList;

/**
 *
 * @author marri
 */
public class PharmacistDirectory {

    ArrayList<PharmacistProfile> pharmacistList;

    public PharmacistDirectory() {

        pharmacistList = new ArrayList();

    }

    public PharmacistProfile newPharmacist(Person p, String qualification) {
        PharmacistProfile pp = new PharmacistProfile(p,qualification);
        pharmacistList.add(pp);
        return pp;

    }

    public PharmacistProfile findPharmacist(String id) {

        for (PharmacistProfile pp : pharmacistList) {

            if (pp.isMatch(id)) {
                return pp;
            }
        }
        return null; //not found after going through the whole list
    }

}
