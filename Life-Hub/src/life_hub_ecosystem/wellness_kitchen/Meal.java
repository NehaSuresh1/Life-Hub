/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.wellness_kitchen;

/**
 *
 * @author marri
 */
public class Meal {

    String id;
    String name;
    String mealType;

    public Meal(String id, String name, String mealType) {
        this.id = id;
        this.name = name;
        this.mealType = mealType;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getName();
    }
}
