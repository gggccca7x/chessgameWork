package com.pulseguard.pluralsight;

public class Main {

    private static final String WHITE = "White";
    private static final String BLACK = "Black";
    public static int whoMoves = 0;//white = 0, black 1
    private static int checkmate = 0;
    static int x = 0;

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

        StartingBoard[] board2 = new StartingBoard[100]; //max number of moves (for now)
        board2[x] = new StartingBoard();
        StartingBoard.move = 1;

        do {
            if (whoMoves == 0) {
                board2[x+1] = sb.update2();
                board2[x] = board2[x+1];
                whoMoves = 1;
                x++;
            } else {
                board2[x+1] = board2[x].update2();
                board2[x] = board2[x+1];
                whoMoves = 0;
                x++;
            }
        }while(checkmate != 1);
    }
}