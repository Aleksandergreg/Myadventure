import java.util.ArrayList;

public class Room {
    private final String name;
    private final String description;
    private Room northRoom;
    private Room southRoom;
    private Room eastRoom;
    private Room westRoom;
    private ArrayList <Item> itemsInRoom = new ArrayList<>();

    public ArrayList<Item> getItemsInRoom(){
        return itemsInRoom;
    }
    public void addItem(String itemName, String itemDescription){
        itemsInRoom.add(0,(new Item("Sværd", "Meget flot")));


    }
    public void setItemsInRoom(ArrayList<Item>itemList){
        this.itemsInRoom = itemList;
    }
    public void createItem(String itemName, String itemDescription){
        Item item = new Item(itemName, itemDescription);
        itemsInRoom.add(item);
    }


    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //get methods
    public String getName() {
        return name;

    }

    public String getDescription() {
        return description;
    }

    public Room getNorthRoom() {
        return northRoom;
    }

    public Room getSouthRoom() {
        return southRoom;
    }

    public Room getEastRoom() {
        return eastRoom;
    }

    public Room getWestRoom() {
        return westRoom;
    }

    public void setSouthRoom(Room southRoom) {
        this.southRoom = southRoom;
    }

    public void setNorthRoom(Room northRoom) {
        this.northRoom = northRoom;
    }

    public void setEastRoom(Room eastRoom) {
        this.eastRoom = eastRoom;
    }

    public void setWestRoom(Room westRoom) {
        this.westRoom = westRoom;
    }
    }

