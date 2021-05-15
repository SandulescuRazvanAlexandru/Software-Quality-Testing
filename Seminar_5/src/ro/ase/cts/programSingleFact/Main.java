package ro.ase.cts.programSingleFact;

import ro.ase.cts.claseSingleTonPLusFactory.SingleFact;
import ro.ase.cts.claseFactory.PersonalMedical;
import ro.ase.cts.claseFactory.TipPersonal;

public class Main {
    public static void main(String[] args) {
        PersonalMedical medic2 = SingleFact.getInstance().create(TipPersonal.MEDIC, "Cccc", 500f);
        PersonalMedical medic3 = SingleFact.getInstance().create(TipPersonal.MEDIC, "Dddd", 600f);
        System.out.println(medic2);
        System.out.println(medic3);

    }
}
