package by.training_epam.module4.airline;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
        a) список рейсов для заданного пункта назначения;
        b) список рейсов для заданного дня недели;
        c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<AirlineBase> airlineBase = new ArrayList<>();
        airlineBase.add(new AirlineBase(new Airline("Tokyo", 748, "boeing", 7.40, Airline.Weekday.SUNDAY)));
        airlineBase.add(new AirlineBase(new Airline("Paris", 789, "boeing", 9.40, Airline.Weekday.FRIDAY)));
        airlineBase.add(new AirlineBase(new Airline("Tokyo", 448, "boeing", 14.40, Airline.Weekday.SUNDAY)));
        airlineBase.add(new AirlineBase(new Airline("Minsk", 118, "boeing", 20.40, Airline.Weekday.SATURDAY)));
        airlineBase.add(new AirlineBase(new Airline("Oslo", 127, "boeing", 00.40, Airline.Weekday.SUNDAY)));


        Logic logic = new Logic();
        logic.printFlightsByDestinationPoint(airlineBase, "Tokyo");
        logic.printFlightsByDay(airlineBase, Airline.Weekday.SUNDAY);
        logic.printFlightsByDayAndDepartureTime(airlineBase, Airline.Weekday.SUNDAY, 10.00);
    }
}
