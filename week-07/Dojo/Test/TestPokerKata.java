import org.junit.Test;
import static org.junit.Assert.*;

public class TestPokerKata {


    @Test
    public void TestHighCard_TwoCardsEqual() {
        String[] hand1 ={"3D", "4D", "5D", "6D", "7D"};
        String [] hand2 = {"3D", "4D", "5D", "6D", "7D"};

        String result = PokerKata.checkHighHand(hand1, hand2);

        assertEquals(result, "Two hands are equal");
    }

    @Test
    public void TestHighCard_Hand2IsHigher() {
        String[] hand1 ={"3D", "4D", "5D", "6D", "6D"};
        String [] hand2 = {"3D", "4D", "5D", "6D", "7D"};

        String result = PokerKata.checkHighHand(hand1, hand2);

        assertEquals(result, "Hand2 is higher.");
    }
}
