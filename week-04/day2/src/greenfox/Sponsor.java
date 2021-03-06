package greenfox;

public class Sponsor extends Person {

    private String company;
    private int hiredStudents;

    public Sponsor() {

        super();
        this.company = "Google";
        this.hiredStudents = 0;

    }

    public Sponsor(String name, int age, String gender, String company) {

        this.hiredStudents = 0;
        this.company = company;
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    public void hire(){
        this.hiredStudents = hiredStudents + 1;
    }

    @Override
    public void introduce(){

        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company +
                " and hired " + hiredStudents + " students so far.");
    }
    @Override
    public void getGoal(){
        System.out.println("Hire brilliant junior software developers.");
    }
}
