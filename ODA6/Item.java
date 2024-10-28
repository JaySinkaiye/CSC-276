package ODA6;
public class Item {

    String Name;
    double Price;

    Item(String newName, double newPrice){
        Name = newName;
        Price = newPrice;
    }

    public String getName(){
        return Name;
    }

    public double getPrice(){
        return Price;
    }
    
}
