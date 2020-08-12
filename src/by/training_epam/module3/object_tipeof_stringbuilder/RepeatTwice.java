package by.training_epam.module3.object_tipeof_stringbuilder;

//6. Из заданной строки получить новую, повторив каждый символ дважды.

public class RepeatTwice {
    public static void main(String [] args){
        String s="Make it twice";
        System.out.print(twin(s));
    }

    public static String twin(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0; i<s.length()*2; i=i+2){
        sb.insert(i,sb.charAt(i));
        }
        return sb.toString();
    }
}
