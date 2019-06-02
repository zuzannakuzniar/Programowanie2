package Day4;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyJsonTest {

    @Test
    public void jacksonTest(){
        Animal cat = new Animal("cat","gryzka",4);
        String catAsJackson = null;
        try {
            catAsJackson = MyJson.toJSONwithJackson(cat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(catAsJackson);

    }

    @Test
    public void jacksonPrettyTest(){
        Animal cat = new Animal("cat","gryzka",4);
        String catAsJackson = null;
        try {
            catAsJackson = MyJson.toJSONwithJacksonPretty(cat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(catAsJackson);
    }

    @Test
    public void gsonTest(){
        Animal cat = new Animal("cat","gryzka",4);
        String catAsGson = null;
        catAsGson = MyJson.toJSONwithGson(cat);

        System.out.println(catAsGson);

    }

}