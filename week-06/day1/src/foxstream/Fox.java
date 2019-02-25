package foxstream;

public class Fox {

    private String name;
    private String color;
    private int age;

    public Fox(String name, String color, int age){

        this.name = name;
        this.color = color;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String toString() {

        return (getName() + " " + getColor() + " " + getAge());
    }
}
