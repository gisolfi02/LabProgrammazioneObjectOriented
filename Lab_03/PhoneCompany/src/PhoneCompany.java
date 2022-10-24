import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneCompany {
    List<User> users;

    private final double minutePrice;
    private final double smsPrice;
    private final double gbPrice;

    public PhoneCompany(double minutePrice, double smsPrice, double gbPrice){
        this.gbPrice = gbPrice;
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        users = new ArrayList<>();
    }
    public void readUserDataFromFile(File f) throws FileNotFoundException{
        Scanner scanner = new Scanner(f);
        while (scanner.hasNextLine()){
            int code;
            code = Integer.parseInt(scanner.nextLine());
            String name,surname;
            name = scanner.nextLine();
            surname = scanner.nextLine();
            User user = new User(code,name,surname);
            users.add(user);
            int minute, sms;
            double gb;
            minute = Integer.parseInt(scanner.nextLine());
            sms = Integer.parseInt(scanner.nextLine());
            gb = Double.parseDouble(scanner.nextLine());
            user.setUsedMinutes(minute);
            user.setUsedSMS(sms);
            user.setUsedMB(gb);
        }
    }
    public User findUserByCode(int code){
        for(User user : users)
            if(user.getCode() == code)
                return user;
        return null;
    }
    public void computeUserCost(User user){
        int smsUsed = user.getUsedSMS();
        int minuteUsed = user.getUsedMinutes();
        double gbUsed = user.getUsedMB();
        user.setTotalCost(minuteUsed*minutePrice + smsUsed*smsPrice + gbUsed*gbPrice/1000);
    }
}
