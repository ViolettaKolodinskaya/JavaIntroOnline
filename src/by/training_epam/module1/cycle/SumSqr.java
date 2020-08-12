package by.training_epam.module1.cycle;

//3. Найти сумму квадратов первых ста чисел.

import static java.lang.Math.pow;
public class SumSqr {
        public static void main(String[] args) {
            double sum=0;
            for(int i=1; i<=100; i++){
                sum+= pow(i,2.0);
            }
            System.out.print(sum);
        }
    }
