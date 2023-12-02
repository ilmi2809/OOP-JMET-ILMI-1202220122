import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Saldo Akun " + account.getName() + ": " + account.getBalance());
    }

    public void removeAccount(String name) {
        Account removedAccount = null;
        for (Account account : accounts) {
            if (account.getName().equals(name)) {
                removedAccount = account;
                break;
            }
        }

        if (removedAccount != null) {
            accounts.remove(removedAccount);
            System.out.println("Akun " + removedAccount.getName() + " Berhasil Dihapus!");
        } else {
            System.out.println("Akun Tidak Ditemukan!");
        }
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getaccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }
}