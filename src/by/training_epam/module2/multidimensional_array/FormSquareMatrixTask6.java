package by.training_epam.module2.multidimensional_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class FormSquareMatrixTask6 {
    public static void main(String [] args){
        int n=10;
        int[][] arr= new int[n][n];
        formSMatrix(arr);
    }

    public static void formSMatrix(int [][] arr){
        for(int i=0; i<arr.length; i++) {
            if (i < arr.length / 2) {
                for (int j = i; j < arr.length - i; j++) {
                    arr[i][j] = 1;
                }
            }
            if (i >= arr.length / 2) {
                for (int j =arr.length-i-1; j<i+1; j++){
                    arr[i][j]=1;
                }
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
