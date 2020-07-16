package di_with_serviceLocator;

public class User {

    //    Service Locator
    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public String whoAreYou(){
        return this.userService.iAm();
    }
}
