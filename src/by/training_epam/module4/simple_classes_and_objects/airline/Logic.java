package by.training_epam.module4.airline;

import java.util.ArrayList;

public class Logic {
    public void printFlightsByDestinationPoint(ArrayList<AirlineBase> airlineBase, String destinationPoint) {
        for (int i = 0; i < airlineBase.size(); i++) {
            if (airlineBase.get(i).airline.getDestinationPoint().equals(destinationPoint)) {
                System.out.println(airlineBase.get(i).airline.toString()+"\n");
            }
        }
    }

    public void printFlightsByDay(ArrayList<AirlineBase> airlineBase, Airline.Weekday weekday) {
        for (int i = 0; i < airlineBase.size(); i++) {
            if (airlineBase.get(i).airline.getWeekday().equals(weekday)) {
                System.out.println(airlineBase.get(i).airline.toString() + "\n");
            }
        }
    }

    public void printFlightsByDayAndDepartureTime(ArrayList<AirlineBase> airlineBase, Airline.Weekday weekday, double time) {
        for (int i = 0; i < airlineBase.size(); i++) {
            if (airlineBase.get(i).airline.getWeekday().equals(weekday)) {
                if (airlineBase.get(i).airline.getDepartureTime() > time) {
                    System.out.println(airlineBase.get(i).airline.toString() + "\n");
                }
            }
        }
    }
}