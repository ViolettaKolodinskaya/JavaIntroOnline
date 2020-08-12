package module4.book;

import java.util.ArrayList;

public class Logic {
    public void printAuthorBooks(ArrayList<Book> book, String author) {
        System.out.println("Author: "+ author + ", Books: ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getAuthor().equals(author)) {
                System.out.println(" \"" + book.get(i).getTitle() +"\"");
            }
        }
    }

    public void printPublishingHouseBooks(ArrayList<Book> book, String publishingHouse) {
        System.out.println("Publishing House: " + publishingHouse+ ", Books: ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getPublishingHouse().equals(publishingHouse)) {
                System.out.println(book.get(i).getAuthor() + ", \"" + book.get(i).getTitle() +"\"");
            }
        }
    }

    public void afterDate(ArrayList<Book> book, int date) {
        System.out.println("Books released after "+ date + ": ");
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getPublicationDate() > date) {
                System.out.println(book.get(i).getAuthor()+ ", \"" + book.get(i).getTitle() +"\"");
            }
        }
    }
}
