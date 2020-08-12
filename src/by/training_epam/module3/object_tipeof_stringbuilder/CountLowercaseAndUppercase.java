package by.training_epam.module3.object_tipeof_stringbuilder;

//9. Посчитать количество строчных(маленьких) и прописных(больших) букв в введенной строке.
// Учитывать только английские буквы.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountLowercaseAndUppercase {

    public static void main(String[] args){
        String s="";
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        try{
            s=reader.readLine();
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Количество прописных латинских букв в строке: " + countUppercaseLetters(s));
        System.out.println("Количество строчных латинских букв в строке: " + countLowercaseLetter(s));
    }

    public static int countUppercaseLetters(String s) {
        int count = 0;
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }

            return count;
        }



    public static int countLowercaseLetter(String s){
        int count=0;
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
