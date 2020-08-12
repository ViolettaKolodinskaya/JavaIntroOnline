package by.training_epam.module2.multidimensional_array;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FormRandomMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if (m > 0 && n > 0 && m > n) {
            int[][] arr = new int[m][n];
            System.out.println(Arrays.deepToString(formMatrix(arr, m, n)));
        }
    }


    public static int[][] formMatrix(int[][] arr, int m, int n) {
        Random random = new Random();
         int count;
        for (int j = 0; j < n; j++) {
              do{
                  count = 0;
                   for (int i = 0; i < m; i++) {
                       arr[i][j] = random.nextInt(2);
                       if (arr[i][j] == 1) {
                           count++;
                       }
                   }
               }
                   while(count!=j);
           }

            return arr;

    }
}