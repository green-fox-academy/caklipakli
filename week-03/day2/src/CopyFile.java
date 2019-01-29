// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void main(String[] args) {

        String fileName1 = "./assets/newMy-file.txt";
        String fileName2 = "./assets/copiedMy-file.txt";
        System.out.println("The copy was successful: " + DoubleTheFile(fileName1, fileName2));

    }

    public static boolean DoubleTheFile(String fileName1, String fileName2){

        boolean ifCopied = true;

        try{
            Path filePath = Paths.get(fileName1);
            Path filePath2 = Paths.get(fileName2);
            Files.write(filePath2, Files.readAllLines(filePath));

        } catch (Exception e) {
            ifCopied = false;
        }

        return ifCopied;
    }
}
