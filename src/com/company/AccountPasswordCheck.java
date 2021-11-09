package com.company;

public class AccountPasswordCheck {
    private String password = "gruntingdemidog07";

    public String getAccountPassword(){
        return password;
    }

    public boolean accountPasswordCorrect(String passwordToCheck) {
        if(passwordToCheck==getAccountPassword()){
            return true;
        }
        else{
            return false;
        }
    }
}
