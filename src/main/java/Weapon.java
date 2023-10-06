public abstract class Weapon extends Item {
    public int weaponDamage;

    public Weapon(String itemName, String itemDescription, int weaponDamage) {
        super(itemName, itemDescription);
        this.weaponDamage = weaponDamage;
    }

    public abstract int remainingAmmo();

    public abstract int attackEnemy();
    public int getWeaponDamage(){
        return weaponDamage;
    }
}
