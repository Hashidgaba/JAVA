package Q3;
//Abstract class
abstract class BankAccount {
 protected double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 public abstract void deposit(double amount);

 public abstract void withdraw(double amount);

 public double getBalance() {
     return balance;
 }
}

//SavingsAccount class
class SavingsAccount extends BankAccount {
 private double interestRate = 0.03;

 public SavingsAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount + (amount * interestRate); // add interest
     System.out.println("Deposited into Savings: " + amount);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawn from Savings: " + amount);
     } else {
         System.out.println("Insufficient funds in Savings");
     }
 }
}

//CurrentAccount class
class CurrentAccount extends BankAccount {
 private double overdraftLimit = 500;

 public CurrentAccount(double initialBalance) {
     super(initialBalance);
 }

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited into Current: " + amount);
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= balance + overdraftLimit) {
         balance -= amount;
         System.out.println("Withdrawn from Current: " + amount);
     } else {
         System.out.println("Overdraft limit exceeded in Current Account");
     }
 }
}

//Test class
public class Main {
 public static void main(String[] args) {
     BankAccount savings = new SavingsAccount(1000);
     BankAccount current = new CurrentAccount(500);

     savings.deposit(200);
     savings.withdraw(300);
     System.out.println("Savings Balance: " + savings.getBalance());

     current.deposit(100);
     current.withdraw(700);
     System.out.println("Current Balance: " + current.getBalance());
 }
}