package di_with_serviceLocator.impl;

import di_with_serviceLocator.UserService;

public class AdminService implements UserService {


    @Override
    public String iAm(){
        return "I am admin";
    }


}
