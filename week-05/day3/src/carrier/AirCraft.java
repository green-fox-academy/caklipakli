package carrier;

public abstract class AirCraft {

    int currentAmmo;
    int maxAmmo;
    int baseDamage;
    int allDamage;
    String type;



    public abstract int reFill(int parameter);

    public abstract boolean isPriority();

    public String getType() {
        return type;
    }

    public String getStatus() {
        return toString();
    }

    public String toString() {

        return "Type " + type + ", Ammo: " + currentAmmo + ", base damage: "+ baseDamage + ", all damage: " + allDamage;
    }

    public int fight() {
        currentAmmo = 0;
        return baseDamage * maxAmmo;
    }

}
