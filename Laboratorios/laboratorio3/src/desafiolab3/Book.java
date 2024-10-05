package desafiolab3;

public class Book {
   private String title;
   private Author author;
   private double price;

   public Book(String title, Author author, double price) {
      this.title = title;
      this.author = author;
      this.price = price;
   }

   public String getInfo() {
      String var10000 = this.title;
      return "Titulo: " + var10000 + ", Autor: " + this.author.getName() + ", Price: " + this.price;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public Author getAuthor() {
      return this.author;
   }

   public void setAuthor(Author author) {
      this.author = author;
   }

   public double getPrice() {
      return this.price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}