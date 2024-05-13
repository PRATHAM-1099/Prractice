package LLD.Chess;

import LLD.Chess.Piece.Piece;

public class Box {
    Piece piece;
    int x;
    int y;

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Box(Piece piece){
        this.piece = piece;
    }

}

