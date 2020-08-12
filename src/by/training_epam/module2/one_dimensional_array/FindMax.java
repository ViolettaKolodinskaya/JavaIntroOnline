package by.training_epam.module2.one_dimensional_array;

//7. Даны действительные числа (a1, a2...a2n). Найти FindMax(a1 + a2n,  a2 + a2n−1,...  an + an+1).

public class FindMax {
    public static void main(String [] args) {
        int[] arr = {6, 9, 34, 8, 323, 9, 78, 1111};
        System.out.print(max(arr));
    }

    public static int max(int [] arr){
        int max=arr[0]+arr[arr.length-1];
        for(int i=0; i<arr.length/2; i++){
            if(arr[i]+arr[arr.length-(1+i)]>max){
                max=arr[i]+arr[arr.length-(1+i)];
            }
        }
        return max;
    }
}
