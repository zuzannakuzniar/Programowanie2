package Day4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SerializationTest {

    @DisplayName("Serialised and deserialised object should equal")
    @Test
    public void serialisedAndDeserialisedObjectShouldEqual(){
        // serialised
        Person person = new Person("Robert", "Kareta");
        person.setAdress(new Address("Cicha 2"));
        try {
            Serialization.serialised(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // deserialised
        //chceck equal
    }

}