package by.training_epam.module2.multidimensional_array;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int[][] arr = {{4, 89, 56}, {7, 1, 0}, {-56, 90, 4}};
        System.out.print(Arrays.deepToString(sortInAscendingOrder(arr)));
        System.out.print(Arrays.deepToString(sortInDescendingOrder(arr)));
    }


    public static int[][] sortInAscendingOrder(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            boolean bool=false;
            while(!bool) {
                bool = true;
                for (int j = 0; j < arr[i].length-1; j++) {
                    if (arr[i][j] > arr[i][j + 1]) {
                        tmp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = tmp;
                        bool = false;
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] sortInDescendingOrder ( int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int tmp;
            boolean bool=false;
            while(!bool) {
                bool = true;
                for (int j = 0; j < arr[i].length-1; j++) {
                    if (arr[i][j] < arr[i][j + 1]) {
                        tmp = arr[i][j];
                        arr[i][j] = arr[i][j + 1];
                        arr[i][j + 1] = tmp;
                        bool = false;
                    }
                }
            }

        }
        return arr;
    }
}
