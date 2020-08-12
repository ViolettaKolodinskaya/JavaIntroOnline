package by.training_epam.module2.subprogramme;

//5.Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива, но больше всех других элементов).

public class SecondNumber {
    public static void main (String [] args){
        int [] arr={8, 35, 78, 30, 709, 608, 2, 708};
        System.out.print(secondN(arr));
    }

    public static int secondN(int [] arr){
        int sec=arr[0];
       for(int i=0; i<arr.length; i++){
           if(arr[i]<max(arr)&&arr[i]>sec){
               sec=arr[i];
           }
       }
return sec;
    }

    public static int max(int [] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
//или можно просто отсортировать массив по убыванию и вывести число по индексу.


