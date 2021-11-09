package com.company;

public class AccountPointsCheck {
    private double points = 5000;
    public double getPoints() { return points; }
    public void decreasePoints(double pointsOfPurchase){
        points -= pointsOfPurchase;
    }
    public void increasePoints(double pointsForInserting){
        points += pointsForInserting;
    }

    public boolean haveEnoughPoints(double purchasePoints) {
        if(purchasePoints > getPoints()){
            System.out.println("You do not have enough points");
            System.out.println("Current balance: " + getPoints());
            return false;
        }
        else{
            decreasePoints(purchasePoints);
            System.out.println("Purchase completed successfully! Enjoy:)");
            System.out.println("Your current balance: " + getPoints());
            return true;
        }
    }
    public void addPointsToAccount(double pointsToInsert){
        increasePoints(pointsToInsert);
        System.out.println("You successfully added "+ pointsToInsert + " into your balance!");
        System.out.println("Your current balance: " + getPoints());
    }
}
