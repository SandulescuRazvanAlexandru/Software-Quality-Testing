public class Main {

    public static void afiseazaInfoJucator(FabricaJucator fabrica, String nume, int nrTricou) {
        Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInfoJucator(new FabricaAtacant(), "Aaaa", 10);
        afiseazaInfoJucator(new FabricaPortar(), "Bbbb", 15);

        afiseazaInfoJucator(new FabricaMijlocas(), "Cccc", 20);
    }
}