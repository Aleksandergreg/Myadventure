public class Weapon extends Item {
  public int weaponDamage;

    public Weapon(String itemName, String itemDescription, int weaponDamage) {
        super(itemName, itemDescription);
        this.weaponDamage = weaponDamage;
    }
}
