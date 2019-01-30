package diceset;

public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();
        diceSet.roll();
        System.out.println(diceSet.getCurrent());
        int n = 0;
        for (int i = 0; i < 6; i++) {
            while (diceSet.getCurrent(i) != 6) {
                diceSet.reroll(i);
                n = n + 1;
            }
        }
        System.out.println("Number of rerolls: " + n);
        System.out.println(diceSet.getCurrent());

    }
}