package by.training_epam.module2.subprogramme;

//  16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//  Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfOddDigits {
    public static void main (String [] args) {
        int n=0;
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите n, чтобы определить сумму n-значных чисел.");
        try {
            n = Integer.parseInt(reader.readLine());
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Сумма чисел равна " + sumOfOddDigits(n));
        System.out.println("В найденной цифре " + countOfEvenDigits(sumOfOddDigits(n)) + " четных числа.");
    }


    private static int sumOfOddDigits(int n){
        int sum=0;
        for(int i= (int)Math.pow(10.0,n-1); i<(Math.pow(10.0,n))-1; i++) {
            if (isOdd(i)) {
                sum +=i;

            }
        }
        return sum;
    }



    private static int countOfEvenDigits(int sum){
        int count=0;
        int[] arr=getArrayFromDigits(sum);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }

        return count;
    }


    private static int[] getArrayFromDigits(int value) {
        String s = Integer.toString(value);
        int[] result = new int[s.length()];
        for (int i = 0; i < result.length; i++) {
            result[i] = Character.digit(s.charAt(i), 10);
        }
        return result;
    }


    private static boolean isOdd(int num){
        int[] arr=getArrayFromDigits(num);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) return false;
        }
        return true;

    }


    }

