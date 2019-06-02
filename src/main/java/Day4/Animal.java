package Day4;

public class Animal {
    private String type;
    private String name;
    private int age;

    public Animal(String type, String name, int age){
        this.age = age;
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
