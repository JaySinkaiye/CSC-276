package HW2;
public class BankAccount {


    private static double INTEREST_RATE;

    private int accountNum;
    private double bankBalance;
    private int duration;
    private double interest;

    public BankAccount(int accountNum, double bankBalance){
        this.accountNum = accountNum;
        this.bankBalance = bankBalance;
    }

    public void setAccountNum(int newAccountNum) {
        accountNum = newAccountNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountBalance(double newBankBalance) {
        bankBalance = newBankBalance;
    }

    public double getBankBalace() {
        return bankBalance;
    }

    public void setDuration(int newDuration) {
        duration = newDuration;
    }

    public int getDuration() {
        return duration;
    }

    public double calcInterest() {
        return interest = bankBalance * INTEREST_RATE * duration;
    }

    public void setInterestRate(double newInterestRate){
        INTEREST_RATE = newInterestRate;
    }


    public double updateBalance(double additionalAmount) {
        return bankBalance += additionalAmount + interest;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNum);
        System.out.println("Duration(in years): " + duration);
        System.out.println("Interest Earned: " + interest);
        System.out.println("Balance: $" + bankBalance+ "\n\n");

    }

    public static double convertCur(double fAmount, double fEx) {
        return fAmount * fEx;
    }

}
