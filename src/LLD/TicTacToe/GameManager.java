package LLD.TicTacToe;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class GameManager {

    Deque<Player> turns;
    Board board;

    GameManager(int size){
        board = new Board(size);
        turns = new LinkedList<>();
        initializeGame();
    }
    public void initializeGame(){
        Player player1 = new Player("Player1", new PieceX());
        Player player2 = new Player("Player2", new PieceO());
        turns.add(player1);
        turns.add(player2);
    }

    public void playGame(){
        Player winner;
        boolean isWinner = false;
        while(true){
            Player p = turns.poll();
            board.printBoard();
            System.out.println("Enter row and column");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] pos= input.split(" ");
            int row = Integer.parseInt(pos[0]);
            int col = Integer.parseInt(pos[1]);
            if(board.addPiece(row,col, p.piece)){
                turns.add(p);
            }
            else{
                System.out.println("Entered wrong position, Please try again");
                turns.addFirst(p);
                continue;
            }
            boolean win = board.checkWinner(row, col, p.piece);
            if(win){
                System.out.println(p.name + " Won");
                break;
            }
        }
    }
}
