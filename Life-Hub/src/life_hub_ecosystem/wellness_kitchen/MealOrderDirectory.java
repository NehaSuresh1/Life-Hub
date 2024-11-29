/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen;

import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class MealOrderDirectory {

    ArrayList<MealOrder> mealOrderlist;

    public MealOrderDirectory() {
        mealOrderlist = new ArrayList();
    }

    public ArrayList<MealOrder> getMealOrderlist() {
        return mealOrderlist;
    }

    public MealOrder NewOrder(DoctorProfile dp, PatientProfile pp, String period) {
        MealOrder mo = new MealOrder(UUID.randomUUID().toString(), dp, pp, period);
        mealOrderlist.add(mo);
        return mo;
    }

    public MealOrder findOrder(String id) {

        for (MealOrder mo : mealOrderlist) {
            if (mo.isMatch(id)) {
                return mo;
            }
        }
        return null; //not found after going through the whole list
    }

}
