
public class FizzBuzz {

    public static void main(String[] args) {





        for (int i = 1; i < 101; i++) {

            double number = i;
            double num3 = (number % 3);
            boolean div3 = (num3 == 0);
            double num5 = (number % 5);
            boolean div5 = (num5 == 0);

            if (div3 && div5) {
                System.out.println("FizzBuzz");
            }
            else if (div3) {
                System.out.println("Fizz");
            }
            else if (div5) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }


    }
}
