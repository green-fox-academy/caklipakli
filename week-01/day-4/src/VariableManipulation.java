public class VariableManipulation {

    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = a + 10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = b -7;
        System.out.println(b);

        int c = 44;
        c = c * 2;
        // please double c's value

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = d / 5;

        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)

        boolean f3 = (f1 > f2);
        System.out.println("The statement f1 is bigger than f2 is " + f3);

        int g1 = 350;
        int g2 = 200;
        boolean g3 = ((g2 *2) > g1);
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println(g3);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int eleven = h % 11;
        boolean divisor = (eleven == 0);
        System.out.println("If 11 is a divisor: " + divisor);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        boolean i3 = (i1 > i2 * i2) & (i1 < i2 * i2 * i2);
        System.out.println("Conditionals with i is " + i3);

        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int j2 = j % 3;
        int j3 = j % 5;
        boolean j4 = ((j2 == 0) | (j3 == 0));
        System.out.println("Dividable by 3 or 5 is " + j4);

        String k = "Apple";
        //fill the k variable with its content 4 times
        k = k + k + k + k;
        System.out.println(k);
    }
}
