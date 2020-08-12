package module4.train;

//4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
//Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
// номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
//назначения должны быть упорядочены по времени отправления.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String [] args){
        ArrayList <Train> train=new ArrayList <> ();
                train.add (new Train("Tokyo",421, "12:20"));
                train.add (new Train("Nagasaki", 632, "15:40"));
                train.add (new Train("Hokkaido", 78, "21:45"));
                train.add (new Train("Osaka", 541, "05:05"));
                train.add (new Train("Tokyo", 849, "07:50"));


        Collections.sort(train);
        System.out.println(train);

        Comparator station = new DestinationStation();
        Collections.sort(train, station);

        System.out.println(train);

        PrintInfo print=new PrintInfo();
        print.printInfo(train);

    }
}
