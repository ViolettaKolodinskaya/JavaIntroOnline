package module4.text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextLogic {

    public String supplementText(){
        String supplement="";
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       try {
           supplement = reader.readLine();
           reader.close();
       }
       catch(IOException e){
           e.printStackTrace();
       }
       return supplement;
    }



    public void printTitle(Text text){
      System.out.println(text.getHeadLine());
    }


    public void printText(Text text){
        System.out.println(text.toString());
    }
}
