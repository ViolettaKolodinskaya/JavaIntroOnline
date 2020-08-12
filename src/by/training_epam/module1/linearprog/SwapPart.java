package by.training_epam.module1.linearprog;

//4.Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
//дробную и целую части числа и вывести полученное значение числа.

public class SwapPart {
    public static void main(String []args) {
        double r = 111.555;
        int a = (int) r;
        double d = a * 0.001;
        double z = r - a;
        double x = z * 1000;
        double num = x + d;
        System.out.print(num);
    }
}
