package by.training_epam.module2.sort;

//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai < ai+1,
//то продвигаютсяна один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются
// на один элемент назад.Составить алгоритм этой сортировки.

import java.util.Arrays;

public class ShellSort {
    public static void main(String [] args){
        int [] arr={87, 45, 35, 12, 3, 108, 180};
        System.out.print(Arrays.toString(sort(arr)));

    }

    public static int[] sort(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            shellSort(array, h);
            h = h/3;
        }
        return array;
    }

    private static void shellSort(int[] array, int h) {
        for (int i = h; i < array.length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h])
                    swap(array, j, j - h);
                else
                    break;
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
