import java.util.*;

public class AppendLetter {
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        System.out.println(appendA(far));

    }
    public static List<String> appendA(List<String> animalsList){

        for (String animal: animalsList)
        {
            animalsList.set(animal.concat("a"));
        }
        //for (int i = 0; i < animalsList.size(); i++) {

          //  animalsList.set(i, animalsList.get(i) + "a");
        //}

        System.out.println(animalsList);
        return animalsList;
    }


// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
}

