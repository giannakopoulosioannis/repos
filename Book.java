package bookexercise;


public class Book {
    private String bookName;
    private double bookPrice;
    private int bookQuantity;
    private Author author;
    
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    
    public String getBookName(){
        return bookName;
    } 
    
    public void setBookPrice(double bookPrice){
        this.bookPrice = bookPrice;
    }
    
    public Double getBookPrice(){
        return bookPrice;
    }
    
    public void setBookQuantity(int bookQuantity){
        this.bookQuantity = bookQuantity;
    }
    
    public int getBookQuantity(){
        return bookQuantity;
    }
    
    public void setAuthor(Author author){
        this.author=author;
    }
    
    public Author getAuthor(){
        return author;
    }
    
    @Override
    public String toString(){
        return "Book{" + "name= " + bookName + ", price= " + bookPrice + ", quantity= " + bookQuantity + ", author= " + author +'}';
    }
    
    
}
