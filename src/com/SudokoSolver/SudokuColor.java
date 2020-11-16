package com.SudokoSolver;

public class SudokuColor extends Sudoko{
    private String colorOfBox[];

    public SudokuColor(int[][] board, int boardSize,String colorOfBox[]) {
        super(board,boardSize);
        this.colorOfBox = colorOfBox;
    }
}
