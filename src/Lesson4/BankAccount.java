package Lesson4;

public class BankAccount
    {
        int Id=000; // by default int@ "0"-a. Hima by default "000"
        String name="Unname"; // by default "null"-a.Hima "Unname"
        public double balance=000.100; // by default "0.0".

    double balanceReplenishment(double amount)
        {
        balance=balance+amount;
        return balance;
        }

    double balanceWithdrawal(double amount)
        {
        balance=balance-amount;
        return balance;
        }

    public BankAccount(int Id, double balance)
        {
        this.Id=Id;
        this.balance=balance;
        }
    }
class BankAccountTest
    {
    public static void main(String[] args)
        {
        BankAccount MyAccount= new BankAccount(123,5.9);   //creating  new object
        BankAccount YourAccount= new BankAccount(947,25.4); //creating  new object
        BankAccount HisAccount= new BankAccount(340,-50.9);  //creating  new object

        MyAccount.Id=123;//Konstruktorum arden nshel enq
        MyAccount.name="Vazgen";
        MyAccount.balance=5.9;//Konstruktorum arden nshel enq

        YourAccount.Id=947;//Konstruktorum arden nshel enq
        YourAccount.name="Ivan";
        YourAccount.balance=25.4;//Konstruktorum arden nshel enq

        HisAccount.Id=340;//Konstruktorum arden nshel enq
        HisAccount.name="Spartak";
        HisAccount.balance=-50.9;//Konstruktorum arden nshel enq

        HisAccount.balanceReplenishment(50.9);//calling methode
        System.out.println(HisAccount.balance);
        HisAccount.balanceWithdrawal(45.0);//calling methode
        System.out.println(HisAccount.balance);
        }
    }
