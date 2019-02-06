package clone;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("John", 20, "male", "BME");

        Student johnTheClone = student1.clone(student1);

        johnTheClone.introduce();

    }
}
