package di.impl;

import di.UserService;

public class CustomerService implements UserService {


    @Override
    public String iAm(){
        return "I am customer";
    }


}
