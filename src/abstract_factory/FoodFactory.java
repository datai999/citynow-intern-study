package abstract_factory;

import abstract_factory.factory.bread.BreadFactory;
import abstract_factory.factory.rice.RiceFactory;

public class FoodFactory {

    private FoodFactory(){}

    private static class LazyHolder{
        private static final FoodFactory INSTANCE = new FoodFactory();
    }

    public static FoodFactory getInstance(){
        return FoodFactory.LazyHolder.INSTANCE;
    }

    public AbstractFoodFactory getFactory(TypeFactory type){
        switch (type){
            default:
            case breadFactory:
                return BreadFactory.getInstance();
            case riceFactory:
                return RiceFactory.getInstance();
        }
    }
}
