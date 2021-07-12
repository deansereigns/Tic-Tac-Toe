package com.tic_tac_toe;

public class TTT {
    private String[][] board;
    private static final int rows = 3;
    private static final int columns = 3;
    private String reg = "\\s{3}";



    public TTT() {
        board = new String[rows][columns];
        this.initializeBoard();
    }
    // A constructor to Initialize new Board
    //initializing board and fill with empty spaces

    public void initializeBoard() {
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                board[i][j] = "   ";
            }
        }
    }


     // setPlay method will set player's move.

    public void setPlay(int i, int j, String player) {
        if(board[i][j].matches(reg))
            board[i][j] = " "+player+" ";
    }

   // Checking Winners
    public boolean isGameOver() {
        //checking along rows
        for(int i = 0; i < rows; i++) {
            if(!board[i][0].matches(reg) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                return true;
            }
        }
        //checking along columns

        for(int j = 0; j < columns; j++) {
            if(!board[0][j].matches(reg) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j]))
                return true;
        }
        //checking along diagonals
        if(!board[0][0].matches(reg) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
            return true;
        if(!board[0][2].matches(reg) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
            return true;
        //no body's won
        return false;

    }


      // Prints Board on the screen.

    public String printBoard() {
        String strBoard = "";
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(j == columns-1)
                    strBoard += board[i][j];
                else
                    strBoard += board[i][j] + "|";
            }
            if(i != rows-1)
                strBoard += "\n---+---+---\n";
        }
        return strBoard;
    }

}
