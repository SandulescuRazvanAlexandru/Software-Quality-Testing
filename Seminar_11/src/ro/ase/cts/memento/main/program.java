package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMemento;
import ro.ase.cts.memento.clase.Meci;

public class program {

    public static float getTicket(int area, float basePrice, boolean groupReduction) {
        float finalPrice = 0;
        switch (area) {
            case 1:
                finalPrice = basePrice;
            case 2:
                finalPrice = basePrice * 1.2f;
                break;
            case 3:
                finalPrice = basePrice * 1.5f;
                break;
        }
        System.out.println("1111111 --- " + finalPrice);
        if (groupReduction)
            finalPrice = (float)basePrice * 1.5f;
        System.out.println("2222222 --- " + finalPrice);
        return finalPrice;
    }

    public static void main(String[] args) {
        ManagerMemento manager = new ManagerMemento();

        Meci meci1 = new Meci("Steaua", "Dinamo", 102, 100, 12);
        manager.adaugaMemento(meci1.creareMemento());

        meci1.setEchipaGazda("Rapid");
        meci1.setNrSpectatori(152);
        manager.adaugaMemento(meci1.creareMemento());

        System.out.println(meci1.toString());

        System.out.println();

        meci1.setMemento(manager.getMemento(0));
        System.out.println(meci1.toString());

        System.out.println("--------------------------");

        meci1.setMemento(manager.getLastMemento());
        System.out.println(meci1.toString());

        System.out.println("--------------------------");

        double phi = 1.61803;
        int val1 = (int) Math.pow(phi, 4);
        int val2 = (int) Math.pow(-1, 4);
        int val3 = (int) Math.pow(phi, 4);

        System.out.println((int) (val1 - (val2 / val3)) / (int) Math.sqrt(5));

        System.out.println("--------------------------");

        System.out.println(getTicket(3,100,true));
    }
}
