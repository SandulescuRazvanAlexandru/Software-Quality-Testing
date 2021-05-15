package cts.sandulescu.razvan.g1086.pattern.command.clase;

public abstract class CerereAbstracta {

    private String denumire;
    private TipCerere tipCerere;

    public CerereAbstracta(String denumire, TipCerere tipCerere) {
        this.denumire = denumire;
        this.tipCerere = tipCerere;
    }

    public String getDenumire() {
        return denumire;
    }

    public TipCerere getTipCerere() {
        return tipCerere;
    }

    public abstract void proceseazaCererea(String denumire, TipCerere tipCerere);
}
