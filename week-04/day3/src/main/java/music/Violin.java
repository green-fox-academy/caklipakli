package main.java.music;

public class Violin extends StringedIntstrument{

    public Violin(){

        this.name = "Violin";
        this.numberOfStrings = 4;
    }

    public Violin(int number){

        this.name = "Violin";
        this.numberOfStrings = number;
    }

    @Override
    public String sound() {
        return "Skreech";
    }
}
