package module4.text;

//1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести на
//консоль текст, заголовок текста.

import java.util.ArrayList;
import java.util.Objects;

public class Text {
    private String headLine;
    ArrayList <Sentence> sentences;

    public Text(String headLine,ArrayList <Sentence> sentences){
        this.headLine=headLine;
        this.sentences=sentences;
    }

    public void setHeadLine(String headLine) {
        this.headLine = headLine;
    }

    public void setSentences(ArrayList <Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getHeadLine() {
        return headLine;
    }

    public ArrayList<Sentence> getSentence() {
        return sentences;
    }

    @Override
    public int hashCode() {
        return Objects.hash(headLine, sentences);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj==null||getClass()!=obj.getClass()){
            return false;
        }
        Text text=(Text) obj;
        return headLine==text.headLine &&
                sentences==text.sentences;
    }

    @Override
    public String toString() {
        String result="";
        for (int i = 0; i < sentences.size() - 1; i++) {
           result+= sentences.get(i).toString();
        }

            return headLine + result;
        }
}
