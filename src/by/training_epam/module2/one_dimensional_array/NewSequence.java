package by.training_epam.module2.one_dimensional_array;

//8.Дана последовательность целых чисел (a1, a2...a2n).
//Образовать новую последовательность, выбросив из данной min(a1, a2,...an).

public class NewSequence {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 12, 90, 56, 1, 87};
        newArray(arr,min(arr));
    }

    public static void newArray(int [] arr, int min) {
        int [] newAr= new int [arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                newAr[sum += 1] =  arr[i];
            }
        }
        print(newAr);
    }

    public static void print(int [] newAr){
        for(int i=0; i<newAr.length; i++){
            System.out.print(newAr [i] + " ");
        }
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}