public class MeleeWeapon extends Weapon{


    public MeleeWeapon(String itemName, String itemDescription, int weaponDamage) {
        super(itemName, itemDescription, weaponDamage);
    }

    @Override
    public int remainingAmmo() {
        return 1;
    }

    @Override
    public int attackEnemy() {
        return attackEnemy();
    }
}
