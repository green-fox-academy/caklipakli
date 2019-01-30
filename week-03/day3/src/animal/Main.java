package animal;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        animal1.drink();
        animal2.eat();
        animal3.play();
        System.out.println(animal1.thirst + " " + animal1.hunger);
        System.out.println(animal2.thirst + " " + animal2.hunger);
        System.out.println(animal3.thirst + " " + animal3.hunger);
    }
}
