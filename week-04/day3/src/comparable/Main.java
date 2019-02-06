package comparable;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Fleet toDoList = new Fleet();

        Thing thing1 = new Thing("Get milk");
        Thing thing2 = new Thing("Remove the obstacles");
        Thing thing3 = new Thing( "Stand up");
        Thing thing4 = new Thing( "Eat lunch");

        thing3.complete();
        thing4.complete();

        toDoList.add(thing1);
        toDoList.add(thing2);
        toDoList.add(thing3);
        toDoList.add(thing4);

        System.out.println(toDoList);

    }
}
