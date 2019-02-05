package greenfox;

public class Student extends Person {

        private String previousOrganization;
        private int skippedDays;

        public Student() {

            super();
            this.previousOrganization = "The School of life";
            this.skippedDays = 0;

        }

        public Student(String name, int age, boolean gender, String previousOrganization){

            this.skippedDays = 0;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.previousOrganization = previousOrganization;

        }


    public void introduce(){

        if (gender) {

            System.out.println("Hi, I'm " + name + ", a " + age +
                    " year old female from " + previousOrganization + " who skipped " + skippedDays + " days.");
        } else {
            System.out.println("Hi, I'm " + name + ", a " + age +
                    " year old male  from " + previousOrganization + " who skipped " + skippedDays + " days.");
        }
    }

    public void getGoal(){
        System.out.println("Be a junior softwer developer!");
    }


}
