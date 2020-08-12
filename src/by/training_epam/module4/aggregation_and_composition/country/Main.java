package module4.country;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){

        ArrayList <City> cities=new ArrayList<>();

        cities.add(new City("Marjina Gorka"));
        cities.add(new City("Blon"));
        cities.add(new City("Puhvichy"));


        ArrayList <Region> regions=new ArrayList<>();

        regions.add(new Region(112.9, cities));
        regions.add(new Region(157.5, cities));
        regions.add(new Region(202.0, cities));

    }
}
