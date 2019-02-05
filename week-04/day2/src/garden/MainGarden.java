package garden;

public class MainGarden {

    public static void main(String[] args) {

        Plant plant1 = new Plant("yellow", "Flower");
        Plant plant2 = new Plant("blue", "Flower");
        Plant plant3 = new Plant("purple", "Tree");
        Plant plant4 = new Plant("orange", "Tree");

        plant1.wateringPlant(10);
        plant2.wateringPlant(20);

        Garden newGarden = new Garden();

        newGarden.planting(plant1);
        newGarden.planting(plant2);
        newGarden.planting(plant3);
        newGarden.planting(plant4);

        newGarden.showMeTheGarden();
        newGarden.wateringTheGarden(40);
        newGarden.wateringTheGarden(70);

    }
}
