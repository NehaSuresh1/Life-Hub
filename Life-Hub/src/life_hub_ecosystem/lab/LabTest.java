/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

/**
 *
 * @author marri
 */
public class LabTest {

    String id;
    String name;

    public LabTest(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
