import java.util.Scanner;

public class PrintBigger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");

        int number1 = scanner.nextInt();

        System.out.println("Please enter another number: ");

        int number2  = scanner.nextInt();

        int number = number1 - number2;
        if (number > 0) {
            System.out.println("The first number is greater");
        } else if (number < 0) {
            System.out.println("The second number is greater");
        } else {
            System.out.println("The two numbers are equal.");
        }


    }
}
