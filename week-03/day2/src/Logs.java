// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

    public static void main(String[] args) {

        String path = "./log.txt";

        System.out.println(IPAddress(ReadFileIntoAList(path)));

        System.out.println("The GET / POST ratio: " + Ratio(ReadFileIntoAList(path)));
    }

    public static List<String> ReadFileIntoAList(String path) {
        List<String> userData = new ArrayList<>();
        try {
            Path filePath = Paths.get(path);
            userData = Files.readAllLines(filePath);

        } catch (Exception e) {
            System.out.println("Unable to read the file: log.txt");
        }

        return userData;

        }

        public static String[] IPAddress(List<String> inputData){

            String[] splitArray = new String[3];
            String[] ipAddress = new String[1];

            try {
                for (String line : inputData) {
                    splitArray = line.split("   ");
                    System.out.println(splitArray[1]);
                }

                for (int i = 0; i < splitArray[1].length(); i++) {
                    ipAddress[i] = splitArray[1];
                }
            } catch (Exception e) {
                System.out.println("Unable to get IP address");
            }
            return ipAddress;
        }

        public static int Ratio(List<String> inputData){
        int ratio =0;
        int get =0;
        int put =0;

        try {
            for (int i = 0; i < inputData.size(); i++) {

                if (inputData.get(i).contains("GET")) {
                    get = get + 1;
                } else if (inputData.get(i).contains("PUT")) {
                    put = put + 1;
                }
            }
            ratio = get / put;
        } catch (Exception e) {
                System.out.println("Sorry, sg wrong with the ratio");
            }

        return ratio;
        }

}

