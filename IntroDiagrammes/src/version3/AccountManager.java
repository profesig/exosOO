package version3;

class AccountManager {

    private Account[] accounts;

    AccountManager() {
        accounts = new Account[3];
        accounts[0] = new Account("c1", 100);
        accounts[1] = new Account("c2", 200);
        accounts[2] = new Account("c3", 300);
    }

    Account findAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    void printAccounts() {
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
