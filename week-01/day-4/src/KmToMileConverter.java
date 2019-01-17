import java.util.Scanner;

public class KmToMileConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the biggest distance you have travelled from your home (in km): ");
        int userInput = scanner.nextInt();

        double miles = userInput * 0.62137;

        System.out.println("You were " + miles + " miles away.");

    }
}
