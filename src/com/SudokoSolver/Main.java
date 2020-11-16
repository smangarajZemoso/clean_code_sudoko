package com.SudokoSolver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Suduko Solver");
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        int boardSize = board.length;
        Sudoko sudoko = new Sudoko(board,boardSize);
        SudokuSolver sudokuSolver = new SudokuSolver(sudoko);
        if (sudokuSolver.solveSudoku())
        {
            // print solution
            SudokoPrinter.printSuduko(sudokuSolver.getSudoko());
        }
        else {
            System.out.println("No solution");
        }
    }
}
