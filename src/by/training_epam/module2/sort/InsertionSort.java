package by.training_epam.module2.sort;

//5. Сортировка вставками. Дана последовательность чисел. Требуется переставить числа в порядке возрастания.
// Делается это следующим образом. Пусть a1, a2 ... ai - упорядоченная последовательность, т. е.
//a1 < a2 < ... < an. Берется следующее число a(i + 1) и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;

public class InsertionSort {
    public static void main(String [] args){
        int [] arr={87, 45, 35, 12, 3, 108, 180};
        System.out.print(Arrays.toString(aSort(arr)));

    }

    public static int [] aSort(int [] arr) {

        int index = 0;
        int[] resultArray = new int[arr.length];
        resultArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++, index++) {
            int insertIndex = binarySearch(resultArray, index, arr[i]);
            if (insertIndex == i) resultArray[i] = arr[i];
            else arrayIndexShift(resultArray, insertIndex, arr[i], index);
        }
        return resultArray;
    }


    public static int binarySearch(int[] resultArray, int maxIndex, int item) {
        int index;
        int searchIndex=0;
        int first = 0;
        int last = maxIndex;

        if (first == last) {
            if (resultArray[first] <= item)
                searchIndex=first + 1;
            else searchIndex=first;
        }

        while (first <= last) {
            index = (first + last) / 2;
            if (item > resultArray[index]) {
                first = index + 1;
            } else if (item < resultArray[index]) {
                last = index - 1;
            } else searchIndex=index;
        }

        if (last - first <= 1)
            searchIndex= first;

        return searchIndex;

    }



    public static void arrayIndexShift(int[] array, int pasteIndex, int value, int maxIndex) {
        for (int i = maxIndex + 1; i > pasteIndex; i--, maxIndex--) {
            array[i] = array[maxIndex];
        }
        array[pasteIndex] = value;
    }


}
