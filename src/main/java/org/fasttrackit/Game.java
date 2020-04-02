package org.fasttrackit;

import java.util.Scanner;

public class Game {



    public void start(){
        System.out.println("WELCOME!");

         int playerCount = getPlayerCountfromUser();
    }
    private String getVehicleNameFromUser() {

        System.out.println("Please enter vehicle name: ");
        Scanner scanner = new Scanner(System.in);
         return scanner.nextLine();
    }

    private int getPlayerCountfromUser(){
        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}