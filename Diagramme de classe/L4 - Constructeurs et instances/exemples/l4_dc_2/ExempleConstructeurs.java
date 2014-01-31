package l4_dc_2;

public class ExempleConstructeurs {

    public static void main(String[] args) {

        Chambre chambreEnfants = new Chambre(5, 3);
        Chambre chambreParents = new Chambre(2, 3);

        System.out.println("Enfants: " + chambreEnfants.getLargeur());
        System.out.println("Parents: " + chambreParents.getLargeur());
    }
}
