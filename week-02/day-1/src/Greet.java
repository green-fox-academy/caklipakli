public class Greet {
// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
// - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

    public static void main(String[] args) {

        String al = "Greenfox";
        greet(al);

    }

    public static void greet(String input)
    {
        System.out.println("Greetings dear, " + input);
    }
}
