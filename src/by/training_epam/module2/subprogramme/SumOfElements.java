package by.training_epam.module2.subprogramme;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
//массива с номерами от k до m.


public class SumOfElements {
    public static void main(String [] args){
        int [] arr={7, 9, 23, 56, 48, 39, 5, 1, 3, 7, 16};
        int a=3, b=5;
        System.out.print(sum(arr, a, b));
    }
    public static int sum(int [] arr, int a, int b){
        int sum=0;
        for(int i=a; i<b+1; i++){
           sum+=arr[i];
        }
      return sum;
    }
}
