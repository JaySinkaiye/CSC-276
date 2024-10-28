import java.util.Scanner;

public class Bank {

    double checkingBalance;
    double checkingInterestRate;
    int checkingDuration;

    double savingBalance;
    double savingInterestRate;
    int savingDuration;

    double savingsInterest;
    double checkingsInterest;

    public void askForCheckingInformation(){
        Scanner input = new Scanner(System.in);

        //asking for bank information
        System.out.println("Enter the balance for the checking account: ");
        checkingBalance = input.nextDouble();
        System.err.println("Enter the interest rate for the checking account:");
        checkingInterestRate = input.nextDouble();
        System.out.println("Enter the duration in years for the checking account: ");
        checkingDuration = input.nextInt();

    
    }

    public void askForSavingInformation(){
        Scanner savingInput = new Scanner(System.in);

        //asking for bank information
        System.out.println("\n\nEnter the balance for the saving account: ");
        savingBalance = savingInput.nextDouble();
        System.err.println("Enter the interest rate for the saving account:");
        savingInterestRate = savingInput.nextDouble();
        System.out.println("Enter the duration in years for the saving account: ");
        savingDuration = savingInput.nextInt();

        savingInput.close();
    }

    public double calculateCheckingInterest(){
        checkingsInterest = (checkingBalance* checkingInterestRate*checkingDuration)/100;
        return checkingsInterest;
    }
    public double calculateSavingInterest(){
        savingsInterest = (savingBalance* savingInterestRate*savingDuration)/100;
        return savingsInterest;
    }

    public void displayCheckingInformation(){
        System.out.printf("\nYour balance for your checking account is %.2f", checkingBalance);
        System.out.printf("\nYour interest rate for your checking account  is %.2f", checkingInterestRate);
        System.out.println("\nYour duration in years for your checking account is " + checkingDuration  + " years");
    }

    public void displaySavingInformation(){
        System.out.printf("\nYour balance for your saving account is $%.2f", savingBalance);
        System.out.printf("\nYour interest rate for your saving account  is %.2f percent", savingInterestRate);
        System.out.println("\nYour duration for your saving account is " + savingDuration + " years");
    }

    public void displayBankInformation(){
        System.out.println("\n\nThank you for banking with United Trust Bank");
        System.out.printf("Savings Account:\tBalance: $%.2f", savingBalance);
        System.out.printf("\tInterest Earned: $%.2f", savingsInterest);
        System.out.printf("\nCheckings Account:\tBalance: $%.2f",checkingBalance);
        System.out.printf( "\tInterest Earned: $%.2f", checkingsInterest);
    }

    public static void main(String[] args) {
         Bank bank = new Bank();

         bank.askForCheckingInformation();
         bank.displayCheckingInformation();

         bank.askForSavingInformation();
         bank.displaySavingInformation();

         bank.calculateSavingInterest();

         bank.displayBankInformation();
    }
    
}
