package by.training_epam.module1.cycle;

//6.Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Accordance {
    public static void main(String [] args){
        for (int i = 0; i < 256; i++) {
            System.out.printf("%d - %s\n", i, (char) i);
        }
    }
}
