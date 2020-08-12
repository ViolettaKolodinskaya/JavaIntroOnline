package module4.text;

import java.util.ArrayList;

public class Form {

   public ArrayList<Sentence> formList(ArrayList <Sentence> sentences, ArrayList <Word> words){
       int index=0;
       for(int i=0; i<words.size(); i++){
           sentences.add(index, new Sentence(words));
           if(words.get(i).getWord().equals(".")||words.get(i).getWord().equals("!")||words.get(i).getWord().equals("?")){
               index++;
           }

       }

       return sentences;
   }
}
