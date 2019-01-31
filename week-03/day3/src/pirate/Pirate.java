package pirate;

public class Pirate {

    String name;
    String post;
    int power;
    boolean ifSleeps;
    int intoxication;
    boolean alive;

    public Pirate() {
        ifSleeps = false;
        power = 50;
        intoxication = 0;
        alive = true;
    }

    public Pirate(String name, String post, int power, boolean ifSleeps) {
        this.name = name;
        this.post = post;
        this.power = power;
        this.ifSleeps = ifSleeps;
        intoxication = 0;
        alive = true;
    }

    public int drinkSomeRum(int intoxication){
            intoxication = this.intoxication + 10;
            return intoxication;
    }

    public void howItsGoingMate(int intoxication) {
        if (intoxication < 40) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }

    public boolean brawl(String name1, String name2 ){

        return alive;
    }
}
