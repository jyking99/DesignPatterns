package ch04.factoryMethod.idcard;
import java.util.*;

import ch04.factoryMethod.framework.*;
import ch08.abstractFactory.factory.Factory;
import ch08.abstractFactory.factory.Link;
import ch08.abstractFactory.factory.Page;
import ch08.abstractFactory.factory.Tray;

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }
    public HashMap getDatabase() {
        return database;
    }
	@Override
	public Link createLink(String caption, String url) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return null;
	}
}
