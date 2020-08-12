package by.training_epam.module3.string_as_an_array_of_char;

//4.В строке найти количество чисел.

public class NumberOfNumbers {
   public static void main(String [] args){
       System.out.print(countOfNumbers("asgc6bainsk l234 jll 56 hbnk 9 jkl 456 89"));
   }

   public static int countOfNumbers(String str){
       char [] chars=str.toCharArray();
       int count=0;
       for(int i=0; i<chars.length-1; i++){
          if(Character.isDigit(chars[i])&&!Character.isDigit(chars[i+1])){
              count++;}
          }
       if(Character.isDigit(chars[chars.length-1])){
           count++;
       }
       return count;
   }
}
