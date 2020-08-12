package by.training_epam.module3.object_tipeof_stringbuilder;

//7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde
//def", то должно быть выведено "abcdef".

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateCharacters {
    public static void main(String [] args){
        String s;
        try{ BufferedReader reader=new BufferedReader (new InputStreamReader(System.in));
         s=reader.readLine();
           reader.close();
            System.out.print(newString(s));
       }
       catch(IOException e){
           e.printStackTrace();
       }
    }

    public static String newString(String s){
        s=s.replace(" ","");
        StringBuilder sb=new StringBuilder(s);
        for(int k=0; k<sb.length()-1; k++) {
            for (int j =sb.length()-1; j>k; j--) {
                if (sb.charAt(k) == sb.charAt(j)) {
                    sb.delete(j, j + 1);
                }
            }
        }
        return sb.toString();
    }
}
