package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameAccount gameAccount = new GameAccount("Demidog03", "gruntingdemidog07");
        System.out.println("Welcome to game store. Here you can buy in-game cosmetic items.\n");
        System.out.println("Available sales: ");
        System.out.println("1.Skin DeadGrass - 2500 points\n" +
                "2.Skin StormBreaker - 3700 points\n" +
                "3.Card GruntingDemiGod - 1500 points\n" +
                "4.Charm YourLastDay - 1700 points\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose purchase: ");
        System.out.println("If you want to add points write 0");
        int n = scanner.nextInt();
        switch (n) {
            case (1):
                gameAccount.purchasePoints(2500);
                break;
            case (2):
                gameAccount.purchasePoints(3700);
                break;
            case (3):
                gameAccount.purchasePoints(1500);
                break;
            case (4):
                gameAccount.purchasePoints(1700);
                break;
            case(0):
                System.out.println("Points to add: ");
                Scanner scanner1 = new Scanner(System.in);
                double p = scanner1.nextDouble();
                gameAccount.addPoints(p);
                break;
        }


    }
}
