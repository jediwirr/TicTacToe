import org.jetbrains.annotations.NotNull;

public class GameBoard {
    private String[][] gameBoard = {{"   ", "|", "   ", "|", "   "},
            {"---", "+", "---", "+", "---"},
            {"   ", "|", "   ", "|", "   "},
            {"---", "+", "---", "+", "---"},
            {"   ", "|", "   ", "|", "   "}};

    public void print(@NotNull Position position, String symbol) {
        int x = position.getAxisPoint("x");
        int y = position.getAxisPoint("y");
        gameBoard[x][y] = " " + symbol + " ";

        System.out.println();

        for (String[] row : gameBoard) {
            for (String c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
