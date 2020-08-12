package by.training_epam.module2.multidimensional_array;

//9.Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class SumOfElementsInTheColumn {
    public static void main(String [] args){
        int [][] arr={{10,78,6,7,8},{8,6,9,6,4},{7,8,9,0,109}};
System.out.print(sum(arr));
    }

    public static int sum(int [][] arr){
        int index=0;
        int max=-1;
        for(int i=0; i<arr[0].length; i++){
            int sum=0;
        for(int j=0; j<arr.length; j++){
            sum+=arr[j][i];
            if(max<sum){
                max=sum;
                index=i;
            }
        }
        }
        return index;
    }
}
