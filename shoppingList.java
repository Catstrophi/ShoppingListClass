import java.util.ArrayList;

public class shoppingList {
    private ArrayList<String> shoppingList = new ArrayList<>();

    // Constructor
    public shoppingList(ArrayList<String> shoppingList){
        this.shoppingList = shoppingList;
    }

    // Getter
    public ArrayList<String> getShoppingList(){
        return shoppingList;
    }

    // Add element
    public void addShoppingItem(String e){
        shoppingList.add(e);
        System.out.println("The item was added successfully");
    }

    // Tells user how many items are in the array
    public void printShoppingList(){
        int numOfItems = shoppingList.size();
        System.out.println("You have " + numOfItems + " items in your grocery list");
        for(int i = 1; i < numOfItems + 1; i++){
            System.out.println(i + ", " + shoppingList.get(i - 1));
        }
    }

    // Searching for the index of the element
    public int search(String e){
        return shoppingList.indexOf(e);
    }

    // Modifying the array
    public void modifyShoppingItem(int inx, String e){
        shoppingList.add(inx, e);
        System.out.println("The shopping item at a given position has been modified");
    }

    // Modifying the array overloaded
    public void oModifyShoppingItem(String newI, String oldI){
        int inx = search(newI);
        shoppingList.remove(inx);
        shoppingList.add(inx, newI);
    }

    // Removing an element
    public void removeShoppingItem(int i){
        shoppingList.remove(i);
    }

    // Removing an element overloaded
    public boolean oRemoveShoppingItem(String e){
        int position = search(e);
        if (position >= 0) {
            return oRemoveShoppingItem(e);
        }
        return false;
    }

    // Check if the item is in the array
    public boolean itemExists(String e){
        return shoppingList.contains(e);
    }



}

