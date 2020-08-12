package by.training_epam.module2.subprogramme;

//10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого
//являются цифры числа N.


import java.util.Arrays;

public class Digits {
    public static void main(String [] args){
        int a=786540;
        System.out.print(Arrays.toString(arr(a)));
    }

    public static int [] arr(int a){
        String s = Integer.toString(a);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = a % 10;
            a /= 10;
        }
        return arr;
    }
}
