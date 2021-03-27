package ro.ase.cts.claseFactory;

public class Brceva extends PersonalMedical {
    public Brceva(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brceva{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
