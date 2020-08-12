package by.training_epam.module3.object_tipeof_stringbuilder;

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Spacing {
    public static void main(String[] args) {
        String s = " Oy, Oy, you'd better        stop...";
        System.out.print(soMuchSpace(s));
    }

    public static int soMuchSpace(String s) {
        int maxSpaces = 0;
        int ind = -1;
        while (ind < s.length() && (ind = s.indexOf(" ", ++ind)) > -1) {
            int count = 1;

            while (ind < s.length() - 1 && s.charAt(++ind) == ' ') {
                count++;
            }

        maxSpaces = (count > maxSpaces) ? count : maxSpaces;

    }
        return maxSpaces;
    }
}

