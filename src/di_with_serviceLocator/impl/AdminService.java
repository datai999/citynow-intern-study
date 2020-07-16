package di_with_serviceLocator.impl;

import di_with_serviceLocator.IUserService;

public class AdminService implements IUserService {


    @Override
    public String iAm(){
        return "I am admin";
    }


}
