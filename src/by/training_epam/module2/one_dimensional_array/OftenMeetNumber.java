package by.training_epam.module2.one_dimensional_array;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

import java.util.Arrays;
import java.util.Scanner;

public class OftenMeetNumber {
    public static void main(String [] args){
        int n= 8;
        int [] arr= new int[n];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int [] copy= Arrays.copyOf(arr, arr.length);

        int [] count= new int[arr.length];
        oftenMeet(arr,count,copy);

    }

    public static void oftenMeet(int [] arr, int [] count, int [] copy) {
        int aCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == copy[j]) {
                    aCount++;
                    count[i]=aCount;
                }
            }
            aCount=0;
        }

        System.out.print(arr[index(count)]);
    }

    public static int index(int [] count){
        int index=0;
        int max=count[0];
        for(int i=0; i<count.length; i++){
            if(count[i]>max){
                max=count[i];
                index=i;

            }
            continue;
        }
        return index;
    }
    }
