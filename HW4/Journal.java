package HW4;

public class Journal extends LibraryItem{

    private int issueNumber;

    Journal(String title, String author, int issueNumber){
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString(){
        return super.toString() + "\nIssue Number:" + issueNumber;
    }

    @Override
    public void displayDetails(){
        System.out.println("\nTitle: " + title);
        System.out.println("author: " + author);
        System.out.println("Available: " + isAvailable);
        System.out.println("Type of Item" + issueNumber);
    }

}
