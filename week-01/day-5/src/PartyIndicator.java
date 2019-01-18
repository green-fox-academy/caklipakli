import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number of the girls: ");

        int girls = scanner.nextInt();

        System.out.println("Please enter the number of the boys: ");

        int boys = scanner.nextInt();

        int gen = girls - boys;
        int num = girls + boys;
        boolean sausage = (girls == 0);
        boolean gender = (gen == 0);
        boolean number = (num > 20);

        if (sausage) {
            System.out.println("Sausage party");
        } else if (gender & number) {
            System.out.println("The party is excellent!");
        } else if (number) {
            System.out.println("Quite cool party!");
        } else {
            System.out.println("Average party.");
        }

    }
}
