package version1;


class BankingSystem {

    private Account account1;
    private Account account2;

    BankingSystem() {
        account1 = new Account("c1", 300);
        account2 = new Account("c2", 200);
    }

    void transfer(double amount, String debitAccountNumber, String creditAcccountNumber) {
        System.out.println("Nous allons virer un montant de " + amount + " du compte " + debitAccountNumber + " � " + creditAcccountNumber);
        System.out.println("Etat des comptes avant l'op�ration:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());

        account1.debit(amount);
        account2.credit(amount);

        System.out.println("Etat des comptes apr�s l'op�ration:");
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
