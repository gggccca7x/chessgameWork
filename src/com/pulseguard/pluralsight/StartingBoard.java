package com.pulseguard.pluralsight;

public class StartingBoard {

    public static int move;
    ChessPiece [][] chessBoard = new ChessPiece[8][8];
    static ChessPiece cpBlank = ChessPiece.blank;
    InputConversion ic = new InputConversion();

    public StartingBoard update(){
        int[] inputs = ic.getCoordinates();
        boolean firstMove = ic.testFirstSelectedPiece(chessBoard[inputs[0]][inputs[1]] , cpBlank);
        if(firstMove == false) {
            chessBoard[inputs[2]][inputs[3]] = chessBoard[inputs[0]][inputs[1]];
            chessBoard[inputs[0]][inputs[1]] = ChessPiece.blank;
            printBoard();
        } else {
            System.out.println("SELECTED BLANK");
            update();
        }
        return new StartingBoard();
    }

    void setupBoard(){
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                if (x == 1) {
                    chessBoard[x][y] = ChessPiece.bpawn;
                } else if (x == 6) {
                    chessBoard[x][y] = ChessPiece.wpawn;
                } else if ((x == 0 && y == 0) || (x == 0 && y == 7)) {
                    chessBoard[x][y] = ChessPiece.brook;
                } else if((x == 7 && y == 0) || (x == 7 && y == 7)){
                    chessBoard[x][y] = ChessPiece.wrook;
                } else if((x == 0 && y == 1) || (x==0 && y==6)) {
                    chessBoard[x][y] = ChessPiece.bknight;
                } else if((x == 7 && y == 1) || (x==7 && y==6)) {
                    chessBoard[x][y] = ChessPiece.wknight;
                } else if((x == 0 && y == 2) || (x==0 && y==5)) {
                    chessBoard[x][y] = ChessPiece.bbishop;
                } else if((x == 7 && y == 2) || (x==7 && y==5)) {
                    chessBoard[x][y] = ChessPiece.wbishop;
                } else if(x == 0 && y == 3) {
                    chessBoard[x][y] = ChessPiece.bqueen;
                } else if(x == 7 && y == 3) {
                    chessBoard[x][y] = ChessPiece.wqueen;
                } else if(x == 0 && y == 4) {
                    chessBoard[x][y] = ChessPiece.bking;
                } else if(x == 7 && y == 4) {
                    chessBoard[x][y] = ChessPiece.wking;
                } else if((x%2 == 0 && y%2 == 0)||(x%2 == 1 && y%2 == 1)){
                    chessBoard[x][y] = ChessPiece.blank;
                } else{
                    chessBoard[x][y] = ChessPiece.blank;
                }
            }
            System.out.println("");
        }
        //only affects the first one
        printBoard();
    }

    //PRINTING THE BOARD
    void printBoard(){
        for (int x = 0; x < 8; x++){
            System.out.print((8 - x) + " ");
            for (int y = 0; y < 8; y++){
                for(ChessPiece cp : ChessPiece.values()){
                    if(chessBoard[x][y] == cp){
                        System.out.print(cp.pieceValue());
                    }
                }
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("     A    B    C    D    E    F    G    H");
    }
}