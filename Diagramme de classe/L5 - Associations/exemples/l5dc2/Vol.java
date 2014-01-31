package l5dc2;

public class Vol {
    private Avion avion;
    private int placesReservees;

    public int placesDisponibles() {
        int capacite = avion.getCapacitePassagers();
        return placesReservees - capacite;
    }
}

