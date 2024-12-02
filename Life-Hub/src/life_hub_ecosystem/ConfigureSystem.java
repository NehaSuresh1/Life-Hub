/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import life_hub_ecosystem.wellness_kitchen.persona.DelieryAgentProfile;
import life_hub_ecosystem.wellness_kitchen.persona.HealthHubManagerProfile;
import life_hub_ecosystem.hospital.Appointment;
import life_hub_ecosystem.hospital.Med;
import life_hub_ecosystem.hospital.departments.Department;
import life_hub_ecosystem.hospital.profiles.DoctorProfile;
import life_hub_ecosystem.hospital.profiles.NurseProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import life_hub_ecosystem.lab.LabTest;
import life_hub_ecosystem.lab.persona.LabAssistantProfile;
import life_hub_ecosystem.persona.Password;
import life_hub_ecosystem.persona.Person;
import life_hub_ecosystem.persona.UserAccount;
import life_hub_ecosystem.persona.UserAccountDirectory;
import life_hub_ecosystem.pharmacy.PharmacistProfile;

/**
 *
 * @author marri
 */
public class ConfigureSystem {

    public static EcoSystem initialize() {
        EcoSystem es = new EcoSystem("Health Haven");

        Hospital h1 = es.hospitalDirectory.newHospital("Hospital Branch 1", "02119");
        Hospital h2 = es.hospitalDirectory.newHospital("Hospital Branch 2", "02115");
//        Hospital h3 = es.hospitalDirectory.newHospital("Hospital Branch 3");
//        Hospital h4 = es.hospitalDirectory.newHospital("Hospital Branch 4");
        //Department d1 = es.hospitalDirectory.findHospital(h1.getId()).departmentDirectory.newDept("")
///////////---------------------------------------------------------
        Lab l1 = es.labDirectory.newLab("Lab branch 1", "02119");
        Lab l2 = es.labDirectory.newLab("Lab branch 2", "02119");
//        Lab l3 = es.labDirectory.newLab("Lab branch 3");
//        Lab l4 = es.labDirectory.newLab("Lab branch 4");

///////////---------------------------------------------------------
        Pharmacy p1 = es.pharmacyDirectory.newPharmacy("Pharmacy branch 1", "02119");
        Pharmacy p2 = es.pharmacyDirectory.newPharmacy("Pharmacy branch 2", "02115");
//        Pharmacy p3 = es.pharmacyDirectory.newPharmacy("Pharmacy branch 3");
//        Pharmacy p4 = es.pharmacyDirectory.newPharmacy("Pharmacy branch 4");

///////////---------------------------------------------------------
        WellnessKitchen hh1 = es.healthHubDirectory.newHH("HealthHub branch 1", "02119");
        WellnessKitchen hh2 = es.healthHubDirectory.newHH("HealthHub branch 2", "02115");
//        WellnessKitchen hh3 = es.healthHubDirectory.newHH("HealthHub branch 3");
//        WellnessKitchen hh4 = es.healthHubDirectory.newHH("HealthHub branch 4");

///////////---------------------------------------------------------
        Person person01 = es.personDirectory.newPerson("abc", 24, "abc@gmail.com" , "male");
        Person person02 = es.personDirectory.newPerson("cde", 24, "cde@gmail.com" , "male");
        Person person03 = es.personDirectory.newPerson("efg", 24, "efg@gmail.com" , "male");
        Person person04 = es.personDirectory.newPerson("ghi", 24, "ghi@gmail.com", "male" );
        Person person05 = es.personDirectory.newPerson("ijk", 24, "ijk@gmail.com", "male");
        Person person06 = es.personDirectory.newPerson("klm", 24, "klm@gmail.com", "male");
        Person person07 = es.personDirectory.newPerson("mno", 24, "mno@gmail.com", "male");
        Person person08 = es.personDirectory.newPerson("opq", 24, "opq@gmail.com", "male");
        Person person09 = es.personDirectory.newPerson("qrs", 24, "qrs@gmail.com", "male");
        Person person10 = es.personDirectory.newPerson("stu", 24, "stu@gmail.com", "male");
        Person person16 = es.personDirectory.newPerson("klm1", 24, "klm1@gmail.com", "male");
        Person person17 = es.personDirectory.newPerson("mno1", 24, "mno1@gmail.com", "male");
        Person person18 = es.personDirectory.newPerson("opq1", 24, "opq1@gmail.com", "male");
        Person person19 = es.personDirectory.newPerson("qrs1", 24, "qrs1@gmail.com", "male");
        Person person20 = es.personDirectory.newPerson("stu1", 24, "stu1@gmail.com", "male");

        Person person11 = es.personDirectory.newPerson("klm12", 24, "klm12@gmail.com", "male");
        Person person12 = es.personDirectory.newPerson("mno12", 24, "mno12@gmail.com", "male");
        Person person13 = es.personDirectory.newPerson("opq12", 24, "opq12@gmail.com", "male");
        Person person14 = es.personDirectory.newPerson("qrs12", 24, "qrs12@gmail.com", "male");
        Person person15 = es.personDirectory.newPerson("stu12", 24, "stu12@gmail.com", "male");
///////////------------------------------------------------------------

        //System.out.println(es.hospitalDirectory.findHospital(h1.getId()));
        Department d1 = h1.departmentDirectory.newDept("Cardiology");
        Department d2 = h1.departmentDirectory.newDept("Orthology");

        Department d3 = es.hospitalDirectory.findHospital(h2.getId()).departmentDirectory.newDept("Cardiology");
        Department d4 = es.hospitalDirectory.findHospital(h2.getId()).departmentDirectory.newDept("Orthology");
///////////---------------------------------------------------------
        DoctorProfile dp1 = es.hospitalDirectory.findHospital(h1.getId()).doctorDirectory.newDoctor(person01, d1, "10", "MD in cardiology", h1);
        DoctorProfile dp2 = es.hospitalDirectory.findHospital(h1.getId()).doctorDirectory.newDoctor(person02, d2, "10", "MD in Orthology", h1);

        DoctorProfile dp3 = es.hospitalDirectory.findHospital(h2.getId()).doctorDirectory.newDoctor(person03, d3, "10", "MD in cardiology", h2);
        DoctorProfile dp4 = es.hospitalDirectory.findHospital(h2.getId()).doctorDirectory.newDoctor(person04, d4, "10", "MD in Orthology", h2);

///////////---------------------------------------------------------
        NurseProfile np1 = es.hospitalDirectory.findHospital(h1.getId()).nurseDirectory.newNurse(person05, d1, "5", h1);
        NurseProfile np2 = es.hospitalDirectory.findHospital(h1.getId()).nurseDirectory.newNurse(person06, d2, "5", h1);
        NurseProfile np3 = es.hospitalDirectory.findHospital(h2.getId()).nurseDirectory.newNurse(person07, d3, "5", h2);
        NurseProfile np4 = es.hospitalDirectory.findHospital(h2.getId()).nurseDirectory.newNurse(person08, d4, "5", h2);
///////////---------------------------------------------------------

        LabAssistantProfile la1 = es.labDirectory.findLab(l1.getId()).labAssistantDirectory.newLabAssistant(person09);
        LabAssistantProfile la2 = es.labDirectory.findLab(l2.getId()).labAssistantDirectory.newLabAssistant(person10);

///////////---------------------------------------------------------
        PharmacistProfile pp1 = es.getPharmacyDirectory().findPharmacy(p1.getId()).pharmacistDirectory.newPharmacist(person16, "B Pharma");
        PharmacistProfile pp2 = es.getPharmacyDirectory().findPharmacy(p2.getId()).pharmacistDirectory.newPharmacist(person17, "M Pharma");

///////////---------------------------------------------------------
        HealthHubManagerProfile hhm1 = es.healthHubDirectory.findHH(hh1.getId()).healthHubManagerDirectory.newManager(person18, "4");
        HealthHubManagerProfile hhm2 = es.healthHubDirectory.findHH(hh2.getId()).healthHubManagerDirectory.newManager(person19, "4");

///////////---------------------------------------------------------
        DelieryAgentProfile da1 = es.healthHubDirectory.findHH(hh1.getId()).deliveryAgentDirectory.newDA(person20, "02119");
        DelieryAgentProfile da2 = es.healthHubDirectory.findHH(hh2.getId()).deliveryAgentDirectory.newDA(person20, "02120");

///////////--------------------------------------------------------- 
        PatientProfile patient01 = h1.patientDirectory.newPatient("veg", "123 main st", "Boston", "MA", "02119", person11, h1);
        PatientProfile patient02 = h1.patientDirectory.newPatient("non-veg", "123 high st", "Boston", "MA", "02120", person12, h1);
        PatientProfile patient03 = h1.patientDirectory.newPatient("veg", "123 low st", "Boston", "MA", "02115", person13, h1);
        PatientProfile patient04 = h2.patientDirectory.newPatient("veg", "123 main st", "Boston", "MA", "02119", person14, h2);
        PatientProfile patient05 = h2.patientDirectory.newPatient("non-veg", "123 high st", "Boston", "MA", "02120", person15, h2);
        //PatientProfile patient06 = h2.patientDirectory.newPatient("vegan", "123 low st", "Boston", "MA", "02115", person11);
///////////--------------------------------------------------------- 

        Med med1 = es.getMedDirectory().newMedicine("Crocin");
        Med med2 = es.getMedDirectory().newMedicine("Paracetmol");
        Med med3 = es.getMedDirectory().newMedicine("Vicks");
        Med med4 = es.getMedDirectory().newMedicine("New med");
///////////--------------------------------------------------------- 

        LabTest lt1 = es.getLabTestDirectory().newTest("Blood pressure test");
        LabTest lt2 = es.getLabTestDirectory().newTest("Glucose test");
        LabTest lt3 = es.getLabTestDirectory().newTest("thyroid test");
///////////--------------------------------------------------------- 

///////////---------------------------------------------------------
        Appointment apt1 = h1.getAppointmentDirectory().newApt(dp1, patient01);
        patient01.addAppointments(apt1);

///////////--------------------------------------------------------- 
        es.getMealDirectory().NewMeal("Lentil Shepherd's Pie", "veg");
        es.getMealDirectory().NewMeal("Black Bean Burgers", "veg");
        es.getMealDirectory().NewMeal("Tofu Scramble", "veg");
        es.getMealDirectory().NewMeal("Stuffed Peppers", "veg");
        es.getMealDirectory().NewMeal("Summer Veggie Wraps", "veg");
        es.getMealDirectory().NewMeal("Rainbow Veggie Salad", "veg");
        es.getMealDirectory().NewMeal("Rainbow Veggie Buddha Bowl", "veg");

        es.getMealDirectory().NewMeal("Chicken Kabobs", "non-veg");
        es.getMealDirectory().NewMeal("Turkey Chili", "non-veg");
        es.getMealDirectory().NewMeal("Shrimp Stir-Fry", "non-veg");
        es.getMealDirectory().NewMeal("Tuna Salad with Whole-Wheat Bread", "non-veg");
        es.getMealDirectory().NewMeal("Shrimp Scampi", "non-veg");
        es.getMealDirectory().NewMeal("Indian Chicken Tikka Masala", "non-veg");
        es.getMealDirectory().NewMeal("Thai Chicken Salad", "non-veg");

///////////--------------------------------------------------------- 
        UserAccountDirectory uadirectory = es.getUseraccountdirectory();
         UserAccount ua001 = uadirectory.newUserAccount(dp1, dp1.getPerson().getName(), Password.hasher(dp1.getPerson().getName()));
        UserAccount ua002 = uadirectory.newUserAccount(dp2, dp2.getPerson().getName(), Password.hasher(dp2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua003 = uadirectory.newUserAccount(dp3, dp3.getPerson().getName(), Password.hasher(dp3.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua005 = uadirectory.newUserAccount(np1, np1.getPerson().getName(), Password.hasher (np1.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua006 = uadirectory.newUserAccount(np2, np2.getPerson().getName(), Password.hasher(np2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua007 = uadirectory.newUserAccount(np3, np3.getPerson().getName(), Password.hasher(np3.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua008 = uadirectory.newUserAccount(np4, np4.getPerson().getName(), Password.hasher(np4.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua009 = uadirectory.newUserAccount(la1, la1.getPerson().getName(), Password.hasher(la1.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua010 = uadirectory.newUserAccount(la2, la2.getPerson().getName(), Password.hasher(la2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua011 = uadirectory.newUserAccount(pp1, pp1.getPerson().getName(), Password.hasher(pp1.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua012 = uadirectory.newUserAccount(pp2, pp2.getPerson().getName(), Password.hasher(pp2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua013 = uadirectory.newUserAccount(hhm1, hhm1.getPerson().getName(),Password.hasher( hhm1.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua014 = uadirectory.newUserAccount(hhm2, hhm2.getPerson().getName(), Password.hasher(hhm2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua015 = uadirectory.newUserAccount(da1, da1.getPerson().getName(), Password.hasher(da1.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua016 = uadirectory.newUserAccount(da2, da2.getPerson().getName(), Password.hasher(da2.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua017 = uadirectory.newUserAccount(patient01, patient01.getPerson().getName(), Password.hasher(patient01.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua018 = uadirectory.newUserAccount(patient02, patient02.getPerson().getName(),Password.hasher( patient02.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua019 = uadirectory.newUserAccount(patient03, patient03.getPerson().getName(), Password.hasher(patient03.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua020 = uadirectory.newUserAccount(patient04, patient04.getPerson().getName(), Password.hasher(patient04.getPerson().getName())); /// order products for one of the customers and performed by a sales person
        UserAccount ua021 = uadirectory.newUserAccount(patient05, patient05.getPerson().getName(), Password.hasher(patient05.getPerson().getName())); /// order products for one o


        // UserAccount ua022 = uadirectory.newUserAccount(patient06, patient06.getPerson().getName(), patient06.getPerson().getName()); /// order products for one of the customers and performed by a sales person

///////////---------------------------------------------------------
        return es;
    }
}
