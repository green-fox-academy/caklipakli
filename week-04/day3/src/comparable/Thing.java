package comparable;

public class Thing implements Comparable<Thing> {

    private String name;
    private boolean completed;

    public Thing(String name) {
        this.name = name;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name;
    }

    @Override
    public int compareTo(Thing thing) {
        if (this.completed == thing.completed) {
             return this.name.compareTo(thing.name);
        }
        if (this.completed) {
            return -1;
        }
        if (thing.completed){
            return 1;
        }
        return 0;
    }
}
