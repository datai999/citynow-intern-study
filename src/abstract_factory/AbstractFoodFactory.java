package abstract_factory;

import abstract_factory.material.TypeMaterial;

public abstract class AbstractFoodFactory {

    public abstract String createFood(TypeMaterial type);
}
