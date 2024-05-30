import java.util.Random;

public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private int accountNumber;
    private double savingsBalance;
    private static int numAccounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances
   private static int getId(){
    Random randNum =  new Random();
    int randomId = randNum.nextInt(1000000) + 999999999;
    return randomId;
   }
    // CONSTRUCTOR
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        BankAccount.numAccounts += 1;
        this.accountNumber = BankAccount.getId();
    }
    // Be sure to increment the number of accounts
    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance() {
        return checkingBalance;
    }
   
   
    public double getSavingsBalance() {
        return savingsBalance;
    }
  
    public int getAccountNumber() {
        return accountNumber;
    }
   
    public static double getTotalMoney() {
        return totalMoney;
    }
    public static int getNumAccounts(){
        return numAccounts;
    }
   
    
    // METHODS
    // deposit
    public void depositMoney( double amount, String account ){
        if(account.equals("savings"))
         this.savingsBalance += amount;
         else if (account.equals("checking"))
         this.checkingBalance += amount;
         BankAccount.totalMoney += amount;

    }
    // - users should be able to deposit money into their checking or savings account
    public void displayAccountBalance(){
        System.out.println("Your saving balance: "+ this.savingsBalance +" \n" +"Your cheking balance: " + this.checkingBalance );
    }
    
    // withdraw 
    // - users should be able to withdraw money from their checking or savings account
    // - do not allow them to withdraw money if there are insufficient funds
    // - all deposits and withdrawals should affect totalMoney
    public void withdrawMoney(double amount, String account){
        boolean is_ready = false;
        if(account.equals("savings")){
            if( this.savingsBalance - amount >=0){
                is_ready= true;
                this.savingsBalance -= amount;}

        }
        else if (account.equals("checking")){
            if(this.checkingBalance - amount >= 0){
            is_ready = true;
            this.checkingBalance -= amount;}
        }
        if(is_ready){
            BankAccount.totalMoney -= amount;
        }
        else {System.out.println(" Insufficient funds");}
    }
    // getBalance
    // - display total balance for checking and savings of a particular bank account
}
