package by.training_epam.module1.branching;

// 4.Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class Brick {
    public static void main(String[] args){
        size(5,10,3,12,9);
    }


    public static void size(int A, int B, int x, int y, int z){
if(A>x && B>y ||A>y && B>x || A>x && B>z|| A>z && B>x ||A>y && B>z || A>z && B>y){
    System.out.println("Кирпич пройдет через отверстие");
}
else{
    System.out.println("Кирпич не пройдет через отверстие");
}
    }
}
