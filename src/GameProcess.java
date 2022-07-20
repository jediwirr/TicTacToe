import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GameProcess {
    private HashMap<String, Integer> position = new HashMap<String, Integer>();

    public void run() {
        setPosition("x");
        setPosition("y");
        GameBoard gameBoard = new GameBoard();
        gameBoard.print(position);
    }

    private void setPosition(String axis) {
        String[] allowedPositions = {"1", "3", "5"};
        Scanner scanner = new Scanner(System.in);
        System.out.print(axis + "-axis: ");
        String value = scanner.nextLine();

        if (Arrays.asList(allowedPositions).contains(value)) {
            position.put(axis, Integer.parseInt(value));
        } else {
            System.out.println("Position is not allowed. Choose one of: 1, 3, 5");
            setPosition(axis);
        }
    }
}
