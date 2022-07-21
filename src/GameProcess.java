import java.util.HashMap;

public class GameProcess {
    Position position = new Position();
    Player player = new Player();
    CPU CPU = new CPU();
    GameBoard gameBoard = new GameBoard();
    private boolean waitForPlayer = true;

    public void run() {
        player.setPlayerSymbol();
        CPU.setCPUSymbol(player.symbol);
        nextMove();
        nextMove();
    }

    private void nextMove() {
        if (waitForPlayer) {
            position.setByPlayer("x");
            position.setByPlayer("y");
            gameBoard.print(position, player.symbol);
            waitForPlayer = false;
        } else {
            HashMap CPUPosition = CPU.getPosition(position.get());
            int x = (int) CPUPosition.get("x");
            int y = (int) CPUPosition.get("y");
            position.setByCPU("x", x);
            position.setByCPU("y", y);
            gameBoard.print(position, CPU.symbol);
            waitForPlayer = true;
        }
    }
}
