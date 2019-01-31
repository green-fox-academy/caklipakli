// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

import java.util.Scanner;

public class SumDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int n = scanner.nextInt();
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n){

        if (n < 10) {
            return n;
        }

        return sumDigits(n / 10) + n % 10;
    }
}
