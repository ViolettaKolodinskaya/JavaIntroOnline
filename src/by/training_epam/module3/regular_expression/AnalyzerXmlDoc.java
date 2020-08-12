package by.training_epam.module3.regular_expression;

 //2. Дана строка, содержащая текст(xml-документ). Напишите анализатор,
// позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для
// решения данной задачи нельзя.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalyzerXmlDoc {
    public static void main(String[] args) {
        String s = "<notes>\n" +
                "\t<note id = \"1\">\n" +
                "\t\tto>Вася</to>\n" +
                "\t\t<from>Света</from>\n" +
                "\t\t<heading>Напоминание</heading>\n" +
                "\t\t<body>Позвони мне завтра!</body>\n" +
                "\t</note>\n" +
                "\t<note id = \"2\">\n" +
                "\t\t<to>Петя</to>\n" +
                "\t\t<from>Маша</from>\n" +
                "\t\t<heading>Важное напоминание</heading>\n" +
                "\t\t<body/>\n" +
                "\t</note>\n" +
                "</notes>";
        parseXML(s);

    }

    private static void parseXML(String xml) {
        String openBodyCloseTags = "(?<openTag><[^/].*?>)(?<body>.*)(?<closeTag><[/].*?>)";
        String onlyOpenTags = "(?<onlyOpenTag><[^/].*?>)";
        String onlyCloseTags = "(?<onlyCloseTag><[/].*?>)";
        String onlyEmptyTag = "(?<onlyEmptyTag><.*?[/]>)";

        Pattern tagPattern = Pattern.compile(openBodyCloseTags + "|" + onlyOpenTags + "|"
                + onlyCloseTags + "|" + onlyEmptyTag);
        Matcher matcher = tagPattern.matcher(xml);
        while (matcher.find()) {
            if (matcher.group("body") != null) {
                System.out.println("Open tag is: " + matcher.group("openTag")
                        + " Body is: " + matcher.group("body")
                        + " Close tag is: " + matcher.group("closeTag"));
            } else if (matcher.group("onlyOpenTag") != null) {
                System.out.println("Open tag is: " + matcher.group("onlyOpenTag"));
            } else if (matcher.group("onlyCloseTag") != null) {
                System.out.println("Close tag is: " + matcher.group("onlyCloseTag"));
            } else if (matcher.group("onlyEmptyTag") != null) {
                System.out.println("Tag without body is: " + matcher.group("onlyEmptyTag"));
            }
        }
    }
}


