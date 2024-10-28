package Hw3;
import java.util.*;;

public class TwitterTest {
    
    public static void main(String[] args) {

        // making sure the main method works as expected

        // Person pers1 = new Person("Jamie Short", "JNeverShort", 129);
        // Person pers2 = new Person("Tyler Wong", "NeverWrongJustWong", 32);
        // Person pers3 = new Person("Adelaide Adeniji", "AdeBeLying99", 9000);

        // Person[] twitterUsers = {pers1, pers2, pers3};

        // Twitter test = new Twitter(twitterUsers);
        // test.printAllUsers();
        // System.out.println(test.calculateTotalFollowers());

        String[] tenRandomNames = {"Louis", "Wyatt", "Ope", "Claudia", "Joe", "Jane", "Ken", "Tobi", "Naomi", "Lestat"};

        Person[] persons = new Person[20];
        Random random = new Random();

        for (int i = 0; i <= 20; i++ ){
            String randomName = tenRandomNames[random.nextInt(tenRandomNames.length)];
            String randomUsername = "@" + randomName;
            int randomFollowers = random.nextInt(1,100);

            persons[i] = new Person(randomName, randomUsername, randomFollowers);
            
            Twitter newTest = new Twitter(persons);
            newTest.printAllUsers();
            System.out.println(newTest.calculateTotalFollowers());

        }
    }
}
