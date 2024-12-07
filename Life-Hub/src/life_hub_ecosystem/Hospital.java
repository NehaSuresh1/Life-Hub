/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem;

import life_hub_ecosystem.hospital.AppointmentDirectory;
import life_hub_ecosystem.hospital.MessageDirectory;
import life_hub_ecosystem.hospital.departments.DepartmentDirectory;
import life_hub_ecosystem.hospital.profiles.DoctorDirectory;
import life_hub_ecosystem.hospital.profiles.NurseDirectory;
import life_hub_ecosystem.hospital.profiles.PatientDirectory;

/**
 *
 * @author ojas
 */
public class Hospital {

    String Id;
    String name;
    String zipcode;
    DepartmentDirectory departmentDirectory;
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    NurseDirectory nurseDirectory;
    AppointmentDirectory appointmentDirectory;
    MessageDirectory messageDirectory;

    public Hospital(String Id, String name, String zipcode) {
        this.Id = Id;
        this.name = name;
        this.zipcode = zipcode;
        this.departmentDirectory = new DepartmentDirectory();
        this.patientDirectory = new PatientDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.nurseDirectory = new NurseDirectory();
        this.appointmentDirectory = new AppointmentDirectory();
        this.messageDirectory = new MessageDirectory();

    }

    public MessageDirectory getMessageDirectory() {
        return messageDirectory;
    }

    public AppointmentDirectory getAppointmentDirectory() {
        return appointmentDirectory;
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

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public DepartmentDirectory getDepartmentDirectory() {
        return departmentDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public NurseDirectory getNurseDirectory() {
        return nurseDirectory;
    }

    @Override
    public String toString() {
        return getId();
    }

}
