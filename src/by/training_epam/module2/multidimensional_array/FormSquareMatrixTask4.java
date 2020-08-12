package by.training_epam.module2.multidimensional_array;

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import java.util.Arrays;

public class FormSquareMatrixTask4 {
    public static void main(String[] args) {
        int n = 6;
        int arr[][] = new int[n][n];
        System.out.print(Arrays.deepToString(formMatrix(arr)));
    }

    public static int[][] formMatrix(int[][] arr) {
        int num = 1;
        int reverse=6;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i%2!=0){
                    arr[i][j]=reverse;
                    reverse--;
                }
                else{
                arr[i][j] = num;
                num++;
            }
            }
            num=1;
            reverse=6;
        }
        return arr;
    }
}