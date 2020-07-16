package factory.impl;

import factory.IDrink;

public class Pepsi implements IDrink {
    @Override
    public String getName() {
        return Pepsi.class.getName();
    }
}
