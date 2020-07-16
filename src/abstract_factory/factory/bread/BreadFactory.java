package abstract_factory.factory.bread;

import abstract_factory.AbstractFoodFactory;
import abstract_factory.factory.bread.impl.BreadEgg;
import abstract_factory.factory.bread.impl.BreadMeat;
import abstract_factory.material.TypeMaterial;

public class BreadFactory extends AbstractFoodFactory {

    private BreadFactory(){}

    private static class LazyHolder{
        private static final BreadFactory INSTANCE = new BreadFactory();
    }

    public static BreadFactory getInstance(){
        return LazyHolder.INSTANCE;
    }

    @Override
    public String createFood(TypeMaterial type) {
        switch (type){
            default:
            case egg:
                return new BreadEgg().create();
            case meat:
                return new BreadMeat().create();
        }
    }

}
