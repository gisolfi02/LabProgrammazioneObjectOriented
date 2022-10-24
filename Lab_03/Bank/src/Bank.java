import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<BankAccount> accounts;

    public Bank() {

        this.accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance, String customerName) {
        accounts.add(new BankAccount(initialBalance,customerName));
    }

    public BankAccount find(int accountNumber) {
        for (BankAccount ba : this.accounts) {
            if (ba.getAccountNumber() == accountNumber)
                return ba;
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        for(BankAccount b : accounts)
            if(b.getAccountNumber()==accountNumber)
                b.deposit(amount);
    }

    public void withdraw(int accountNumber, double amount) {
        for (BankAccount b : accounts)
            if(b.getAccountNumber() == accountNumber)
                b.withdraw(amount);
    }

    public double getBalance(int accountNumber) {
        for(BankAccount b : accounts)
            if(b.getAccountNumber()==accountNumber)
                return b.getBalance();
        return 0;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        for(BankAccount b : accounts)
            if(b.getAccountNumber()== fromAccountNumber)
                b.withdraw(amount);
        for(BankAccount b2 : accounts)
            if(b2.getAccountNumber()== toAccountNumber)
                b2.deposit(amount);
    }
}