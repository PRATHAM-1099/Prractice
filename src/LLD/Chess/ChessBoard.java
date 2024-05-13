package LLD.Chess;


import LLD.Chess.Piece.Piece;

import java.util.ArrayDeque;
import java.util.Deque;

public class ChessBoard {
    Box[][] chessBoard = new Box[8][8];
    Deque<Player> turn = new ArrayDeque<>();

    public ChessBoard(){
        Player p1 = new Player();
        Player p2 = new Player();
        turn.add(p1);
        turn.add(p2);
    }


    public void makeMove(int x1, int y1, int x2, int y2){
        Box box = chessBoard[x1][y1];
        Piece piece = box.getPiece();
        piece.move(x1,y1,x2,y2);
    }
}
