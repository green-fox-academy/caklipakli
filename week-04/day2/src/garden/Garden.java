package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> garden = new ArrayList<Plant>();

    public Garden(){

    }

    public Garden(List<Plant> listOfPlants){

        this.garden = listOfPlants;
    }

    public void planting(Plant plant){

        this.garden.add(plant);
    }

    public void wateringTheGarden(int water) {
        System.out.println("Watering with " + water);

        int divide = 0;
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).needsWater) {
                divide = divide + 1;
            }
        }
        if (divide > 0) {
            water = water / divide;
        } else {

            water = 0;
        }
        for (int i = 0; i < garden.size(); i++) {

            garden.get(i).wateringPlant(water);
        }

        showMeTheGarden();
        System.out.println();

    }

    public void showMeTheGarden(){

        for (int i = 0; i < garden.size(); i++) {

            garden.get(i).info();

        }
    }

}
