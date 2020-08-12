package by.training_epam.module4.aggregation_and_composition.account;

import java.util.ArrayList;

public class DataBase {
    ArrayList <Account> accountBase;

    public DataBase(ArrayList <Account> accountBase){
        this.accountBase=accountBase;
    }

    public ArrayList<Account> getAccountBase() {
        return accountBase;
    }

    public void setAccountBase(ArrayList<Account> accountBase) {
        this.accountBase = accountBase;
    }


}
