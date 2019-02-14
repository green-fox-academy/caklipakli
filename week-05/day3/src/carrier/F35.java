package carrier;

public class F35 extends AirCraft {

    public F35(){

        super(50,0, "F35", 12);

    }


    @Override
    public boolean isPriority() {
        return true;
    }


}
