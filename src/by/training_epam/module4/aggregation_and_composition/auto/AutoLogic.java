package by.training_epam.module4.aggregation_and_composition.auto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class AutoLogic{

    public void move(Auto auto){
        boolean turnOn=true;

        if(auto.getFuelTank()==0){
            turnOn=false;
        }
        if(turnOn){
            System.out.println("Автомобиль начал движение");
        }
        if(!turnOn){
            System.out.println("Заправьте свой автомобиль");
        }
    }


    public void changeWheel(Auto auto, Wheels wheels){
            if (auto.getWheels().equals(wheels)){
                System.out.println("Эти колеса уже установлены");}
                else{
                    auto.setWheels(wheels);
                }
        }



    public void printAuto(Auto auto){
        System.out.println(auto.getModel());
        System.out.println(auto.toString());
    }



    public int fuel(Auto auto) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество литров, на которое вы бы хотели заправиться");


        try {
            int plus = Integer.parseInt(reader.readLine());
            if(auto.getFuelTank()+plus>auto.getTankValue()){
                System.out.println("Количество топлива превышает объем бака");
            }
            else if(plus<0){}
            else{
                auto.setFuelTank(auto.getFuelTank()+plus);
            }
            reader.close();
        }


    catch(IOException e){
            e.printStackTrace();
    }
        return auto.getFuelTank();
    }
}
