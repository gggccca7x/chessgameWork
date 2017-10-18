package com.pulseguard.pluralsight;

import java.util.Scanner;

public class UserInterface {

    public String playerMove(String player){
        Scanner sc = new Scanner(System.in);
        System.out.println("Turn to move: " + player);
        System.out.println("NOTE: FOR NOW ALL INPUTS ARE IN FORM 'a2', small letter followed by number");
        System.out.print("Select a piece to move: ");
        String moveFrom = sc.nextLine();
        System.out.print("Select where to move this piece: ");
        String moveTo = sc.nextLine();
        return moveFrom+moveTo;
    }
}