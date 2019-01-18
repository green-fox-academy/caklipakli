import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int i = 8;

        while (i != number) {

            if (i < number) {
                System.out.println("The stored number is lower.");
            } else if (i > number) {
                System.out.println("The stored number is higher.");
            }
            System.out.println("Enter a number: ");
            number = scanner.nextInt();
        }
        System.out.println("You found the number: " + i);


    }
}
