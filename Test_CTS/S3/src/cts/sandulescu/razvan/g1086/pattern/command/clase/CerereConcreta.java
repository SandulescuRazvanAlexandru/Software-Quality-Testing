package cts.sandulescu.razvan.g1086.pattern.command.clase;

public class CerereConcreta extends CerereAbstracta {

    IProcesatorCerere iProcesatorCerere;

    public CerereConcreta(String denumire, TipCerere tipCerere, IProcesatorCerere iProcesatorCerere) {
        super(denumire, tipCerere);
        this.iProcesatorCerere = iProcesatorCerere;
    }

    @Override
    public void proceseazaCererea(String denumire, TipCerere tipCerere) {
        this.iProcesatorCerere.procesareCerere(tipCerere, denumire);
    }
}
