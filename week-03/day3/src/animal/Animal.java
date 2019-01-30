package animal;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public void eat(){

        hunger = hunger - 1;

    }

    public void drink() {
        thirst = thirst -1;
    }
    public void play() {
        hunger = hunger + 1;
        thirst = thirst + 1;
    }
}
