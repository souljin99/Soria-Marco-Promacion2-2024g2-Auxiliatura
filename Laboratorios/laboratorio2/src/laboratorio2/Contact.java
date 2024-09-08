package laboratorio2;

import java.io.Serializable;
//implemente la interfaz "Serializable" para que el objeto "contact" que es un dato del hashmap pueda ser serializable
public class Contact implements Serializable {
    private String name;
    private String email;
    private Integer age;
    private String phone;

    public Contact(String name, String email, int age, String phone) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Age:" + age);
        System.out.println("Phone: " + phone);
        System.out.println("--------------");
    }
}