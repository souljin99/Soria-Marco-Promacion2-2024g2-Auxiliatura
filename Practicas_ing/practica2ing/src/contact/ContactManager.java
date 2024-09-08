package contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class ContactManager {
    private HashMap<String, Contact> contacts;
    public ContactManager() {
        this.contacts = new HashMap<>();
    }
    public void addContact(Contact contact) {
        this.contacts.put(contact.getEmail(), contact);
    }
    public Contact searchContact(String email) {
        if (this.contacts.containsKey(email)) {
            return this.contacts.get(email);
        }
        return null;
    }
    public Boolean removeContact(String email) {
        if (this.contacts.containsKey(email)) {
            this.contacts.remove(email);
            return true;
        }
        return false;
    }
    public void showAllContacts() {
        for (Contact contact : this.contacts.values()) {
            contact.print();
        }
    }
    public void saveContacts() {
    	 try {
             FileOutputStream file = new FileOutputStream("file.ser");
             ObjectOutputStream out = new ObjectOutputStream(file);
             out.writeObject(contacts);
             out.close();
             file.close();
         } catch (IOException i) {
             i.printStackTrace();
         }
    }
    public HashMap showSavedContacts() {
    	try {
            FileInputStream fileIn = new FileInputStream("file.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            contacts = (HashMap<String, Contact>) in.readObject();
            in.close();
            fileIn.close();
            for (String key : contacts.keySet()) {
                Contact contact = contacts.get(key);
                contact.print();
            }

        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
        }
		return contacts;
    }
}