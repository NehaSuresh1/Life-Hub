/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package life_hub_ecosystem.hospital;

import life_hub_ecosystem.hospital.profiles.NurseProfile;
import life_hub_ecosystem.hospital.profiles.PatientProfile;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author marri
 */
public class MessageDirectory {
    
    ArrayList<Message> msgList;

    public MessageDirectory() {

        msgList = new ArrayList();

    }

    public ArrayList<Message> getMsgsList() {
        return msgList;
    }

    public Message newMessage(String info, NurseProfile np, PatientProfile pp) {
        Message msg = new Message(UUID.randomUUID().toString(),info, np, pp);
        msgList.add(msg);
        return msg;
    }

//    public Appointment findApt(String id) {
//
//        for (Appointment dept : appointmentsList) {
//
//            if (dept.isMatch(id)) {
//                return dept;
//            }
//        }
//        return null; //not found after going through the whole list
//    }
}
