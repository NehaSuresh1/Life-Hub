/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital.departments;

import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author hemin
 */
public class DepartmentDirectory {

    ArrayList<Department> departmentList;

    public DepartmentDirectory() {

        departmentList = new ArrayList();

    }
    
        public Department newDept(String deptName) {
        Department dept = new Department(UUID.randomUUID().toString(),deptName);
        departmentList.add(dept);
        return dept;
    }
        
    public Department findDept(String id) {

        for (Department dept : departmentList) {

            if (dept.isMatch(id)) {
                return dept;
            }
        }
            return null; //not found after going through the whole list
         }
}
