package greenfox;

public class Main {

    public static void main(String[] args) {

        Person somebody = new Person();
        Person someone = new Person("Jane", 20, "female");

        somebody.introduce();
        someone.introduce();
        someone.getGoal();

        Student student1 = new Student();

        student1.introduce();

        Mentor anyone = new Mentor();

        anyone.introduce();
        anyone.getGoal();

    }
}
