package ro.ase.cts.claseDecorator;

public abstract class DecoratorAbstract implements CardBancar {
    private Card card;

    public DecoratorAbstract(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }

    public abstract void platesteContactless();

    @Override
    public void platestePOS() {
        this.card.platestePOS();
    }

    @Override
    public void platesteOnline() {
        this.card.platesteOnline();
    }
}
