package SMS;

import java.util.*;

public class SMSOrganizer {
    final private List<SMS> messages;

    public SMSOrganizer() {
        messages = new ArrayList<>();
    }

    public void addSMSToOrganizer(SMS sms) {
        this.messages.add(sms);
    }

    public List<SMS> getListByDate() {
        messages.sort(SMS.dataComparator);
        return this.messages;
    }

    public List<SMS> getListBySender() {
        messages.sort(SMS.senderComparator);
        return this.messages;
    }
}
