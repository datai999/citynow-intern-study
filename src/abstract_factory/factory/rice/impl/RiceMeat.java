package abstract_factory.factory.rice.impl;

import abstract_factory.material.Meat;

public class RiceMeat implements Meat {


    @Override
    public String create() {
        return RiceMeat.class.getName();
    }
}
