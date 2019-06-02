package Day4;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class Jsons {


    public static String toJSONwithJackson(Car car) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(car);
    }

    public static String toJSONwithJackson(Car[] cars) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(cars);
    }

    public static String toJSONwithJacksonPretty(Car[] cars) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(cars);
    }

    public static String toJSONwithGSON(Car car) {
        Gson gson = new Gson();
        return gson.toJson(car);
    }
}


class Car {
    private String brand;
    private String model;
    private String engine;
    private String fuelType;
    private double price;

    public Car(String brand, String model, String engine, String fuelType, double price) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double getPrice() {
        return price;
    }
}
