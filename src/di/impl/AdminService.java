package di.impl;

import di.UserService;

public class AdminService implements UserService {


    @Override
    public String iAm(){
        return "I am admin";
    }


}
