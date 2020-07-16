package abstract_factory.factory.bread.impl;

import abstract_factory.material.Meat;

public class BreadMeat implements Meat {

    @Override
    public String create() {
        return BreadMeat.class.getName();
    }
}
