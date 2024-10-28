public class Fruit {

    String name;
    double price;
    double weight;

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double newPrice){
        price = newPrice;
    }

    public double getPrice(){
        return price;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }

    public double getWeight(){
        return weight;
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Fruit person1 = new Fruit();
        person1.setName("John");
        person1.setPrice(5.67);
        person1.setWeight(0.95);

        System.out.println("Your name is " + person1.getName() 
        + "\nYour price is $" + person1.getPrice()
         + "\nYour fruit weights " + person1.getWeight());

         person1.display();
    }
}
