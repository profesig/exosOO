package version2;


class BankingSystem {

    private Account account1;
    private Account account2;

    BankingSystem() {
        account1 = new Account("c1", 300);
        account2 = new Account("c2", 200);
    }

    void transfer(double amount, String debitAccountNumber, String creditAcccountNumber) {

        printBefore(amount, debitAccountNumber, creditAcccountNumber);

        account1.debit(amount);
        account2.credit(amount);

        printAfter();
    }

    private void printBefore(double amount, String debitAccountNumber, String creditAcccountNumber) {
        System.out.println("Nous allons virer un montant de " + amount + " du compte " + debitAccountNumber + " à  " + creditAcccountNumber);
        System.out.println("Etat des comptes avant l'opération:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }

    private void printAfter() {
        System.out.println("Etat des comptes aprÃ¨s l'opération:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
