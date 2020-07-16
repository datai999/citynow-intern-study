import di_with_serviceLocator.User;
import di_with_serviceLocator.impl.AdminService;
import di_with_serviceLocator.impl.CustomerService;
import singleton.EarlyServer;
import singleton.LazyServer;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){

        System.out.println("Choose: ");
        MainClass main = new MainClass();
        int choose;
//        choose = new Scanner(System.in).nextInt();
        choose = 1;
        switch(choose) {
            case 0:
                main.dependencyInjection_serviceLocator();
                break;
            case 1:
                main.singleton();
                break;
            default:
                // code block
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
}
