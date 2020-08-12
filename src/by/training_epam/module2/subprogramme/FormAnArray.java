package by.training_epam.module2.subprogramme;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;


public class FormAnArray {
    public static void main(String[] args) {
        int k = 10, n = 5;
        int[] arr = new int[10];
        System.out.print(Arrays.toString(formA(arr, k, n)));
    }

    public static int[] formA(int[] arr, int k, int n) {

        int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * n);
                sum = sum + arr[i];
                if(sum>=k)
                    break;
            }

            //System.out.print(sum);
           // System.out.print(Arrays.toString(arr));

        return arr;
    }
}