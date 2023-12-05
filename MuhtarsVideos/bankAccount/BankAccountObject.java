package MuhtarsVideos.bankAccount;

public class BankAccountObject {
    public static void main(String[] args) {
        BankAccount account1= new BankAccount(); // class must be constructur  we didnt define any constructor compile gives us default constructor
        account1.accountHolder="Erhan Dol";
        account1.accountNumber=12345678L;
        account1.showBalance();
        account1.Deposit(2000);
        account1.Deposit(4000);

        account1.WithDraw(3000);
        account1.WithDraw(3001);

        System.out.println("-------------------------------");

        BankAccount account2= new BankAccount();
        account2.accountSetUp("Muaz",22255557777L);
        account2.showBalance();
        account2.Deposit(1000000);


    }
}
