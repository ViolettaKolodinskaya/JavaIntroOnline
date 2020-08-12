package by.training_epam.module3.object_tipeof_stringbuilder;

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class MakeACake {
    public static void main(String [] args){
        String s="информатика";
        System.out.print(makeACake(s));
    }

    public static String makeACake( String s){
        StringBuilder cake=new StringBuilder();
        cake.append(s.charAt(7))
        .append(s.charAt(3))
        .append(s.charAt(4))
                .append(s.charAt(7));
        return cake.toString();
    }
}
