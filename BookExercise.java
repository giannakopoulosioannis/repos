
package bookexercise;

    // Additional Classes files are book.java & author.java

public class BookExercise {

   
    public static void main(String[] args) {
    
   Author author = new Author();
   Book book = new Book();
   
  author.setAuthorName("Noah Solloway");
  author.setAuthorEmail("NSoll@gmail.com");
  author.setAuthorGender("Male");
  
  book.setBookName("Descent");
  book.setBookPrice(15.99);
  book.setBookQuantity(1);
  book.setAuthor(author);
  
        System.out.println(author);
        System.out.println(book);
 
    
    }
    
}
