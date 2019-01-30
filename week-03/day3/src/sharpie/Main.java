package sharpie;

public class Main {
    public static void main(String[] args) {

        Sharpie wtf = new Sharpie("yellow", 3.5);
        wtf.use();

        System.out.println(wtf.color);
        System.out.println(wtf.width);
        System.out.println(wtf.inkAmount);
    }

}
