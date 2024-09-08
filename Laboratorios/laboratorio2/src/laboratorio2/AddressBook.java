package laboratorio2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
public class AddressBook {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : this.contacts.values()) {
            contact.print();
        }
    }

    public Contact searchContact(String email) {
        if (contacts.containsKey(email)) {
            return this.contacts.get(email);
        } else {
            System.out.println("Contact not found.");
        }
		return null;
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }
    
    public void storeContact() {
    	try {
            FileOutputStream file = new FileOutputStream("contact1"
            		+ "s.ser");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(contacts);
            oos.close();
            file.close();
            System.out.println("The list of contacts has been saved in the'contacts.ser'folder");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public HashMap loadContact() {
    	try {
            FileInputStream file = new FileInputStream("contacts.ser");
            ObjectInputStream ois = new ObjectInputStream(file);
            HashMap<String, Contact> savedContats = (HashMap<String, Contact>) ois.readObject();
            ois.close();
            file.close();
            System.out.println("Contact list previously saved: " + savedContats);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    	return contacts;
    }
}