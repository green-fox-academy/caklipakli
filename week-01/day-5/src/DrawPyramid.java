import java.util.Scanner;

public class DrawPyramid {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        String pyramid;
        String space = " ";
        String star = "*";
        int number2 = 1;

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - (i+1); j++) {
                System.out.print(space);
            }
            for (int k = 0; k < number2; k++) {
                System.out.print(star);
            }
            number2 = number2 + 2;
            System.out.println();
        }
    }
}
