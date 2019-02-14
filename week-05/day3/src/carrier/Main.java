package carrier;

public class Main {

    public static void main(String[] args) {

        /*Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
        Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
        Type F35, Ammo: 12, Base Damage: 50, All Damage: 600
        Type F16, Ammo: 8, Base Damage: 30, All Damage: 240
        Type F16, Ammo: 8, Base Damage: 30, All Damage: 240*/

        Carrier myCarrier = new Carrier(2300, 5000);

        F35 plane1 = new F35();
        F35 plane2 = new F35();
        F35 plane3 = new F35();
        F16 plane4 = new F16();
        F16 plane5 = new F16();

        myCarrier.add(plane1);
        myCarrier.add(plane2);
        myCarrier.add(plane3);
        myCarrier.add(plane4);
        myCarrier.add(plane5);

        myCarrier.getStatus();

        try {
            myCarrier.fill();
        } catch (IllegalArgumentException ex){
            System.out.println("No ammo");
        }

        myCarrier.getStatus();

        plane1.fight();
        plane4.fight();
        myCarrier.fill();
        myCarrier.getStatus();


    }
}
