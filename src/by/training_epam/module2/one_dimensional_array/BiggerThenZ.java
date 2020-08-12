package by.training_epam.module2.one_dimensional_array;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

public class BiggerThenZ {
    public static int z=5;
    public static void main(String [] args){
        int [] arr={3, 8, 6, 2, 9, 0, 12};
        change(arr);
    }

    public static void change(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>z){
                arr[i]=z;
                count++;
            }
        }
        System.out.println("Количество замен: " + count);
    }
}
