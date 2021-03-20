package ro.ase.cts.main;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;

public class Main {

    public static void main(String[] args) {
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "In bulgaria");
//
//        System.out.println(parlament1.toString());
//        System.out.println(parlament2.toString());

        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println("------------------------------------------------");
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("AAAAA", 400, 100, "AAAAAAA22");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("BBBBB", 400, 100, "BBBBBBB22");
        System.out.println("------------------------------------------------");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

    }
}
