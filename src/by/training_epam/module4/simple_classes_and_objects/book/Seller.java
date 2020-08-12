package module4.book;

public class Seller {
   private String nameOfSeller;
   private Book book;

public Seller(String nameOfSeller){
    this.nameOfSeller=nameOfSeller;

}
public Book getBook(){
    return book;
}

public void setBook(Book book){
    this.book=book;
}

    public void setNameOfSeller(String nameOfSeller) {
        this.nameOfSeller = nameOfSeller;
    }

    public String getNameOfSeller() {
        return nameOfSeller;
    }

    @Override
    public String toString() {
        return "Seller: " + nameOfSeller;
    }
    //метод по вычислению выручки определенного продавца;

}