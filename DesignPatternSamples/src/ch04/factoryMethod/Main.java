package ch04.factoryMethod;

import ch04.factoryMethod.framework.Factory;
import ch04.factoryMethod.framework.Product;
import ch04.factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("åãèÈç_");
        Product card2 = factory.create("Ç∆ÇﬁÇÁ");
        Product card3 = factory.create("ç≤ì°â‘éq");
        card1.use();
        card2.use();
        card3.use();
    }
}
