package ro.ase.cts.programDecorator;

import ro.ase.cts.claseDecorator.Card;
import ro.ase.cts.claseDecorator.DecoratorContactlessCard;
import ro.ase.cts.claseDecorator.DecoratorContactlessTelefon;

public class Main {
    public static void main(String[] args) {
        Card card = new Card("Aaaa");
        card.platestePOS();
        card.platesteOnline();

        DecoratorContactlessCard decoratorContactless = new DecoratorContactlessCard(card);
        decoratorContactless.platesteContactless();
        decoratorContactless.platesteOnline();

        DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
        decoratorContactlessTelefon.platestePOS();
        decoratorContactlessTelefon.platesteContactless();
    }
}
