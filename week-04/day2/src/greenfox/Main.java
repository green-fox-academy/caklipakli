package greenfox;

public class Main {

    public static void main(String[] args) {

        Person somebody = new Person();
        Person someone = new Person("Jane", 20, "female");

        somebody.introduce();
        someone.introduce();
        someone.getGoal();

        Student student1 = new Student();
        Student student2 = new Student("Bob", 35, "male", "OTP");

        student1.introduce();

        Mentor anyone = new Mentor();

        anyone.introduce();
        anyone.getGoal();

        Sponsor representative = new Sponsor("Dirty Fred", 60, "male", "Balmoral");

        representative.introduce();

        Cohort megalotis = new Cohort("Megalotis");

                megalotis.addStudent(student1);
                megalotis.addMentor(anyone);
                megalotis.info();
    }
}
