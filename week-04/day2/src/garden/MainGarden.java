package garden;

public class MainGarden {

    public static void main(String[] args) {

        Plant plant1 = new Plant("yellow", "Flower");
        Plant plant2 = new Plant("purple", "Tree");

        plant1.wateringPlant(10);
        plant2.wateringPlant(20);

        plant1.info();
    }
}
