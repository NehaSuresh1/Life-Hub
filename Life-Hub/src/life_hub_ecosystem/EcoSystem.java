/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import life_hub_ecosystem.wellness_kitchen.MealDirectory;
import life_hub_ecosystem.wellness_kitchen.MealOrderDirectory;
import life_hub_ecosystem.hospital.MedDirectory;
import life_hub_ecosystem.lab.LabOrdersDirectory;
import life_hub_ecosystem.lab.LabTestDirectory;
import life_hub_ecosystem.lab.TestReportDirectory;
import life_hub_ecosystem.persona.PersonDirectory;
import life_hub_ecosystem.persona.UserAccountDirectory;
import life_hub_ecosystem.pharmacy.PharmaOrderDirectory;

/**
 *
 * @author ojas
 */
public class EcoSystem {

    String name;
    PersonDirectory personDirectory;
    UserAccountDirectory useraccountdirectory;
    HospitalDirectory hospitalDirectory;
    LabDirectory labDirectory;
    PharmacyDirectory pharmacyDirectory;
    HealthHubDirectory healthHubDirectory;
    LabTestDirectory labTestDirectory;
    MedDirectory medDirectory;
    LabOrdersDirectory labOrdersDirectory;
    PharmaOrderDirectory pharmaOrderDirectory;
    TestReportDirectory testReportDirectory;
    MealOrderDirectory mealOrderDirectory;
    MealDirectory mealDirectory;

    public EcoSystem(String name) {
        this.name = name;
        personDirectory = new PersonDirectory();
        useraccountdirectory = new UserAccountDirectory();
        hospitalDirectory = new HospitalDirectory();
        labDirectory = new LabDirectory();
        pharmacyDirectory = new PharmacyDirectory();
        healthHubDirectory = new HealthHubDirectory();
        labTestDirectory = new LabTestDirectory();
        medDirectory = new MedDirectory();
        labOrdersDirectory = new LabOrdersDirectory();
        pharmaOrderDirectory = new PharmaOrderDirectory();
        testReportDirectory = new TestReportDirectory();
        mealOrderDirectory = new MealOrderDirectory();
        mealDirectory = new MealDirectory();
        //PharmaOrder pharmaOrder = new PharmaOrder(name, medsList, pp, dp)
    }

    public MealDirectory getMealDirectory() {
        return mealDirectory;
    }

    public MealOrderDirectory getMealOrderDirectory() {
        return mealOrderDirectory;
    }

    public TestReportDirectory getTestReportDirectory() {
        return testReportDirectory;
    }

    public PharmaOrderDirectory getPharmaOrderDirectory() {
        return pharmaOrderDirectory;
    }

    public LabOrdersDirectory getLabOrdersDirectory() {
        return labOrdersDirectory;
    }

    public MedDirectory getMedDirectory() {
        return medDirectory;
    }

    public LabTestDirectory getLabTestDirectory() {
        return labTestDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public PharmacyDirectory getPharmacyDirectory() {
        return pharmacyDirectory;
    }

    public HealthHubDirectory getHealthHubDirectory() {
        return healthHubDirectory;
    }
}
