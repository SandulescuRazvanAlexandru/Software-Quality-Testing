public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ionel", new PlataCash());
        client.platesteNoua(200);
        client.setPlata(new PlataCard());
        client.platesteNoua(100.3f);
        client.setPlata(new PlataBonuriMasa());
        client.platesteNoua(1000.5f);
    }
}