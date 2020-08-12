package module4.book;
/*Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
   метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
   методами. Задать критерии выбора данных и вывести эти данные на консоль.
   Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
   Найти и вывести:
   a) список книг заданного автора;
   b) список книг, выпущенных заданным издательством;
   c) список книг, выпущенных после заданного года.
  */
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Book> book=new ArrayList<>();
        book.add(new Book(1,"Crime and punishment","Dostoevskij","AST",1985,350,45.90,"skin"));
        book.add(new Book(2,"Wor and Peace","Tolstoy","AST",1985,1200,80.90,"skin"));
        book.add(new Book(3,"Alisa","Karrol","AST",1956,250,30.00,"skin"));
        book.add(new Book(4,"Gift","Nabokov","AST",1985,350,15.90,"paper"));
        book.add(new Book(5,"Fight Club","Palanik","AST",1985,350,45.90,"skin"));
        book.add(new Book(6,"Lolita","Nabokov","AST",1985,350,45.90,"skin"));

    Logic logic=new Logic();
    logic.printAuthorBooks(book, "Nabokov");
    logic.printPublishingHouseBooks(book,"AST");
    logic.afterDate(book,1980);
    }
}
