package main.java.music;

public class BassGuitar extends StringedIntstrument {

    public BassGuitar(){

        this.name = "Bass guitar";
        this.numberOfStrings = 4;

    }

    public BassGuitar(int number){

        this.numberOfStrings = number;
        this.name = "Bass guitar";
    }

    @Override
    public String sound() {

        return "Duum-duum-duum";
    }
}
