package factory;

import factory.impl.Coca;
import factory.impl.Pepsi;

public class DrinkFactory {

    private DrinkFactory(){};

    private static class LazyHolder{
        private static final DrinkFactory INSTANCE = new DrinkFactory();
    }

    public static DrinkFactory getInstance(){
        return LazyHolder.INSTANCE;
    }

    public IDrink getDrink(TypeDrink name){
        switch (name){
            default:
            case Coca:
                return new Coca();
            case Pepsi:
                return new Pepsi();
        }
    }
}
