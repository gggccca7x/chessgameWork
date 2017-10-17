package com.pulseguard.pluralsight;

public class Main {

    private static final String WHITE = "White";
    private static final String BLACK = "Black";
    public static int whoMoves = 0;//white = 0, black 1
    private static int checkmate = 0;

    public static String getWHITE() {
        return WHITE;
    }
    public static String getBLACK() {
        return BLACK;
    }

    public static void main(String[] args) {

        //initialiser
        StartingBoard sb = new StartingBoard();
        sb.setupBoard();

        StartingBoard[] board2 = new StartingBoard[100];
        board2[0] = new StartingBoard();
        StartingBoard.move = 1;

        do {
            if (whoMoves == 0) {
                StartingBoard.setupBoard();

                whoMoves = 1;
            } else {
                StartingBoard.setupBoard();
                whoMoves = 0;
            }
        }while(checkmate != 1);
    }
}