import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Position {
    Scanner scanner = new Scanner(System.in);
    private HashMap<String, Integer> position = new HashMap<String, Integer>();

    public void setByPlayer(String axis) {
        String[] allowedPositions = {"-1", "0", "1"};
        System.out.print(axis + "-axis: ");
        String value = scanner.nextLine();

        if (Arrays.asList(allowedPositions).contains(value)) {
            int point = countPositionIndex(value);
            position.put(axis, point);
        } else {
            System.out.println("Position is not allowed. Choose one of: -1, 0, 1");
            setByPlayer(axis);
        }
    }

    public void setByCPU(String axis, int point) {
        position.put(axis, point);
    }

    public HashMap get() {
        return position;
    }

    public int getAxisPoint(String axis) {
        int point = position.get(axis);
        return point;
    }

    private int countPositionIndex(String value) {
        switch(value) {
            case "0":
                return 2;
            case "1":
                return 4;
            default:
                return 0;
        }
    }
}
