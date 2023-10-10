import java.util.ArrayList;

public class Player {
    private int playerHP;
    private Room currentRoom;
    private ArrayList<Item> playerInventory = new ArrayList<>();
    private Weapon weaponEquipped;
    private int playerDamage;

    Room getCurrentRoom() {
        return currentRoom;
    }

    public Player() {
        playerHP = 150;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public int getPlayerHp() {
        return playerHP;
    }

    public boolean move(String direction) {
        Room requestedRoom = null;
        if (direction.charAt(0) == 'n') {
            requestedRoom = currentRoom.getNorth();
        } else if (direction.charAt(0) == 'e') {
            requestedRoom = currentRoom.getEast();
        } else if (direction.charAt(0) == 'w') {
            requestedRoom = currentRoom.getWest();
        } else if (direction.charAt(0) == 's') {
            requestedRoom = currentRoom.getSouth();
        }

        if (requestedRoom != null) {
            currentRoom = requestedRoom;
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Item> getPlayerInventory() {
        return playerInventory;
    }

    public void addItem(Item item) {
        playerInventory.add(item);
    }


    public Item removeItem(String itemName) {
        for (Item item : playerInventory) {
            if (item.getItemName().equals(itemName)) {
                playerInventory.remove(item);
                return item;
            }
        }
        return null;
    }

    public Item takeItem(String itemName) {
        Item pickedUpItem = getCurrentRoom().removeItem(itemName);
        addItem(pickedUpItem);
        return pickedUpItem;
    }

    public Item dropItem(String itemName) {
        Item droppedItem = removeItem(itemName);
        currentRoom.addItem(droppedItem);
        return droppedItem;
    }

    public Item findItem(String itemName) {
        for (Item item : playerInventory) {
            if (item.getItemName().equals(itemName)) {
                return item;
            }
        }
        return null;
    }

    public Adventure.message eatFood(String itemName) {
        Item item = findItem(itemName);
        if (item instanceof Food food) {
            playerHP += food.getHealthPoints();
            removeItem(itemName);
            return Adventure.message.FOUND;
        } else if (item == null) {
            return Adventure.message.CANT;
        } else {
            return Adventure.message.NOT_FOUND;
        }
    }
    public Adventure.message weaponEquip(String itemName) {
        Item item = findItem(itemName);
        if (item == null) {
            return Adventure.message.NOT_FOUND;
        } else if (item instanceof Weapon) {
            weaponEquipped = (Weapon) item;
            return Adventure.message.FOUND;
        } else {
            return Adventure.message.CANT;
        }
    }
    public Weapon getWeaponEquipped(){
        return weaponEquipped;
    }
    public void setPlayerHP(int playerHP){
        this.playerHP = playerHP;
    }
    public void attack(Enemy enemy){
enemy.attack(this);
if (!enemy.enemyDied()){
    enemy.attack(this);
}
    }
    public Adventure.message attackStatus (){
if ((weaponEquipped) == null){
    return Adventure.message.NOT_FOUND;
} else if (!currentRoom.getEnemies().isEmpty()) {
playerDamage = weaponEquipped.getWeaponDamage();
for (Enemy enemy : currentRoom.getEnemies()){
    attack(enemy);
    return Adventure.message.FOUND;
}

    
}
else{
    return Adventure.message.CANT;
}return null;
}
public boolean playerDead(){
if (playerHP < 1){
    return true;
}else{ return false;
}
}}

