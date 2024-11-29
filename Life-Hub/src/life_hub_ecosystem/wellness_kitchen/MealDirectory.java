/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class MealDirectory {

    ArrayList<Meal> meallist;

    public MealDirectory() {
        meallist = new ArrayList();
    }

    public Meal NewMeal(String mealName, String mealType) {
        Meal mo = new Meal(UUID.randomUUID().toString(), mealName, mealType);
        meallist.add(mo);
        return mo;
    }

    public Meal findMeal(String id) {

        for (Meal mo : meallist) {
            if (mo.isMatch(id)) {
                return mo;
            }
        }
        return null; //not found after going through the whole list
    }

    public ArrayList<Meal> findMealByType(String mealType) {

        ArrayList<Meal> meals = new ArrayList<>();

        for (Meal mo : meallist) {
            if (mo.getMealType() == mealType) {
                meals.add(mo);
            }
        }
        return meals; //not found after going through the whole list
    }

}
