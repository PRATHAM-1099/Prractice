package LLD.TicTacToe;

public class Main {

    public static void main(String[] args) {
        GameManager gameManager = new GameManager(5);
        gameManager.initializeGame();
        gameManager.playGame();
    }
}
