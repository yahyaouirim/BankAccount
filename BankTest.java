public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
        BankAccount b1 = new BankAccount();
        System.out.println( " new account number is :" + b1.getAccountNumber());
        b1.depositMoney(23.50, "checking");
        b1.depositMoney(100.05, "savings");
        b1.displayAccountBalance();
        System.out.println(BankAccount.getTotalMoney());
        
   
    }
}
