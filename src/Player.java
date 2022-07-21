import java.util.Arrays;
import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    public String symbol;

    public void setPlayerSymbol() {
        System.out.print("Please, insert X or O: ");
        String value = scanner.nextLine();
        validateInput(value);
    }

    private void validateInput(String value) {
        String allowedValues[] = {"X", "O"};
        if (Arrays.asList(allowedValues).contains(value)) {
            symbol = value;
        } else {
            System.out.println("Are you new to TicTacToe?");
            setPlayerSymbol();
        }
    }
}
