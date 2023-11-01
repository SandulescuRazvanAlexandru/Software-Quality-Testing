public class DecoratorContactlessCard extends DecoratorAbstract {
    public DecoratorContactlessCard(Card card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(super.getCard().getTitular() + " a realizat o plata contactless cu cardul");
    }
}
