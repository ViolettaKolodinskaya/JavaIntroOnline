package by.training_epam.module2.multidimensional_array;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

public class
FindPositiveElement {
    public static void main(String[] args){
        int [][]arr={{3,-5,8,9},
                    {7,-29,-76,0},
                    {89,-6,56,1},
                    {-90,6,3,-9}};
        findElements(arr);
    }

    public static void findElements(int [][] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i][i]>0){
                System.out.print(arr[i][i]+" ");
            }
        }
    }
}
