import java.util.Scanner;

public class Sum {

    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

            System.out.println("Please enter a number: ");
            int parameter = scanner.nextInt();
            System.out.println(sum(parameter));
        }

        public static int sum(int x)
        {
            int summa = 0;
            for (int i = 0; i < x; i++) {
                System.out.println("Please enter a number: ");
                int input = scanner.nextInt();
                summa = summa + input;
            }
            return summa;
        }
}
