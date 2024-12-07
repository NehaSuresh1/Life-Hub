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
public class HospitalDirectory {
    
       ArrayList<Hospital> hospitallist;

    public HospitalDirectory() {

        hospitallist = new ArrayList();

    }

    public Hospital newHospital(String name, String zipcode) {

       Hospital p = new Hospital(UUID.randomUUID().toString(), name, zipcode);
        hospitallist.add(p);
        return p;

    }

    public Hospital findHospital(String id) {

        for (Hospital p : hospitallist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }
     public String[] getList() {
        String[] hospName = new String[hospitallist.size()];
        ArrayList<String> hosps = new ArrayList<String>();
        hospitallist.forEach((hosp) -> {
            hosps.add(hosp.getName());

        });
        for (int i = 0; i < hospitallist.size(); i++) {
            hospName[i] = hosps.get(i);
        }
        return hospName;
    }
    
    public Hospital findHospitalByName(String name) {

        for (Hospital p : hospitallist) {

            if (p.getName() == null ? name == null : p.getName().equals(name)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

    
    public Hospital findHospitalByZipcode(String zipCode) {
        int closestDistance = Integer.MAX_VALUE;
        //int closestNumber = Integer.MIN_VALUE;
        Hospital closestHosp = null;
        for (Hospital p : hospitallist) {

            if (p.getZipcode().equalsIgnoreCase(zipCode)) {
                return p;
            }

            int distance = Math.abs(Integer.parseInt(p.getZipcode()) - Integer.parseInt(zipCode));
            if (distance < closestDistance) {
                closestDistance = distance;
                closestHosp = p;
            }
        }

        return closestHosp; //not found after going through the whole list
    }

    
}
