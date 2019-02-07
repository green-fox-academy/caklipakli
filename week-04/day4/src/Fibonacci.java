public class Fibonacci {

    public static void main(String[] args) {

        Fibonacci f = new Fibonacci();
        System.out.println(f.Fibonacci(-1));
    }

    public int Fibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 2)+ Fibonacci(n - 1);
    }
}
