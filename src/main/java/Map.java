public class Map {
    public Room currentRoom;


    public Map(){

        Room room1 = new Room("Room 1 ", "The brown bear is lurking");
        Room room2 = new Room("Room 2 ", "The grizzly bear is lurking");
        Room room3 = new Room("Room 3 ", "The honey badger is lurking");
        Room room4 = new Room("Room 4 ", "The Winnie the Pooh is lurking");
        Room room5 = new Room("Room 5 ", "GC Kuss is awaiting you, and he gifted you the brand new Cervelo, huge grats BUDDY!");
        Room room6 = new Room("Room 6 ", "The Panda bear is lurking");
        Room room7 = new Room("Room 7 ", "The Asian honeybear bear is lurking");
        Room room8 = new Room("Room 8 ", "The polar bear is lurking");
        Room room9 = new Room("Room 9 ", "The sun bear is lurking");

        currentRoom = room1;

        //Setters for each room connecting them
        //Room 1
        room1.setEastRoom(room2);
        room1.setSouthRoom(room4);
        //Room 2
        room2.setEastRoom(room3);
        room2.setWestRoom(room1);
        //room 3
        room3.setWestRoom(room2);
        room3.setSouthRoom(room6);
        //room 4
        room4.setNorthRoom(room1);
        room4.setSouthRoom(room7);
        //room 5
        room5.setSouthRoom(room8);
        //room 6
        room6.setSouthRoom(room9);
        room6.setNorthRoom(room3);
        //room 7
        room7.setEastRoom(room8);
        room7.setNorthRoom(room4);
        //room 8
        room8.setWestRoom(room7);
        room8.setEastRoom(room9);
        room8.setNorthRoom(room5);
        //room 9
        room9.setNorthRoom(room6);
        room9.setWestRoom(room8);
        room9.setEastRoom(room2);
    }

    public Room getCurrent() {
        return currentRoom;
    }



    }

