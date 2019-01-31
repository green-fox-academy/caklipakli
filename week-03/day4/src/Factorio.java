// Create a recursive function called `refactorio`
// that returns it's input's factorial

import java.util.Scanner;

public class Factorio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial: " + factorio(n));
    }

    public static int factorio(int n) {

        if (n  == 2) {
            return n;
        } else {
            return (factorio(n - 1) * n);
        }
    }
}
