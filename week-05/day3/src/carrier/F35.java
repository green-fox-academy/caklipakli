package carrier;

public class F35 extends AirCraft {

    public F35(){

        super();
        this.baseDamage = 50;
        this.currentAmmo = 0;
        this.type = "F35";
        this.maxAmmo = 8;

    }


    @Override
    public int fight() {
        currentAmmo = 0;
        return baseDamage * maxAmmo;
    }

    @Override
    public int reFill(int parameter) {
        if (parameter < maxAmmo) {
            currentAmmo = parameter;
            return 0;
        } else {
            currentAmmo = maxAmmo;
            return parameter - maxAmmo;
        }
    }



    @Override
    public boolean isPriority() {
        return true;
    }


}
