package by.training_epam.module4.aggregation_and_composition.account;

import java.util.ArrayList;

public class AccountLogic {
    public void printBase(DataBase base){
        System.out.println(base.getAccountBase());
    }

    public void totalAmount(ArrayList<Account> accountBase){
        double count=0.0;

        for(int i=0; i<accountBase.size(); i++){
            count+=accountBase.get(i).getBalance();
        }
       System.out.print("В данный момент на ваших счетах находится " + count);
    }

    public double positiveA(ArrayList <Account> accountBase){
     return 0.0;
    }
    public double negativeA(ArrayList <Account> accountBase){
     return 0.0;
    }
}
