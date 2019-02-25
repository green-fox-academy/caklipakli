package foxstream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxMain {

    public static void main(String[] args) {

        Fox fox1 = new Fox("Tom", "green", 6);
        Fox fox2 = new Fox("Liz", "blue", 2);
        Fox fox3 = new Fox("Pete", "green", 2);
        Fox fox4 = new Fox("Meg", "pink", 6);
        Fox fox5 = new Fox("Ryan", "green", 4);

        List<Fox> foxes = new ArrayList<>();
        foxes.add(fox1);
        foxes.add(fox2);
        foxes.add(fox3);
        foxes.add(fox4);
        foxes.add(fox5);

        // Write a Stream Expression to find the foxes with green color!

        List<Fox> greenFoxes =  foxes.stream()
                .filter(color -> color.getColor().equals("green"))
                .collect(Collectors.toList());

        greenFoxes.forEach(fox -> System.out.println(fox.toString()));

        System.out.println();

        List<Fox> greenFoxes2 =  foxes.stream()
                .filter(color -> color.getColor().equals("green"))
                .filter(age -> age.getAge()< 5)
                .collect(Collectors.toList());

        greenFoxes2.forEach(fox -> System.out.println(fox.toString()));

        Map<String, Long> colorOfFoxes = foxes.stream()
                .collect(Collectors.groupingBy(fox -> fox.getColor(), Collectors.counting()));


    }
}
