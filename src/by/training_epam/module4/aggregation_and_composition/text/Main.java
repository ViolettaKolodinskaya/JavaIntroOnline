package module4.text;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Word> words= new ArrayList<>();
        words.add(new Word("Spring"));
        words.add(new Word(" is "));
        words.add(new Word("coming"));
        words.add(new Word("! "));

        ArrayList <Sentence> sentences=new ArrayList<>();
        Form form=new Form();
        form.formList(sentences,words);

        Text text=new Text("Spring",sentences);


        TextLogic logic = new TextLogic();
        logic.printTitle(text);
        logic.printText(text);
        words.add(new Word(logic.supplementText()));
        logic.printText(text);



    }
}