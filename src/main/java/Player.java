public class Player {
    Map map = new Map();

    public void goNorth() {
        if (map.currentRoom.getNorthRoom() != null) {
            map.currentRoom = map.currentRoom.getNorthRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
        } else {
            System.out.println("No door that direction");
        }


    }

    public void goSouth() {
        if (map.currentRoom.getSouthRoom() != null) {
            map.currentRoom = map.currentRoom.getSouthRoom();
            System.out.println(map.currentRoom.getName() + map.currentRoom.getDescription());
        } else {
            System.out.println("No door that direction");
        }
    }

    public void goEast() {
        if (map.currentRoom.getEastRoom() != null) {
            map.currentRoom = map.currentRoom.getEastRoom();
        } else {
            System.out.println("No door that direction");
        }
    }

    public void goWest() {
        if (map.currentRoom.getEastRoom() != null) {
            map.currentRoom = map.currentRoom.getWestRoom();
        } else {
            System.out.println("No door that direction");
        }
    }
}
