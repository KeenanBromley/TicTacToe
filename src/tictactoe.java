public class tictactoe {
    int[][] board;

    public tictactoe() {
        board = new int[][]{{0, 0, 0}, {0, 0, 0,}, {0, 0, 0}};
    }

    public void playerTurn(int player, int column, int row) {
        board[row - 1][column - 1] = player;
    }

    public boolean isWinner() {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0) {
            return true;
        } else if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0) {
            return true;
        } else {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != 0) {
                    return true;
                } else if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private String numToChar(int num) {
        if(num == 0) {
            return " ";
        }
        else if (num == 1) {
            return "X";
        }

        return "O";
    }

    public String printBoard() {
        String[] stringboard = new String[5];
        String game;
        for(int i = 0; i < 5; i++) {
            if(i % 2 == 0) {
                stringboard[i] = numToChar(board[i/2][0]) + "|" + numToChar(board[i/2][1]) + "|" + numToChar(board[i/2][2]);
            }
            else {
                stringboard[i] = "-----";
            }
        }

        game = stringboard[0] + "\n" + stringboard[1] + "\n" +stringboard[2] + "\n" +stringboard[3] + "\n" +stringboard[4];
        return game;
    }

    public boolean validMove(int row, int column) {
        return board[row - 1][column - 1] == 0;
    }


}
