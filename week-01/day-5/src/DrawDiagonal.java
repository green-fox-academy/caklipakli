import java.util.Scanner;

public class DrawDiagonal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                System.out.print("%");
            }
            System.out.println();

        }
    }
}
