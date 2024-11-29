/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.lab;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class LabTestDirectory {

    ArrayList<LabTest> labTestsList;

    public LabTestDirectory() {
        this.labTestsList = new ArrayList<LabTest>();
    }

    public ArrayList<LabTest> getLabTestsList() {
        return labTestsList;
    }

    public LabTest newTest(String testName) {
        LabTest test = new LabTest(UUID.randomUUID().toString(), testName);
        labTestsList.add(test);
        return test;
    }

    public LabTest findTest(String id) {

        for (LabTest test : labTestsList) {

            if (test.isMatch(id)) {
                return test;
            }
        }
        return null; //not found after going through the whole list
    }

}
