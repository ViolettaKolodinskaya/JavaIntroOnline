package by.training_epam.module4.aggregation_and_composition.account;

import java.util.Objects;

public class Account {
   private User user;
   private int accountNumber;
   private boolean isBlocked;
   private double balance;

public Account( User user, int accountNumber, boolean isBlocked, double balance){
    this.user=user;
    this.accountNumber=accountNumber;
    this.isBlocked=false;
    this.balance=balance;
}

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public User getUser() {
        return user;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Account account=(Account) obj;
        return user.equals(obj)&&
                accountNumber==account.accountNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, accountNumber, isBlocked, balance);
    }

    @Override
    public String toString() {
        return "\n User: " + user +
        "\n AccountNumber: " + accountNumber +
        "\n Balance: " + balance + "\n";
    }
}
