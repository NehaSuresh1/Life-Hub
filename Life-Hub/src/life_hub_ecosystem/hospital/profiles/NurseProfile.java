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
 * @author hemin
 */
public class NurseProfile extends Profile {

    Person person;
    private Department dept;
    private String experience;
    Hospital hosp;

    public NurseProfile(Person p, Department dept, String exp, Hospital hosp) {
        super(p);
        person = p;
        this.dept = dept;
        this.experience = exp;
        this.hosp = hosp;
    }

    public Hospital getHosp() {
        return hosp;
    }

    
    public Department getDept() {
        return dept;
    }

    public void setDept(Department dept) {
        this.dept = dept;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String getRole() {
        return "Nurse";
    }

    @Override
    public String toString() {
        return person.getName();
    }

    public boolean isMatch(String id) {
        return person.getPersonId().equals(id);
    }

}
