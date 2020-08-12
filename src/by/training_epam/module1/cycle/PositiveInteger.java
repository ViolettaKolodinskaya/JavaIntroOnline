package by.training_epam.module1.cycle;

import java.util.InputMismatchException;
import java.util.Scanner;

//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
//все числа от 1 до введенного пользователем числа.

public class PositiveInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительное число:");
        try{ int num = sc.nextInt();

            if (num > 0&& num% 1 == 0) {
                int sum = 0;
                for (int i = 1; i < num; i++) {
                    sum += i;
                }
                System.out.print("Сумма чисел до введенного вами: " + sum);
            }
            else {
                System.out.print("Вы ввели неправильное число");
            }}
        catch(InputMismatchException e){
            System.out.print("Вы ввели неправильное число");
        }

    }
}
