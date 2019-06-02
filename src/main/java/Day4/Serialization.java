package Day4;

import java.io.*;

public class Serialization {

    public static void serialised(Person person) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("personSerialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}

class Person implements Serializable {
    private String firstname;
    private String lastname;

    transient private Address adress;

    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }
}

class Address{
    private String city;
    public Address(String city){this.city=city;}
}