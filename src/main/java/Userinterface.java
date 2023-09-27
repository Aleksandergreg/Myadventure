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
                    System.out.println("going north, attempting to enter the cave:");
                    player.goNorth();

                }
                case "south", "s", "go south" -> {
                    System.out.println("Going south, attempting to enter the cave:");
                    player.goSouth();

                }
                case "east", "e", "go east" -> {
                    System.out.println("Going east, attempting to enter the cave:");
                    player.goEast();

                }
                case "west", "w", "go west" -> {
                    System.out.println("Going west, attempting to enter the cave:");
                    player.goWest();
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