package by.training_epam.module3.object_tipeof_stringbuilder;

//2. В строке вставить после каждого символа 'a' символ 'b'.

public class InsertB {
    public static void main(String [] args){
        String s="any time I look around";
        System.out.print(insertB(s));
    }

    public static String insertB(String s){
        s = s.replaceAll("a", "ab");
        return s;
    }
}
