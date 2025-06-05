package day27;
import java.util.*;

public class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        if(initialBalance > 0)
        {
            this.balance = initialBalance;
        }
        else
        {
            this.balance = 0;
        }
    }

    public void deposit(double amount)
    {
        if(amount > 0)
        {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        }
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double getBalance()
    {
        return balance;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount acc = new BankAccount(initialBalance);

        System.out.print("Enter deposit amount: ");
        double depositAmt = sc.nextDouble();
        acc.deposit(depositAmt);

        System.out.println("Current balance: " + acc.getBalance());
    }
}
