package by.training_epam.module3.object_tipeof_stringbuilder;

//8.Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
//длинных слов может быть несколько, не обрабатывать.

public class TheLongestWord {
    public static void main(String[] args) {

        longestWord("horse elephant dog mouse fox");
    }

    public static void longestWord(String s) {
        int maxEnd = 0;
        int maxBegin = 0;
        int maxLength = 0;
        int firstChar = 0;
        int lastChar = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                lastChar = i;
                if (maxLength < (lastChar - firstChar)) {
                    maxLength = lastChar - firstChar;
                    maxEnd = lastChar;
                    maxBegin = firstChar;
                }
            }
        }
        System.out.println(maxBegin + " " + maxEnd + " " + firstChar+ " " + maxLength);
    }

    //public static void printWords(int fistIndex, int lastIndex, String s)
}
