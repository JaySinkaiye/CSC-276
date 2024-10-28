package Hw3;

public class Person {

    String name;
    String username;
    int numFollowers;

    Person(String name, String username, int numFollowers){
        this.name = name;
        this.username = username;
        this.numFollowers = numFollowers;
    }

    public String getName(){
        return name;
    }

    public String getUsername(){
        return username;
    }

    public int getNumFollowers(){
        return numFollowers;
    }
    
    public String toString(){
        return "Name: " + name + "\nUsername: " + username + "\nNumber of FOllowers: " + numFollowers + "\n";
    }
}
