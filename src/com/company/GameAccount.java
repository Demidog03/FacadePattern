package com.company;

public class GameAccount {
    private String username;
    private String password;

    AccountUsernameCheck usernameChecker;
    AccountPasswordCheck passwordChecker;
    AccountPointsCheck pointsChecker;

    public GameAccount(String newUsername, String newPassword){
        username = newUsername;
        password = newPassword;

        usernameChecker = new AccountUsernameCheck();
        passwordChecker = new AccountPasswordCheck();
        pointsChecker = new AccountPointsCheck();
    }

    public String getUsername(){return username;}
    public String getPassword(){return password;}

    public void purchasePoints(double pointsToBuy){
        if(usernameChecker.accountUsernameValid(getUsername())
                && passwordChecker.accountPasswordCorrect(getPassword())
                && pointsChecker.haveEnoughPoints(pointsToBuy)){
            System.out.println("Purchase complete\n");
        }
        else{
            System.out.println("Purchase failed\n");
        }
    }
    public void addPoints(double pointsToAdd){
        if(usernameChecker.accountUsernameValid(getUsername())&&passwordChecker.accountPasswordCorrect(getPassword())){
            pointsChecker.addPointsToAccount(pointsToAdd);
            System.out.println("Transaction complete\n");
        }
        else{
            System.out.println("Transaction failed\n");
        }
    }
}
