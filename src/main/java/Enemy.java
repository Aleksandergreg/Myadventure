public class Enemy {
    private int enemyHp;
    private String enemyName;
    private Weapon enemyWeapEquip;
    private String enemyDescription;



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

    public void add(Enemy enemy) {
    }
    @Override
    public String toString() {
        return "Enemy{" +
                "enemyHp=" + enemyHp +
                ", enemyName='" + enemyName + '\'' +
                ", enemyWeapEquip=" + enemyWeapEquip +
                ", enemyDescription='" + enemyDescription + '\'' +
                '}';
    }}
