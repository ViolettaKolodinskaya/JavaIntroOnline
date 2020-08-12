package by.training_epam.module3.object_tipeof_stringbuilder;

//5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class MeetA {
    public static void main(String [] args){
        String s="fgha aajhjka aokjaaa";
        System.out.print(countA(s));
    }

    public static int countA(String s){
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
              count+=1;
            }
        }
        return count;
    }
}
