import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("1202220122", "ilmi", 100000.0);
        Account account2 = new Account("1202220123", "syahbana", 200000.0);
        Account account3 = new Account("1202220124", "Ilmi_SI4607", 300000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        System.out.println("");

        account1.deposit(50000.0);
        account2.withdraw(20000.0);

        System.out.println("");

        bank.removeAccount("ilmi    ");

        System.out.println("");

        System.out.println("Daftar Semua Akun dalam Bank:");
        List<Account> allAccounts = bank.getAllAccounts();
            for (Account acc : allAccounts) {
                System.out.println("Nama: " + acc.getName()+ ", Account Number: " + acc.getaccountNumber()+ ", Saldo: " + acc.getBalance());   
            }

    }
}