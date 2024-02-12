package LLD.TicTacToe;

public class Board {

    Cell[][] cells;
    int size;

    Board(int size){
        this.size = size;
        cells = new Cell[size][size];
    }

    boolean addPiece(int row, int col, Piece piece){
        if(cells[row][col]==null){
            cells[row][col] = new Cell();
            cells[row][col].setPiece(piece);
            cells[row][col].setAvailable(false);
            return true;
        }
        else return false;
    }

    public void printBoard() {
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(cells[i][j]!=null && cells[i][j].piece.pieceType == PieceType.X){
                    System.out.print("  X  ");
                }
                else if(cells[i][j]!=null && cells[i][j].piece.pieceType == PieceType.O){
                    System.out.print("  O  ");
                }
                else System.out.print("  _  ");
            }
            System.out.println();
            System.out.println();

        }
    }

    public boolean checkWinner(int row, int col, Piece piece) {
        boolean r=true,c=true,d=true;
        for(int i=0;i<size;i++){
            if(cells[row][i]!=null){
                if(cells[row][i].piece.pieceType!=piece.pieceType)r=false;
            }else r=false;
        }

        for(int i=0;i<size;i++){
            if(cells[i][col]!=null){
                if(cells[i][col].piece.pieceType!=piece.pieceType)c=false;
            }else c=false;
        }

        for(int i=0;i<size;i++){
            if(cells[i][i]!=null){
                if(cells[i][i].piece.pieceType!=piece.pieceType)d=false;
            }else d=false;
        }
        int j=0;
        for(int i=size-1;i>=0;i--){
            if(cells[j][i]!=null){
                if(cells[j][i].piece.pieceType!=piece.pieceType)d=false;
            }else d=false;

            j++;
        }

        return r || c || d;
    }
}
