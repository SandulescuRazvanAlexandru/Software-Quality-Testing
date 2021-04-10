package ro.ase.cts.claseDecorator;

public class DecoratorContactlessTelefon extends DecoratorAbstract {
    public DecoratorContactlessTelefon(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(super.getCard().getTitular() + " a platit contactless cu telefonul");
    }
}
