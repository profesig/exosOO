package version1;


class BankingSystem {
	
	private Account account1;
	private Account account2;
	
	BankingSystem() {
		account1 = new Account("c1", 300);
		account2 = new Account("c2", 200);	
	}
	
	void virer(float montant, String noCompteDebit, String noCompteCredit) {
		System.out.println("Nous allons virer un montant de " + montant + " du compte " + noCompteDebit + " à " + noCompteCredit);
		System.out.println("Etat des comptes avant l'opération:");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
		
		account1.debiter(montant);
		account2.crediter(montant);
		
		System.out.println("Etat des comptes après l'opération:");
		System.out.println(account1.toString());
		System.out.println(account2.toString());
	}
}
