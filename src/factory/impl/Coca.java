package factory.impl;

import factory.IDrink;

public class Coca implements IDrink {


    @Override
    public String getName() {
        return Coca.class.getName();
    }
}
