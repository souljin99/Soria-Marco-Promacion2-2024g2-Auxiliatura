package desafiolab3;

import java.util.HashMap;
import java.util.Iterator;

public class ListOfAuthors {
   HashMap<String, Author> list = new HashMap();

   public ListOfAuthors() {
      this.list = this.list;
   }

   public HashMap<String, Author> getList() {
      return this.list;
   }

   public void setList(HashMap<String, Author> list) {
      this.list = list;
   }

   public void addAuthor(Author author) {
      this.list.put(author.getName(), author);
   }

   public void print() {
      if (this.list.isEmpty()) {
         System.out.println("There is no authors on the list.");
      } else {
         System.out.println("List of authors: ");
         Iterator var2 = this.list.keySet().iterator();

         while(var2.hasNext()) {
            String name = (String)var2.next();
            System.out.println("Author: " + name);
         }
      }

   }
}