package module4.country;

import java.util.ArrayList;

public class Region {
    double area;
    ArrayList <City> city;

    public Region(double area,  ArrayList<City> city){
        this.area=area;
        this.city=city;
    }

    public  ArrayList<City> getCity() {
        return city;
    }

    public void setCity (ArrayList <City> city) {
        this.city = city;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
