package carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<AirCraft> carrier = new ArrayList<>();
    int ammo;
    int healthPoint;


    public Carrier(int ammo, int healthPoint){

        this.ammo = ammo;
        this.healthPoint = healthPoint;
    }

    public void add(AirCraft plane){

        carrier.add(plane);
    }

    public void fill(){

        if (this.ammo < 0) {
            throw new IllegalArgumentException("No ammo");
        }
        int sumNeededAmmo = 0;
        int neededAmmo;

        for (AirCraft plane : carrier) {
                neededAmmo = plane.maxAmmo - plane.currentAmmo;
                sumNeededAmmo = sumNeededAmmo + neededAmmo;
        }

        if (sumNeededAmmo < this.ammo) {

            for (int i = 0; i < carrier.size(); i++) {

                this.ammo =  carrier.get(i).reFill(this.ammo);
            }

        } else {

            for (int i = 0; i < carrier.size(); i++) {

                if (sumNeededAmmo < this.ammo)
                if((carrier.get(i).isPriority())){
                    this.ammo = carrier.get(i).reFill(this.ammo);

                }
            }
        }
    }

    public int totalDamage(){

        int totalDamage = 0;
        for (AirCraft plane : carrier) {
            totalDamage = totalDamage + plane.allDamage;
        }
        return totalDamage;
    }

    public void getStatus(){

        if (healthPoint == 0) {

            System.out.println("It's dead Jim :(");
        } else {

            System.out.println("HP: " + healthPoint + ". Aircraft count: " + carrier.size() + ", Ammo Storage: " + ammo +
                    " Total damage: " + totalDamage());
            System.out.println("Aircrafts:");

            for (AirCraft plane : carrier){
                System.out.println(plane.getStatus());
            }
        }

    }

    public int fight(Carrier enemy){

        return enemy.healthPoint - totalDamage();
    }

}
