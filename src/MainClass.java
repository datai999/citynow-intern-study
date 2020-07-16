import di.User;
import di.impl.AdminService;
import di.impl.CustomerService;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){

        System.out.println("Choose: ");
        MainClass main = new MainClass();
        int choose = new Scanner(System.in).nextInt();
//        choose = 0;
        switch(choose) {
            case 0:
                main.dependency_injection();
                break;
            case 1:
                // code block
                break;
            default:
                // code block
        }
    }

    private void dependency_injection(){

        User user = new User();

        user.setUserService(new AdminService());
        System.out.println(user.whoAreYou());

        user.setUserService(new CustomerService());
        System.out.println(user.whoAreYou());
    }
}
