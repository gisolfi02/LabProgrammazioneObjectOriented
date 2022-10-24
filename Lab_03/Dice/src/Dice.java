import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Qual'è la tua predizione?");
            predictedValue = in.nextInt();
            System.out.println("Quanto vuoi scommettere?");
            bet = in.nextDouble();
            if(bet>playerAccount.getBalance() && bet>casinoAccount.getBalance()/5)
                return;
            Random random = new Random();
            actualValue = random.nextInt(6)+1;
            System.out.println("Il dado ha estratto il numero " + actualValue);
            if(predictedValue==actualValue) {
                playerAccount.deposit(bet * 5);
                casinoAccount.withdraw(bet*5);
                System.out.println("Hai vinto " + bet*5 );
            }
            else{
                playerAccount.withdraw(bet);
                casinoAccount.deposit(bet);
                System.out.println("Hai perso " + bet);
            }
            if(playerAccount.getBalance()>0){
                System.out.println("Vuoi scommettere ancora? si/no");
                choice = in.nextLine();
            }
        }while (choice.equals("si"));

        System.out.println("Il tuo saldo è " + playerAccount.getBalance());

    }
}