package version1;


class Account {
	
	private String noCompte;
	private float solde;
	
	Account(String noCompte, float solde) {
		this.noCompte = noCompte;
		this.solde = solde;
	}
	
	void crediter(float montant) {
		solde = solde + montant;
	}
	
	void debiter(float montant) {
		solde = solde - montant;
	}
	
	public String toString() {
		return "Account[noCompte: " + noCompte + ", solde: " + solde + "]";
	}
}
