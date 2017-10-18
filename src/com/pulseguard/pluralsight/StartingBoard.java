package com.pulseguard.pluralsight;

public class StartingBoard {

    static int move;
    ChessPiece [][] chessBoard = new ChessPiece[8][8];
    InputConversion ic = new InputConversion();

    public StartingBoard update2(){
        int[] updateB = ic.getCoordinates();
        chessBoard[updateB[2]][updateB[3]] = chessBoard[updateB[0]][updateB[1]];
        chessBoard[updateB[0]][updateB[1]] = ChessPiece.blank;
        printBoard();
        return new StartingBoard();
    }

    StartingBoard setupBoard(){

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

        printBoard();
        return new StartingBoard();
    }

    void printBoard(){
        //PRINTING OUT THE BOARD
        for (int x = 0; x < 8; x++) {
            System.out.print((8 - x) + " ");
            for (int y = 0; y < 8; y++) {
                if(chessBoard[x][y]==ChessPiece.blank){
                    System.out.print("  +  ");
                } if(chessBoard[x][y]==ChessPiece.bpawn){
                    System.out.print("  bp ");
                } if(chessBoard[x][y]==ChessPiece.wpawn){
                    System.out.print("  wp ");
                } if(chessBoard[x][y]==ChessPiece.bbishop){
                    System.out.print("  bb ");
                } if(chessBoard[x][y]==ChessPiece.wbishop){
                    System.out.print("  wb ");
                } if(chessBoard[x][y]==ChessPiece.bknight){
                    System.out.print("  bn ");
                } if(chessBoard[x][y]==ChessPiece.wknight){
                    System.out.print("  wn ");
                } if(chessBoard[x][y]==ChessPiece.brook){
                    System.out.print("  br ");
                } if(chessBoard[x][y]==ChessPiece.wrook){
                    System.out.print("  wr ");
                } if(chessBoard[x][y]==ChessPiece.bqueen){
                    System.out.print("  bq ");
                } if(chessBoard[x][y]==ChessPiece.wqueen){
                    System.out.print("  wq ");
                } if(chessBoard[x][y]==ChessPiece.bking){
                    System.out.print("  bk ");
                } if(chessBoard[x][y]==ChessPiece.wking){
                    System.out.print("  wk ");
                }
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("     A    B    C    D    E    F    G    H");
    }
}