package desafiolab3;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      System.out.println("---Books store---");
      menu();
   }

   static void menu() {
      Scanner in = new Scanner(System.in);
      ListOfAuthors list = new ListOfAuthors();

      Integer option;
      do {
         System.out.println("1.-Add an author.");
         System.out.println("2.-Search for an author.");
         System.out.println("3.-Show list of authors.");
         System.out.println("4.-Exit.");
         option = in.nextInt();
         in.nextLine();
         switch(option) {
         case 1:
            System.out.println("Write the name of the author to add.");
            String name = in.nextLine().toLowerCase();
            Author author = new Author(name);
            if (list.getList().containsValue(author)) {
               System.out.println("The author " + String.valueOf(author) + "  is already on the list. Please add another author");
            } else {
               list.addAuthor(author);
               System.out.println("The author was added successfully. What action do you want to take now?");
               authorMenu(author);
            }
            break;
         case 2:
            System.out.println("Write the name of the author to search.");
            String name2 = in.nextLine().toLowerCase();
            Author author2 = new Author(name2);
            if (list.getList().containsKey(name2)) {
               System.out.println("The author " + author2.getName() + " was found. What action do you want to take now?");
               authorMenu(author2);
            } else {
               System.out.println("The author is not on the list yet. do you want to add it?");
               System.out.println("1.-Yes");
               System.out.println("2.-No");
               Integer op = in.nextInt();
               in.nextLine();
               switch(op) {
               case 1:
                  list.addAuthor(author2);
                  System.out.println("The author was added succesfully. What action do you want to take now?");
                  authorMenu(author2);
               case 2:
                  break;
               default:
                  System.out.println("Wrong option, please try again...");
               }
            }
            break;
         case 3:
            list.print();
            break;
         default:
            System.out.println("Wrong option, please try again...");
         case 4:
            System.out.println("Exiting....");
         }
      } while(option != 4);

   }

   static void authorMenu(Author author) {
      Scanner in = new Scanner(System.in);

      Integer option;
      do {
         System.out.println("1.-Add a new book the list of this author.");
         System.out.println("2.-Show the list of books of this author.");
         System.out.println("3.-Go back.");
         option = in.nextInt();
         in.nextLine();
         switch(option) {
         case 1:
            System.out.println("Enter the title of the book.");
            String title = in.nextLine().toLowerCase();
            System.out.println("Enter the price of the book.");
            double price = in.nextDouble();
            Book book = new Book(title, author, price);
            if (author.getBooks().contains(book)) {
               System.out.println("This book is already on this author's list.");
            } else {
               author.addBook(book, title, price);
            }
            break;
         case 2:
            author.getListOfBooks();
         case 3:
            break;
         default:
            System.out.println("Wrong option, please try again...");
         }
      } while(option != 3);

   }
}