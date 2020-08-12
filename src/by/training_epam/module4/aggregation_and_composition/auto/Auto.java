package by.training_epam.module4.aggregation_and_composition.auto;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

import java.util.Objects;


public class Auto {
    String model;
    int year;
    Engine engine;
    Wheels wheels;
    int fuelTank;
    int tankValue;

   public Auto(String model, int year, int tankValue, Wheels wheels, int fuelTank){
       this.engine=new Engine(360);
       this.wheels=wheels;
       this.model=model;
       this.year=year;
       this.tankValue=tankValue;
       this.fuelTank=fuelTank;
   }

    public void setFuelTank(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public void setTankValue(int tankValue) {
        this.tankValue = tankValue;
    }

    public int getTankValue() {
        return tankValue;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, fuelTank, tankValue);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        Auto auto=(Auto) obj;
        return model==auto.model&&
        year==auto.year&&
        tankValue==auto.tankValue;
    }

    @Override
    public String toString() {
        return "model: " + model +
        ", year: " + year + "\n" +
                wheels.toString() +
               "power: " + engine.getPower() +
                " tank value: " + tankValue +
                " fuel tank: " + fuelTank;

    }
}
