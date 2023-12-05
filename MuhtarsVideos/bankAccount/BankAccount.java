package MuhtarsVideos.bankAccount;

public class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    public void showBalance(){

        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Available balance: $" + balance );
    }

    public void Deposit(double amount){
        System.out.println("Depositin " + amount + "to account" + accountNumber );
        balance+= amount;
        System.out.println("New balance is : " + balance);
    }

    public void WithDraw(double amount){

        if(balance<=0){
            System.out.println("there is No available balance");
            return; // if there is no available balance code stop here!
        }
        System.out.println("With drawing $ "+amount+"from the account "+ accountNumber);

        balance-=amount;

        if(balance<0) {
            balance -= 35;
        }
        System.out.println("amount after decreasing new Balance $ : " + balance);
    }
    public void accountSetUp(String name , long acctNum){
        accountHolder=name;
        accountNumber=acctNum;
    }
}
