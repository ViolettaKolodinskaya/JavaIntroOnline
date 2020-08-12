package by.training_epam.module3.object_tipeof_stringbuilder;

//10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
//знаком. Определить количество предложений в строке X.

public class NumberOfSentences {
    public static void main(String [] args){
        System.out.print(countS("It's a new day! It's a new life! And i'm feeling good."));
    }

    public static int countS(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='!'||s.charAt(i)=='?'||s.charAt(i)=='.'){
               count+=1;
           }
        }
        return count;
    }
}
/* Код не сработал бы с предложением, которое заканчивается многоточием. Но в условии этого нет, поэтому такой вариант
и не рассматривала.*/
