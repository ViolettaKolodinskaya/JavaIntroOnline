package by.training_epam.module2.subprogramme;

//1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел.

public class CommonDivisor {
    public static void main(String[] args) {
        System.out.print(commonDivisor(16,36));

    }

    public static int commonDivisor(int a, int b ) {
        int count=0;
        int [] arr= new int[a>b? b : a];
        for (int i = 2; i < (a>b? b : a); i++) {
            if (a % i == 0 && b % i == 0) {
                    arr[count]=i;
                    count+=1;
                }
            }
       return max(arr);

    }

    public static int min(int [] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
           if(arr[i]<min){
               min=arr[i];
           }
        }
        return min;
    }

    public static int max(int [] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


}
