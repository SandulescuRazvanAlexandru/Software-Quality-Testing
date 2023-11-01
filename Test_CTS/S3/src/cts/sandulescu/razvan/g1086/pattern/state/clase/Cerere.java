package cts.sandulescu.razvan.g1086.pattern.state.clase;

public class Cerere {
    private int zile;
    String motiv;

    ICerereStudent stareCurenta= null;

    public Cerere(int zile, String motiv) {
        this.zile = zile;
        this.motiv = motiv;
        this.stareCurenta = new StareTrimisaPeFlux();
    }

    public void setStareCurenta(ICerereStudent stareCurenta) {
        this.stareCurenta = stareCurenta;
    }

    public void confirmare() {
        this.setStareCurenta(new StareConfirmata());
    }

    public void verificare() {
        if (zile > 10 || motiv == "") {
            this.setStareCurenta(new StareRespinsa());
        } else {
            this.setStareCurenta(new StareAvizare());
        }
    }
}
