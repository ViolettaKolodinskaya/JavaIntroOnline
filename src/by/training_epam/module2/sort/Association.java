package by.training_epam.module2.sort;

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.


import java.util.Arrays;

public class Association {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {67, 3, 2, 34, 5, 1, 0,99,100};
        int[] arr2 = {7, 90, 7, 45};
        int[] newArr = new int[arr.length + arr2.length];
        System.out.print(Arrays.toString(association(arr, arr2, newArr, k)));
    }

    public static int[] association(int[] arr, int[] arr2, int[] newArr, int k) {
        //System.arraycopy(arr,0,newArr,0,k+1);
        //System.arraycopy(arr2,0,newArr,k+1, arr2.length);
        //System.arraycopy(arr,k+1, newArr,k+1+arr2.length, arr.length-(k+1));
        for (int i = 0; i < newArr.length; i++) {
            if (i <= k) {
                newArr[i] = arr[i];
            } else if (i > k && i < arr2.length + k + 1) {
                newArr[i] = arr2[i-(k+1)];
            } else if(i>arr2.length+k){
                newArr[i] = arr[i-arr2.length];
            }
        }
        return newArr;
    }
}
