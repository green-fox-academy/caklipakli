public class Swap {

    public static void main(String[] args) {
        // Swap the values of the variables
        int a = 123;
        int b = 526;

        System.out.println("Eredeti a: " + a);
        System.out.println("Eredeti b: " + b);
        int aTemp = a;
        int bTemp = b;
        a = bTemp;
        b = aTemp;

        System.out.println("Kicserélt a: " + a);
        System.out.println("Kicserélt b: " + b);

    }
}
