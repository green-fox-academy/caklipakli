// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");

        String string = scanner.next();

        int length = string.length();


        System.out.println("The new string " + changeX(string));
    }

    public static String changeX(String string) {

        if (string.length() < 1) {

            return string;
        } else {

            char check = string.charAt(0);

            if (check == 'x') {
                return "y" + changeX(string.substring(1));
            } else {

                return check + changeX(string.substring(1));
            }
        }
    }
}
