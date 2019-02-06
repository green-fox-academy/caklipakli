package greenfox;

public class Student extends Person {

        private String previousOrganization;
        private int skippedDays;

        public Student() {

            super();
            this.previousOrganization = "The School of life";
            this.skippedDays = 0;

        }

        public Student(String name, int age, String gender, String previousOrganization){

            this.skippedDays = 0;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.previousOrganization = previousOrganization;

        }

    @Override
    public void introduce(){

        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " from "
                + previousOrganization + " who skipped " + skippedDays + " days.");
        }
    @Override
    public void getGoal(){
        System.out.println("Be a junior softwer developer!");
    }

    public void skipDays(int numberOfDays){
            this.skippedDays = skippedDays + numberOfDays;
    }


}
