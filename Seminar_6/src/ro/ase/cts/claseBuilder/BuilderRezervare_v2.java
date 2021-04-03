package ro.ase.cts.claseBuilder;

public class BuilderRezervare_v2 implements AbstractBuilder {
    private int codRezervare;
    private boolean areMancareInclusa;
    private boolean areScaunErgonomic;
    private boolean areBauturaRacoritoare;
    private boolean areMuzicaAmbientala;
    private String genMuzical;

    public BuilderRezervare_v2() {
        codRezervare = 1000;
        genMuzical = "default";
    }

    public BuilderRezervare_v2 setCodRezervare(int codRezervare) {
        this.codRezervare = codRezervare;
        return this;
    }

    public BuilderRezervare_v2 setAreMancareInclusa(boolean areMancareInclusa) {
        this.areMancareInclusa = areMancareInclusa;
        return this;
    }

    public BuilderRezervare_v2 setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }

    public BuilderRezervare_v2 setAreBauturaRacoritoare(boolean areBauturaRacoritoare) {
        this.areBauturaRacoritoare = areBauturaRacoritoare;
        return this;
    }

    public BuilderRezervare_v2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        return this;
    }

    public BuilderRezervare_v2 setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBauturaRacoritoare, areMuzicaAmbientala, genMuzical);
    }
}
