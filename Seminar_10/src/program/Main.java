package program;

import clase.*;
import claseChain.Cont;
import claseChain.ContCredit;
import claseChain.ContCurent;
import claseChain.ContEconomii;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();
        Executant cont = new Executant("Gigel");

        ComandaCreare comandaCreare = new ComandaCreare(cont, 1000);
        managerComenzi.adaugaComanda(comandaCreare);

        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 123));

        managerComenzi.executaComanda();

        managerComenzi.adaugaComanda(new ComandaDepunere(cont, 1234));
        managerComenzi.adaugaComanda(new ComandaRetragere(cont, 2200));

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();


        System.out.println("---------------------------------------------------------------");

//        Cont contCurent = new ContCurent(200);
//        Cont contCredit = new ContCredit(150);
//        Cont contEconomii = new ContEconomii(150);
//
//        contCurent.setSuccesorCont(contCredit);
//        contCurent.setSuccesorCont(contEconomii);
//
//        contCurent.realizeazaPlata(100);
//        contCurent.realizeazaPlata(150);
//        contCurent.realizeazaPlata(100);
//        contCurent.realizeazaPlata(100);
//        contCurent.realizeazaPlata(100);

        Cont contCurent = new ContCurent(200);
        Cont contCredit = new ContCredit(150);
        Cont contEconomii = new ContEconomii(150);

        contCurent.setSuccesorCont(contCredit);
        contCredit.setSuccesorCont(contEconomii);

        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(150);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);
        contCurent.realizeazaPlata(100);

        System.out.println("---------------------------------------------------------------");



    }
}
