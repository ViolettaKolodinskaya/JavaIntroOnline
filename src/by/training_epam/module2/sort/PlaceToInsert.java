package by.training_epam.module2.sort;

//7. Пусть даны две неубывающие последовательности действительных чисел.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//в первую последовательность так, чтобы новая последовательность оставалась возрастающей.


import java.util.Arrays;

public class PlaceToInsert {
    public static void main(String[] args) {
        int[] arr = {3, 5, 5, 12, 14, 78, 80};
        int[] arr2 = {0, 2, 4, 7, 7, 90, 100};
        System.out.println(Arrays.toString(newSequence(arr, arr2)));

    }


    public static int[] newSequence(int[] arr, int[] arr2) {
        int[] newArr = new int[arr.length + arr2.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.out.println(Arrays.toString(newArr));
        for (int j = 0; j < arr2.length; j++) {
            searchIndexAndInsert(newArr, arr2[j], j, arr.length);
        }

        return newArr;
    }


    public static int[] searchIndexAndInsert(int[] newArr, int item, int j, int arrLength) {
        int searchIndex = 0;
        for (int i = 0; i < newArr.length; i++) {

            if (item <= newArr[i]) {
                searchIndex = i;
                moveRight(newArr, searchIndex);
                newArr[i] = item;
                break;
            }

            else{
                newArr[arrLength+j]=item;
            }

        }
        return newArr;
    }



    private static int[] moveRight(int[] newArr, int searchIndex) {
        for (int i = newArr.length-1; i>searchIndex; i--) {
            newArr[i]=newArr[i-1];
        }
return newArr;
    }
}