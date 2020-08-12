package by.training_epam.module2.multidimensional_array;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

import java.util.Arrays;

public class MatrixOfRandomNumber {
    public static void main(String[] args){
        int [][] arr=new int [10][20];
        System.out.print(Arrays.deepToString(formMatrix(arr))+"\n");
        printNumberOfStrings(arr);
    }
    public static int[][] formMatrix(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*15);
            }
        }
      return arr;
    }

    public static void printNumberOfStrings(int [][] arr){
        for(int i=0; i<arr.length; i++){
            int count=0;
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]==5){
                    count++;
                    if(count>=3){
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }
}
