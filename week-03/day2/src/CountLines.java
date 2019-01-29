// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


public class CountLines {

    public static void main(String[] args) {

        String fileName = "./assets/my-file.txt";
        System.out.println("The number of lines in the text: " + Lines(fileName));
    }

    public static int Lines(String fileName) {
        List<String> lines;
        try {
            Path filePath = Paths.get(fileName);
            lines = Files.readAllLines(filePath);
            return (lines.size());

        } catch (Exception e) {
            System.out.println("Unable to read the file: my-file.txt");
            return 0;
        }
    }
}

