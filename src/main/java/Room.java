import java.util.ArrayList;

public class Room {
    private final String name;
    private final String description;
    private Room northRoom;
    private Room southRoom;
    private Room eastRoom;
    private Room westRoom;
    private final ArrayList <Item> itemsInRoom = new ArrayList<>();

    public ArrayList<Item> getItemsInRoom(){
return  getItemsInRoom();
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
