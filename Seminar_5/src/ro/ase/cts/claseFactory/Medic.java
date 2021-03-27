package ro.ase.cts.claseFactory;

public class Medic extends PersonalMedical {
    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
