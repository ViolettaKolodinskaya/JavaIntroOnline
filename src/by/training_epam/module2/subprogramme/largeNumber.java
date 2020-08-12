package by.training_epam.module2.subprogramme;

// 11.Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class largeNumber {
    public static void main(String [] args){
        long a=675489765674L;
        long b=974204856573L;
        largeNum(a,b);
    }
    public static void largeNum(long a, long b){
        String s=Long.toString(a);
        String s1=Long.toString(b);
        if(s.length()>s1.length()){
            System.out.print("В первом числе больше цифр, чем во втором");
        }
        else if(s1.length()>s.length()){
            System.out.print("Во втором числе больше цифр, чем в первом");
        }
        else{
            System.out.print("В числах равное колличество цифр");
        }
    }
}
