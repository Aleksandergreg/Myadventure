import java.util.ArrayList;

public class Room {
    private ArrayList<Item> itemsInRoom = new ArrayList<>();

    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setNorth(Room room) {
        this.north = room;
    }

    public void setSouth(Room room) {
        this.south = room;
    }

    public void setEast(Room room) {
        this.east = room;
    }

    public void setWest(Room room) {
        this.west = room;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }


    public void createItem(String itemName, String itemDescription) {
        Item item = new Item(itemName, itemDescription);
        itemsInRoom.add(item);
    }
    public void createFood (String itemName,String itemDescription, int healthPoints){
        Food food = new Food(itemName, itemDescription, healthPoints);
        itemsInRoom.add(food);
    }
    public void createMeleeWeapon(String itemName, String itemDescription, int weaponDamage){
        Weapon weapon = new Weapon(itemName, itemDescription, weaponDamage);
        itemsInRoom.add(weapon);
    }
    public void createRangedWeapon(String itemName, String itemDescription, int weaponDamage){
        Weapon rangedWeapon = new Weapon(itemName, itemDescription, weaponDamage);
        itemsInRoom.add(rangedWeapon);
    }

    public ArrayList<Item> getItemsInRoom(){
        return itemsInRoom;
    }

    public void addItem(Item item){
        itemsInRoom.add(item);
    }

    public Item removeItem(String itemName){
        for (Item item : itemsInRoom){
            if (item.getItemName().equals(itemName)){
                itemsInRoom.remove(item);
                return item;
            }
        }
        return null;
    }
}