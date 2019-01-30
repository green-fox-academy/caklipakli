package diceset;

import java.util.ArrayList;
import java.util.Arrays;

public class DiceSet {
    ArrayList<Integer> dice = new ArrayList<>();

    public ArrayList<Integer> roll() {
        for (int i = 0; i < 6; i++) {
            dice.add((int) (Math.random() * 6) + 1);
        }
        return dice;
    }

    public ArrayList<Integer> getCurrent() {
        return dice;
    }

    public int getCurrent(int i) {
        return dice.get(i);
    }

    public void reroll() {
        for (int i = 0; i < dice.size(); i++) {
            dice.set(i, (int) (Math.random() * 6) + 1);
        }
    }

    public void reroll(int k) {
        dice.set(k, (int) (Math.random() * 6) + 1);
    }

}