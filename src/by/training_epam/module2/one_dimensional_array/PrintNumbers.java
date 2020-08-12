package by.training_epam.module2.one_dimensional_array;

//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class PrintNumbers {
    public static void main(String [] args){
        int [] arr={-4,8,15, 3, 2, 0};
        printNum(arr);
    }

    public static void printNum(int [] arr){
for(int i=0; i<arr.length; i++){
    if(arr[i]>i){
        System.out.print(arr[i] + " ");
    }
}
    }
}
