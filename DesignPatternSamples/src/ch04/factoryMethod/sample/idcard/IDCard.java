package ch04.factoryMethod.sample.idcard;

import ch04.factoryMethod.sample.framework.*;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println(owner + "�̃J�[�h�����܂��B");
        this.owner = owner;
    }
    public void use() {
        System.out.println(owner + "�̃J�[�h���g���܂��B");
    }
    public String getOwner() {
        return owner;
    }
}
