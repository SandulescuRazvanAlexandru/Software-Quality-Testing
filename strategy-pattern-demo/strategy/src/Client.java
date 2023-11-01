public class Client {
    private String numeClient;
    private Payable plata;

    public Client(String numeClient, Payable plata) {
        this.numeClient = numeClient;
        this.plata = plata;
    }

    public void setPlata(Payable plata) {
        this.plata = plata;
    }

    public void platesteNoua(float suma) {
        System.out.println("Clientul " + this.numeClient + " are de realizat o plata: ");
        this.plata.pay(suma);
    }
}
