package cts.sandulescu.razvan.g1086.pattern.command.clase;

import java.util.ArrayList;
import java.util.TreeMap;

public class CerereManager {

    ArrayList<CerereAbstracta> cereri = new ArrayList<>();

    public void adaugaCerere(CerereAbstracta cerereAbstracta) {
        cereri.add(cerereAbstracta);
    }

    public void incepePrelucareCereri() {
        if (this.cereri.size() > 0) {

            CerereAbstracta cerereAbstracta = null;
            boolean isUrgenta = false;
            int position = -1;
            for (int i = 0; i < this.cereri.size() && isUrgenta == false; ++i) {
                cerereAbstracta = this.cereri.get(i);
                if(cerereAbstracta.getTipCerere() == TipCerere.URGENTA) {
                    isUrgenta = true;
                    position = i;
                }
            }
            if (isUrgenta)
            {
                this.cereri.remove(position);
                cerereAbstracta.proceseazaCererea(cerereAbstracta.getDenumire(), cerereAbstracta.getTipCerere());
            }
            else {
                cerereAbstracta = this.cereri.get(0);
                this.cereri.remove(0);
                cerereAbstracta.proceseazaCererea(cerereAbstracta.getDenumire(), cerereAbstracta.getTipCerere());
            }
        }
    }

}
