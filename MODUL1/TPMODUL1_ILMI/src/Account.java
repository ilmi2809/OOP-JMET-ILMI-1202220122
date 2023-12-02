public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, String name, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Saldo akun "+this.name+ " setelah menyetor: " + this.balance);
        } else {
            System.out.println("Error");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0) {
            if(amount <= this.balance) {
                this.balance -= amount;
                System.out.println("Saldo akun "+this.name+ " setelah menarik uang " + this.balance);
            } else {
                System.out.println("Error");
            }
        } else {
            System.out.println("Invalid");
        }
    }

    public String getName() {
        return name;
    }

    public String getaccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}