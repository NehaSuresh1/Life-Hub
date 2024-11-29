/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life_hub_ecosystem.persona;

/**
 *
 * @author marri
 */
public class Person {

    String id;
    String name;
    int age;
    String email;
    String gender;

    public Person(String id, String name, int age, String email, String gender) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getPersonId() {
        return id;
    }

    public void setPersonId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return getPersonId();
    }

}
