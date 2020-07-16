package abstract_factory.factory.bread.impl;

import abstract_factory.material.Egg;

public class BreadEgg implements Egg {

    @Override
    public String create() {
        return BreadEgg.class.getName();
    }
}
