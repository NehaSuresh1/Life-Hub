/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.profiles;

import life_hub_ecosystem.Hospital;
import life_hub_ecosystem.wellness_kitchen.MealPlan;
import life_hub_ecosystem.hospital.Appointment;
import life_hub_ecosystem.hospital.MedPlan;
import life_hub_ecosystem.lab.TestReport;
import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.Profile;
import java.util.ArrayList;

/**
 *
 * @author ojas
 */
public class PatientProfile extends Profile {

    Person person;
    String dietaryChoice;
    String Street;
    String city;
    String state;
    String zipcode;
    Hospital hosp;
    MealPlan mealPlan;
    ArrayList<MedPlan> medPlans;
    ArrayList<TestReport> reports;
    ArrayList<Appointment> appointments;

    public PatientProfile(String dietaryChoice, String Street, String city, String state, String zipcode, Person p, Hospital hosp) {
        super(p);
        this.dietaryChoice = dietaryChoice;
        this.Street = Street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.person = p;
        this.hosp = hosp;
        this.medPlans = new ArrayList<>();
        reports = new ArrayList<>();
        appointments = new ArrayList<>();
    }

    public MealPlan getMealPlan() {
        return mealPlan;
    }

    public void setMealPlan(MealPlan mealPlan) {
        this.mealPlan = mealPlan;
    }

    public ArrayList<MedPlan> getMedPlans() {
        return medPlans;
    }

    public void setMedPlans(ArrayList<MedPlan> medPlans) {
        this.medPlans = medPlans;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public Appointment addAppointments(Appointment apt) {
        appointments.add(apt);
        return apt;
    }

    public void addTest(TestReport tr) {
        reports.add(tr);
    }

    public ArrayList<TestReport> getTests() {
        return reports;
    }

    public MedPlan getActiveMedPlan() {
        for (MedPlan mp : medPlans) {
            if (mp.getIsActive() == true) {
                return mp;
            }
        }
        return null;
    }

    public void addMedPlan(MedPlan medPlan) {
        medPlans.add(medPlan);
    }

    public String getDietaryChoice() {
        return dietaryChoice;
    }

    public void setDietaryChoice(String dietaryChoice) {
        this.dietaryChoice = dietaryChoice;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Hospital getHosp() {
        return hosp;
    }

    public void setHosp(Hospital hosp) {
        this.hosp = hosp;
    }

}
