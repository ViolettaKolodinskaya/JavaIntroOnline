package by.training_epam.module1.branching;

//2.Найти FindMax{min(a, b), min(c, d)}.

public class FindMax {
    public static void main(String []args) {
        int a, b, c, d;
        a=2;
        b=5;
        c=6;
        d=12;

        int max= Math.max(Math.min(a,b),Math.min(c,d));
        System.out.print(max);
    }
}
