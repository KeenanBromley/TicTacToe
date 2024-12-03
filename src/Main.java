import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        tictactoe game = new tictactoe();

        int row;
        int column;

        System.out.println(game.printBoard());

        for (int i = 0; i < 9; i++) {
            System.out.println("Player " + ((i % 2) + 1));
            System.out.println("Pick a row:");
            row = keyboard.nextInt();

            while (row < 1 || row > 3) {
                System.out.println("Please pick a row between 1 and 3");
                row = keyboard.nextInt();
            }

            System.out.println("Pick a column:");
            column = keyboard.nextInt();

            while (column < 1 || column > 3) {
                System.out.println("Pick a column between 1 and 3");
                column = keyboard.nextInt();
            }

            if(game.validMove(row, column)) {
                game.playerTurn(((i % 2) + 1), column, row);
                System.out.println(game.printBoard());
            }
            else {
                System.out.println("Move invalid, pick again!");
                i = i -1;
            }
            if(game.isWinner()) {
                System.out.println("Congrats Player " +  ((i % 2) + 1) + ", you won!");
                i = 9;

            }
        }

        System.out.println("Game over, thanks for playing!");

    }
}