package desafiolab3;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Author {
   private String name;
   List<Book> books = new ArrayList();

   public Author(String name) {
      this.name = name;
   }

   public void addBook(Book book, String title, double price) {
      this.books.add(book);
   }

   public void getListOfBooks() {
      if (this.books.isEmpty()) {
         System.out.println("This author does not have any books saved yet.");
      } else {
         System.out.println("Books of " + this.name + ": ");
         Iterator var2 = this.books.iterator();

         while(var2.hasNext()) {
            Book book = (Book)var2.next();
            PrintStream var10000 = System.out;
            String var10001 = book.getTitle();
            var10000.println("Title: " + var10001 + ", Price: " + book.getPrice());
         }
      }

   }

   public List<Book> getBooks() {
      return this.books;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setBooks(List<Book> books) {
      this.books = books;
   }
}