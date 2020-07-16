import abstract_factory.AbstractFoodFactory;
import abstract_factory.FoodFactory;
import abstract_factory.TypeFactory;
import abstract_factory.material.TypeMaterial;
import di_with_serviceLocator.User;
import di_with_serviceLocator.impl.AdminService;
import di_with_serviceLocator.impl.CustomerService;
import factory.DrinkFactory;
import factory.IDrink;
import factory.TypeDrink;
import singleton.EarlyServer;
import singleton.LazyServer;

public class MainClass {

    private enum Study{
        di_serviceLocator, singleton, factory, abstractFactory, builder
    }

    public static void main(String[] args){

        System.out.println("Choose: ");
        MainClass main = new MainClass();
        Study choose;
//        choose = Study.values()[new Scanner(System.in).nextInt()];
        choose = Study.abstractFactory;
        switch(choose) {
            default:
            case di_serviceLocator:
                main.dependencyInjection_serviceLocator();
                break;
            case singleton:
                main.singleton();
                break;
            case factory:
                main.factory();
                break;
            case abstractFactory:
                main.abstractFactory();
                break;
            case builder:
                break;
        }
    }

    private void dependencyInjection_serviceLocator(){

        User user = new User();

        user.setIUserService(new AdminService());
        System.out.println(user.whoAreYou());

        user.setIUserService(new CustomerService());
        System.out.println(user.whoAreYou());
    }

    private void singleton(){

//        The two commands below will initialize the server and print it to the screen
        EarlyServer earlyServer = EarlyServer.getInstance();
        LazyServer lazyServer = LazyServer.getInstance();

//        Because it is initialized, the lines below will not print to the screen
        EarlyServer earlyServer_2 = EarlyServer.getInstance();
        LazyServer lazyServer_2 = LazyServer.getInstance();
    }

    private void factory(){

        IDrink drink_1 = DrinkFactory.getInstance().getDrink(TypeDrink.Coca);
        System.out.println(drink_1.getName());

        IDrink drink_2 = DrinkFactory.getInstance().getDrink(TypeDrink.Pepsi);
        System.out.println(drink_2.getName());
    }


    private void abstractFactory(){

        AbstractFoodFactory breadFactory = FoodFactory.getInstance().getFactory(TypeFactory.breadFactory);
        AbstractFoodFactory riceFactory = FoodFactory.getInstance().getFactory(TypeFactory.riceFactory);

        String breadEgg =  breadFactory.createFood(TypeMaterial.egg);
        String breadMeat =  breadFactory.createFood(TypeMaterial.meat);

        String riceEgg =  riceFactory.createFood(TypeMaterial.egg);
        String riceMeat =  riceFactory.createFood(TypeMaterial.meat);

        System.out.println(breadEgg);
        System.out.println(breadMeat);
        System.out.println(riceEgg);
        System.out.println(riceMeat);
    }
}
