package cts.sandulescu.razvan.g1086.pattern.command.program;

import cts.sandulescu.razvan.g1086.pattern.command.clase.*;

import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        CerereManager manager = new CerereManager();

        manager.adaugaCerere(new CerereConcreta("Adeverinta", TipCerere.NORMALA, new ModulAdeverinta()));
        manager.adaugaCerere(new CerereConcreta("Taxa", TipCerere.NORMALA, new ModulTaxa()));
        manager.adaugaCerere(new CerereConcreta("Diploma", TipCerere.URGENTA, new ModulDiploma()));
        manager.adaugaCerere(new CerereConcreta("Adeverinta", TipCerere.URGENTA, new ModulAdeverinta()));

        manager.incepePrelucareCereri();
        manager.incepePrelucareCereri();
        manager.incepePrelucareCereri();
        manager.incepePrelucareCereri();
        manager.incepePrelucareCereri(); // am pus asta ca sa ma asigur ca nu crapa daca e lista goala
    }
}
