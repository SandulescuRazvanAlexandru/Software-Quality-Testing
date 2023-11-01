public class FabricaPortar implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Portar(nume, nrTricou);
    }
}
