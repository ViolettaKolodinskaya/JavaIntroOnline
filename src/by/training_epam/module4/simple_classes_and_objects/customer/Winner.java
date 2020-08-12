package module4.customer;

public class Winner {
    private Customer customer;
    public enum Gift {
        CAR("автомобиль Лада \"Калина\" "), PHONE("телефон Nokia"), NOTEBOOK(" ноутбук Acer"), TIKET(" билеты на фильм \"Strang Things\"");
        final private String present;

        Gift(String present) {
            this.present = present;
        }

        public String getPresent() {
            return this.present;

        }
    }
    private Gift gift;

    public Winner(Customer customer, Gift gift){
      this.customer=customer;
      this.gift=gift;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Gift getGift() {
        return gift;
    }

    public void setGift(Gift gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "Поздравляем! Покупатель по имени " + customer.getFirstName() + " " + customer.getLastName() +
                " Вы выиграли " + gift;
    }

}
