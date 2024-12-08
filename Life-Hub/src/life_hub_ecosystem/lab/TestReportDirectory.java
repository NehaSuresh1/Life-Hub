/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;

/**
 *
 * @author neha
 */
public class TestReportDirectory {

    ArrayList<TestReport> trd;

    public TestReportDirectory() {
        this.trd = new ArrayList<>();
    }

    public ArrayList<TestReport> getTrd() {
        return trd;
    }

    public TestReport newTestReport(PatientProfile pp) {
        TestReport tr = new TestReport(pp);
        trd.add(tr);
        return tr;
    }

    public TestReport findTestReport(String id) {

        for (TestReport test : trd) {

            if (test.isMatch(id)) {
                return test;
            }
        }
        return null; //not found after going through the whole list
    }

}
