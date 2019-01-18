import java.util.Scanner;


public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number for multiplication ");

        int number = scanner.nextInt();

        for (int i = 1; i < 11; i++) {
            int result = i * number;
            System.out.println(i + " * " + number + " = " + result);
        }
    }

}
