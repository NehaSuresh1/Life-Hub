/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package life_hub_ecosystem.persona;


/**
 *
 * @author kal bugrara
 */
public class UserAccount {

    Profile profile;
    String username;
    String password;
    boolean isEnabled;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnable) {
        this.isEnabled = isEnable;
    }

    public UserAccount(Profile profile, String un, String pw) {
        username = un;
        password = pw;
        this.profile = profile;
        isEnabled = true;

    }

    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }

    public String getUserLoginName() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }

    public boolean IsValidUser(String un, String pw) {

        if (username.equalsIgnoreCase(un) && password.equals(pw)) {
            return true;
        } else {
            return false;
        }

    }

    public String getRole() {
        return profile.getRole();
    }

    public Profile getAssociatedPersonProfile() {
        return profile;
    }

    @Override
    public String toString() {

        return getUserLoginName();
    }

}
