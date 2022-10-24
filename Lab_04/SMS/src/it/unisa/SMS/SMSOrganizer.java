package it.unisa.SMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SMSOrganizer {
    private final List<SMS> agenda;

    public SMSOrganizer(){
        agenda = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS sms){
        agenda.add(sms);
    }

    public List<SMS> getListBySender(){
        agenda.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS sms1, SMS sms2) {
                return sms1.getSender().compareTo(sms2.getSender());
            }
        });
        return agenda;
    }

    public List<SMS> getListByDate(){
        agenda.sort(new Comparator<SMS>() {
            @Override
            public int compare(SMS sms1, SMS sms2) {
                return sms1.getDate().compareTo(sms2.getDate());
            }
        });
        return agenda;
    }
}
