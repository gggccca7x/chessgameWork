package com.pulseguard.pluralsight;

public enum ChessPiece {
    wpawn("wp"), wbishop("wb"), wknight("wn"), wrook("wr"), wqueen("wq"), wking("wk"), bpawn("bp"),
    bbishop("bb"), bknight("bn"), brook("br"), bqueen("bq"), bking("bk"), blank("+ ");

    private String display;

    ChessPiece(String display){
        this.display = display;
    }

    public String pieceValue(){
        return String.format("  %s ", this.display);
    }
}
