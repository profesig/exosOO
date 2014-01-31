package l4_dc_1;

public class Chambre {

    private double longueur;
    private double largeur;

    public Chambre(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    public double getLargeur() {
        return largeur;
    }

    public double getLongueur() {
        return longueur;
    }
}
