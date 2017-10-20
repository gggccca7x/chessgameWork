package com.pulseguard.pluralsight;

public class Main {

    private static final String WHITE = "White";
    private static final String BLACK = "Black";
    public static int whoMoves = 0;//white = 0, black 1
    private static int checkmate = 0;
    static int moveNumber = 0;

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

        StartingBoard[] chessBoard = new StartingBoard[100]; //max number of moves (for now)
        chessBoard[moveNumber] = new StartingBoard();
        StartingBoard.move = 1;

        while(checkmate != 1) {
            if (whoMoves == 0) {
                chessBoard[moveNumber+1] = sb.update();
                whoMoves = 1;
                moveNumber++;
            } else {
                chessBoard[moveNumber+1] = sb.update();
                whoMoves = 0;
                moveNumber++;
            }
        }
    }
}