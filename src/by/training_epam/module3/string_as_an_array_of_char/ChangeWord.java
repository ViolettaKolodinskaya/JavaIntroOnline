package by.training_epam.module3.string_as_an_array_of_char;

//2. Замените в строке все вхождения 'word' на 'letter'.

public class ChangeWord {
    public static void main(String[] args) {
        System.out.println(replace("words books word sentence"));
    }

    public static String replace(String str) {
        char[] word = { 'w', 'o', 'r', 'd' };
        char[] ch = str.toCharArray();
        String newString = "";
        int i = 0;
        while (i < ch.length) {
            if (ch[i] == word[0]) {
                for (int j = 1; j < word.length; j++) {
                    if (ch[i + j] != word[j]) {
                        break;
                    }
                    else {
                        newString = newString + "letter";
                        i = i + word.length;
                        continue;
                    }
                }
            }

            newString = newString + ch[i];
            i++;
        }
        return newString;
    }
}

