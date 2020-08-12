package by.training_epam.module1.cycle;

 //4.Составить программу нахождения произведения квадратов первых двухсот чисел

import static java.lang.Math.pow;

public class Multiplication {
        public static void main(String[] args) {
            double s=1;
            for(int i=1; i<=200; i++){
                s=s*pow(i,2.0);
            }
            System.out.print(s);
        }
    }

