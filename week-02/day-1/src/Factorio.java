import java.util.Scanner;

public class Factorio {

// - Create a function called `factorio`
//   that returns it's input's factorial

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        int parameter = scanner.nextInt();
        System.out.println(factorio(parameter));
    }
    public static long factorio(int number)
        {
          long fact = 1;
            for (int i = 1; i < number + 1; i++) {
                fact = fact * i;
            }
            return fact;
        }
}
