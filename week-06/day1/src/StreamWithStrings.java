import java.util.stream.IntStream;

public class StreamWithStrings {

    // Write a Stream Expression to find the uppercase characters in a string!

    public static void main(String[] args) {

        String text = "BaBccD";
        IntStream textToStream = text.chars();
        textToStream
                .filter(c -> Character.isUpperCase(c))
                .forEach(c -> System.out.print((char) c + " "));

        }

}

