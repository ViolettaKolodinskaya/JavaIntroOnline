package by.training_epam.module1.cycle;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:

public class NumericalSeries {
    public static void main (String [] args){
        int n=0;
        double sum=0.0;
        double e=0.5;
        double a;
            while(Math.abs(a=1/Math.pow(2,n)+1/Math.pow(3,n)) >=e){
                sum+=a;
                n+=1;
        }
            System.out.print(sum);
    }
}
