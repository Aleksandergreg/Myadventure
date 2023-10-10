public class Enemy {
    private int enemyHp;
    private String enemyName;
    private Weapon enemyWeapEquip;
    private String enemyDescription;
    private Room room;



    public Enemy(int enemyHp, String enemyName, Weapon enemyWeapEquip) {
        this.enemyHp = enemyHp;
        this.enemyName = enemyName;
        this.enemyWeapEquip = enemyWeapEquip;
    }
    public int getEnemyHp(){
        return enemyHp;
    }
    public String getEnemyName(){
        return enemyName;
    }
    public Weapon getEnemyWeapEquip(){
        return enemyWeapEquip;
    }
    public String getEnemyDescription(){
        return enemyDescription;
    }
    public int damageDealt (Player player){
        return enemyHp - player.getWeaponEquipped().getWeaponDamage();
    }
    public void attack(Player player){
        player.setPlayerHP(player.getPlayerHp() - enemyWeapEquip.getWeaponDamage());
    }
    public boolean enemyDied() {
        if (enemyHp < 1) {
            room.addItem(   enemyWeapEquip);
            room.removeEnemy(this);
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return enemyName;
    }}
