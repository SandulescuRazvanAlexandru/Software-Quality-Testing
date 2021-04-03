package ro.ase.cts.program;

import ro.ase.cts.clase.*;

public class Main {

    public static void afiseazaInfo(FabricaJucator fabrica, String nume, int nrTricou) {
        Jucator jucator = fabrica.creazaJucator(nume, nrTricou);
        System.out.println(jucator.toString());
    }

    public static void main(String[] args) {
        afiseazaInfo(new FabricaAtacant(), "Aaaa", 10);
        afiseazaInfo(new FabricaPortar(), "Bbbb", 15);

        afiseazaInfo(new FabricaMijlocas(), "Cccc", 20);
    }
}
