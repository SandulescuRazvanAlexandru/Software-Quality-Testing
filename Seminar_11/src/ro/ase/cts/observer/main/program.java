package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.ClientAbonat;
import ro.ase.cts.observer.clase.ManagerSala;

public class program {
    public static void main(String[] args) {
        ManagerSala managerSala = new ManagerSala("Arena nationala");

        ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
        ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu");

        managerSala.adaugaAbonat(clientAbonat1);
        managerSala.adaugaAbonat(clientAbonat2);

        managerSala.anuntaMeci("fotbal");
        System.out.println("-----------------------------------------");

        managerSala.stergeAbonat(clientAbonat1);

        managerSala.anuntaMeci("volei");
    }
}
