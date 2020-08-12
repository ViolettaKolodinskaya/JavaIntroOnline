package by.training_epam.module2.multidimensional_array;

//16.Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,n*n
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

import java.util.Arrays;
import java.util.Random;

public class MagicSquare {
    public static void main(String [] args){
        int n=3;
        int[][] arr=new int[n][n];
        System.out.print(Arrays.deepToString(formMagicSquare(arr,n)));
    }

    public static int[][] formMagicSquare(int [][] arr, int n){


        Random random = new Random();
        int sumD=0;
        int sumD2=0;

        for(int d=0; d<n; d++) {
            arr[d][d] = random.nextInt(n * n) + 1;
            arr[d][n - 1 - d] = random.nextInt(n * n) + 1;
            sumD += arr[d][d];
            sumD2 += arr[d][n - 1 - d];
        }
            if(sumD!=sumD2){

        }



        return arr;
    }
}
