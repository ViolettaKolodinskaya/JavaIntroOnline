package by.training_epam.module2.one_dimensional_array;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

public class ChangeElement {
    public static void main (String[] args){
        int [] arr={24, 46, 2, 98, 13, 5};
        changeMaxMin(arr);
        print(arr);
    }
    public static void changeMaxMin( int [] arr){
        int maxIndex=0;
        int minIndex=0;
        int min=arr[0];
        int max = arr[0];
        for(int i=0; i<arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex=i;
            }
            else if (arr[i] > max) {
                max = arr[i];
                maxIndex=i;
            }
        }
           int tempMin=min;
            arr[minIndex]=max;
            arr[maxIndex]=tempMin;

    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
