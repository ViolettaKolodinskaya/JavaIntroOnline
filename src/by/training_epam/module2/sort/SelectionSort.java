package by.training_epam.module2.sort;

//3. Сортировка выбором. Дана последовательность чисел a1 <=a2 <=...<= an. Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 6, 5, 13, 1};
        System.out.print(Arrays.toString(aSort(arr)));
    }

    public static int[] aSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxInd = j;
                }
            }
            if (i != maxInd) {
                int tmp = arr[i];
                arr[i] = arr[maxInd];
                arr[maxInd] = tmp;

            }
        }
        return arr;
    }
}
