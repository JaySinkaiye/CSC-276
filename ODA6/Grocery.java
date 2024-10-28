package ODA6;

public class Grocery {

    Item[] items;

    Grocery(Item[] newItems){
        items = newItems;
    }

    public double calculateTotalCost(){

        double total = 0;

        for (Item item : items){
            total += item.getPrice();
        }

        return total;
    }

    public static void main(String[] args) {
        Item Milk = new Item("Milk", 5.6);
        Item Bread = new Item("Bread", 2.49);
        Item Eggs = new Item("Eggs", 4.9);
        
        Item[] itemArray = {Milk, Bread, Eggs};

        Grocery grocery1 = new Grocery(itemArray);
        grocery1.calculateTotalCost();

        System.out.println("The total is " + grocery1.calculateTotalCost());
    }
    
}
