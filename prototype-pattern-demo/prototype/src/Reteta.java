import java.util.ArrayList;
import java.util.List;

public class Reteta implements AbstractPrototype {

    private List<String> solutii;
    private List<Integer> cantitati;

    private Reteta() { } // ca sa nu poata fi apelat din main (pot sa introduc ceva ce sa nu fie validat corect)

    public Reteta(List<String> solutii, List<Integer> cantitati) {
        //realizam validari
        this.solutii = solutii;
        this.cantitati = cantitati;
    }

    public List<String> getSolutii() {
        return solutii;
    }

    public void setSolutii(List<String> solutii) {
        this.solutii = solutii;
    }

    public List<Integer> getCantitati() {
        return cantitati;
    }

    public void setCantitati(List<Integer> cantitati) {
        this.cantitati = cantitati;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("solutii=").append(solutii);
        sb.append(", cantitati=").append(cantitati);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Reteta copie = new Reteta(); // il folosim pe acesta, pentru ca cel cu parametri consuma resurse (ex: validari)
        copie.solutii = new ArrayList<>();
        copie.solutii.addAll(this.solutii);
        copie.cantitati = new ArrayList<>();
        copie.cantitati.addAll(this.cantitati);
        return copie;
    }
}
