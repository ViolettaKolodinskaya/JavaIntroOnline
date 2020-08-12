package by.training_epam.module3.string_as_an_array_of_char;

//3.В строке найти количество цифр.

public class NumberOfDigits {
    public static void main(String [] args){
        System.out.print(countNum("string 12 booms 78 cat 9 dog 900soap"));
    }

    public static int countNum(String str){
        char [] num= str.toCharArray();
        int count=0;
        for(int i=0; i<num.length; i++){
           if(Character.isDigit(num[i])){
             count+=1;
           }
        }
        return count;
    }
}
