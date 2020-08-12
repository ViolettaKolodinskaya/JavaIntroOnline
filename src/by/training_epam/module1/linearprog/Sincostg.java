package by.training_epam.module1.linearprog;
import static java.lang.Math.*;

// 3.Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class Sincostg {
    public static void main(String []args) {
        double x=0.9;
        double y=0.3;
        double z = (sin(x)+ cos(y))/(cos(x)-sin(y))*tan(x*y);
        System.out.print(z);
    }
}

