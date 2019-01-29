// Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
    public static void main(String[] args) {

        String path = "./assets/newMy-file.txt";
        writeXLines(path, "apple", 5);

        }
    public static void writeXLines(String path, String word, int x){
        List<String> content = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            content.add(word);
        }

        try {
            Path filePath = Paths.get(path);
            Files.write(filePath, content);
            //Files.write(filePath, Files.readAllLines(filePath2));

        } catch (Exception e) {
            System.out.println("Sorry, I have no error messages");
        }

        try {
            Path filePath = Paths.get(path);
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e){
            System.out.println("Some problem occurred");
        }
    }

}