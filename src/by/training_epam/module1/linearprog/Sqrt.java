package by.training_epam.module1.linearprog;
    import static java.lang.Math.pow;

    //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):

public class Sqrt {
        public static void main(String []args) {
            double b=2.0;
            double a=1.0;
            double c=3.0;
            double z= (b+Math.sqrt(b*b+4*a*c))/(2*a) - pow(a, 3.0)*c + pow(b, -2.0);
            System.out.print(z);
        }
    }

