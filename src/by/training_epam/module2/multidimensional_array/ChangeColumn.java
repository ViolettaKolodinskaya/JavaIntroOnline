package by.training_epam.module2.multidimensional_array;

//8.В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Arrays;
import java.util.Scanner;

public class ChangeColumn {
    public static void main(String [] args){
        int [][] arr={{5,7,4,9,8,6},{8,56,4,67,3,4},{1,34,5,67,3,89}};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
                   if (n > 0 && n < arr[0].length && k > 0 && k < arr[0].length) {
                System.out.print(Arrays.deepToString(changeC(arr, n, k)));
            }
        }

    public static int[][] changeC(int [][] arr, int n, int k){
        int temp;
        for(int i=0; i<arr.length; i++){
            temp=arr[i][n];
            arr[i][n]=arr[i][k];
            arr[i][k]=temp;
        }
      return arr;
    }
}
