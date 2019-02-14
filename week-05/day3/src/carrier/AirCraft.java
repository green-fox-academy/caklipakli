package carrier;

public abstract class AirCraft {

    int currentAmmo;
    int maxAmmo;
    int baseDamage;
    int allDamage;
    String type;

    public AirCraft(int baseDamage, int currentAmmo, String type, int maxAmmo){

        this.baseDamage = baseDamage;
        this.currentAmmo = currentAmmo;
        this.type = type;
        this.maxAmmo = maxAmmo;
    }


    public int reFill(int parameter){

        if (currentAmmo + parameter < maxAmmo) {
                currentAmmo = currentAmmo + parameter;
                return 0;

        } else {
            currentAmmo = maxAmmo;
            return parameter - (maxAmmo - currentAmmo);
        }
    }

    public abstract boolean isPriority();

    public String getType() {
        return type;
    }

    public String getStatus() {
        return "Type " + type + ", Ammo: " + currentAmmo + ", base damage: "+ baseDamage + ", all damage: " + allDamage;
    }


    public void fight() {
        currentAmmo = 0;
        allDamage = baseDamage * maxAmmo;
    }

}
