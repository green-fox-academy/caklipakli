import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.*;


public class PokerKata {

    public static Map<Character, Integer> scores = new HashMap<>();

    public PokerKata(){
        scores.put('2', 2);
        scores.put('3', 3);
        scores.put('4', 4);
        scores.put('5', 5);
        scores.put('6', 6);
        scores.put('7', 7);
        scores.put('8', 8);
        scores.put('9', 9);
        scores.put('T', 10);
        scores.put('J', 11);
        scores.put('Q', 12);
        scores.put('K', 13);
        scores.put('A', 14);
    }

        public static void main(String[] args) {

            String[] hand1 ={"2D", "3D", "4D", "5D", "6D"};
            String [] hand2 = {"3D", "4D", "5D", "6D", "7D"};

            checkHighHand(hand1, hand2);
        }

        public static String checkHighHand(String[] hand1, String [] hand2){

            int maxHand1 = maxValue(hand1);

            int maxHand2 = maxValue(hand2);


            if (maxHand1 == maxHand2){
                return "Two hands are equal";
            }
            if (maxHand1 > maxHand2) {
                return " Hand1 is higher";
            } else return "Hand2 is higher.";
        }

        public static Integer maxValue(String[] hand){

            OptionalInt maxHand = Arrays.stream(hand)
                    .map(v -> v.charAt(0))
                    .map(scores :: get)
                    .sorted((a,b) -> a<= b ? 1 : -1)
                    .mapToInt(a -> a)
                    .max();
            return maxHand.getAsInt();

        }
 }


