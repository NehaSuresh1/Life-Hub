/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.profiles;

import life_hub_ecosystem.Hospital;
import life_hub_ecosystem.hospital.departments.Department;
import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.Profile;

/**
 *
 * @author marri
 */
public class DoctorProfile extends Profile {

    Person person;
    Hospital hosp;
    private Department dept;
    private String experience;
    private String highestQulification;

    public DoctorProfile(Person p, Department dept, String exp, String highestQulification, Hospital hosp) {
        super(p);
        this.hosp = hosp;
        person = p;
        this.dept = dept;
        this.experience = exp;
        this.highestQulification = highestQulification;
    }

    @Override
    public String getRole() {
        return "Nurse";
    }

    public Hospital getHosp() {
        return hosp;
    }

    public void setHosp(Hospital hosp) {
        this.hosp = hosp;
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getHighestQulification() {
        return highestQulification;
    }

    public void setHighestQulification(String highestQulification) {
        this.highestQulification = highestQulification;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

}
