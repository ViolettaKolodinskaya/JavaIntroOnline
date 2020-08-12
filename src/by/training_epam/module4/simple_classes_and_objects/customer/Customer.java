package module4.customer;

/*8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
        и методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
        Найти и вывести:
        a) список покупателей в алфавитном порядке;
        b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
*/

import java.util.Objects;

public class Customer{

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private int creditCard;
    private int bankAccount;
Winner winner;

    public Customer(int id, String lastName, String firstName, String middleName, String address, int creditCard, int bankAccount){
        this.id=id;
        this.lastName=lastName;
        this.firstName=firstName;
        this.middleName=middleName;
        this.address=address;
        this.creditCard=creditCard;
        this.bankAccount=bankAccount;
    }

    public Winner getWinner() {
        return winner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Customer customer=(Customer) obj;
        return id==customer.id&&
                lastName==customer.lastName&&
                firstName==customer.firstName&&
                middleName==customer.middleName&&
                address==customer.address&&
                creditCard==customer.creditCard&&
                bankAccount==customer.bankAccount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,lastName, firstName, middleName, address, creditCard, bankAccount);
    }

    @Override
    public String toString() {
        return "id: " + id + ", lastName: " + lastName + ", firstName: " + firstName + ", middleName: " + middleName +
        ", address: " + address + ", creditCard: " + creditCard + ", bankAccount: " + bankAccount +"\n";

    }
}
