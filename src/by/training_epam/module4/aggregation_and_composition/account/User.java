package by.training_epam.module4.aggregation_and_composition.account;

import java.util.Objects;

public class User {
    private String name;
    private String surname;



    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public User() {
        this.name = "";
        this.surname = "";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return " Name: " + name +
        "\n Surname: " + surname +
        "\n " ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        User user=(User) obj;
        return this.name.equals(user.name)&&
                this.surname.equals(user.surname);
    }
}