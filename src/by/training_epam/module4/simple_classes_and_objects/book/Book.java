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

import java.util.Objects;

public class Book {
    private static int idCounter=1;
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int publicationDate;
    private int numberOfPages;
    private double price;
    private String binding;

    private Seller seller;

    public Book(){
        this.id=idCounter++;
        this.title="";
        this.author="";
        this.publishingHouse="";
        this.publicationDate=0;
        this.numberOfPages=0;
        this.price=0;
        this.binding="";

    }

    public Book(int id, String title, String author, String publishingHouse, int publicationDate, int numberOfPages, double price, String binding){
        this.id=id;
        this.title=title;
        this.author=author;
        this.publishingHouse=publishingHouse;
        this.publicationDate=publicationDate;
        this.numberOfPages=numberOfPages;
        this.price=price;
        this.binding=binding;
    }
public Seller getSeller(){
        return seller;
}

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void setIdCounter(int idCounter) {
        Book.idCounter = idCounter;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,title,author,publishingHouse,publicationDate,numberOfPages,price,binding);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publicationDate=" + publicationDate +
                ", numberOfPages=" + numberOfPages +
                ", price=" + price +
                ", binding='" + binding +
                '\'' + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null||getClass()!=obj.getClass()) return false;
        Book book=(Book) obj;
        return id == book.id &&
                publicationDate == book.publicationDate &&
                numberOfPages== book.numberOfPages &&
                price == book.price &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                publishingHouse.equals(book.publishingHouse) &&
                binding == book.binding;
    }

}


