import java.util.*;

public class Lab10 {

   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many points do you want to be generated? ");
        int totalPoints = scanner.nextInt();

        Random random = new Random();
        double pointsInCircle = 0;

        for(int i = 0; i < totalPoints; i ++){
            // -1 <= x <= 1
            // -1 <= y <= 1
            double x = random.nextDouble(2) -1;
            double y = random.nextDouble(2) - 1;

            // if x^2 + y^2 <= 1
             if ((Math.pow(x, 2)+ Math.pow(y, 2)) <= 1){
                pointsInCircle ++;
             }
        }

        double Pi = (pointsInCircle/totalPoints) * 4;

        System.out.println("The estimated value of Pi is " + Pi);

        scanner.close();

    }
    
}
