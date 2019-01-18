import java.util.Scanner;

public class DrawTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        String triangle = "";

        for (int i = 0; i < number; i++) {
            triangle = triangle + "*";
            System.out.println(triangle);
        }
    }
}
