package by.training_epam.module3.string_as_an_array_of_char;

//5.Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

import java.util.Arrays;

public class ExtraSpace {

    public static void main(String[] args) {
        System.out.print(newString(" Smoke   on the water, fire   in the sky "));
    }


    public static String newString(String str) {

        char[] chars = str.toCharArray();
        char[] result = new char[chars.length];

        int countSpace = 0;
        int lastIndex = chars.length - 1;
        boolean canAddSpace = false;


        while (chars[lastIndex-1] == ' '){
            lastIndex--;
        }


        for (int i = 0; i < lastIndex; i++) {
            if (chars[i] == ' ') {
                if (canAddSpace){
                    result[i-countSpace] = chars[i];
                    canAddSpace = false;
                }
                else countSpace++;
            }
            else if (chars[i] != ' '){
                result[i-countSpace] = chars[i];
                canAddSpace = true;
            }
        }
        countSpace += chars.length - lastIndex;
        result = minusNToCharLength(result, countSpace);
        return Arrays.toString(result);
    }



        private static char[] minusNToCharLength(char[] input, int n){
        char[] result = new char[input.length-n];
        for (int i = 0; i < input.length-n; i++) {
        result[i] = input[i];
        }
        return result;
        }
        }

