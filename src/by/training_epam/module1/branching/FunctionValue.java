package by.training_epam.module1.branching;

//5. Вычислить значение функции.

import static java.lang.StrictMath.pow;

public class FunctionValue {
    public static double f;


    public static void main(String[] args) {
        function(2);
        System.out.print(f);
    }


    public static double function(double x){
            if (x <= 3) {
                f = x * x - 3 * x + 9;
            } else if (x > 3) {
                f = 1 / (pow(x, 3.0) + 6);
            }
return f;
        }
        }

