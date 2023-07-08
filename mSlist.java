import java.util.ArrayList;
import java.util.Scanner;

public class mSlist {
    public static Scanner scan = new Scanner(System.in);
    private static ArrayList<String> myList = new ArrayList<>();
    public static shoppingList shoppingList = new shoppingList(myList);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        printInstructions();
        while (!quit) {
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> shoppingList.printShoppingList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> quit = true;
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void printInstructions() {
        System.out.println("""
                Press
                \t0 - To print choice options.
                \t1 - To print the list of grocery items.
                \t2 - To add an item to the list
                \t3 - To modify an item in the list.
                \t4 - To remove and item from the list.
                \t5 - To search for an item in the list.
                \t6 - To quit the application""");
    }

    public static void addItem() {
        System.out.print("Enter the item name: ");
        String itemName = scan.nextLine();
        shoppingList.addShoppingItem(itemName);
        System.out.println("Item added: " + itemName);
    }

    public static void removeItem() {
        System.out.print("Enter the item name: ");
        String itemName = scan.nextLine();
        shoppingList.removeShoppingItem(Integer.parseInt(itemName));
        System.out.println("Item removed: " + itemName);
    }

    public static void modifyItem() {
        System.out.print("Enter the item to search for: ");
        String itemToSearch = scan.nextLine();
        System.out.print("Enter the new item: ");
        String newItem = scan.nextLine();
        shoppingList.modifyShoppingItem(Integer.parseInt(itemToSearch), newItem);
        System.out.println("Item modified: " + itemToSearch + " -> " + newItem);
    }

    public static void searchItem() {
        System.out.print("Enter the item to search for: ");
        String itemToSearch = scan.nextLine();
        boolean found = shoppingList.itemExists(itemToSearch);
        if (found) {
            System.out.println("Item found: " + itemToSearch);
        }
    }
}