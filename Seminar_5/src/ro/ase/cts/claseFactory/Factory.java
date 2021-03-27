package ro.ase.cts.claseFactory;

public class Factory {
    public PersonalMedical create(TipPersonal tip, String nume, float salariu) {
        switch (tip) {
            case MEDIC -> {
                return new Medic(nume, salariu);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu);
            }
            case BRCEVA -> {
                return new Brceva(nume, salariu);
            }
            default -> throw new IllegalArgumentException("Smth not okay bro");
        }
    }
}
