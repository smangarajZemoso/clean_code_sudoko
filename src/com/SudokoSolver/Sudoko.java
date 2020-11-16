package com.SudokoSolver;

/* A Backtracking program in
Java to solve Sudoku problem */
class Sudoko // SudokoInitilization
{
    private int[][] board;
    private int boardSize;

    public int[][] getBoard() {
        return board;
    }

    public void setBoard(int[][] board) {
        this.board = board;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void setBoardSize(int boardSize) {
        this.boardSize = boardSize;
    }

    Sudoko(int[][] board,int boardSize)
    {
        this.board = board;
        this.boardSize = boardSize;
    }

}