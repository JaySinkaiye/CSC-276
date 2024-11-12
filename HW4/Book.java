package HW4;

public class Book extends LibraryItem{

    private int pages;

    Book(String title, String author, int pages){
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String toString(){
        return super.toString() + "Number of pages: " + pages;
    }

}
