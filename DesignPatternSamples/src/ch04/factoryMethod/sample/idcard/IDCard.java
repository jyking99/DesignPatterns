package ch04.factoryMethod.sample.idcard;

import ch04.factoryMethod.sample.framework.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }
    public String getOwner() {
        return owner;
    }
}
