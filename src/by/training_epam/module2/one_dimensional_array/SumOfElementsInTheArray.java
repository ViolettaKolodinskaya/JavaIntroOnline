package by.training_epam.module2.one_dimensional_array;

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class SumOfElementsInTheArray {
    public static int k=2;
    public static void main (String [] args){
        int [] ar={4, 8, 9, 15, 32};
        sumOfElements(ar);
    }

    public static void sumOfElements(int [] ar){
        int sum=0;
        for(int i=0; i<ar.length; i++){
            if(ar[i]%k==0){
                sum+=ar[i];
            }
        }
        System.out.println("Сумма элементов кратных k: " + sum);

    }
}
