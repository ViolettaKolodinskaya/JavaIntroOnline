package by.training_epam.module2.sort;

// 2. Даны две последовательности
// a1<=a2<=...<=an и b1<=b2<=...<=bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Дополнительный массив не использовать.

import java.util.Arrays;


public class SortedInAscendingOrder {
    public static void main (String [] args){
        int [] arr={2,4,6,8,10};
        int [] arr2={1,3,5,8,7,9};
        int [] newArr= new int[arr.length+arr2.length];

        System.out.print(Arrays.toString(inAscendingOrder(arr,arr2,newArr )));
    }

    public static int [] inAscendingOrder(int [] arr, int [] arr2, int [] newArr ){
        System.arraycopy(arr,0,newArr,0, arr.length);
        System.arraycopy(arr2, 0, newArr, arr.length, arr2.length);
       // Arrays.sort(newArr);

            for(int i = newArr.length-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++){

            if( newArr[j] > newArr[j+1] ){
                int tmp = newArr[j];
                newArr[j] = newArr[j+1];
                newArr[j+1] = tmp;
            }
        }
    }

        return newArr;
    }
}
