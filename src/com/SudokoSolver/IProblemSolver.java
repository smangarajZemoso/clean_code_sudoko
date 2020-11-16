package com.SudokoSolver;

public interface IProblemSolver {
    boolean isSafe(int row, int col, int num);
    boolean solveSudoku();
    boolean isNumberSafeForBoard(int row, int col, int num);
}


