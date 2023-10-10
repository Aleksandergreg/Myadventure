public class Map {
    private Room currentRoom;

    public void createRooms() {
        Room room1 = new Room("Room 1 ", "The brown bear is lurking");
        Room room2 = new Room("Room 2 ", "The grizzly bear is lurking");
        Room room3 = new Room("Room 3 ", "The honey badger is lurking");
        Room room4 = new Room("Room 4 ", "The Winnie the Pooh is lurking");
        Room room5 = new Room("Room 5 ", "GC Kuss is awaiting you, and he gifted you the brand new Cervelo, huge grats BUDDY!");
        Room room6 = new Room("Room 6 ", "The Panda bear is lurking");
        Room room7 = new Room("Room 7 ", "The Asian honeybear bear is lurking");
        Room room8 = new Room("Room 8 ", "The polar bear is lurking");
        Room room9 = new Room("Room 9 ", "The sun bear is lurking");
        // Setting directions for each room
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.createMelee("Thors Hammer","Really strong", 10);
        room1.createFood("Ost","Stærk",10);

        room2.setWest(room1);
        room2.setEast(room3);
        room2.createItem("A canadian waffle", "Would be nice with some syrup to put on top though");
       room1.createEnemy("Aleks", "Very strong", 50, 2, new MeleeWeapon("Sword", "Strong", 17));
        room3.setWest(room2);
        room3.setSouth(room6);
        room3.createItem("Big snake", "A green can with the name 'Carlsberg' on it");

        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.createItem("bicycle", "An iron horse with two wheels.");

        room5.setSouth(room8);
        room5.createItem("sambuca", "A big glass-bottle with a transparent liquid inside");

        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.createItem("book", "A heavy leather cover with pages inside.");

        room7.setNorth(room4);
        room7.setEast(room8);
        room7.createItem("knife", "A shiny metal thing with sharper blade at the end.");

        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.createFood("Ost", "Meget stærk", 100);
        room8.createMelee("Thors Hammer", "Meget stærk", 10);

        room9.setWest(room8);
        room9.setNorth(room6);
        currentRoom = room1;
    }

    public Room getCurrentRoom() {
        return  currentRoom;
    }

}