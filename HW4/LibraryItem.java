package HW4;

public class LibraryItem {

    protected String title;
    protected String author;
    protected boolean isAvailable;

    LibraryItem(String title, String author){
        this.title = title;
        this.author = author;

        isAvailable = true;
    }

    public void checkOut(){
        if(isAvailable){
            isAvailable = false;
        }
    }

    public void returnItem(){
        isAvailable = true;
    }

    public String toString(){
            return "Title: " + title + "\nAuthor: " + author;
    }

    public void displayDetails(){
        System.out.println("\nTitle: " + title);
        System.out.println("author: " + author);
        System.out.println("Available: " + isAvailable);
    }
}
