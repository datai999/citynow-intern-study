import abstract_factory.AbstractFoodFactory;
import abstract_factory.FoodFactory;
import abstract_factory.TypeFactory;
import abstract_factory.material.TypeMaterial;
import builder.Laptop;
import builder.LaptopBuilder;
import di_with_serviceLocator.User;
import di_with_serviceLocator.impl.AdminService;
import di_with_serviceLocator.impl.CustomerService;
import factory.DrinkFactory;
import factory.IDrink;
import factory.TypeDrink;
import singleton.EarlyServer;
import singleton.LazyServer;
import thread.LuckySpinWithThread;
import thread.LuckySprin;

public class MainClass {

    private enum Study{
        di_serviceLocator, singleton, factory, abstractFactory, builder, thread
    }

    public static void main(String[] args){

        System.out.println("Choose: ");
        MainClass main = new MainClass();
        Study choose;
//        choose = Study.values()[new Scanner(System.in).nextInt()];
        choose = Study.thread;
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
                main.builder();
                break;
            case thread:
                main.thread();
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

    private void builder(){
        Laptop laptop1 = new LaptopBuilder().buildCpu("Intel core i9").buildRam("8GB").buildSsd("Samsung 128GB").build();
        Laptop laptop2 = new LaptopBuilder().buildCpu("Intel core i5").buildRam("12GB").build();

        System.out.println(laptop1);
        System.out.println(laptop2);
    }

    private void thread(){
        LuckySpinWithThread luckySpinWithThread = new LuckySpinWithThread();
        LuckySprin luckySprin = new LuckySprin();

        luckySpinWithThread.start();
        luckySprin.run();
    }
}
