import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> solutii = new ArrayList<>();
        solutii.add("apa");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(10);

        Reteta reteta1 = new Reteta(solutii, cantitati); // reteta1 este "protototipul"
        Reteta reteta2 = (Reteta) reteta1.copiaza();
        Reteta reteta3 = (Reteta) reteta1.copiaza();

        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println(reteta3);

        if (reteta1 != reteta2) {
            System.out.println("Sunt adrese diferite");
        }
    }
}