package com.pulseguard.pluralsight;

public class InputConversion extends UserInterface{

    public int in_First;
    public int in_Second;
    public int out_First;
    public int out_Second;

    public int[] getCoordinates(){
        String input;
        if(Main.whoMoves == 0) {
            input = playerMove(Main.getWHITE());
        } else {
            input = playerMove(Main.getBLACK());
        }
        String inFirst = input.substring(0,1);
        String inSecond = input.substring(1,2);
        String outFirst = input.substring(2,3);
        String outSecond = input.substring(3,4);

        in_First = convertLetter(inFirst);
        in_Second = convertNumber(inSecond);
        out_First = convertLetter(outFirst);
        out_Second = convertNumber(outSecond);

        //number, letter, number, letter
        return new int[]{in_Second, in_First, out_Second, out_First};
    }

    private int convertLetter(String x) {
        int result = 1000;
        switch (x){
            case "a": case "A":
                result = 0;
                break;
            case "b": case "B":
                result = 1;
                break;
            case "c": case "C":
                result = 2;
                break;
            case "d": case "D":
                result = 3;
                break;
            case "e": case "E":
                result = 4;
                break;
            case "f": case "F":
                result = 5;
                break;
            case "g": case "G":
                result = 6;
                break;
            case "h": case "H":
                result = 7;
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        return result;
    }
    private int convertNumber(String x) {
        int result = 1000;
        switch (x){
            case "1":
                result = 7;
                break;
            case "2":
                result = 6;
                break;
            case "3":
                result = 5;
                break;
            case "4":
                result = 4;
                break;
            case "5":
                result = 3;
                break;
            case "6":
                result = 2;
                break;
            case "7":
                result = 1;
                break;
            case "8":
                result = 0;
                break;
            default:
                System.out.println("ERROR");
                break;
        }
        return result;
    }
}
