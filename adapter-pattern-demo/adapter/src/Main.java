public class Main {
    public static void printeazaInfo(Creditable credit) {
        credit.crediteaza();
    }

    public static void main(String[] args) {
        Leasing leasing = new Leasing("Bogdan", 10000);
        //printeazaInfo(leasing);

        AdapterLeasing adapterLeasing = new AdapterLeasing(leasing);
        adapterLeasing.crediteaza();

        System.out.println("-------------------------------------------------- Adapter obiecte --------------------------------------------------\n");
        printeazaInfo(adapterLeasing);

        System.out.println("-------------------------------------------------- Adapter clase ----------------------------------------------------\n");
        AdapterLeasingClase adapterLeasingClase = new AdapterLeasingClase("Gigel", 123456);
        printeazaInfo(adapterLeasingClase);
    }
}