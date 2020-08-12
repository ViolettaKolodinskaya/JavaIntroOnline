package by.training_epam.module2.multidimensional_array;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Arrays;

public class SortColumn {
    public static void main(String[] args){
        int[][] arr = {{4, 89, 56}, {7, 1, 0}, {-56, 90, 4}};
        System.out.print(Arrays.deepToString(inAscendingOrder(arr)));
        System.out.print(Arrays.deepToString(inDescendingOrder(arr)));
    }


    public static int[][] inAscendingOrder(int[][] arr) {
        for (int j = 0; j < arr[0].length; j++) {
            int tmp;
            boolean bool=false;
            while(!bool) {
                bool = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i][j] > arr[i+1][j]) {
                        tmp = arr[i][j];
                        arr[i][j] = arr[i+1][j];
                        arr[i+1][j] = tmp;
                        bool = false;
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] inDescendingOrder ( int[][] arr){
        for (int j = 0; j < arr[0].length; j++) {
            int tmp;
            boolean bool=false;
            while(!bool) {
                bool = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if (arr[i][j] < arr[i+1][j]) {
                        tmp = arr[i][j];
                        arr[i][j] = arr[i+1][j];
                        arr[i+1][j] = tmp;
                        bool = false;
                    }
                }
            }

        }
        return arr;
    }
}

