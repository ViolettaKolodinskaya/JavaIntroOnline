package by.training_epam.module4.aggregation_and_composition.auto;

//2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

public class Main {
    public static void main(String [] args){
        Wheels summerWheels=new Wheels(20,200, Wheels.BussType.SUMMER);
        Wheels winterWheels=new Wheels(20, 200, Wheels.BussType.WINTER);
        Auto auto=new Auto("Reno Scenic", 1998,50,summerWheels,10);
        AutoLogic logic=new AutoLogic();
        logic.printAuto(auto);
        logic.fuel(auto);
        logic.move(auto);
        logic.changeWheel(auto, summerWheels);
        logic.printAuto(auto);
    }
}
