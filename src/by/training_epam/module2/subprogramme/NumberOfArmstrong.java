package by.training_epam.module2.subprogramme;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//использовать декомпозицию.


public class NumberOfArmstrong {
    public static void main(String[] args) {
        int k = 200;
        numbers(k);
    }

    public static void numbers(int k) {
        for (int i = 1; i < k + 1; i++) {
            array(i);
        }
    }

    public static void array(int a) {
        String s = Integer.toString(a);

        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = a % 10;
            a /= 10;
        }
        numberA(arr, s);
    }


    public static void numberA(int[] arr, String s) {
        int a=Integer.parseInt(s);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int d = (int) Math.pow(arr[i], s.length());
            count = count + d;
        }
        if (count == a) {
            System.out.println(count); }

        }

    }
