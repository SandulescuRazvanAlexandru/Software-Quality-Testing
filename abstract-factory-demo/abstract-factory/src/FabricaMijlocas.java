public class FabricaMijlocas implements FabricaJucator{
    @Override
    public Jucator creazaJucator(String nume, int nrTricou) {
        return new Mijlocas(nume, nrTricou);
    }
}
