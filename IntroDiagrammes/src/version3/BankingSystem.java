package version3;


class BankingSystem {

    private AccountManager accountManager;

    BankingSystem() {
        accountManager = new AccountManager();
    }

    void transfer(double amount, String debitAccountNumber, String creditAcccountNumber) {

        printBefore(amount, debitAccountNumber, creditAcccountNumber);

        Account debitAccount = accountManager.findAccount(debitAccountNumber);
        Account creditAccount = accountManager.findAccount(creditAcccountNumber);

        debitAccount.debit(amount);
        creditAccount.credit(amount);

        printAfter();
    }

    private void printBefore(double amount, String debitAccountNumber, String creditAcccountNumber) {
        System.out.println("Nous allons virer un montant de " + amount + " du compte " + debitAccountNumber + " à  " + creditAcccountNumber);
        System.out.println("Etat des comptes avant l'opération:");
        accountManager.printAccounts();
    }

    private void printAfter() {
        System.out.println("Etat des comptes après l'opération:");
        accountManager.printAccounts();
        System.out.println("=============");
    }
}
