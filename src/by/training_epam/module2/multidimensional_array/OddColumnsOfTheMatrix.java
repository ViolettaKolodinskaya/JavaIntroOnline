package by.training_epam.module2.multidimensional_array;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class OddColumnsOfTheMatrix {
    public static void main(String[] args) {
        int[][] arr = {{3, 51, 7, 99, 0}, {4, 5, 8, 90, 1}, {7, 56, 90, 3, 45}, {34, 6, 78, 6, 56,}, {6, 12, 32, 10, 93}};
        printOddColumns(arr);
    }

    public static void printOddColumns(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j = j + 2) {
                if (arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}