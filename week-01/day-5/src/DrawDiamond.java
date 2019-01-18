import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();

            String space = " ";
            String star = "*";
            int number1 = 1;
            boolean odd = ((number % 2) != 0);
            int number2 = (number/2);

            if (odd) {
                number2 = number2 +1;
            }

            for (int i = 0; i < number2; i++) {
                for (int j = 0; j < number - (i+1); j++) {
                    System.out.print(space);
                }
                for (int k = 0; k < number1; k++) {
                    System.out.print(star);
                }
                number1 = number1 + 2;
                System.out.println();
            }

            number1 = (number/2);
            int number3 = number2;
            for (int i = 0; i < number2-1; i++) {
                for (int j = 0; j < number1 + 1; j++) {
                    System.out.print(space);
                }
                for (int k = 0; k < number3 + 1; k++) {
                    System.out.print(star);
                }
                number1 = number1 + 1;
                number3 = number3 - 2;
                System.out.println();
            }


        }
}
