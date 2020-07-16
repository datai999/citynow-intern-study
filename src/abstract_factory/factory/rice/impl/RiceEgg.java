package abstract_factory.factory.rice.impl;

import abstract_factory.material.Egg;

public class RiceEgg implements Egg {
    @Override
    public String create() {
        return RiceEgg.class.getName();
    }
}
