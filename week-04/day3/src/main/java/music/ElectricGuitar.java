package main.java.music;

public class ElectricGuitar extends StringedIntstrument {

    public ElectricGuitar(){

        this.name = "Electric guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int number){

        this.name = "Electric guitar";
        this.numberOfStrings = number;
    }
    @Override
    public String sound() {

        return "Twang";
    }
}


