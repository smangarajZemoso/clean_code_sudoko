package com.SudokoSolver;

public class SudokoPrinter implements ISudokoPrinter {

    public static void printSuduko(Sudoko sudoko)
    {
        // print matrix
        for (int r = 0; r < sudoko.getBoardSize(); r++)
        {
            for (int d = 0; d < sudoko.getBoardSize(); d++)
            {
                System.out.print(sudoko.getBoard()[r][d]);
                System.out.print(" ");
            }
            System.out.print("\n");
            if ((r + 1) % (int)Math.sqrt(sudoko.getBoardSize()) == 0)
            {
                System.out.print("");
            }
        }
    }
}
