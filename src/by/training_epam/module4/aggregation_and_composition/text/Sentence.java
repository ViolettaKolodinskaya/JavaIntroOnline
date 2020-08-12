package module4.text;

import java.util.ArrayList;
import java.util.Objects;

public class Sentence {
   private ArrayList<Word> words;

    public Sentence(ArrayList <Word> words){
        this.words=words;
    }

    public void setWords(ArrayList <Word> words) {
        this.words = words;
    }

    public ArrayList <Word> getWords() {
        return words;
    }

    @Override
    public String toString() {
        return words.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }
}
