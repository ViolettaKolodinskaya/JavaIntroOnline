package by.training_epam.module1.linearprog;
import java.util.Scanner;

// 7.Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
//принадлежит закрашенной области, и false — в противном случае:

public class Coordinate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        try {
            int z = sc.nextInt();
            int w= sc.nextInt();
            cord(z, w);
        }
        catch(NumberFormatException e){
            e.printStackTrace();
        }

    }
    public static void cord(int x, int y) {
        if(y==-1&&x==0){
            System.out.print(false);
        }
        else if (y >= 0 && y <= 4 && x >= -2 && x <= 2) {
            System.out.print(true);
        } else if (y >= -3 && y <= 0 && x >= -4 && x <= 4) {
            System.out.print(true);
        } else {
            System.out.print(false);
        }
    }
}
