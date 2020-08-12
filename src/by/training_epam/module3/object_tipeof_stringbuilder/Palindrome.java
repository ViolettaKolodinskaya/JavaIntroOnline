package by.training_epam.module3.object_tipeof_stringbuilder;

//3. Проверить, является ли заданное слово палиндромом.

public class Palindrome {
    public static void main(String [] args){
        String s="кабак";
        System.out.print(isPalindrom(s));
    }

    public static boolean isPalindrom(String s){
        if (s == null)
            return false;
        StringBuilder str= new StringBuilder(s);
          return s.toLowerCase().equals(str.reverse().toString().toLowerCase());
    }
}
