package com.company;

public class AccountUsernameCheck {
    private String username = "Demidog03";

    public String getAccountUsername() {
        return username;
    }
    public boolean accountUsernameValid(String usernameToCheck) {
        if(usernameToCheck==getAccountUsername()){
            return true;
        }
        else{
            return false;
        }
    }
}
