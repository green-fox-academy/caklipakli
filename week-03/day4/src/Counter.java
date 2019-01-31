
import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        countDown(n);
    }

    public static void countDown(int n){

        if (n < 0) {
            return;
        }
        System.out.println(n);
        countDown(n-1);
    }

}
