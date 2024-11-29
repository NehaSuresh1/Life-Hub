/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import life_hub_ecosystem.pharmacy.PharmacistDirectory;

/**
 *
 * @author marri
 */
public class Pharmacy {

    String Id;
    String name;
    String zipcode;
    PharmacistDirectory pharmacistDirectory;

    public Pharmacy(String id, String name, String zipcode) {
        this.Id = id;
        this.name = name;
        this.zipcode = zipcode;
        pharmacistDirectory = new PharmacistDirectory();
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public PharmacistDirectory getPharmacistDirectory() {
        return pharmacistDirectory;
    }
    

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getId();
    }

}
