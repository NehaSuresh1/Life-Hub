/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life_hub_ecosystem.persona;

import java.util.UUID;
import java.util.ArrayList;

/**
 *
 * @author Marri
 */
public class PersonDirectory {

    ArrayList<Person> personlist;

    public PersonDirectory() {

        personlist = new ArrayList();

    }

    public Person newPerson(String name, int age, String email ,String gender){//,String gender) {

        Person p = new Person(UUID.randomUUID().toString(), name, age, email, gender);
        personlist.add(p);
        return p;

    }

    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

}
