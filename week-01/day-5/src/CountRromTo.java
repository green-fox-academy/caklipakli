import java.util.Scanner;

public class CountRromTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter another number: ");
        int number2 = scanner.nextInt();

        boolean smaller = (number1 >= number2);

        if (smaller) {
            System.out.println("The second number should be bigger.");
        }

         else for (int i = number1; i < number2 + 1; i++) {
            System.out.println(i);
        }
    }
}
