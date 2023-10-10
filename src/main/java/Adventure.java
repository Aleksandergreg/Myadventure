public class Adventure {
    private Map map = new Map();
    private Player player;
    private Enemy enemy;
    public Adventure() {
        map.createRooms();
        player = new Player();
        player.setCurrentRoom(map.getCurrentRoom());
    }

    public Player getPlayer() {
        return player;
    }
    public String getDescription(){
        return player.getCurrentRoom().getDescription();
    }
    public Room getCurrentRoom() {
        return player.getCurrentRoom();
    }

    public boolean go(String direction) {
        return player.move(direction);
    }

    public Item takeItem(String itemName) {
        return player.takeItem(itemName);
    }

    public Item dropItem(String itemName) {
        return player.dropItem(itemName);
    }
    public int showHealth(){
        return player.getPlayerHp();
    }
    public enum message{
        NOT_FOUND,
        FOUND,
        CANT;

    }
    public Adventure.message eatFood(String itemName){
        return player.eatFood(itemName);
    }
    public Adventure.message equipWeapon(String itemName){
        return player.weaponEquip(itemName);
    }
    public Adventure.message attackEnemy (String enemy){
        return message.NOT_FOUND;
    }
}