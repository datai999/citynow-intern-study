package di_with_serviceLocator;

public class User {

    //    Service Locator
    private IUserService IUserService;

    public void setIUserService(IUserService IUserService){
        this.IUserService = IUserService;
    }

    public String whoAreYou(){
        return this.IUserService.iAm();
    }
}
