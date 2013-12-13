package version3;

public class ExosOO_version3 {

    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();
        bankingSystem.transfer(50, "c1", "c2");
        bankingSystem.transfer(100, "c2", "c3");
    }
}
