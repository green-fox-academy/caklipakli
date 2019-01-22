import java.util.*;

public class MachMaking{
        public static void main(String... args){
            ArrayList<String> girls = new ArrayList<>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
            ArrayList<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

            // Write a method that joins the two lists by matching one girl with one boy into a new list
            // If someone has no pair, he/she should be the element of the list too
            // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

            System.out.println(makingMatches(girls, boys));
        }

        public static ArrayList<String> makingMatches(ArrayList<String> girls, ArrayList<String> boys){

            ArrayList<String> join = new ArrayList<>();
            int person;
            boolean b = false;
            boolean g = false;
            if (boys.size() < girls.size()) {
                person = boys.size();
                g = true;
            }
            else {
                person = girls.size();
                b = true;
            }
            for (int i = 0; i < person; i++) {
                    join.add(girls.get(i));
                    join.add(boys.get(i));
                }
            if (g) {
                join.add(girls.get(person));
            }
            if (b) {
                join.add(boys.get(person));
            }
            return join;
    }
 }

