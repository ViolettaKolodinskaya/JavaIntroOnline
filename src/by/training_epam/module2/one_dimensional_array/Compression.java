package by.training_epam.module2.one_dimensional_array;

//10.Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Compression {
    public static void main(String [] args){
        int [] arr={2,4, 6, 7, 5, 3,9};
        compression(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void compression(int[]arr){
        int num=arr.length-aLength(arr);
        for(int i=0; i<num; i++){
                arr[i]=arr[2*(i)];
            }

        for(int i =num; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    public static int aLength(int [] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(i%2!=0){
                count+=1;
            }
        }
       return count;
    }
}
