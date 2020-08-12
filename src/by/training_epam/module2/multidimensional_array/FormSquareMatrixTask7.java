package by.training_epam.module2.multidimensional_array;

//Сформировать квадратную матрицу порядка N по правилу:A[I,J]=sin((Math.pow(I,2)-Math.pow(J,2))/N)
// и подсчитать количество положительных элементов в ней.

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class FormSquareMatrixTask7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] arr = new double[n][n];
        System.out.println(formMatrix(arr, n));
    }

    public static int formMatrix(double[][] arr, int n) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sin((Math.pow(i, 2) - Math.pow(j, 2)) / n);
                if (arr[i][j] > 0) {
                    count++;
                }
            }
        }
        printMatrix(arr);
        return count;
    }

    public static void printMatrix(double[][] arr) {
        System.out.println(Arrays.deepToString(arr));
    }
}