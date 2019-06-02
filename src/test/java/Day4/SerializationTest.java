package Day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class SerializationsTest {

    @DisplayName("Serialised and deserialised object should be equal")
    @Test
    void serialisedAndDeserialisedObjectShouldBeEqual() {

        Person person = new Person("Robert", "Kareta");
        person.setAddress(new Address("Cicha 2"));

        String fileName = "personSerialisation.txt";
        // serialise object
        try {
            Serialization.serialiseToFile(person, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialise object
        Person personFromSerialisation = null;
        try {
            personFromSerialisation = Serialization.deserialiseFromFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // check equal
        Assertions.assertEquals(person.getFirstName(), personFromSerialisation.getFirstName());
        Assertions.assertEquals(person.getLastName(), personFromSerialisation.getLastName());

    }

    @DisplayName("Serialised and deserialised object should be equal - based on String")
    @Test
    void serialisedAndDeserialisedObjectShouldBeEqual_v2() {
        Person person = new Person("Robert", "Kareta");
        person.setAddress(new Address("Cicha 2"));

        String fileName = "personSerialisation.txt";
        // serialise object
        String objectFromSerialisation = null;
        try {
            objectFromSerialisation = Serialization.serialiseToString(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialise object
        Person personFromSerialisation = null;
        try {
            personFromSerialisation = Serialization.deserialiseFromString(objectFromSerialisation);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // check equal
        Assertions.assertEquals(person.getFirstName(), personFromSerialisation.getFirstName());
        Assertions.assertEquals(person.getLastName(), personFromSerialisation.getLastName());

    }

    @DisplayName("Serialised and deserialised object should be equal - based on String")
    @Test
    void serialisedAndDeserialisedObjectShouldBeEqual_v1() {
        Person person = new Person("Robert", "Kareta");
        person.setAddress(new Address("Cicha 2"));

        String fileName = "personSerialisation.txt";
        // serialise object
        byte[] objectFromSerialisation = null;
        try {
            objectFromSerialisation = Serialization.serialiseToString_v1(person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialise object
        Person personFromSerialisation = null;
        try {
            personFromSerialisation = Serialization.deserialiseFromString_v1(objectFromSerialisation);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // check equal
        Assertions.assertEquals(person.getFirstName(), personFromSerialisation.getFirstName());
        Assertions.assertEquals(person.getLastName(), personFromSerialisation.getLastName());

    }
}
