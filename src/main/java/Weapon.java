public abstract class Weapon extends Item {
    private int weaponDamage;


    public Weapon(String weaponName, String weaponDescription, int damage) {
        super(weaponName, weaponDescription);
        this.weaponDamage = damage;
    }

    public String getName() {
        return super.getItemName();
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public abstract int getAmmoLeft();

    public abstract void setAmmo(int ammo);

    public boolean hasAmmo() {
        return true;
    }}