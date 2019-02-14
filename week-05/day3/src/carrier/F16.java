package carrier;

public class F16 extends AirCraft{

    public F16(){

        super(30,0, "F16", 8);

    }

    @Override
    public boolean isPriority() {
        return false;
    }

}
