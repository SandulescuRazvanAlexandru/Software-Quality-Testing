public class Card implements CardBancar {
    private String titular;

    public Card(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public void platestePOS() {
        System.out.println(this.titular + " a platit la POS");
    }

    @Override
    public void platesteOnline() {
        System.out.println(this.titular + " a platit online");
    }
}
