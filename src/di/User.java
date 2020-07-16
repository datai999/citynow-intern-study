package di;

public class User {

    private UserService userService;

    public void setUserService(UserService userService){
        this.userService = userService;
    }

    public String whoAreYou(){
        return this.userService.iAm();
    }
}
