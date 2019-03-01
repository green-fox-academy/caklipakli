import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamWithStrings {

    // Write a Stream Expression to find the uppercase characters in a string!

    public static void main(String[] args) {

        String text = "BaBccD";
        IntStream textToStream = text.chars();
        textToStream
                .filter(c -> Character.isUpperCase(c))
                .forEach(c -> System.out.print((char) c + " "));


        // Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

        System.out.println();

        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI",
                "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

        String a = "A";
        cities.stream().filter(city -> city.startsWith(a))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        // Write a Stream Expression to concatenate a Character list to a string!

        List<Character> charList = Arrays.asList('v','a','l','a','m','i');

        String newString = charList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(newString);

        // Write a Stream Expression to find the frequency of characters in a given string!

        String testString = "elkelkápsztástalaníthatatlanítottátok";
        IntStream charStream = testString.chars();

        Map<Character, Long> charFrequency = testString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        charFrequency.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}

