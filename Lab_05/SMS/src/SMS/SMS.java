package SMS;

import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class SMS {
    private final String sender;
    private final GregorianCalendar date;
    private final int id;
    private static int totalNumberSMS;
    private final String text;

    public SMS(String sender, GregorianCalendar date, String text) {
        this.sender = sender;
        this.date = date;
        this.text = text;
        this.id = totalNumberSMS;
        totalNumberSMS++;
    }

    public String getSender() {
        return sender;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public static int getTotalNumberSMS() {
        return totalNumberSMS;
    }

    public String getText() {
        return text;
    }

    public static Comparator<SMS> dataComparator = new Comparator<>() {
        @Override
        public int compare(SMS sms, SMS t1) {
            return sms.getDate().compareTo(t1.getDate());
        }
    };
    public static Comparator<SMS> senderComparator = new Comparator<>() {
        @Override
        public int compare(SMS sms, SMS t1) {
            return sms.getSender().compareTo(t1.getSender());
        }
    };

}