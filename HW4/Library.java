package HW4;

import java.util.ArrayList;

public class Library {

    private ArrayList<LibraryItem> items;

    Library(){
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
    }

    public void displayItems(){
        for (LibraryItem libraryItem : items) {
            libraryItem.displayDetails();
        }
    }

    public void checkOutItem(int index){
        if(index > items.size() || index < 0){
            System.out.println("No item exists at this index");
        } else{
            items.get(index).checkOut();
        }
    }

    public void returnItem(int index){
        if(index > items.size() || index < 0){
            System.out.println("No item exists at this index");
        } else{
            items.get(index).returnItem();
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Java Programming", "Paul Deitel", 1143);
        Book book1 = new Book("Java", "Payne Dei", 149);
        Book book2 = new Book("C++", "Layla Ren", 859);

        Journal journal = new Journal("Machine Learning", "Manuel Gunther", 12);
        Journal journal1 = new Journal("Learning", "Immanuel Gut", 300);
        Journal journal2 = new Journal("Machines", "Jacob Nomps", 90);
        
        library.addItem(book);
        library.addItem(book1);
        library.addItem(book2);

        library.addItem(journal);
        library.addItem(journal1);
        library.addItem(journal2);

        System.out.println("All Library Items:");
        library.displayItems();

        library.checkOutItem(1);
        library.checkOutItem(5);
        System.out.println("\nAfter Checking Out:");
        library.displayItems();

        library.returnItem(1);
        System.out.println("\nAfter Returning:");
        library.displayItems();
    }
}
