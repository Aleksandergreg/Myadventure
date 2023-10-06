import java.util.Locale;
import java.util.Scanner;

public class UserInterface {
    private Adventure adventure;
    private final Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
    private String userInput = "";
    private String commands = "";

    public void start() {
        adventure = new Adventure();
        welcome();
        commands();
    }

    public void welcome() {
        System.out.println("Welcome to the Adventure game!!");
        System.out.println("Type 'help' for all commands.");
    }

    public void commands() {
        while (!userInput.equals("Exit")) {
            userInput = scan.nextLine().toLowerCase();

            String[] inputSplit = userInput.split(" ");
            String command = inputSplit[0];

            if (inputSplit.length > 1) {
                commands = inputSplit[1];
            }

            switch (command) {
                case "go north", "north", "n" -> {
                    if (adventure.go("north")) {
                        System.out.println("Going north\n" + adventure.getDescription());
                    } else {
                        System.out.println("No entrance that direction");
                    }
                }
                case "go south", "south", "s" -> {
                    if (adventure.go("south")) {
                        System.out.println("Going south\n" + adventure.getDescription());
                    } else {
                        System.out.println("No entrance that direction");
                    }
                }
                case "go east", "east", "e" -> {
                    if (adventure.go("east")) {
                        System.out.println("Going east\n" + adventure.getDescription());
                    } else {
                        System.out.println("No entrance that direction");
                    }
                }
                case "go west", "west", "w" -> {
                    if (adventure.go("west")) {
                        System.out.println("Going west\n" + adventure.getDescription());
                    } else {
                        System.out.println("No entrance that direction");
                    }
                }
                case "look", "l" -> {
                    System.out.println("Looking around...");
                    System.out.println(adventure.getCurrentRoom().getDescription());
                    System.out.println("So you must be inside of " + adventure.getCurrentRoom().getName() + adventure.getCurrentRoom().getDescription());

                    if (adventure.getCurrentRoom().getItemsInRoom().size() > 1) {
                        System.out.println("There are also some items in here: " + adventure.getCurrentRoom().getItemsInRoom());
                    } else if (adventure.getCurrentRoom().getItemsInRoom().size() == 1) {
                        System.out.println("There is also an item in here: " + adventure.getCurrentRoom().getItemsInRoom());
                    } else {
                        System.out.println("There are no items in this room.");
                    }
                }
                case "help", "h" ->
                    helpMenu();

                case "inventory", "inv" -> {
                    if (adventure.getPlayer().getPlayerInventory().isEmpty()) {
                        System.out.println("Your inventory is empty.");
                    } else {
                        System.out.println("Your inventory contains: " + adventure.getPlayer().getPlayerInventory());
                    }
                }
                case "take" -> {
                    Item itemPickedUp = adventure.takeItem(commands);
                    if (itemPickedUp == null) {
                        System.out.println("There is no item in the room of that name.");
                    } else {
                        System.out.println("You pick up: " + itemPickedUp);
                    }
                }
                case "eat" -> {
                    Adventure.message outcome = adventure.eatFood(userInput);
                    switch (outcome) {
                        case FOUND ->
                                System.out.println("Eating " + userInput + " your healthpoints are now: " + adventure.showHealth());
                        case CANT -> System.out.println("You can't eat that " + userInput);
                        case NOT_FOUND -> System.out.println("There is no food in the room " + userInput);

                    }
                }
                case "drop" -> {
                    Item itemDropped = adventure.dropItem(commands);
                    if (itemDropped == null) {
                        System.out.println("You have no item of that name.");
                    } else {
                        System.out.println("You dropped " + itemDropped);
                    }
                }
                case "health" -> {
                    if (adventure.showHealth() > 100) {
                        System.out.println("Your current health is: " + adventure.showHealth() + ". You are in good condition, continue on traveler");
                    } else if (adventure.showHealth() < 100) {
                        System.out.println("Your current health is: " + adventure.showHealth() + ". You are not in a good condition, get something to eat traveler!");

                    }
                }
                case "equip" -> {
                    Adventure.message outcome = adventure.equipWeapon(userInput);
                    switch (outcome){
                        case FOUND -> {System.out.println("Equipping: " + userInput);
                        System.out.println(adventure.getPlayer().getWeaponEquipped().getWeaponDamage());}
                        case CANT -> System.out.println("Cannot equip that item: " + userInput);
                        case NOT_FOUND -> System.out.println("Can't find an item with that name" + userInput);
                    }

                }
                case "exit" -> {
                    System.out.println("Shutting down");
                    System.exit(0);
                }
                default -> System.out.println("Error - wrong input. Type 'help' to see commands");
            }
        }
    }

    private void helpMenu() {
        System.out.println("Commands:");
        System.out.println("Type 'help' for commands");
        System.out.println("Type 'look' to look around in the room");
        System.out.println("Type 'north' to go north");
        System.out.println("Type 'south' to go south'");
        System.out.println("Type 'east' to go east");
        System.out.println("Type 'west' to go west");
        System.out.println("Type 'inventory' to see your inventory");
        System.out.println("Type 'take + 'item name' to take an item in your current room");
        System.out.println("Type 'drop + 'item name' to drop an item from your inventory in your current room");
        System.out.println("Type 'exit' to quit the adventure");
    }
}