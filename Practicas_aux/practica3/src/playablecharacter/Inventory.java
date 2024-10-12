package playablecharacter;

import java.util.ArrayList;
import java.util.Iterator;

public class Inventory {
   private ArrayList<String> items = new ArrayList();

   public Inventory(ArrayList<String> items) {
      this.items = items;
   }

   public void addItem(String item) {
      this.items.add(item);
   }

   public void showItems() {
      System.out.println("List of items: ");
      Iterator var2 = this.items.iterator();

      while(var2.hasNext()) {
         String item = (String)var2.next();
         System.out.println("- " + item);
      }

   }
}