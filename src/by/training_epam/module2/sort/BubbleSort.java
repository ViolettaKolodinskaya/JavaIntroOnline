package by.training_epam.module2.sort;

//4.Сортировка обменами. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
// Для этого сравниваются два соседних числа. Если ai > ai+1, то делается перестановка. Так продолжается до тех пор,
// пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
        int [] arr={ 6, 8, 56, 34, 2, 12, 101};
        int count=0;
        System.out.print(Arrays.toString(aSort(arr, count)));
    }
    public static int []  aSort(int [] arr, int count){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                    count+=1;
                }
            }
        }
        System.out.println(count);
return arr;

    }

}
