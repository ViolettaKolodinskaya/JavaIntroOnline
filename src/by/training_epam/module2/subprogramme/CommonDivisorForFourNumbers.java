package by.training_epam.module2.subprogramme;

//2.Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class CommonDivisorForFourNumbers {
    public static void main (String [] args){
        System.out.print(commonDivisor(16,32,64,128));
    }

    public static int commonDivisor(int a, int b, int c, int d){
        int count=0;
        int min=Math.min(Math.min(a,b),Math.min(c,d));
        int [] arr=new int[min];
        for(int i=1; i<min; i++){
            if(a%i==0&&b%i==0&&c%i==0&&d%i==0){
        arr[count]=i;
        count+=1;
            }
        }
     return max(arr);
}

public static int max(int[] arr){
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
           if(arr[i]>max){
               max=arr[i];
           }
        }
        return max;
    }
}
