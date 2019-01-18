public class ConditionalVariableMutation {

    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        double a2 = a % 2;

        if (a2 == 0){
            out = out + 1;
        }
        System.out.println(out);


        int b = 13;
        String out2 = "";

        boolean sweet = (b > 10 & b < 20);
        boolean less = (b < 10);
        boolean more = (b > 20);

        if (sweet) {
            out2 = "Sweet!";
        }
        if (less) {
            out2 = "Less!";
        }
        if (more){
            out2 = "More!";
        }
        System.out.println(out2);

        int c = 123;
        int credits = 100;
        boolean isBonus = false;

        boolean dec2 = (credits >= 50);

        if (isBonus){
            System.out.println("Semmi sem történik.");
        }
        else if (dec2){
            c = c - 2;
        }
        else {
            c = c -1;
        }

        System.out.println(c);

        int d = 8;
        int time = 120;
        String out3 = "";

        double divide = (d % 4);
        boolean div4 = (divide == 0);
        boolean time1 = (time <= 200);
        boolean time2 = (time > 200);
        if (div4 & time1) {
            out3 = "Check";
        }
        else if (time2) {
            out3 = "Time out";
        }
        else{
            out3 = "Run Forest Run!";
        }

        System.out.println(out3);
    }
}
