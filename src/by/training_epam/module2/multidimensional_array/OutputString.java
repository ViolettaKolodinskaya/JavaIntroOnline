package by.training_epam.module2.multidimensional_array;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class OutputString {
    public static void main(String [] args){
        int k=1, p=3;
        int [][] arr={{3,67,89,345,0},{12,34,87,29,3}};
        printStringAndColumn(arr,k,p);
    }

    public static void printStringAndColumn(int [][] arr, int k, int p){

    for (int i = 0; i < arr[k].length; i++) {
        System.out.print(arr[k][i] + "\t");
    }
    System.out.println();
    for(int j=0; j<arr.length; j++){
        System.out.println(arr[j][p]);
    }
}
    }

