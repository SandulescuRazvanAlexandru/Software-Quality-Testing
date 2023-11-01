package cts.sandulescu.razvan.g1086.pattern.command.clase;

public class ModulDiploma implements IProcesatorCerere {
    @Override
    public void procesareCerere(TipCerere tip, String denumire) {
        System.out.println("Cererea de tip " + tip.toString() + " cu numere " + denumire + " este procesata");
    }
}
