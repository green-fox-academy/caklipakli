// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        divide();
    }

    public static void divide() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a divider: ");
        int parameter = scanner.nextInt();

        try {
            int result = 10 / parameter;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Fail");
        }
    }

}
