/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class MedDirectory {

    ArrayList<Med> medsList;

    public MedDirectory() {

        medsList = new ArrayList();
    }

    public Med newMedicine(String med) {
        Med medicine = new Med(UUID.randomUUID().toString(), med);
        medsList.add(medicine);
        return medicine;
    }

    public ArrayList<Med> getMedsList() {
        return medsList;
    }

    public Med findMed(String id) {

        for (Med med : medsList) {

            if (med.isMatch(id)) {
                return med;
            }
        }
        return null; //not found after going through the whole list
    }

}
