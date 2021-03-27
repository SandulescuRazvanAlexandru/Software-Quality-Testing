package ro.ase.cts.programFactory;

import ro.ase.cts.claseFactory.*;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

//        Medic medic = (Medic) factory.create(TipPersonal.MEDIC, "Aaaa", 100f);
//        Asistent asistent = (Asistent) factory.create(TipPersonal.ASISTENT, "Bbbb", 200f);

        PersonalMedical medic = factory.create(TipPersonal.MEDIC, "Aaaa", 100f);
        PersonalMedical asistent = factory.create(TipPersonal.ASISTENT, "Bbbb", 200f);
//        Asistent asistent2 = (Asistent) factory.create(TipPersonal.ASISTENT, "Bbbb", 200f, 36);


        System.out.println(medic);
        System.out.println(asistent);

    }
}
