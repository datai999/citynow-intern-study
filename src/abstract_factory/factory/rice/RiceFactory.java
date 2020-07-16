package abstract_factory.factory.rice;

import abstract_factory.AbstractFoodFactory;
import abstract_factory.factory.bread.impl.BreadEgg;
import abstract_factory.factory.bread.impl.BreadMeat;
import abstract_factory.factory.rice.impl.RiceEgg;
import abstract_factory.factory.rice.impl.RiceMeat;
import abstract_factory.material.TypeMaterial;

public class RiceFactory extends AbstractFoodFactory {

    private RiceFactory(){}

    private static class LazyHolder{
        private static final RiceFactory INSTANCE = new RiceFactory();
    }

    public static RiceFactory getInstance(){
        return RiceFactory.LazyHolder.INSTANCE;
    }

    @Override
    public String createFood(TypeMaterial type) {
        switch (type){
            default:
            case egg:
                return new RiceEgg().create();
            case meat:
                return new RiceMeat().create();
        }
    }
}
