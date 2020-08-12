package by.training_epam.module2.subprogramme;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Factorial {
    public static void main (String [] args){
        int arr[]=new int[9];
        for(int i=0; i<9; i++){
            arr[i]=i+1;
        }
        System.out.print(sumOfFact(arr));
    }

    public static int sumOfFact(int [] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2!=0){
                sum+=fact(arr[i]);
            }
        }
      return sum;
    }

    public static int fact(int a){
        int f=1;
        for(int i=a; i>0; i--){
           f= f*i;
        }
        return f;
    }
}
