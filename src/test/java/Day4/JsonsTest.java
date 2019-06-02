package Day4;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonsTest {

    private Car car;
    private Car[] array;

    @BeforeEach
    void setUp() {
        car = new Car("VW", "Passat", "1.9 TDI", "diesel", 30_000.00);

        array = new Car[]{car, car, car, car};
    }

    @Test
    void testJSONwithJackson() {
        String json = null;
        try {
            json = Jsons.toJSONwithJackson(car);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(json);

        try {
            System.out.println(Jsons.toJSONwithJackson(array));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(Jsons.toJSONwithJacksonPretty(array));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    @Test
    void testJSONwithGSON() {
        String json = Jsons.toJSONwithGSON(car);
        System.out.println(json);
    }

}
