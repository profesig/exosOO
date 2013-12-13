package version3;


class Account {

    private String accountNumber;
    private float balance;

    Account(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void credit(float amount) {
        balance = balance + amount;
    }

    void debit(float amount) {
        balance = balance - amount;
    }

    public String toString() {
        return "Account[accountNumber: " + accountNumber + ", balance: " + balance + "]";
    }
}
