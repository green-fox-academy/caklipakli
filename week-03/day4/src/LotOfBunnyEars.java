// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

import java.util.Scanner;

public class LotOfBunnyEars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of bunnies in the line: ");

        int power = scanner.nextInt();
        System.out.println("Total number of bunny ears: " + power(power));
    }

    public static int power(int number){

        int ears = 2;

        if (number == 1) {
            return ears;
        }
        if (number % 2 == 0) {
            ears = 3;
        }
        return power(number-1) + ears;
    }
}
