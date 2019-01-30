package fleetofthings;

public class FleetOfThings {


    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        Thing first = new Thing("Get milk");
        Thing second = new Thing("Remove the obstacles");
        Thing third = new Thing("Stand up");
        Thing fourth = new Thing("Eat lunch");

        third.complete();
        fourth.complete();
        fleet.add(first);
        fleet.add(second);
        fleet.add(third);
        fleet.add(fourth);


        System.out.println(fleet.toString());
    }
}
