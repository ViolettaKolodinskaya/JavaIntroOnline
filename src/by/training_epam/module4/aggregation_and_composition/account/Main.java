package by.training_epam.module4.aggregation_and_composition.account;

/*4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
        счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
        всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList<Account> accountBase=new ArrayList<>();
        accountBase.add(new Account(new User("Bill", "Gates"),2345,false,30000.200));
        accountBase.add(new Account(new User("Bill", "Gates"),9862,false,99000.200));
        accountBase.add(new Account(new User("Bill", "Gates"),2345,true,-33.0));
        accountBase.add(new Account(new User("Bill", "Klinton"),2345,false,-678.90));
        accountBase.add(new Account(new User("Bill", "Klinton"),2345,false,89000.00));
        DataBase base=new DataBase(accountBase);
        AccountLogic logic= new AccountLogic();
        logic.printBase(base);
       logic.totalAmount(accountBase);
    }
}
