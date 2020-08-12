package by.training_epam.module3.regular_expression;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.


public class WorkWithText {
    public static void main(String[] args) {
        String s = "Конструктор – это специальный метод, который вызывается при создании нового объекта. " +
                "Конструктор инициализирует объект непосредственно во время создания." +
                " Имя конструктора совпадает с именем класса, включая регистр, а по синтаксису конструктор похож " +
                "на метод без возвращаемого значения.";

        System.out.println(s);
        System.out.println("\n---SortedParagraphsByQTTSentence: ");
        System.out.println(getSortedParagraphs(s));
        System.out.println("\n---SortedWordsByLengthIntoSentences: ");
        System.out.println(getSortedWordsByLength(s));
        System.out.println("\n---getSortedLexemsByCharIntoSentence: ");
        System.out.println(getSortedLexemsByChar(s, 0));
    }



    private static String getSortedParagraphs(String string){
        StringBuilder result = new StringBuilder();
        String[] paragraphs = string.split("\\s*(\\n)\\s*");

        int[] qttSentences = new int[paragraphs.length];

        Pattern endOfSentence = Pattern.compile("\\?|!|\\.");

        for (int i = 0; i < qttSentences.length; i++) {
            qttSentences[i] = 0;
            Matcher matcher = endOfSentence.matcher(paragraphs[i]);
            while (matcher.find()){
                qttSentences[i]++;
            }
        }

        int[] order = getSortedOrder(qttSentences);

        for (int i = 0; i < order.length; i++) {
            int sortedPos = order[i];
            result.append(paragraphs[sortedPos]);
        }
        return result.toString();
    }

    private static String getSortedWordsByLength(String string) {
        StringBuilder result = new StringBuilder();
        String[] sentences = string.split("\\s*(\\.|\\?|!)\\s*");
        for (int i = 0; i < sentences.length; i++) {
            String[] sentenceWordsQTT = sentences[i].split("\\W+");
            int[] charsQTT = new int[sentenceWordsQTT.length];

            for (int j = 0; j < charsQTT.length; j++) {
                charsQTT[j] = sentenceWordsQTT[j].length();
            }

            int[] order = getSortedOrder(charsQTT);

            for (int j = 0; j < order.length; j++) {
                result.append(sentenceWordsQTT[order[j]]);
                result.append(" ");
            }
            result.append("\n");
        }
        return result.toString();
    }

    private static String getSortedLexemsByChar(String string,int num){
        StringBuilder result = new StringBuilder();
        String[] sentences = string.split("\\s*(\\.|\\?|!)\\s*");

        String searchedSentence = sentences[num];
        String[] wordsArr = searchedSentence.split("\\W+");

        System.out.println("Enter character for sorting:");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputChar = String.valueOf(reader.readLine().trim().charAt(0));

            Pattern searchedCharPattern = Pattern.compile(inputChar);

            Arrays.sort(wordsArr);
            int[] charsQTT = new int[wordsArr.length];
            for (int i = 0; i < wordsArr.length; i++) {
                charsQTT[i] = 0;
                Matcher matcher = searchedCharPattern.matcher(wordsArr[i]);
                while (matcher.find()) {
                    charsQTT[i]++;
                }
            }

            int[] order = getSortedOrderReversed(charsQTT);

            for (int j = 0; j < order.length; j++) {
                result.append(wordsArr[order[j]]);
                result.append(" ");
            }
            result.append("\n");
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }


    private static int[] getSortedOrder (int[] arr){
        int[] order = new int[arr.length];
        for (int i = 0; i < order.length; i++) {
            order[i] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int tmpIndex = i;
            for (int j = i; j > 0; j--){
                if (arr[j-1] > tmp){
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    order[j] = order[j-1];
                    order[j-1] = tmpIndex;
                }
            }
        }
        return order;
    }

    private static int[] getSortedOrderReversed (int[] arr){
        int[] order = new int[arr.length];
        for (int i = 0; i < order.length; i++) {
            order[i] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int tmpIndex = i;
            for (int j = i; j > 0; j--){
                if (arr[j-1] < tmp){
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    order[j] = order[j-1];
                    order[j-1] = tmpIndex;
                }
            }
        }
        return order;
    }
}

