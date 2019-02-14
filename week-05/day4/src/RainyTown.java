import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class RainyTown {

    public static void main(String[] args) {

        System.out.println(whichRainyCity(ReadFileIntoList("./src/cities.txt")));

    }

    public static List<String> ReadFileIntoList(String fileName){

        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try{
            lines.addAll(Files.readAllLines(filePath));

        } catch (IOException ex){

        }

        return lines;
    }

    public static String whichRainyCity(List<String> lines){

        Map<String, Integer> rainyCities = new HashMap<>();
        //List<Integer> days = new ArrayList<>();

        for(String line : lines){
            String[] splitArray = line.split(",");

            /*String[] dates = splitArray[0].split("-");

            int day = 0;
            try {
                day = Integer.parseInt(dates[2]);
            } catch (NumberFormatException ex) {}

            days.add(day);*/

            if(rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], rainyCities.get(splitArray[1]) + 1);
            } else if(!rainyCities.containsKey(splitArray[1]) && splitArray[2].equals("RAINY")) {
                rainyCities.put(splitArray[1], 1);
            }
        }

        String mostRainyCity = "";
        int mostRainy = 0;
        for (String city : rainyCities.keySet()) {
            if(mostRainy < rainyCities.get(city)) {
                mostRainy = rainyCities.get(city);
                mostRainyCity = city;
            }
        }




        return mostRainyCity;
    }
}
