package Engine;

public class game_logic {
    static String Board[][];

    public game_logic(String updBoard[][]) {
        Board = updBoard;
    }

    public boolean isWin() {
        
        for (int i = 0; i < 3; i++) {
            if (!Board[i][0].equals(" ") && Board[i][0].equals(Board[i][1]) && Board[i][0].equals(Board[i][2])) {
                return true;
            }
        }
        
        for (int j = 0; j < 3; j++) {
            if (!Board[0][j].equals(" ") && Board[0][j].equals(Board[1][j]) && Board[0][j].equals(Board[2][j])) {
                return true;
            }
        }
        
        if (!Board[0][0].equals(" ") && Board[0][0].equals(Board[1][1]) && Board[0][0].equals(Board[2][2])) {
            return true;
        }
        if (!Board[0][2].equals(" ") && Board[0][2].equals(Board[1][1]) && Board[0][2].equals(Board[2][0])) {
            return true;
        }
        return false;
    }
}
