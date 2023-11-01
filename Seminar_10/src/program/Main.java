package program;

import clase.*;
import claseChain.Cont;
import claseChain.ContCredit;
import claseChain.ContCurent;
import claseChain.ContEconomii;

public class Main {
    public static void main(String[] args) {



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
