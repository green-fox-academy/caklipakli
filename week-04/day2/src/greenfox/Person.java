package greenfox;

public class Person {

    String name;
    int age;
    boolean gender;

    public Person () {

        this.name = "Jane Doe";
        this.age = 30;
        this.gender = true;
    }

    public Person (String name, int age, boolean gender) {

        this.name = name;
        this.age = age;
        this.gender = gender;

    }


    public void introduce(String name, int age, boolean gender){

        if (gender) {

            System.out.println("Hi, I'm " + name + ", a " + age + " year old female.");
        } else {
            System.out.println("Hi, I'm " + name + ", a " + age + " year old male.");
        }
    }

    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");
    }



}
