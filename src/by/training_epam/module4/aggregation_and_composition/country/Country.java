package module4.country;

//3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры.

import java.util.ArrayList;

public class Country {
   ArrayList<District> district;
    final String capital;

    public Country(ArrayList <District> district, String capital){
        this.district = district;
        this.capital=capital;
    }

    public String getCapital() {
        return capital;
    }

    public void setDistrict(ArrayList <District> district) {
        this.district = district;
    }

    public ArrayList <District> getDistrict() {
        return district;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
