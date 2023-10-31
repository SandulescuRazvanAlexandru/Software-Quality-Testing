package ro.ase.cts.main;

import ro.ase.cts.clase.Parlament;
import ro.ase.cts.clase.ParlamentLazy;
import ro.ase.cts.clase.Star;

public class Main {

    public static void main(String[] args) {

//        // Inainte de Singleton
//        Parlament parlament1 = new Parlament("Romania", 123, 4, "Undeva");
//        Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "In bulgaria");
//        System.out.println(parlament1.toString());
//        System.out.println(parlament2.toString());

        // Singleton
        Parlament parlament1 = Parlament.getInstance();
        Parlament parlament2 = Parlament.getInstance();
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        // Testare Singleton - Eager initialization
        System.out.println("------------------------------------------------");
        parlament1.setTara("Romania");
        parlament2.setNrParlamentari(300);
        System.out.println(parlament1.toString());
        System.out.println(parlament2.toString());

        // Testare Singleton - Lazy initialization
        System.out.println("------------------------------------------------");
        ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("AAAAA", 400, 100, "AAAAAAA22");
        ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("BBBBB", 400, 100, "BBBBBBB22");
        System.out.println(parlamentLazy1.toString());
        System.out.println(parlamentLazy2.toString());

        // Testare
        System.out.println("------------------------------------------------");
        Star star1 = Star.getInstance("Star1", 1, 0.1f);
        Star star2 = Star.getInstance("Star2", 3, 0.2f);
        Star star3 = Star.getInstance("Star3", 3, 0.3f);
        System.out.println(star1.toString());
        System.out.println(star2.toString());
        System.out.println(star3.toString());

    }
}
