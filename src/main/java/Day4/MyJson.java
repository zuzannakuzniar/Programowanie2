package Day4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class MyJson {
    public static String toJSONwithJackson(Animal animal) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(animal);
    }
    public static String toJSONwithJacksonPretty(Animal animal) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(animal);
    }

    public static String toJSONwithGson(Animal animal){
        Gson gson = new Gson();
        return gson.toJson(animal);
    }

}
