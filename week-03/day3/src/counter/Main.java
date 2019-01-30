package counter;

public class Main {

    public static void main(String[] args) {

        Counter counter = new Counter();

        counter.add(5);
        counter.get();
        counter.add();
        counter.get();
        counter.reset();
        counter.get();

        Counter counter1 = new Counter(5);

        counter1.add(4);
        counter1.get();
        counter1.add();
        counter1.get();
        counter1.reset();
        counter1.get();

    }
}
