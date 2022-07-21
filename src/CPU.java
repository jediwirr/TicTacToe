import java.util.HashMap;

public class CPU {
    public String symbol;
    private final HashMap<String, Integer> CPUposition = new HashMap<String, Integer>();

    public void setCPUSymbol(String playerSymbol) {
        if (playerSymbol.equals("X")) {
            symbol = "O";
        } else {
            symbol = "X";
        }
    }

    public HashMap getPosition(HashMap position) {
        countCPUPosition(position);
        return CPUposition;
    }

    private void countCPUPosition(HashMap position) {
        CPUposition.put("x", 4);
        CPUposition.put("y", 2);
    }
}
