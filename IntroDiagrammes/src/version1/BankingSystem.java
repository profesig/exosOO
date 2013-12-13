package version1;


class BankingSystem {

    private Account account1;
    private Account account2;

    BankingSystem() {
        account1 = new Account("c1", 300);
        account2 = new Account("c2", 200);
    }

    void transfer(float amount, String debitAccountNumber, String creditAcccountNumber) {
        System.out.println("Nous allons virer un montant de " + amount + " du compte " + debitAccountNumber + " à " + creditAcccountNumber);
        System.out.println("Etat des comptes avant l'opération:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.debit(amount);
        account2.credit(amount);

        System.out.println("Etat des comptes après l'opération:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
