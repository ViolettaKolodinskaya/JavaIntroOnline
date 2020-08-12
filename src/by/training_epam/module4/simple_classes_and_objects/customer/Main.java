package module4.customer;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customer=new ArrayList<>();
        customer.add(new Customer(1,"Ivanov", "Ivan", "Denisovich", "Polevaja str.14", 24352323, 547));
        customer.add(new Customer(2,"Petrov", "Boris", "Aleksandrovich", "Polevaja str.8",67676767,879));
        customer.add(new Customer(3,"Sidorov", "Sergey", "Denisovich", "Polevaja str.23",98765432,764));
        customer.add(new Customer(4,"Bokolova", "Anna", "Leonidovna", "Polevaja str.1",56563432, 900));
        customer.add(new Customer(5,"Shukshyna", "Irina", "Olegovna", "Polevaja str.4",77777777,1111));

        Comparator lastName= new Logic();
        Collections.sort(customer, lastName);
        System.out.println(customer);

        Logic logic=new Logic();
        logic.cardNumber(customer,60000000,100000000 );
    }
}