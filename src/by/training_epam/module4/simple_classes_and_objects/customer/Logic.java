package module4.customer;


import java.util.ArrayList;
import java.util.Comparator;

public class Logic implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int result= o1.getLastName().compareTo(o2.getLastName());
        return result;
    }

    public void cardNumber(ArrayList <Customer> customer, int a, int b){
        for(int i=0; i<customer.size(); i++){
            if(customer.get(i).getCreditCard()>a&&customer.get(i).getCreditCard()<b){
                System.out.print(customer.get(i));
            }
        }
    }
}
