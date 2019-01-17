import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a whole number: ");

        int number = scanner.nextInt();

        int number2 = number % 2;

        if (number2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("Odd");
        }


    }

}
