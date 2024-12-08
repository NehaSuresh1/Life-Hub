/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

import life_hub_ecosystem.hospital.profiles.PatientProfile;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.UUID;

/**
 *
 * @author neha
 */
public class TestReport {

    String id;
    PatientProfile pp;
    HashMap<LabTest, String> testResults;
    String testResultDate;

    public TestReport(PatientProfile pp) {
        this.pp =pp;
        this.id = UUID.randomUUID().toString();
        testResults = new HashMap<>();
        this.testResultDate = LocalDateTime.now().toString();
    }

    public PatientProfile getPp() {
        return pp;
    }

    public HashMap<LabTest, String> getTestResults() {
        return testResults;
    }

    public String getTestResultDate() {
        return testResultDate;
    }

    public String getId() {
        return id;
    }

    public void addTest(LabTest lt, String result) {
        testResults.put(lt, result);
    }

    public boolean isMatch(String id) {
        if (getId().equals(id)) {
            return true;
        }
        return false;
    }

}
