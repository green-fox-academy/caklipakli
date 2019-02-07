import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static void main(String[] args) {

        CountLetters play = new CountLetters();
        Map<Character, Integer> dictionary;
        dictionary = play.countChar("blablablabla");
        System.out.println(dictionary);
    }

    public Map<Character, Integer> countChar(String string) {

        Map<Character, Integer> makeDictionary = new HashMap<>();

        int occurance = 0;
        for (int i = 0; i < string.length(); i++) {

            if (makeDictionary.containsKey(string.charAt(i))) {
                occurance = makeDictionary.get(string.charAt(i));
                occurance += 1;
                makeDictionary.put(string.charAt(i), occurance);
            } else {
                makeDictionary.put(string.charAt(i), 1);
            }
        }
        return makeDictionary;
    }
}
