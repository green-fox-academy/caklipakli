// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

import java.util.Scanner;

public class NumberAdder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        System.out.println(addNumbers(n));
    }

    public static int addNumbers(int n){

        if (n == 1) {
            return n;
        }
        return addNumbers(n - 1) + n;
    }
}
