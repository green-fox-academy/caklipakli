package carrier;

public class F16 extends AirCraft{

    public F16(){

        super();
        this.baseDamage = 30;
        this.currentAmmo = 0;
        this.type = "F16";
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
        return false;
    }

    @Override
    public String getStatus() {
        return toString();
    }

}
