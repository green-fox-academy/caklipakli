package garden;

public class Plant {

    String color;
    String type;
    double currentAmountOfWater;

    public Plant(String color, String type){

        this.color = color;
        this.type = type;
        this.currentAmountOfWater = 10;
    }
    public Plant(String color, String type,int currentAmountOfWater){

        this.color = color;
        this.type = type;
        this.currentAmountOfWater = currentAmountOfWater;
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

    public void info () {
        System.out.println(color + " " + type + " " + currentAmountOfWater );
    }

}
