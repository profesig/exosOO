package version2;


class Account {

    private String accountNumber;
    private double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void credit(double amount) {
        balance = balance + amount;
    }

    void debit(double amount) {
        balance = balance - amount;
    }

    public String toString() {
        return "Account[accountNumber: " + accountNumber + ", balance: " + balance + "]";
    }
}
