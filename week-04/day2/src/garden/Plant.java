package garden;

public class Plant {

    String color;
    String type;
    double currentAmountOfWater;
    boolean needsWater;

    public Plant(String color, String type){

        this.color = color;
        this.type = type;
        this.currentAmountOfWater = 0;
        this.needsWater = true;
    }
    public Plant(String color, String type,int currentAmountOfWater){

        this.color = color;
        this.type = type;
        this.currentAmountOfWater = currentAmountOfWater;
        this.needsWater = true;
    }

    public void wateringPlant(int water){

        if (this.type == "Tree") {
            this.currentAmountOfWater = currentAmountOfWater + water * 0.4;
        } else if (this.type == "Flower") {
            this.currentAmountOfWater = currentAmountOfWater + water * 0.75;
        } else {
            System.out.println("We do not water this plant.");
        }
    }

    public void  ifWateringNeeded(){

        if ((type == "Tree") && (currentAmountOfWater < 10)){

            needsWater = true;
        } else {
            needsWater = false;
        }

        if ((type == "Flower") && (currentAmountOfWater < 5)){

            needsWater = true;
        } else {
            needsWater = false;
        }
    }

    public void info () {

        if (needsWater) {
            System.out.println(color + " " + type + " needs water");
        } else {
        System.out.println(color + " " + type + " doesnt need water");
        }
        System.out.println();
    }

}
