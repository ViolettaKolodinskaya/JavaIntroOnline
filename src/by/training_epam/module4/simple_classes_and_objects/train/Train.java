package module4.train;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
// номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.


import java.util.Objects;

public class Train implements Comparable <Train>{
   private String destinationStation;
    private int numberOfTrain;
    private String departureTime;


    public Train(){
        destinationStation="";
        numberOfTrain=0;
        departureTime="";
    }

    public Train(String destinationStation, int numberOfTrain, String departureTime){
        this.destinationStation=destinationStation;
        this.numberOfTrain=numberOfTrain;
        this.departureTime=departureTime;
    }

    public String getDestinationStation(){

        return destinationStation;
    }
    public int getNumberOfTrain(){
        return numberOfTrain;
    }
    public String getDepartureTime(){

        return departureTime;
    }
    public void setDepartureTime(String departureTime){
        this.departureTime=departureTime;
    }
    public void setDestinationStation(String destinationStation){

        this.destinationStation=destinationStation;
    }
    public void setNumberOfTrain(int numberOfTrain){

        this.numberOfTrain=numberOfTrain;
    }

    @Override
    public String toString() {
        return "train{" +
                "destinationStation='" + destinationStation + '\'' +
                ", numberOfTrain=" + numberOfTrain +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }

    @Override
    public int compareTo(Train o) {
        return this.numberOfTrain-o.numberOfTrain;
    }

    @Override
    public boolean equals(Object o) {
        if(this==o)return true;
        if(getClass()!=o.getClass())
            return false;
        if(o==null)
            return false;
        Train train = (Train) o;
        return  numberOfTrain== train.numberOfTrain &&
                Objects.equals(destinationStation, train.destinationStation) &&
                Objects.equals(departureTime, train.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationStation, numberOfTrain, departureTime);
    }
}
