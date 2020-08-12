package by.training_epam.module4.airline;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
        a) список рейсов для заданного пункта назначения;
        b) список рейсов для заданного дня недели;
        c) список рейсов для заданного дня недели, время вылета для которых больше заданного*/

import java.util.Objects;

public class Airline {
    private String destinationPoint;
    private int flightNumber;
    private String airplaneType;
    private double departureTime;
    public enum Weekday {

        SUNDAY("Sunday"), MONDAY("Monday"), TUSDAY("Tusday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday");
        final private String day;
        Weekday(String day){
           this.day=day;
        }
        public String getDay(){
            return this.day;
        }

    }
   private Weekday weekday;

    public Airline(String destinationPoint, int flightNumber, String airplaneType, double departureTime, Weekday weekday ){
this.destinationPoint=destinationPoint;
this.flightNumber=flightNumber;
this.airplaneType=airplaneType;
this.departureTime=departureTime;
this.weekday=weekday;
    }

    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }

    public Weekday getWeekday() {
        return weekday;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }



    @Override
    public int hashCode() {
        return Objects.hash(destinationPoint,flightNumber,airplaneType,departureTime,weekday);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())
            return false;
        Airline airline=(Airline) obj;
        return
                destinationPoint==airline.destinationPoint&&
        flightNumber==airline.flightNumber&&
        airplaneType==airline.airplaneType&&
        departureTime==airline.departureTime&&
        weekday==airline.weekday;
    }

    @Override
    public String toString() {
        return
        "destinationPoint: " + destinationPoint +
                "\nflightNumber: " + flightNumber +
                "\nairplaneType: " + airplaneType +
                "\ndepartureTime: " + departureTime +
                "\nweekday: " + weekday;

    }
}
