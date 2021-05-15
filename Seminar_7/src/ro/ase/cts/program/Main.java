package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterLeasing;
import ro.ase.cts.clase.AdapterLeasingClase;
import ro.ase.cts.clase.Creditable;
import ro.ase.cts.clase.Leasing;
import ro.ase.cts.claseDecorator.Card;
import ro.ase.cts.claseDecorator.DecoratorContactlessCard;
import ro.ase.cts.claseDecorator.DecoratorContactlessTelefon;

public class Main {
    public static void printeazaInfo(Creditable credit) {
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan", 10000);
        //printeazaInfo(leasing);

        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();

        System.out.println("-------------------------------------------------- Adapter obiecte --------------------------------------------------\n");
        printeazaInfo(adapterLeasing);

        System.out.println("-------------------------------------------------- Adapter clase ----------------------------------------------------\n");
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Gigel", 123456);
        printeazaInfo(adapterLeasingClase);
    }
}
