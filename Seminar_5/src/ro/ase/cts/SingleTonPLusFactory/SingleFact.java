package ro.ase.cts.SingleTonPLusFactory;

import ro.ase.cts.claseFactory.*;

public class SingleFact {

    private static SingleFact singleFact = null;

    private SingleFact() {
    }

    public static synchronized SingleFact getInstance() {
        if (singleFact == null) {
            singleFact = new SingleFact();
        }
        return singleFact;
    }

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
