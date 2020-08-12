package by.training_epam.module2.multidimensional_array;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

import java.util.Arrays;

public class MaxElementOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 34, 56, 90, 3}, {34, 76, 39, 2, 1}, {4, 78, 60, 6, 0}};
        System.out.print(Arrays.deepToString(changeOddElements(arr)));
    }

    public static int[][] changeOddElements(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0 && arr[i][j] != 0) {
                    arr[i][j] = findMax(arr);
                }
            }
        }
        return arr;
    }

    public static int findMax(int[][] arr) {
        int max = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
