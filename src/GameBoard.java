import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

public class GameBoard {
    private String[][] gameBoard = {{"   ", "|", "   ", "|", "   "},
            {"---", "+", "---", "+", "---"},
            {"   ", "|", "   ", "|", "   "},
            {"---", "+", "---", "+", "---"},
            {"   ", "|", "   ", "|", "   "}};

    public void print(@NotNull HashMap position) {
        int x = (int) position.get("x");
        int y = (int) position.get("y");
        gameBoard[x - 1][y - 1] = " X ";

        System.out.println();

        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
