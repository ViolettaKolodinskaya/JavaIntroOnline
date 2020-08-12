package by.training_epam.module2.multidimensional_array;

//5.Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class FormSquareMatrixTask5 {
    public static void main(String [] args){
        int n=6;
        int [][]arr=new int[n][n];
        formMatrix(arr);
    }

    public static void formMatrix(int [][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                arr[i][j]=i+1;
            }
        }
        printMatrix(arr);
    }

    public static void printMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
