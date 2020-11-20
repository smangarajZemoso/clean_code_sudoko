package com.SudokoSolver;

public class SudokuSolver implements IProblemSolver {

    public Sudoko getSudoko() {
        return sudoko;
    }

    public void setSudoko(Sudoko sudoko) {
        this.sudoko = sudoko;
    }

    private Sudoko sudoko = null;

    SudokuSolver(Sudoko sudoko) {
        this.sudoko = sudoko;
    }

    public boolean isNumberSafeForBoard(int row, int col, int num) {
        return this.sudoko.getBoard()[row][col] == num;
    }

    public boolean usedInRow(int row,int num) {
        for (int d = 0; d < this.sudoko.getBoard().length; d++)
        {
            // Check if the number we are trying to place is already present in that row, return false
            if(isNumberSafeForBoard(row,d,num)) {
                return false;
            }
        }
        return true;
    }

    public boolean usedInCol(int col,int num) {
        for (int r = 0; r < this.sudoko.getBoard().length; r++)
        {
            // Check if the number we are trying to place is already present in that column, return false
            if(isNumberSafeForBoard(r,col,num)) {
                return false;
            }
        }
        return true;
    }
    public boolean usedInBox(int row,int col,int num) {
        int sqrt = (int)Math.sqrt(this.sudoko.getBoard().length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart; d < boxColStart + sqrt; d++)
            {
                if(isNumberSafeForBoard(r,col,num)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSafe(int row, int col, int num)
    {
//        return !usedInRow(row,num) && !usedInCol(col,num) && !usedInBox(row,col,num);
//         Row has the unique (row-clash)
        for (int d = 0; d < this.sudoko.getBoard().length; d++)
        {
            // Check if the number we are trying to place is already present in that row, return false
            if(isNumberSafeForBoard(row,d,num)) {
                return false;
            }
        }
        // Column has the unique numbers (column-clash)
        for (int r = 0; r < this.sudoko.getBoard().length; r++)
        {
            // Check if the number we are trying to place is already present in that column, return false
            if(isNumberSafeForBoard(r,col,num)) {
                return false;
            }
        }
        // Corresponding square has unique number (box-clash)
        int sqrt = (int)Math.sqrt(this.sudoko.getBoard().length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;

        for (int r = boxRowStart; r < boxRowStart + sqrt; r++)
        {
            for (int d = boxColStart; d < boxColStart + sqrt; d++)
            {
                if(isNumberSafeForBoard(r,col,num)) {
                    return false;
                }
            }
        }
        // if there is no clash, it's safe
        return true;
    }

    public boolean solveSudoku()
    {
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < this.sudoko.getBoardSize(); i++)
        {
            for (int j = 0; j < this.sudoko.getBoardSize(); j++)
            {
                if (this.sudoko.getBoard()[i][j] == 0)
                {
                    row = i;
                    col = j;
                    // We still have some remaining missing values in Sudoku
                    isEmpty = false;
                    break;
                }
            }
            if (!isEmpty) {
                break;
            }
        }
        // No empty space left
        if (isEmpty)
        {
            return true;
        }
        // Else for each-row backtrack
        for (int num = 1; num <= this.sudoko.getBoardSize(); ++num)
        {
            if (isSafe(row, col, num))
            {
                this.sudoko.getBoard()[row][col] = num;
                if (solveSudoku())
                {
                    return true;
                }
                else
                {
                    // replace it
                    this.sudoko.getBoard()[row][col] = 0;
                }
            }
        }
        return false;
    }
}
