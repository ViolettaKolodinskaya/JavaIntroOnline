package by.training_epam.module2.subprogramme;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника.

public class TheAreaOfTheHexagon {
    public static void main(String [] args){
System.out.print(hexagon(8.0));
    }

    public static double hexagon(double a){
      double s=(3*Math.sqrt(3)*a*a)/2;
      return s;
    }
}
