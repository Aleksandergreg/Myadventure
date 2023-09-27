import java.util.Scanner;

public class Userinterface {
    private Scanner input = new Scanner(System.in);
    public Adventure adventure = new Adventure();
    Map map = new Map();
    Player player = new Player();

    public void start() {
        System.out.println("Welcome to the adventure game");


        String userInput;
        while (true) {
            userInput = input.nextLine().toLowerCase().trim();
            switch (userInput) {
                case "north", "n", "go north" -> {
                    System.out.println("going north");
                    player.goNorth();
                    //System.out.println("You are inside of:" + map.currentRoom.getName() + map.currentRoom.getDescription());
                   // System.out.printf(Farve.ANSI_PURPLE + "You are inside of %s" +Farve.ANSI_RED + "%s\n", map.currentRoom.getName(), map.currentRoom.getDescription());
                }
                case "south", "s", "go south" -> {
                    player.goSouth();
                   // System.out.println(Farve.ANSI_GREEN + "You are inside of: "+map.currentRoom.getName()+ Farve.ANSI_RED + map.currentRoom.getDescription() + Farve.ANSI_RESET);
                }
                case "east", "e", "go east" -> {
                    System.out.println("Going east");
                    player.goEast();
                    //System.out.println("You are inside of: " + map.currentRoom.getName() + map.currentRoom.getDescription());
                }
                case "west", "w", "go west" -> {
                    System.out.println("Going west");
                    player.goWest();
                    //System.out.printf(Farve.ANSI_PURPLE+"You are inside of %s" + Farve.ANSI_RED + "%s\n", map.currentRoom.getName(), map.currentRoom.getDescription());
                }
                case "look", "l", "looking around" ->
                        System.out.println("You are inside of " + map.currentRoom + map.currentRoom.getDescription());
                case "exit" -> {
                    System.out.println(Farve.ANSI_BLUE + "Home of the free" + Farve.ANSI_WHITE + " -because of the brave" + Farve.ANSI_RED + "- Thank you for playing");
                    System.exit(0);
                }
                case "info", "help" -> System.out.println("""
                        Write north, south, east or west to move in this direction
                        Write look to view your current room
                        Write exit to exit the game
                        There is also a teleporter function, with the keyword abrakadabra - try it out!
                        """);
                case "abrakadabra", "teleport" -> {
                    System.out.println("You are inside of:" +map.currentRoom.getName());

                }
                default -> System.out.println("Invalid input, please try again");
            }
        }
    }
}