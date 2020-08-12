package module4.train;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintInfo {
    public void printInfo(ArrayList <Train> train){
       try {
           System.out.println("Введите номер поезда, чтобы получить инфориацию о времени отправления и пункте прибытия");
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int num = Integer.parseInt(reader.readLine());
           for (int i = 0; i < train.size(); i++) {
if(num==train.get(i).getNumberOfTrain()){
    System.out.println(train.get(i));
}
else{ }
           }
           reader.close();
       }
       catch(IOException e){
           e.printStackTrace();
       }

    }
}
