import di_with_serviceLocator.User;
import di_with_serviceLocator.impl.AdminService;
import di_with_serviceLocator.impl.CustomerService;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){

        System.out.println("Choose: ");
        MainClass main = new MainClass();
        int choose = new Scanner(System.in).nextInt();
//        choose = 0;
        switch(choose) {
            case 0:
                main.dependencyInjection_serviceLocator();
                break;
            case 1:
                // code block
                break;
            default:
                // code block
        }
    }

    private void dependencyInjection_serviceLocator(){

        User user = new User();

        user.setUserService(new AdminService());
        System.out.println(user.whoAreYou());

        user.setUserService(new CustomerService());
        System.out.println(user.whoAreYou());
    }
}
