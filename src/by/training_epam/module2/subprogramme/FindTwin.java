package by.training_epam.module2.subprogramme;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.


public class FindTwin {
    public static void main(String[] args) {
     findT(8);
    }

    public static void findT(int a) {
        int[] arr = new int[a+1];
        for (int i = 0; i <=a; i++) {
            arr[i] = a + i;
        }
        print(arr);
    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length-2; i++){
            System.out.println(arr[i] +" "+ arr[i+2]);
        }
    }
}

