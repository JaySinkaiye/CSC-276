package HW2;

public class Bank {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100, 1000);
        BankAccount account2 = new BankAccount(200, 1500);

        //setting interest rates
        account1.setInterestRate(0.03);
        account2.setInterestRate(0.03);

        //setting durations(in years)
        account1.setDuration(2);
        account2.setDuration(2);

        //adding 300 to account 1
        account1.setAccountBalance(account1.getBankBalace()+300);
        //subtraction 400 from account 2
        account2.setAccountBalance(account2.getBankBalace()-400);

        // calculation interest
        account1.calcInterest();
        account2.calcInterest();

        //displaying bank information for both accounts
        account1.displayAccount();
        account2.displayAccount();

        //converting 150 swiss franks to USD. One frank = 1.16 USD
        double account1ConvertedAmount = BankAccount.convertCur(150, 1.6);
        //converting 140 Euros to USD. One Euro = 1.10 USD
        double account2ConvertedAmount = BankAccount.convertCur(140, 1.1);

        //adding converted amounts to each respective account
        account1.updateBalance(account1ConvertedAmount);
        account2.updateBalance(account2ConvertedAmount);

    }
}
