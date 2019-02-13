package main.java.music;

public abstract class StringedIntstrument extends Instrument {

    int numberOfStrings;

    public StringedIntstrument() {

        super();

    }

    public abstract String sound();

    @Override
    public void play() {
        System.out.println(this.name + ", a " + this.numberOfStrings + "-stringed instrument that goes " + this.sound());
    }
}
