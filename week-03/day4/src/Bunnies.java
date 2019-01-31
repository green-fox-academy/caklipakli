// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).


import java.util.Scanner;

public class Bunnies {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of bunnies: ");

        int power = scanner.nextInt();
        System.out.println("Total number of bunny ears: " + power(power));
    }

    public static int power(int power){

        int base = 2;
        if (power == 1) {
            return base;
        }

        return power(power-1) + base;
    }
}
