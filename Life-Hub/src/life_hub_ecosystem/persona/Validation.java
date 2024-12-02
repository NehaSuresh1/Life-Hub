/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.persona;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ojas
 */
public class Validation {

//     public boolean password( String password) {
//        // Replace with the password to validate
//        String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(password);
//       
//
//        if(matcher.matches()) {
//          return true;
//        } else {
//           return false;
//        }
//        
//    }

    public boolean email(String email)
    {
      String regex="^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        
        if(matcher.matches()) {
          return true;
        } else {
           return false;
        } 
    }  
    
}
