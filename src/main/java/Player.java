import java.util.ArrayList;

public class Player {
    Map map = new Map();
    private Room currentRoom;
    private ArrayList<Item> itemsInPlayer = new ArrayList<>();
    private Adventure adventure;

    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
    }

    public Room getCurrentRoom(){
        return map.currentRoom;
    }


public ArrayList<Item> getItemsInPlayer(){
    return itemsInPlayer;
}
public Item removeItem(String itemName) {
    for (Item item : itemsInPlayer) {
        if (item.getItemName().equals(itemName)) {
            itemsInPlayer.remove(item);
            return item;
        }
    }
    return null;
}
    public Item takeItem(String itemName) {
        for (Item item : currentRoom.getItemsInRoom()) {
            if (item.getItemName().equals(itemName)) {
                currentRoom.getItemsInRoom().remove(item);
                itemsInPlayer.add(item);
                return item; //
            }
        }
        return null;
    }

    public void goNorth() {
        if (map.currentRoom.getNorthRoom() != null) {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
            ArrayList<Item> itemsInRoom = map.currentRoom.getItemsInRoom();
            if (!itemsInRoom.isEmpty()) {
                System.out.println("Items in the room:");
                for (Item item : itemsInRoom) {
                    System.out.println(item.getItemName() + ": " + item.getItemDescription());
                }
            }
        } else {
            System.out.println("No door that direction");
        }

    }

    public void goSouth() {
        if (map.currentRoom.getSouthRoom() != null) {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
            ArrayList<Item> itemsInRoom = map.currentRoom.getItemsInRoom();
            if (!itemsInRoom.isEmpty()) {
                System.out.println("Items in the room:");
                for (Item item : itemsInRoom) {
                    System.out.println(item.getItemName() + ": " + item.getItemDescription());
                }
            }
        } else {
            System.out.println("No door that direction");
        }
    }

    public void goEast() {
        if (map.currentRoom.getEastRoom() != null) {
            map.currentRoom = map.currentRoom.getEastRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
            ArrayList<Item> itemsInRoom = map.currentRoom.getItemsInRoom();
            if (!itemsInRoom.isEmpty()) {
                System.out.println("Items in the room:");
                for (Item item : itemsInRoom) {
                    System.out.println(item.getItemName() + ": " + item.getItemDescription());
                }
            }
        } else {
            System.out.println("No door that direction");
        }
    }

    public void goWest() {
        if (map.currentRoom.getEastRoom() != null) {
            map.currentRoom = map.currentRoom.getWestRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
            ArrayList<Item> itemsInRoom = map.currentRoom.getItemsInRoom();
            if (!itemsInRoom.isEmpty()) {
                System.out.println("Items in the room:");
                for (Item item : itemsInRoom) {
                    System.out.println(item.getItemName() + ": " + item.getItemDescription());
                }
            }
        } else {
            System.out.println("No door that direction");
        }

}}
