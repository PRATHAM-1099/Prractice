package LLD.TicTacToe;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager(30 );
        gameManager.initializeGame();
        gameManager.playGame();
    }
}
