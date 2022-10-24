import java.util.Scanner;

public class TicTacToe {

    private final String[][] board;
    static int ROWS = 3;
    static int COLUMNS = 3;
    static String player1 = "x";
    static String player2 = "o";

    public TicTacToe() {
        board = new String[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++)
            for (int j = 0; j < COLUMNS; j++)
                board[i][j] = " ";
    }

    public String toString() {
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < ROWS; i++) {
            r.append("|");
            for (int j = 0; j < COLUMNS; j++)
                r.append(board[i][j]);
            r.append("|\n");
        }
        return r.toString();
    }

    public void set(int i, int j, String player) {
        if (board[i][j].equals(" "))
            board[i][j] = player;
    }

    public String getWinner() {
        int x, o;
        for(int i = 0;i<ROWS;i++){
            x = 0;
            o = 0;
            for(int j = 0; j < COLUMNS; j++) {
                if(board[i][j].equals(player1)){
                    x++;
                    if(x==3)
                        return "x";
                }
                else if(board[i][j].equals(player2)){
                    o++;
                    if(o==3)
                        return "o";
                }
            }
        }
        for(int j = 0; j < COLUMNS; j++){
            x = 0;
            o = 0;
            for (int i = 0; i < ROWS; i++){
                if(board[i][j].equals(player1)){
                    x++;
                    if(x==3)
                        return "x";
                }
                else if(board[i][j].equals(player2)){
                    o++;
                    if(o==3)
                        return "o";
                }

            }
        }
        x = 0;
        o = 0;
        for (int i = 0; i < ROWS;i++){
            if(board[i][i].equals(player1)){
                x++;
                if(x == 3)
                    return "x";
            }
            else if (board[i][i].equals(player2)) {
                o++;
                if (o==3)
                    return "o";
            }
        }
        x = 0;
        o = 0;
        int j = 0;
        for (int i = ROWS-1; i>=0; i--) {
            if (board[i][j].equals(player1)) {
                x++;
                if (x == 3)
                    return "x";
            } else if (board[i][j].equals(player2)) {
                o++;
                if (o == 3)
                    return "o";
            }
            j++;
        }
        return "Nessun vincitore";
    }

    public static void main(String[] args) {
        String player = player1;
        TicTacToe game = new TicTacToe();
        Scanner in = new Scanner(System.in);
        int row, column;
        System.out.println(game);

        do {

            if (game.getWinner().equals(player1) || game.getWinner().equals(player2)) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci riga per " + player + " (-1 per uscire):");
            row = in.nextInt();

            if (row == -1) {
                System.out.println("Partita finita");
                System.exit(0);
            }

            System.out.println("Inserisci colonna per " + player + ":");
            column = in.nextInt();

            if (row >= ROWS || column >= COLUMNS) {
                System.out.println("Combinazione non valida");
            } else {
                game.set(row,column,player);
                System.out.println(game);
                System.out.println("Vince: " + game.getWinner());
                if (player.equals(player1)) {
                    player = player2;
                } else {
                    player = player1;
                }
            }

        } while (row < ROWS && column < COLUMNS);
    }
}