package by.training_epam.module2.subprogramme;

//9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
//если угол между сторонами длиной X и Y— прямой.

public class Quadrangle {
    public static void main(String [] args){
      System.out.print(area(4.0,5.0,4.0,5.0));
    }

    public static double area(double a, double b, double c, double d){
        double hp=(a+b+c+d)/2.0;
        double area= Math.sqrt((hp - a) * (hp - b) * (hp - c) * (hp - d));
return area;
    }

}
