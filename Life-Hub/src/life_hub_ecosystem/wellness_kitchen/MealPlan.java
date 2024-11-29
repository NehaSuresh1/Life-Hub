/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marri
 */
public class MealPlan {

    HashMap<Meal, ArrayList<String>> mealDetails;

    public MealPlan() {
        mealDetails = new HashMap<>();
    }

    public void addMeal(Meal e, String dateOfDelivery) {
        mealDetails.put(e, new ArrayList<String>());
        mealDetails.get(e).add(dateOfDelivery);
        mealDetails.get(e).add("No");
    }

//    public Meal findOrder(String id) {
//
//        for (Meal mo : meals) {
//            if (mo.isMatch(id)) {
//                return mo;
//            }
//        }
//        return null; //not found after going through the whole list
//    }
    public void setStatusToTrue(Meal meal) {
        mealDetails.get(meal).set(1, "Yes");
    }

    public HashMap<Meal, ArrayList<String>> getMealDetails() {
        return mealDetails;
    }
}
