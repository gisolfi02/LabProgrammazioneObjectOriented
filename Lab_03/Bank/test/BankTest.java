import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BankTest {

    @Before
    public void setup(){
        BankAccount.totalNumberOfAccounts = 0;
    }

    @Test
    public void findAccountTest() {
        Bank b = new Bank();
        b.addAccount(1000, "Dario");
        BankAccount newAccount = b.find(1);
        Assert.assertEquals(1, newAccount.getAccountNumber());
        Assert.assertEquals(1000, newAccount.getBalance(), 0);
        Assert.assertEquals("Dario", newAccount.getCustomerName());
    }

    @Test
    public void depositTest() {
        Bank b = new Bank();
        b.addAccount(1000,"io");
        BankAccount a = b.find(1);
        b.deposit(a.getAccountNumber(), 1000);
        Assert.assertEquals(2000, b.getBalance(a.getAccountNumber()), 0);
    }

    @Test
    public void withdrawTest() {
        Bank b = new Bank();
        b.addAccount(1000,"io");
        BankAccount a = b.find(1);
        b.withdraw(a.getAccountNumber(), 1000);
        Assert.assertEquals(0, b.getBalance(a.getAccountNumber()), 0);
    }

    @Test
    public void transferTest() {
        Bank b = new Bank();
        b.addAccount(1000,"io");
        b.addAccount(0,"tu");
        b.transfer(1,2,1000);
        BankAccount a1 = b.find(1);
        BankAccount a2 = b.find(2);
        Assert.assertEquals(0,b.getBalance(a1.getAccountNumber()),0);
        Assert.assertEquals(1000,b.getBalance(a2.getAccountNumber()),0);
    }
}