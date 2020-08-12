package by.training_epam.module1.linearprog;
//6.Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Clock {
    public static void main(String []args) {
        int t = 440;
        int a = (int) 440 / 60;
        int s =t-a*60;
        int ch= (int) a/60;
        int m=(int) a-ch*60;
        System.out.print(ch + "ч " + m + "мин " + s + "с ");
    }
}
